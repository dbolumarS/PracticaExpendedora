package expendedora.model;

import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class Expendedora {
	final static double CREDITOMAXIMO = 10;
	private double credito=0.00;
	private double cambioDisponible;
	private double importeVentas = 0.00;
	private String[] nombreProductos;
	private double[] precioProductos;
	private int[] stockProductos;

	public Expendedora( double cambioDisponible, String[] nombreProductos,
			double[] precioProductos, int[] stockProductos) {
		
		
		this.cambioDisponible = cambioDisponible;
		this.nombreProductos = new String[nombreProductos.length];
		this.precioProductos = new double[precioProductos.length];
		this.stockProductos = new int[stockProductos.length];
		
	for (int i = 0; i < nombreProductos.length; i++) {
		this.nombreProductos[i]=nombreProductos[i];
	}
	
	for (int i = 0; i < precioProductos.length; i++) {
		this.precioProductos[i]=precioProductos[i];
	}
	
	for (int i = 0; i < stockProductos.length; i++) {
		this.stockProductos[i]=stockProductos[i];
	}
		
		if (this.nombreProductos.length != this.precioProductos.length || this.nombreProductos.length != this.stockProductos.length
				|| this.nombreProductos.length != this.stockProductos.length) {
			
			throw new IllegalArgumentException("No cuadran las cuentas");
		}
	}

	public double getCredito() {
		
		return Math.round(credito*100)/100.00;
	}


	public double getCambioDisponible() {
		return  Math.round(cambioDisponible*100)/100.00;
	}



	public double getImporteVentas() {
		return importeVentas;
	}



	public int getNumeroProductos() {
		return nombreProductos.length;
	}

	public String getNombre(int i) {
		String nombre = null;
		for (int j = 0; j < nombreProductos.length; j++) {
			if(nombreProductos[j] == nombreProductos[i]) {
				 nombre = nombreProductos[i];
			}
		}
		return nombre;
	}
	
	public double getPrecio(int i) {
		double precio = 0;
		for (int j = 0; j < precioProductos.length; j++) {
			if(precioProductos[j] == precioProductos[i]) {
				precio = precioProductos[j];
			}
		}
		return precio;
	} 
	
	public int getStock(int i) {
		int stock = 0;
		for (int j = 0; j < stockProductos.length; j++) {
			if(stockProductos[j] == stockProductos[i]) {
				
				stock = stockProductos[i];
			}
		}
		return stock;
	}
	
	public String toString() {
		
		
		String devolver = "Credito  : " + this.credito + " euros\n" + "Cambio  : " + this.cambioDisponible + " euros\n" +
				"Importe de ventas  : " + this.importeVentas + " euros\n" + "Productos  : " + this.nombreProductos.length + "\n";
		
		for (int i = 0; i < this.nombreProductos.length; i++) {
			devolver = devolver + this.nombreProductos[i].toString() + " - " + this.precioProductos[i] + " - " + this.stockProductos[i] + " \n" ;
		}
			return devolver;	
	}
	
	public void anyadirDinero (double importe) {
		
		if((importe+credito)<CREDITOMAXIMO ) {
			credito = credito+importe;
			
		} 
	}
	
	public double devolverCredito() {
		double c = credito;
		credito = 0;
		return c;
	}
	
	public double comprar(int i) throws CreditoInsuficienteException, CambioInsuficienteException, StockInsuficienteException{
		
		double creditoADevolver = 0;
		creditoADevolver = getCredito()-precioProductos[i]; 
			if(getPrecio(i) > credito) 	throw new CreditoInsuficienteException("Introduzca mas dinero");
				
			
		if(getCambioDisponible() < creditoADevolver){
			throw new CambioInsuficienteException("No hay cambio");
		} else 
			
			cambioDisponible = cambioDisponible- creditoADevolver;
		
		
			if(getStock(i) > 0) {
				stockProductos[i]=stockProductos[i]-1;
					
				} else 
					
					throw new StockInsuficienteException("No queda stock");
		
		importeVentas = importeVentas+getPrecio(i);
		
		credito = 0; 
		
		
		return  Math.round(creditoADevolver*100)/100.00;
		
	}
}
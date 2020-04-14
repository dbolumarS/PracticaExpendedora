package expendedora.controller;

import java.net.URL;
import java.util.ResourceBundle;

import expendedora.model.CambioInsuficienteException;
import expendedora.model.CreditoInsuficienteException;
import expendedora.model.Expendedora;
import expendedora.model.StockInsuficienteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;

public class FXMLExpendedoraController implements Initializable{

	private Expendedora e;

	@FXML
	private Label lblProducto;

	@FXML
	private Button btnCompra1;

	@FXML
	private Button btnCompra2;

	@FXML
	private Button btnCompra3;

	@FXML
	private Button btnCompra4;

	@FXML
	private Button btnCompra5;

	@FXML
	private Button btnCompra6;

	@FXML
	private Label lblDinero;
	
	 @FXML
	 private Label lblCambio;
	
	@FXML
	private Label lblIntroducido;

	@FXML
	private Button btnCredito2E;

	@FXML
	private Button btnCredito1E;

	@FXML
	private Button btnCredito50C;

	@FXML
	private Button btnCredito20C;

	@FXML
	private Button btnCredito10C;

	@FXML
	private Button btnCredito5C;

	@FXML
	private Button btnCredito2C;

	@FXML
	private Button btnCredito1C;

	@FXML
	private Label lblCredito;

	@FXML
	private Button btnDevolver;

	@FXML
	void OnActionComprar1(ActionEvent event) {
		
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Compra Bien realizada");
			alert.setHeaderText(null);
			alert.setContentText("Se devuelve " + e.comprar(0));

			alert.showAndWait();
			lblCredito.setText("" + e.getCredito());
			lblCambio.setText("" + e.getCambioDisponible());
			btnCompra1.setText(e.getNombre(0) + "\n" + e.getPrecio(0) + "€\n" + e.getStock(0) + " ud");
			

		} catch (CreditoInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay credito suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (StockInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay stock suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (CambioInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay cambio suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void OnActionComprar2(ActionEvent event) {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Compra Bien realizada");
			alert.setHeaderText(null);
			alert.setContentText("Se devuelve " + e.comprar(1));
			alert.showAndWait();
			
			lblCredito.setText("" + e.getCredito());
			lblCambio.setText("" + e.getCambioDisponible());
			btnCompra2.setText(e.getNombre(1) + "\n" + e.getPrecio(1) + "€\n" + e.getStock(1) + " ud");

		} catch (CreditoInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay credito suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (StockInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay stock suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (CambioInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay cambio suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void OnActionComprar3(ActionEvent event) {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Compra Bien realizada");
			alert.setHeaderText(null);
			alert.setContentText("Se devuelve " + e.comprar(2));
			alert.showAndWait();
			
			lblCredito.setText("" + e.getCredito());
			lblCambio.setText("" + e.getCambioDisponible());
			btnCompra3.setText(e.getNombre(2) + "\n" + e.getPrecio(2) + "€\n" + e.getStock(2) + " ud");

		} catch (CreditoInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay credito suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (StockInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay stock suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (CambioInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay cambio suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void OnActionComprar4(ActionEvent event) {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Compra Bien realizada");
			alert.setHeaderText(null);
			alert.setContentText("Se devuelve " + e.comprar(3));
			alert.showAndWait();
			
			lblCredito.setText("" + e.getCredito());
			lblCambio.setText("" + e.getCambioDisponible());
			btnCompra4.setText(e.getNombre(3) + "\n" + e.getPrecio(3) + "€\n" + e.getStock(3) + " ud");

		} catch (CreditoInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay credito suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (StockInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay stock suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (CambioInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay cambio suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void OnActionComprar5(ActionEvent event) {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Compra Bien realizada");
			alert.setHeaderText(null);
			alert.setContentText("Se devuelve " + e.comprar(4));
			alert.showAndWait();
			
			lblCredito.setText("" + e.getCredito());
			lblCambio.setText("" + e.getCambioDisponible());
			btnCompra5.setText(e.getNombre(4) + "\n" + e.getPrecio(4) + "€\n" + e.getStock(4) + " ud");

		} catch (CreditoInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay credito suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (StockInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay stock suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (CambioInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay cambio suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void OnActionComprar6(ActionEvent event) {
		try {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Compra Bien realizada");
			alert.setHeaderText(null);
			alert.setContentText("Se devuelve " + e.comprar(5));
			alert.showAndWait();
			
			lblCredito.setText("" + e.getCredito());
			lblCambio.setText("" + e.getCambioDisponible());
			btnCompra6.setText(e.getNombre(5) + "\n" + e.getPrecio(5) + "€\n" + e.getStock(5) + " ud");

		} catch (CreditoInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay credito suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (StockInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay stock suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();

		} catch (CambioInsuficienteException ex) {

			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("No hay cambio suficiente");
			alert.setHeaderText(null);
			alert.setContentText(ex.getMessage());
			alert.showAndWait();
		}
	}

	@FXML
	void OnActionDevuelve(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Devolución: ");
		alert.setHeaderText(null);
		alert.setContentText("Se devuelve " + e.devolverCredito() + " euros");
		lblCredito.setText("0.00");
		alert.showAndWait();
	}

	@FXML
	void OnActionIngresaDinero(ActionEvent event) {
		Button btn = (Button) event.getSource();
		double dinero = Double.parseDouble(btn.getId());
		if (dinero < 3.00) {
			e.anyadirDinero(dinero);
			lblCredito.setText("" + e.getCredito());
		} else {
			dinero = dinero/1000.00;
			e.anyadirDinero(dinero);
			lblCredito.setText("" + e.getCredito());
		}
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		String[] nombres = { "Kit-Kat", "Rosquilletas", "Sandwitches", "Agua 1L", "Coca-Cola", "Papas" };
		double[] precios = { 2, 1.9, 2, 0.75, 1, 1.5 };
		int[] stock = { 5, 6, 2, 7, 4, 5 };
		e = new Expendedora(20,nombres, precios, stock);
		
		mostrarEstadoExpendedora();
		
		
	}
	
	private void mostrarEstadoExpendedora() {
		
		lblCambio.setText("" + e.getCambioDisponible());
		
		btnCompra1.setText(e.getNombre(0) + "\n" + e.getPrecio(0) + "€\n" + e.getStock(0) + " ud");
		btnCompra2.setText(e.getNombre(1) + "\n" + e.getPrecio(1) + "€\n" + e.getStock(1) + " ud");
		btnCompra3.setText(e.getNombre(2) + "\n" + e.getPrecio(2) + "€\n" + e.getStock(2) + " ud");
		btnCompra4.setText(e.getNombre(3) + "\n" + e.getPrecio(3) + "€\n" + e.getStock(3) + " ud");
		btnCompra5.setText(e.getNombre(4) + "\n" + e.getPrecio(4) + "€\n" + e.getStock(4) + " ud");
		btnCompra6.setText(e.getNombre(5) + "\n" + e.getPrecio(5) + "€\n" + e.getStock(5) + " ud");
	}
}

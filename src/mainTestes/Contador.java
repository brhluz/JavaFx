package mainTestes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText("" + contador);
		});
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			labelNumero.setText("" + contador);
		});
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoIncremento);
		boxBotoes.getChildren().add(botaoDecremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.getStyleClass().add("conteudo");
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.setSpacing(10);
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		String caminhoCSS = getClass().getResource("/mainTestes/Contador.css").toExternalForm();
		
		Scene scene = new Scene(boxPrincipal,400,400);
		scene.getStylesheets().add(caminhoCSS);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}

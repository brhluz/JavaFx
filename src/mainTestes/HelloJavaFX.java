package mainTestes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
//        Label label = new Label("Olá, JavaFX no Eclipse!");
//        Scene scene = new Scene(label, 300, 100);
//        primaryStage.setTitle("Exemplo JavaFX");
//        primaryStage.setScene(scene);
    	
    	
    	Button botaoA = new Button("A");
    	Button botaoB = new Button("B");
    	Button botaoC = new Button("C");
    	
    	botaoA.setOnAction(e -> System.out.println("A"));
    	botaoB.setOnAction(e -> System.out.println("B"));
    	botaoC.setOnAction(e -> System.exit(0));
    	
    	VBox box = new VBox();
    	
    	box.setAlignment(Pos.CENTER);
    	box.setSpacing(10);
    	box.getChildren().add(botaoA);
    	box.getChildren().add(botaoB);
    	box.getChildren().add(botaoC);
    	
    	Scene unicScene = new Scene(box, 200, 400);
    	primaryStage.setScene(unicScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

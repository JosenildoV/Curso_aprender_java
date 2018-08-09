package viewfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestandoJavafx extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Image imagem = new Image("imagens/livro.png");
		primaryStage.setTitle("testando Javafx hello world");
		primaryStage.getIcons().add(imagem);
		
		Group root = new Group();
		Scene scene = new Scene(root, 300, 300, Color.AQUA);
		
		Button btn_ola = new Button("Dizer olá");
		Label lb_ola = new Label("Minha primeira Janela");
		
		btn_ola.setLayoutX(50);
		btn_ola.setLayoutY(50);
		lb_ola.setLayoutX(30);
		lb_ola.setLayoutY(100);
		
		root.getChildren().addAll(btn_ola, lb_ola);
		
		btn_ola.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				lb_ola.setText("Olá mundo!!");
			}
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}

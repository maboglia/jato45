package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.Cambiatore;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	
	Stage palcoscenico;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.palcoscenico = primaryStage;
		
		try {
			VBox root = new VBox();
			
			Text testo = new Text("Cambia monete");
			Text output = new Text("");
			
			TextField tf = new TextField();
			
			Button btn = new Button();
			btn.setText("Cliccami");
			
			btn.setOnAction(e -> {
				String input = tf.getText();
				int euro = Integer.parseInt(input);
				int[] cambiati = Cambiatore.cambia(euro);
				StringBuilder preOutput = new StringBuilder();
				for(int pezzi : cambiati) {
					preOutput.append("\n" + pezzi);
				}
				output.setText(preOutput.toString());
			});

			root.getChildren().add(testo);
			root.getChildren().add(tf);
			root.getChildren().add(btn);
			root.getChildren().add(output);
			Scene scena = new Scene(root,400,400);
			scena.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Scene scena2 = new Scene(root,400,400);
			
			
			palcoscenico.setTitle("La mia prima finestra");
			palcoscenico.setScene(scena);
			palcoscenico.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

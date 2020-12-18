package ticTacToe;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) {        
        Label top = new Label ("Turn: X");
        Logic gameLogic = new Logic();
        BorderPane mainLayout = new BorderPane();
        Layout layout = new Layout(top);
        
        top.setFont(Font.font("Monospaced: ", 40));
        mainLayout.setTop(top);
        mainLayout.setPadding(new Insets(10, 10, 10, 10));
        
        mainLayout.setCenter(layout.getLayout());
        
        
        
        Scene scene = new Scene(mainLayout);
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
}

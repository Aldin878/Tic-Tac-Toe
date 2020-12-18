package ticTacToe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Layout {

    private GridPane gridLayout;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Logic gameLogic;
    private Label top;
    private int count;
    private boolean game;

    public Layout(Label top) {
        gridLayout = new GridPane();

        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        buttonOne = new Button(" ");
        buttonTwo = new Button(" ");
        buttonThree = new Button(" ");
        buttonFour = new Button(" ");
        buttonFive = new Button(" ");
        buttonSix = new Button(" ");
        buttonSeven = new Button(" ");
        buttonEight = new Button(" ");
        buttonNine = new Button(" ");
        this.top = top;
        gameLogic = new Logic();
        count = 0;
        game = true;

        setLayout();
        setAction();
    }

    public void setLayout() {
        buttonOne.setFont(Font.font("Monospaced", 40));
        buttonTwo.setFont(Font.font("Monospaced", 40));
        buttonThree.setFont(Font.font("Monospaced", 40));
        buttonFour.setFont(Font.font("Monospaced", 40));
        buttonFive.setFont(Font.font("Monospaced", 40));
        buttonSix.setFont(Font.font("Monospaced", 40));
        buttonSeven.setFont(Font.font("Monospaced", 40));
        buttonEight.setFont(Font.font("Monospaced", 40));
        buttonNine.setFont(Font.font("Monospaced", 40));

        gridLayout.addRow(0, buttonOne, buttonTwo, buttonThree);
        gridLayout.addRow(1, buttonFour, buttonFive, buttonSix);
        gridLayout.addRow(2, buttonSeven, buttonEight, buttonNine);

    }

    public int getCount() {
        return this.count;
    }

    public GridPane getLayout() {
        return gridLayout;
    }

    public String checkWinner() {
        if (gameLogic.checkIfWin().equals("X wins!") || gameLogic.checkIfWin().equals("O wins!")) {
            game = false;
            return gameLogic.checkIfWin();
        }

        System.out.println(getCount());
        if (this.getCount() == 8) {
            return "Draw!";
        }

        return "Turn: " + gameLogic.getTurn();
    }

    public void setAction() {
        buttonOne.setOnMouseClicked((event) -> {
            if (buttonOne.getText().isBlank() && game == true) {
                gameLogic.setString(0, 0);
                buttonOne.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonTwo.setOnMouseClicked((event) -> {
            if (buttonTwo.getText().isBlank() && game == true) {
                gameLogic.setString(0, 1);
                buttonTwo.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonThree.setOnMouseClicked((event) -> {
            if (buttonThree.getText().isBlank() && game == true) {
                gameLogic.setString(0, 2);
                buttonThree.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonFour.setOnMouseClicked((event) -> {
            if (buttonFour.getText().isBlank() && game == true) {
                gameLogic.setString(1, 0);
                buttonFour.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonFive.setOnMouseClicked((event) -> {
            if (buttonFive.getText().isBlank() && game == true) {
                gameLogic.setString(1, 1);
                buttonFive.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonSix.setOnMouseClicked((event) -> {
            if (buttonSix.getText().isBlank() && game == true) {
                gameLogic.setString(1, 2);
                buttonSix.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonSeven.setOnMouseClicked((event) -> {
            if (buttonSeven.getText().isBlank() && game == true) {
                gameLogic.setString(2, 0);
                buttonSeven.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonEight.setOnMouseClicked((event) -> {
            if (buttonEight.getText().isBlank() && game == true) {
                gameLogic.setString(2, 1);
                buttonEight.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });

        buttonNine.setOnMouseClicked((event) -> {
            if (buttonNine.getText().isBlank() && game == true) {
                gameLogic.setString(2, 2);
                buttonNine.setText(gameLogic.turn());
                top.setText("Turn: " + gameLogic.getTurn());
                top.setText(checkWinner());
                count++;
            }

            gameLogic.getData();
        });
    }
}

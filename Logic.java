package ticTacToe;

import javafx.scene.control.Label;

public class Logic {

    private String ticTacArray[][];
    private int turn;
    private Layout layout;

    public Logic() {
        ticTacArray = new String[3][3];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                ticTacArray[x][y] = " ";
            }
        }

    }

    public void setString(int x, int y) {
        if (turn % 2 == 0) {
            ticTacArray[x][y] = "X";
        } else {
            ticTacArray[x][y] = "O";
        }
    }

    public String turn() {
        if (turn < 10 && turn > -1) {
            if (turn % 2 == 0 || turn == 0) {
                turn++;
                return "X";
            } else {
                turn++;
                return "O";
            }
        }

        return " ";
    }

    public void getData() {
        for (int x = 0; x < ticTacArray.length; x++) {
            for (int y = 0; y < ticTacArray.length; y++) {
                System.out.print(ticTacArray[x][y]);
            }
            System.out.println("");
        }
    }

    public String getTurn() {
        if (turn < 10 && turn > -1) {
            if (turn % 2 == 0 || turn == 0) {
                return "X";
            } else {
                return "O";
            }
        }

        return " ";
    }

    public String checkIfWin() {

        for (int i = 0; i < 3; i++) {
            if (ticTacArray[i][0].equals("X") && ticTacArray[i][1].equals("X") && ticTacArray[i][2].equals("X")) {
                return "X wins!";
            }

            if (ticTacArray[i][0].equals("O") && ticTacArray[i][1].equals("O") && ticTacArray[i][2].equals("O")) {
                return "O wins!";
            }

            if (ticTacArray[0][i].equals("O") && ticTacArray[1][i].equals("O") && ticTacArray[2][i].equals("O")) {
                return "O wins!";
            }

            if (ticTacArray[0][i].equals("X") && ticTacArray[1][i].equals("X") && ticTacArray[2][i].equals("X")) {
                return "X wins!";
            }

            if (ticTacArray[0][0].equals("X") && ticTacArray[1][1].equals("X") && ticTacArray[2][2].equals("X")) {
                return "X wins!";
            }

            if (ticTacArray[2][0].equals("X") && ticTacArray[1][1].equals("X") && ticTacArray[0][2].equals("X")) {
                return "X wins!";
            }

            if (ticTacArray[0][0].equals("O") && ticTacArray[1][1].equals("O") && ticTacArray[2][2].equals("O")) {
                return "O wins!";
            }

            if (ticTacArray[2][0].equals("O") && ticTacArray[1][1].equals("O") && ticTacArray[0][2].equals("O")) {
                return "O wins!";
            }
        }

        return " ";
    }

}

package com.dfmzone;

public class Main {

    public static void main(String[] args) {

        GameEntry diego = new GameEntry("Diego", 1500);
        GameEntry max = new GameEntry("Max", 1700);
        GameEntry joao = new GameEntry("joao", 1200);

        ScoreBoard scoreBoard = new ScoreBoard(5);

        scoreBoard.add(diego);
        scoreBoard.add(max);
        scoreBoard.add(joao);

        System.out.println(scoreBoard.toString());
    }
}

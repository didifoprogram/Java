package com.dfmzone;

import java.util.Arrays;

public class ScoreBoard {
    private int numOfEntries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        if (numOfEntries < board.length || newScore > board[numOfEntries - 1].getScore()) {
            if (numOfEntries < board.length) {
                numOfEntries++;
            }
            int j = numOfEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > numOfEntries) {
            throw new IndexOutOfBoundsException("Invalid index " + i);
        }
        GameEntry tmp = board[i];
        for (int j = i; j < numOfEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        board[numOfEntries - 1] = null;
        numOfEntries--;
        return tmp;
    }

    @Override
    public String toString() {
        return "ScoreBoard{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}

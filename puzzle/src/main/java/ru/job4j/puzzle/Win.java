package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rst = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board, i)) {
                rst = true;
                break;
            }
            for (int j = 0; j < board[i].length; j++) {
                if (monoVertical(board, j)) {
                    rst = true;
                    break;
                }
            }
        }
        return rst;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rst = true;
        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 1) {
                rst = false;
                break;
            }
        }
        return rst;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rst = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                rst = false;
                break;
            }
        }
        return rst;
    }
}

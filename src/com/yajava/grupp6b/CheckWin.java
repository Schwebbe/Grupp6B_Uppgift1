package com.yajava.grupp6b;

/**
 * 
 * CheckWin class controlls winning conditions.
 * 
 * @author Viktor Tornberg
 * 
 */

public class CheckWin {

    /**
     * 
     * @param GameBoard
     * @return boolean
     * 
     *         Method to check conditions for possible Win. This method looks at
     *         conditions diagonally, horizontally and vertically if true, player
     *         have win.
     * 
     */

    public static boolean Win(GameBoard gb, int player) {

        // Check condition for diagonal, up/down.

        if (gb.getPoint(0, 0) == player && gb.getPoint(1, 1) == player && gb.getPoint(2, 2) == player) {

            return true;
        }

        // Check condition for diagonal down/up.

        if (gb.getPoint(0, 2) == player && gb.getPoint(1, 1) == player && gb.getPoint(2, 0) == player) {

            return true;
        }

        // Loop to check horizontal win

        for (int i = 0; i < 3; i++) {

            if (gb.getPoint(i, 0) == player && gb.getPoint(i, 1) == player && gb.getPoint(i, 2) == player) {

                return true;
            }
        }

        // Loop to check vertical win

        for (int i = 0; i < 3; i++) {

            if (gb.getPoint(0, i) == player && gb.getPoint(1, i) == player && gb.getPoint(2, i) == player) {

                return true;
            }
        }

        return false;

    }

    /**
     * 
     * @param GameBoard
     * @return int
     * 
     *         Method that keeps track on number of free space on the gameboard.
     *         This method is to check if it's a possible draw. The method returns
     *         number of free places.
     * 
     */

    public static int draw(GameBoard gb) {

        int count = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (gb.getPoint(i, j) == 0) {

                    count++;

                }

            }

        }

        return count;

    }

}

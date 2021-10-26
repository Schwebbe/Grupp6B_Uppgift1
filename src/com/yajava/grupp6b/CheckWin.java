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
     *         Method to check conditions for possible X-win. This method looks at
     *         conditions diagonally, horizontally and vertically if true, X have
     *         win.
     * 
     */

    public static boolean WinX(GameBoard gb) {

        // Check condition for diagonal, up/down.

        if (gb.getPoint(0, 0) == 1 && gb.getPoint(1, 1) == 1 && gb.getPoint(2, 2) == 1) {

            return true;
        }

        // Check condition for diagonal down/up.

        if (gb.getPoint(0, 2) == 1 && gb.getPoint(1, 1) == 1 && gb.getPoint(2, 0) == 1) {

            return true;
        }

        // Loop to check horizontal win

        for (int i = 0; i < 3; i++) {

            if (gb.getPoint(i, 0) == 1 && gb.getPoint(i, 1) == 1 && gb.getPoint(i, 2) == 1) {

                return true;
            }
        }

        // Loop to check vertical win

        for (int i = 0; i < 3; i++) {

            if (gb.getPoint(0, i) == 1 && gb.getPoint(1, i) == 1 && gb.getPoint(2, i) == 1) {

                return true;
            }
        }

        return false;

    }

    /**
     * 
     * @param GameBoard
     * @return boolean
     * 
     *         Method to check conditions for possible O-win. This method looks at
     *         conditions diagonally, horizontally and vertically if true, O have
     *         win.
     * 
     */

    public static boolean WinO(GameBoard gb) {

        // Check condition for diagonal, up/down.

        if (gb.getPoint(0, 0) == 2 && gb.getPoint(1, 1) == 2 && gb.getPoint(2, 2) == 2) {

            return true;
        }

        // Check condition for diagonal down/up.

        if (gb.getPoint(0, 2) == 2 && gb.getPoint(1, 1) == 2 && gb.getPoint(2, 0) == 2) {

            return true;
        }

        // Loop to check horizontal win

        for (int i = 0; i < 3; i++) {

            if (gb.getPoint(i, 0) == 2 && gb.getPoint(i, 1) == 2 && gb.getPoint(i, 2) == 2) {

                return true;
            }
        }

        // Loop to check vertical win

        for (int i = 0; i < 3; i++) {

            if (gb.getPoint(0, i) == 2 && gb.getPoint(1, i) == 2 && gb.getPoint(2, i) == 2) {

                return true;
            }
        }

        return false;

    }

}

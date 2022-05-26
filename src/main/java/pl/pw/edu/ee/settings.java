package pl.pw.edu.ee;

public class Settings {
        public int boardLength = 8; // a-h dont set for more than 140
        public int boardWidth = 8; // 1-8
        String tilecolor1 = "Green";
        String tilecolor2 = "White";
        boolean whiteStartsGame = true;
        String[][] defaultPosition1 = {
                        { "bR", "bN", "bB", "bQ", "bK", "bB", "bN", "bR" },
                        { "bP", "bP", "bP", "bP", "bP", "bP", "bP", "bP" },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "wP", "wP", "wP", "wP", "wP", "wP", "wP", "wP" },
                        { "wR", "wN", "wB", "wQ", "wK", "wB", "wN", "wR" }
        };
        String[][] defaultPosition2 = {
                        { "wR", "  ", "bK", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "wN", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "bP", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "bP", "  ", "  ", "  ", "  ", "wK" },
                        { "  ", "wP", "  ", "wB", "  ", "wQ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " }
        };
        String[][] defaultPosition3 = {
                        { "bR", "  ", "  ", "  ", "bK", "  ", "  ", "bR" },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "bN" },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "wR", "  ", "  ", "wK", "  ", "wR", "wR" }
        };
        String[][] defaultPosition4 = {
                        { "bR", "  ", "  ", "  ", "bK", "  ", "bR", "bR" },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "bN" },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "wR", "wR", "wR", "  ", "wR", "wR", "wR" }
        };
        String[][] defaultPosition = {
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "wP", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "bP", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " }
        };
        String[][] defaultPosition6 = {
                        { "bK", "bP", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "wQ", "  ", "  ", "  ", "  ", "  ", "  " }
        };

        String[][] defaultPosition7 = {
                        { "wQ", "  ", "bB", "  ", "  ", "bR", "bK", "  " },
                        { "bP", "  ", "bP", "bP", "  ", "  ", "bP", "bP" },
                        { "  ", "bP", "  ", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "bB", "  ", "  ", "  ", "  ", "  " },
                        { "  ", "  ", "wP", "  ", "wN", "  ", "  ", "  " },
                        { "  ", "  ", "  ", "wB", "  ", "  ", "wP", "  " },
                        { "wP", "wP", "  ", "wK", "  ", "  ", "bQ", "  " },
                        { "wR", "  ", "wB", "  ", "  ", "  ", "  ", "  " }
        };

        String[][] defaultPosition8 = {
                        { "bK", "  ", "  " },
                        { "  ", "  ", "  " },
                        { "  ", "wQ", "  " }
        };
}

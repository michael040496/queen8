import java.util.*;

public class task11 {
    public static void main(String[] args) {

        task11 t11 = new task11();
        int str = 8;

        String[][] brett = new String[str][str];

        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {
                brett[i][j] = "o";
            }
        }


        t11.matprint(brett);
        while (true) {
            System.out.println("Skriv felt: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            int[] pos = t11.translate(input);

            System.out.println(pos[0]);
            System.out.println(pos[1]);

            if (t11.checkPlacable(brett, str, pos[0], pos[1])) {
                brett[pos[0]][pos[1]] = "x";
            }

            t11.matprint(brett);
        }
    }

    public void solve(String[][] brett, int str) {
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {
                if ((brett[j][i]).equals("o")) {
                    for (int k = 0; k < str; k++) {

                    }
                }
            }
        }
    }

    public boolean checkPlacable(String[][] brett, int str, int row, int column) {
        // checks the whole column for the coordinate
        for (int i = 0; i < str; i++) {
            //System.out.println(brett[i][column]);
            if ((brett[i][column]).equals("x")) {
                return false;
            }
        }
        // checks the whole row for the coordinate
        for (int i = 0; i < str; i++) {
            if ((brett[row][i]).equals("x")) {
                return false;
            }
        }
        // checks the diagonals of the coordinate
        // upright
        for (int i = 0; i < str; i++) {

            if ((row - i) < 0 || (column + i >= str)) break;
            if ((brett[row - i][column + i]).equals("x")) {
                System.out.println("upright");
                return false;
            }
        }
        //downleft
        for (int i = 0; i < str; i++) {

            if ((row + i) >= str || ((column - i) < 0)) break;

            if ((brett[row + i][column - i]).equals("x")) {
                System.out.println("downleft");
                return false;
            }
        }

        // upleft
        for (int i = 0; i < str; i++) {

            if ((row - i) < 0 || (column - i < 0)) break;

            if ((brett[row - i][column - i]).equals("x")) {
                System.out.println("upleft");
                return false;
            }
        }

        // downright
        for (int i = 0; i < str; i++) {

            if ((row + i) >= str || (column + i >= str)) break;

            if ((brett[row + i][column + i]).equals("x")) {
                System.out.println("downright");
                return false;
            }
        }
        return true;
    }

    public void matprint(String[][] brett) {
        for (String[] row : brett) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int[] translate(String pos) {
        String pos2 = pos.substring(0, 1);
        String pos1 = pos.substring(1, 2);
        int p1 = 9;
        int p2 = 9;

        if (pos2.equals("a")) p2 = 0;
        if (pos2.equals("b")) p2 = 1;
        if (pos2.equals("c")) p2 = 2;
        if (pos2.equals("d")) p2 = 3;
        if (pos2.equals("e")) p2 = 4;
        if (pos2.equals("f")) p2 = 5;
        if (pos2.equals("g")) p2 = 6;
        if (pos2.equals("h")) p2 = 7;

        if (pos1.equals("1")) p1 = 7;
        if (pos1.equals("2")) p1 = 6;
        if (pos1.equals("3")) p1 = 5;
        if (pos1.equals("4")) p1 = 4;
        if (pos1.equals("5")) p1 = 3;
        if (pos1.equals("6")) p1 = 2;
        if (pos1.equals("7")) p1 = 1;
        if (pos1.equals("8")) p1 = 0;

        if (p1 > 8 || p2 > 8) return null;
        if (p1 < 0 || p2 < 0) return null;

        return new int[]{p1, p2};
    }
}

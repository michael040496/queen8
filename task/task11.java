import java.util.*;
import java.util.Arrays.*;

public class task11{
    public static void main(String[] args) {

        task11 t11 = new task11();
        int str = 8;

        String [][] board = new String[str][str];//a two dimensional array representing the board 

        for (int i = 0; i < str; i++) {    //the visual makeup of the board. A 8x8 board consisting of "o's"
            for (int j = 0; j < str; j++) {
                board[i][j] = "o";
            }
        }


        t11.matprint(board);
        while(true){
            System.out.println("Skriv felt: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            int [] pos = t11.translate(input); //Takes the user input as a rank + file coordinate, and translates it

            if(t11.checkPlacable(board,str,pos[0],pos[1])){
                board[pos[0]][pos[1]] = "x";
            }



            t11.matprint(board);
        }
    }

    public void solve(String [][] board, int str){
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {
                if ((board[j][i]).equals("o")){
                    for (int k = 0; k < str; k++) {

                    }
                }
            }
        }
    }

    public boolean checkPlacable(String [][] board, int str, int row, int column){
        // checks the whole row for the coordinate
        for (int i = 0; i < str; i++) {
            //System.out.println(brett[i][column]);
            if ((board[i][column]).equals("x")){
                return false;
            }
        }
        // checks the whole row for the coordinate
        for (int i = 0; i < str; i++) {
            if ((board[row][i]).equals("x")){
                return false;
            }
        }
        // checks the diagonals of the coordinate
        // upright
        for (int i = 0; i < str; i++) {

            if((row-i) < 0 || (column+i >= str)) break;
            if((board[row-i][column+i]).equals("x")){
                return false;
            }
        }
        //downleft
        for (int i = 0; i < str; i++) {

            if((row+i) >= str || (column-i < 0)) break;
            if((board[row+i][column-i]).equals("x")){
                return false;
            }
        }
        return true;
    }

    public void matprint(String [][] brett){
        for (String[] row : board){
            System.out.println(Arrays.toString(row));
        }
    }

    public int [] translate(String pos){
        String pos1 = pos.substring(0,1);
        String pos2 = pos.substring(1,2);
        int p1 = 9;
        int p2 = 9;

        if(pos1.equals("a")) p1=7;
        if(pos1.equals("b")) p1=6;
        if(pos1.equals("c")) p1=5;
        if(pos1.equals("d")) p1=4;
        if(pos1.equals("e")) p1=3;
        if(pos1.equals("f")) p1=2;
        if(pos1.equals("g")) p1=1;
        if(pos1.equals("h")) p1=0;


        if(pos2.equals("1")) p2=0;
        if(pos2.equals("2")) p2=1;
        if(pos2.equals("3")) p2=2;
        if(pos2.equals("4")) p2=3;
        if(pos2.equals("5")) p2=4;
        if(pos2.equals("6")) p2=5;
        if(pos2.equals("7")) p2=6;
        if(pos2.equals("8")) p2=7;

        if(p1 > 8 || p2 > 8) return null;

        return new int[] {p1,p2};
    }
}

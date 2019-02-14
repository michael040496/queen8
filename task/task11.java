import java.util.*;
import java.util.Arrays.*;

public class task11{
    public static void main(String[] args) {

        task11 t11 = new task11();
        int str = 8;
        
        String [][] brett = new String[str][str];
        
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < str; j++) {
                brett[i][j] = "o";
            }
        }

        
        t11.matprint(brett);
        while(true){
            System.out.println("Skriv felt: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            int [] pos = t11.translate(input);
            brett[pos[0]][pos[1]] = "x";
            
            t11.matprint(brett);
        }        
    }

    public void matprint(String [][] brett){
        for (String[] row : brett){
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
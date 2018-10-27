
import java.util.Scanner;

public class MainClass {


    public static void main(String args[]){

       Matrix matrix = new Matrix();
       matrix.input();
        matrix.check();


        System.out.println("chose the way you sort 'm'(manually) or 'a'(auto)");
        String c="m";
        Scanner reader = new Scanner(System.in);
        c=reader.next();


       if(c.equals("m"))
           matrix.sortManually();
       else
           matrix.sortAuto();

        reader.close();


    }


}

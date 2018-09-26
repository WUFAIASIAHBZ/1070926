import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        double d =  Math.sqrt(x*x+y*y);
        if(d>100){
            System.out.println("outside");
        }else{
            System.out.println("inside");
        }
    }
}

package module1;
import java.util.Scanner;
 class largest { 

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
        ob.close();
    }
}
    


public class DivideDemo {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        finally {
            System.out.println("Program finished");
        }
    }
}
public class ExceptionDemo {

    public static void main(String[] args) {

        // Unchecked Exception
        int a = 10, b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }

        // Checked Exception
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
    }
}
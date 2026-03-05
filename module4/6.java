final class TestFinal {

    final int x = 10;

    final void display() {
        System.out.println("Final method");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        System.out.println("Value = " + t.x);
        t.display();
    }
}
package module3;

class OverloadExample {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class OverrideExample {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends OverrideExample {
    void show() {
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        OverloadExample o = new OverloadExample();
        System.out.println(o.add(2,3));
        System.out.println(o.add(1,2,3));

        OverrideExample obj = new Child();
        obj.show();
    }
}
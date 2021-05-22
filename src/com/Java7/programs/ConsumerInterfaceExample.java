package important.programs;

@FunctionalInterface // annotation for functional interface
interface FuncInterface {

    public int doOperation(int a, int b);
}

public class ConsumerInterfaceExample {

    public static void main(String args[]) {
        FuncInterface multi = (a, b) -> a * b;
        FuncInterface sub = (a, b) -> a - b;
        FuncInterface div = (a, b) -> a / b;
        FuncInterface add = (a, b) -> a + b;

        // simple operation of multiplication of 'a' and 'b'
        System.out.println("Result multi: " + multi.doOperation(30, 60));
        System.out.println("Result sub: " + sub.doOperation(30, 60));
        System.out.println("Result div: " + div.doOperation(30, 60));
        System.out.println("Result add: " + add.doOperation(30, 60));
    }
}

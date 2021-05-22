package StringPrograms;

public class NullPointerExceptionExample {
    public static void main(String[] args) {

        String s = null;
        if (s.equals("aaa")) { //Will throw NullPointerException
            System.out.println("s = " + s);
        }

    }
}

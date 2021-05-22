package InnerClass;

public class OuterClass {

    int a;

    void get() {
        System.out.println("get");
    }
    //abstract strictfp synchronized Transient default these modifiers only applied to method
    //volatile modifier is only used for variables

    private class InnerClass {
        void show() {
            class LocalInnerClass {// Local inner class

                void putdata() {
                    System.out.println("Inside local inner class put data");
                }
            }
            System.out.println("Showww");
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
        outerClass.get();
    }
}

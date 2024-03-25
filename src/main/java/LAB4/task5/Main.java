package LAB4.task5;

public class Main {
    public static void main(String[] args) {
        bar();
    }

    public static void bar() {
        boolean exceptionThrown = false;
        try {
            throw new ClassCastException();
        } catch (RuntimeException e) {
            exceptionThrown = true;
        } finally {
            if (!exceptionThrown) {
                System.out.println("fail");
            }
        }
    }
}

public class BreakpointExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // This will cause an error when we try to divide by zero
        int result = divide(a, b);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b; // Bug here: dividing by zero
    }
}

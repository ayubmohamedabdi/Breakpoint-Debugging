public class BreakpointExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 1; // This will not cause an error when we try to divide by 1
        int result = divide(a, b);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b; // No Bug here: dividing by 1
    }
}

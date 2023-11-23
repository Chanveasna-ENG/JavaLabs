public class recursion {
    public static void main(String[] args) {
        System.out.println("The " + args[0] + "th number in the fibonacci sequence is "
                + recursionFunction(Integer.parseInt(args[0])));
    }

    public static int recursionFunction(int n) {
        // implement fibbonacci sequence
        if (n <= 1)
            return n;
        return recursionFunction(n - 1) + recursionFunction(n - 2);
    }
    
    public static int loopFunction(int n) {
        // implement fibbonacci sequence
        int a = 0, b = 1, c = 0;
        if (n <= 1)
            return n;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c; 
        }
        return c;
    }
}

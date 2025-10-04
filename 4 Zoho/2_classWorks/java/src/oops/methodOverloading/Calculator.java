package oops.methodOverloading;

public class Calculator {

    // Method 1: add two double numbers
    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // Method 2: add three int numbers (change in number of parameters)
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // Method 3: add one int and one long (change in parameter types)
    public long add(int a, long b) {
        System.out.println("Adding int and long");
        return a + b;
    }
    
    // ❗ Ambiguous case - if int int method not defined due to type promotion

    // Method 4: add one long and one int (change in order of parameters)
    public long add(long a, int b) {
        System.out.println("Adding long and int");
        return a + b;
    }

    /*
     * ❌ This method is NOT allowed:
     * public long add(int a, int b) {
     *     return a + b;
     * }
     * 
     * Reason: It has the same parameter types and count as:
     * public double add(double a, double b)
     * or any existing add(int, int) method if present.
     * 
     * Return type alone CANNOT differentiate overloaded methods.
     */

}

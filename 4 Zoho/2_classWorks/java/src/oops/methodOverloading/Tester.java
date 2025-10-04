package oops.methodOverloading;

public class Tester {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // 1️⃣ Call add(double, double)
        double result1 = calc.add(10.5, 5.5);
        System.out.println("Result (double, double): " + result1);
        System.out.println();

        // 2️⃣ Call add(int, int, int)
        int result2 = calc.add(10, 20, 30);
        System.out.println("Result (int, int, int): " + result2);
        System.out.println();

        // 3️⃣ Call add(int, long)
        long result3 = calc.add(15, 10000000000L);  // int and long
        System.out.println("Result (int, long): " + result3);
        System.out.println();

        // 4️⃣ Call add(long, int)
        long result4 = calc.add(10000000000L, 25);  // long and int
        System.out.println("Result (long, int): " + result4);
        System.out.println();

        // 🔴 Ambiguous Case: Will cause compile-time error if defined like this:
        // calc.add(10, 20);  // No method with exactly (int, int) — may conflict with others if defined
    }
}

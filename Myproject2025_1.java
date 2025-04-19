/*
package myproject2025_1;

import java.util.Scanner;

class Calculator {
    int res;
    int a, b;

    // Overloaded Sum methods
    void Sum(int x, int y) {
        a = x;
        b = y;
        res = x + y;
    }

    void Sum(float x, float y) {
        a = (int) x;
        b = (int) y;
        res = (int) (x + y);
    }

    void Sum(int x, float y) {
        a = x;
        b = (int) y;
        res = x + (int) y;
    }

    void Sum(float x, int y) {
        a = (int) x;
        b = y;
        res = (int) x + y;
    }

    void Sum(int x, int y, int z) {
        a = x;
        b = y + z;  // Adjusted just for display logic
        res = x + y + z;
    }

    void sub(int x, int y) {
        a = x;
        b = y;
        res = x - y;
    }

    void mult(int x, int y) {
        a = x;
        b = y;
        res = x * y;
    }

    void div(int x, int y) {
        a = x;
        b = y;
        if (y == 0) {
            System.out.println("⚠️ Cannot divide by zero.");
            res = 0;
            return;
        }
        res = x / y;
    }

    void result(int ch) {
        switch (ch) {
            case 1:
                System.out.println(a + " + " + b + " = " + res);
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + res);
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + res);
                break;
            case 4:
                if (b != 0)
                    System.out.println(a + " / " + b + " = " + res);
                break;
        }
    }
}

public class Myproject2025_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator obj = new Calculator();
        int a = 0, b = 0, ch;
        float fx = 4.5f, fy = 3.5f;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1: Sum");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();

            if (ch > 0 && ch < 5) {
                System.out.print("Enter two numbers: ");
                a = in.nextInt();
                b = in.nextInt();
            }

            switch (ch) {
                case 1:
                    obj.Sum(a, b);          // main overload
                    obj.Sum(fx, fy);        // example: float version
                    obj.Sum(a, fx);         // example: int-float version
                    obj.result(1);
                    break;
                case 2:
                    obj.sub(a, b);
                    obj.result(2);
                    break;
                case 3:
                    obj.mult(a, b);
                    obj.result(3);
                    break;
                case 4:
                    obj.div(a, b);
                    obj.result(4);
                    break;
                case 5:
                    System.out.println("✅ Exiting the calculator. Bye!");
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
}
*/
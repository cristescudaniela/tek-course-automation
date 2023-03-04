package topic3;

public class Operations {

    static void printAritmeticOperations() {
        int a = 8;
        int b = 22;
        int c = 15;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("Result of operation a + b is " + (a + b));
        System.out.println("Result of operation a - b + c is " + (a - b + c));
        System.out.println("Result of operation b * a / c is " + (b * (float) a / (float) c));
        System.out.println("Result of operation b / a is " + (float) b / (float) a);
        System.out.println("Result of operation a % c is " + (a % c));
        System.out.println("Result of operation b % a is " + (b % a));
        System.out.println("Result of operation ++ a is " + (++a));
        System.out.println("a = " + a);
        System.out.println("Result of operation a++ is " + (a++));
        System.out.println("a = " + a);
        System.out.println("Result of operation b-- is " + (b--));
        System.out.println("b = " + b);
        System.out.println("Result of operation --b is " + (--b));
        System.out.println("b = " + b);
    }

    static void printLogicOperations() {

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        System.out.println("!(true && false) = " + !(true && false));
        System.out.println("!(false && false) = " + !(false && false));
        System.out.println("!(true && true) = " + !(true && true));
        System.out.println("!(false && true) = " + !(false && true));
        System.out.println("!(true ) = " + !(true));
        System.out.println("!(false) = " + !(false));
    }

    static void printRelationalOperations() {
        int g = 8;
        int h = 12;
        System.out.println("g == h = " + (g == h));
        System.out.println("g != h = " + (g != h));
        System.out.println("g > h = " + (g > h));
        System.out.println("g < h = " + (g < h));
        System.out.println("g >= h = " + (g >= h));
        System.out.println("g <= g = " + (g <= h));
    }

    static void useForAndWhile(String nume) {
        int s = 0;
        while (s <= 90) {
            System.out.println("Value of s :" + s);
            s = s + 10;
        }
        for (int d = 18; d <= 65; d++) {
            System.out.println("Value of d :" + d);
        }

       // String nume = "Daniela";
        for (int e = 0; e<nume.length(); e++){
            System.out.println(nume.charAt(e));
        }
    }

}

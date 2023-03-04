package topic4;

public class Methods {
    public static int sum(int a, int b) {
        int result = 0;
        if (a > b) {
            System.out.println("Numerele sunt introduse in ordine gresita");
            return 0;
        } else if (a == b) {
            System.out.println("Numarul va fi " + a);
            return a;
        } else {
            for (int i = a; i <= b; i++) {
                result += i;
                System.out.println(result);
            }
            System.out.println("Suma cifrelor de la " + a + " la " + b + " va fi " + result);
        }
        return result;
    }

    public static void sum(int a) {
        if (a > 0) {
            int sum = 0;
            int i = 0;
            while (i <= a) {
                sum += i;
                i++;
                System.out.println(sum);
            }
            System.out.println("Suma cifrelor de la 0 pana la " + a + " va fi " + sum);
        }

    }
}


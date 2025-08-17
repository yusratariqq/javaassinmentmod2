@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class SquareRunner {
    public static int findSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Square sq = SquareRunner::findSquare;

        int num = 7;
        System.out.println("Square of " + num + " = " + sq.calculate(num));
    }
}


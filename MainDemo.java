class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
}

public class MainDemo {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        int result = mu.add(10, 20);
        System.out.println("Sum = " + result);
    }
}

package labs;

public class Lab1_3 {
    public static void main(String[] args)
    {
        double sum = 0;
        for (double i = 1; i <= 10; i++) {
            sum += 1 / i;
        }
        System.out.println(sum);
    }
}
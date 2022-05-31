public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator c=new Calculator();
        int x=50;
        int y=6;

        int s1 = c.sum(x, y);
        c.print(s1);


        int m = c.minus(x, y);

        c.print(m);


    }
}

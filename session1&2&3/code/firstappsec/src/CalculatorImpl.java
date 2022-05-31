import java.util.Calendar;

public class CalculatorImpl extends Calculator implements Calc {
    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        return x-y+y;
    }

    @Override
    public int add1(int x, int y) {
        return 0;
    }

    @Override
    public int add2(int x, int y) {
        return 0;
    }

    @Override
    public int add3(int x, int y) {
        return 0;
    }

    @Override
    public int add4(int x, int y) {
        return 0;
    }
}

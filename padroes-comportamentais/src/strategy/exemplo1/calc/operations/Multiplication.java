package strategy.exemplo1.calc.operations;

public class Multiplication implements Operation{

    @Override
    public int calculate(int n1, int n2) {

        return n1 * n2;
    }
}

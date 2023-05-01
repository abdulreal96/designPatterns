package strategy;

public class MultiplicationStrategy implements StrategyInterface{

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

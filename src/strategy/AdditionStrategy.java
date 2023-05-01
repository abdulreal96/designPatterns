package strategy;

public class AdditionStrategy implements StrategyInterface{

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

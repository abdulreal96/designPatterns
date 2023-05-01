package strategy;

public class SubtractionInterface implements StrategyInterface{

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

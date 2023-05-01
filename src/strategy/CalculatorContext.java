package strategy;

public class CalculatorContext {

    private StrategyInterface strategyInterface;

    public CalculatorContext(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public void setStrategyInterface(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public int executeStrategy(int a, int b){
        return strategyInterface.execute(a, b);
    }
}

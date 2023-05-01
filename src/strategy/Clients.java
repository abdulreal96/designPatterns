package strategy;

public class Clients {

    public static void main(String[] args) {


        CalculatorContext cal = new CalculatorContext(new AdditionStrategy());
        int result = cal.executeStrategy(4, 6);
        System.out.println (result);

        cal.setStrategyInterface(new SubtractionInterface());
        result = cal.executeStrategy(3, 54);
        System.out.println(result);

        cal.setStrategyInterface(new MultiplicationStrategy());
        result = cal.executeStrategy(43, 4);
        System.out.println(result);
    }
}

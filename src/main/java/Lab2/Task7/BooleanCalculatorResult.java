package Lab2.Task7;

public class BooleanCalculatorResult extends CalculatorResult {
    public BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Object computeResult() {

        double leftOperand = Double.parseDouble(calculatorRequest.getLeftOperand().toString());
        double rightOperand = Double.parseDouble(calculatorRequest.getRightOperand().toString());
        String operation = calculatorRequest.getOperation();

        switch (operation) {
            case "==":
                return leftOperand == rightOperand;
            case "!=":
                return leftOperand != rightOperand;
            case ">":
                return leftOperand > rightOperand;
            case "<":
                return leftOperand < rightOperand;
            default:
                throw new IllegalArgumentException("Unsupported operation for BooleanCalculatorResult");
        }
    }
}

package Lab3.task6.calculatorResult;

import Lab3.task6.CalculationRequest;

public class DoubleCalculationResult extends CalculationResult {
    public DoubleCalculationResult(CalculationRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        CalculationRequest request = getRequest();
        Double leftOperand = (Double) request.leftOperand();
        Double rightOperand = (Double) request.rightOperand();

        return switch (request.operation()) {
            case "+" -> leftOperand + rightOperand;
            case "-" -> leftOperand - rightOperand;
            case "*" -> leftOperand * rightOperand;
            case "/" -> leftOperand / rightOperand;
            default -> throw new IllegalArgumentException();
        };
    }
}
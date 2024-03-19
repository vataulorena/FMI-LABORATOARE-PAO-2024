package Lab3.task6.requestMapper;

import Lab3.task6.CalculationRequest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public abstract class NumberCalculatorRequestMapper implements CalculatorRequestMapper {
    protected static final List<String> VALID_OPERATIONS = Arrays.asList("+", "-", "*", "/");

    @Override
    public Optional<CalculationRequest> tryMapRequest(String leftOperandString, String operatorString, String rightOperandString) {
        if (!isOperationValid(operatorString)) {
            return Optional.empty();
        }

        return mapNumbers(leftOperandString, operatorString, rightOperandString);
    }


    protected boolean isOperationValid(String operation) {
        return VALID_OPERATIONS.contains(operation);
    }

    protected abstract Optional<CalculationRequest> mapNumbers(String leftOperandString, String operatorString, String rightOperandString);
}
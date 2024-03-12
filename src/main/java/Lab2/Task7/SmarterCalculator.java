package Lab2.Task7;

import java.util.ArrayList;
import java.util.List;

public class SmarterCalculator {

    public static List<CalculatorResult> calculate(String[] args) {
        List<CalculatorRequest> requests = InputConverter.mapRequests(args);
        List<CalculatorResult> results = new ArrayList<>();
        for (CalculatorRequest request : requests) {
            CalculatorResult result;
            switch (request.getRequestType()) {
                case "Integer":
                    result = new IntegerCalculatorResult(request);
                    break;
                case "Double":
                    result = new DoubleCalculatorResult(request);
                    break;
                case "Boolean":
                    result = new BooleanCalculatorResult(request);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported request type");
            }
            results.add(result);
        }
        return results;
    }

    public static void main(String[] args) {
        String[] inputArgs = {
                "1", "+", "2",
                "2", "*", "5",
                "1", "+", "5.0",
                "1.0", "-", "2",
                "10.0", "/", "1"
        };

        List<CalculatorResult> calculationResults = calculate(inputArgs);

        for (CalculatorResult result : calculationResults) {
            CalculatorRequest request = result.getRequest();
            System.out.println("Operation " + request + " has result " + result.computeResult());
        }
    }
}

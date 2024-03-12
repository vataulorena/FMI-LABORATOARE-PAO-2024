package Lab2.Task7;

import java.util.ArrayList;
import java.util.List;

public class InputConverter {
    public static List<CalculatorRequest> mapRequests(String[] args) {
        List<CalculatorRequest> requests = new ArrayList<>();
        for (int i = 0; i < args.length; i += 3) {
            Object leftOperand = args[i].contains(".") ? Double.parseDouble(args[i]) : Integer.parseInt(args[i]);
            String operation = args[i + 1];
            Object rightOperand = args[i + 2].contains(".") ? Double.parseDouble(args[i + 2]) : Integer.parseInt(args[i + 2]);
            requests.add(new CalculatorRequest(leftOperand, rightOperand, operation));
        }
        return requests;
    }
}

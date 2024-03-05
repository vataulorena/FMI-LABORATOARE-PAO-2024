package Lab1.task4;

public class DummyCalculator {
    public DummyCalculator() {
    }

    public void calculate(String... args) {
        String[] var2 = args;
        int var3 = args.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String arg = var2[var4];
            String[] parts = arg.split(" ");
            String operand1 = parts[0];
            String operation = parts[1];
            String operand2 = parts[2];
            if (!operand1.contains(".") && !operand2.contains(".")) {
                Integer op1 = Integer.parseInt(operand1);
                Integer op2 = Integer.parseInt(operand2);
                Integer result = this.performOperation(op1, op2, operation);
                System.out.println(result);
            } else {
                Double op1 = Double.parseDouble(operand1);
                Double op2 = Double.parseDouble(operand2);
                Double result = this.performOperation(op1, op2, operation);
                System.out.println(result);
            }
        }

    }

    private Double performOperation(Double op1, Double op2, String operation) {
        switch (operation) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Operație necunoscută: " + operation);
        }
    }

    private Integer performOperation(Integer op1, Integer op2, String operation) {
        switch (operation) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Operație necunoscută: " + operation);
        }
    }
}

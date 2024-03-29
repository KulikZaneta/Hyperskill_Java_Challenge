package _static.calculator_with_history;

class Calculator {
    private int value;
    private static int history;

    public Calculator(int value) {
        this.value = value;
        history = 0;
    }

    public int add(int value) {
        history++;
        return this.value += value;
    }

    public int multiply(int value) {
        history++;
        return this.value *= value;
    }

    public static int showHistory() {
        return history;
    }

    public int getValue() {
        return this.value;
    }
}


package Arithmetic;

public class Arithmetic {
    private Number num1;
    private Number num2;

    public Arithmetic(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin() {
        if (num1.doubleValue() < num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }

    public Number getMax() {
        if (num1.doubleValue() > num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }
}

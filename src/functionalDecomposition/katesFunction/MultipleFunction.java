package src.functionalDecomposition.katesFunction;

public class MultipleFunction {
    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (x > 0 && x < 1) {
            return f2(x);
        } else {
            return f3(x);
        }
    }

    //implement your methods here
    public static double f1(double x) {
        return (x * x) + 1;
    }

    public static double f2(double x) {
        return 1 / (x * x);
    }

    public static double f3(double x) {
        return (x * x) - 1;
    }
}

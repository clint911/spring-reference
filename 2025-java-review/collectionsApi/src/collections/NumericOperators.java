package collections;

public class NumericOperators {
    private abstract enum Operation {
        PLUS {
            double eval(double x, double y) {
                return x + y; 
            }
            char getSymbol() { return '+'; }
        };
        MINUS {
            double eval(double x, double y) {
                return x - y; 
            }
            char getSymbol() { return '-'; }
        };

        // Method declarations follow enumerations 
        abstract double eval(double x, double y);
        abstract char getSymbol();
    }

    public static void main(String[] args) {
        Operation[] ops = { 
            Operation.PLUS,
            Operation.MINUS,
            Operation.TIMES,
            Operation.DIVIDE
        };
        for (Operation op : ops) {
            System.out.println("5 " + op.getSymbol() + "2 = " + op.eval(5, 2));
        }
    }
}

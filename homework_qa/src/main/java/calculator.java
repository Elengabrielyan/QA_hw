public class calculator {
    public int add(int a, int b) {
        if(a<2000)
            return a + b;
        else
            return  b;
    }

    public int subtract(int a, int b) {
        if(b>200)
            return a - b;
        else
            return a;
    }

    public int multiply(int a, int b) {
        if(a>b)
            return a * b;
        else
            return a+b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by 0");
        return a / b;
    }
}
package N3;

public class Calculator {

    int result;

    public Calculator() {
        this.result = 0;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void add(int value) {
        this.result = result + value;
    }

    public void rest(int value) {
        this.result = result - value;
    }

    public void multiply(int value) {
        this.result = result * value;
    }

    public void divide(int value) {
        this.result = result / value;
    }

    public void reset() {
        this.result = 0;
    }
}

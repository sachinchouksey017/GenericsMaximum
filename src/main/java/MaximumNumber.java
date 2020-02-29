public class MaximumNumber<T extends Comparable> {

    T number1;
    T number2;
    T number3;

    public MaximumNumber(T num1, T num2, T num3) {
        this.number1 = num1;
        this.number2 = num2;
        this.number3 = num3;
    }

    public <E extends Comparable> E Maximum(E num1, E num2, E num3) {
        return (num1.compareTo(num2) > 0) ? ((num1.compareTo(num3) > 0) ? num1 : num3) : ((num2.compareTo(num3) > 0) ? num2 : num3);

    }

    public T testMaximum() {
        return (number1.compareTo(number2) > 0) ? ((number1.compareTo(number3) > 0) ? number1 : number3) : ((number2.compareTo(number3) > 0) ? number2 : number3);
    }
}

public class MaximumNumber {
    public int greaterNumber(int num1, int num2, int num3) {
        Integer integer1 = Integer.valueOf(num1);
        Integer integer2 = Integer.valueOf(num2);
        Integer integer3 = Integer.valueOf(num3);
        return (integer1.compareTo(integer2) > 0) ? ((integer1.compareTo(integer3) > 0) ? num1 : num3) : ((integer2.compareTo(integer3) > 0) ? num2 : num3);
    }

    public float greaterNumberFloat(float num1, float num2, float num3) {
        Float number1 = Float.valueOf(num1);
        Float number2 = Float.valueOf(num2);
        Float number3 = Float.valueOf(num3);
        return (number1.compareTo(number2) > 0) ? ((number1.compareTo(number3) > 0) ? num1 : num3) : ((number2.compareTo(number3) > 0) ? num2 : num3);
    }
}

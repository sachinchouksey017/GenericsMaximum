public class MaximumNumber {
    public int greaterNumber(int num1, int num2, int num3) {
        Integer integer1 = Integer.valueOf(num1);
        Integer integer2 = Integer.valueOf(num2);
        Integer integer3 = Integer.valueOf(num3);
        return (integer1.compareTo(integer2) > 0) ? ((integer1.compareTo(integer3) > 0) ? num1 : num3) : ((integer2.compareTo(integer3) > 0) ? num2 : num3);
    }

}

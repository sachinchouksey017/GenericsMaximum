import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumNumberProblem {

    MaximumNumber max;

    @Before
    public void initialize() {
    }

    @Test
    public void given_max_number_at_first_position_should_return_same() {
        max = new <Integer> MaximumNumber(14,12,1);
        int maximum = (int) max.testMaximum();
        Assert.assertEquals(14, maximum);
    }

    @Test
    public void given_max_number_at_second_position_should_return_same() {
        max = new <Integer> MaximumNumber(14,129,1);
        int maximum = (int) max.testMaximum();
        Assert.assertEquals(129, maximum);
    }

    @Test
    public void given_max_number_at_third_position_should_return_same() {
        max = new <Integer> MaximumNumber(14, 129, 1200);
        int maximum = (int) max.testMaximum();
        Assert.assertEquals(1200, maximum);
    }

    @Test
    public void given_float_max_number_at_first_position_should_return_same() {
        max = new <Float> MaximumNumber((float) 14.2, (float) 3.2, (float) 2.3);
        float maximum = (float) max.testMaximum();
        Assert.assertEquals(14.2, maximum, 1);
    }

    @Test
    public void given_max_number_float_at_second_position_should_return_same() {
        max = new <Float> MaximumNumber((float) 14.2, (float) 33.2, (float) 2.3);
        float maximum =(float) max.testMaximum();
        Assert.assertEquals(33.2, maximum, 1);
    }

    @Test
    public void given_max_number_float_at_third_position_should_return_same() {
        max = new <Float> MaximumNumber((float) 14.2, (float) 3.2, (float) 22.3);
        float maximum =(float) max.testMaximum();
        Assert.assertEquals(22.3, maximum, 1);
    }
    @Test
    public void given_max_string_at_first_position_should_return_same() {
        max = new <String> MaximumNumber("Peach","Apple","Banana");
        String maximum =(String) max.testMaximum();
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void given_max_string_at_second_position_should_return_same() {
        max = new <String> MaximumNumber("Apple","Peach","Banana");
        String maximum =(String) max.testMaximum();
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void given_max_string_at_third_position_should_return_same() {
        max = new <String> MaximumNumber("Apple","Banana","Peach");
        String maximum =(String) max.testMaximum();
        Assert.assertEquals("Peach", maximum);
    }

}

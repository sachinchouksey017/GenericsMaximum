import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MaximumNumberProblem {

    MaximumNumber max;

    @Before
    public void initialize() {
        max = new MaximumNumber();
    }

    @Test
    public void given_max_number_at_first_position_should_return_same() {
        int maximum = max.greaterNumber(14, 12, 1);
        Assert.assertEquals(14, maximum);
    }

    @Test
    public void given_max_number_at_second_position_should_return_same() {
        int maximum = max.greaterNumber(14, 129, 12);
        Assert.assertEquals(129, maximum);
    }

    @Test
    public void given_max_number_at_third_position_should_return_same() {
        int maximum = max.greaterNumber(14, 129, 1200);
        Assert.assertEquals(1200, maximum);
    }

    @Test
    public void given_float_max_number_at_first_position_should_return_same() {
        float maximum = max.greaterNumberFloat((float) 14.2, (float) 3.2, (float) 2.3);
        Assert.assertEquals(14.2, maximum, 1);
    }

    @Test
    public void given_max_number_float_at_second_position_should_return_same() {
        float maximum = max.greaterNumberFloat((float) 14.2, (float) 33.2, (float) 2.3);
        Assert.assertEquals(33.2, maximum, 1);
    }

    @Test
    public void given_max_number_float_at_third_position_should_return_same() {
        float maximum = max.greaterNumberFloat((float) 14.2, (float) 3.2, (float) 22.3);
        Assert.assertEquals(22.3, maximum, 1);
    }
    @Test
    public void given_max_string_at_first_position_should_return_same() {
        String maximum = max.MaximumString("Peach","Apple","Banana");
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void given_max_string_at_second_position_should_return_same() {
        String maximum = max.MaximumString("Apple","Peach","Banana");
        Assert.assertEquals("Peach", maximum);
    }
    @Test
    public void given_max_string_at_third_position_should_return_same() {
        String maximum = max.MaximumString("Apple","Banana","Peach");
        Assert.assertEquals("Peach", maximum);
    }
}

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

}

package szestkam;

import org.junit.Assert;
import org.junit.Test;

public class ColorTest {

    @Test
    public void test_that_two_color_instance_are_different(){
        Color colorRed = new Color(ColorCode.RED,0.1);
        Color colorBlue = new Color(ColorCode.BLUE,0.4);

        Assert.assertNotEquals(colorRed, colorBlue);
    }

    @Test
    public void test_that_two_color_instance_are_equal(){
        Color colorRed_1 = new Color(ColorCode.RED,0.1);
        Color colorRed_2 = new Color(ColorCode.RED,0.1);

        Assert.assertEquals(colorRed_1, colorRed_2);
    }

    @Test
    public  void test_when_update_color_that_instances_is_immutable(){
        Color colorRed_1 = new Color(ColorCode.RED,0.1);
        Color colorRed_2 = colorRed_1;

        colorRed_2 = colorRed_2.updateCodeColor(ColorCode.RED);
        Assert.assertFalse(colorRed_1 == colorRed_2);
        Assert.assertEquals(colorRed_1, colorRed_2);
    }

    @Test
    public void test_when_getColor_then_instance_is_immutable(){
        Color colorBlue = new Color(ColorCode.BLUE,0.5);
        Color colorBlueBis = colorBlue.getColor();

        Assert.assertFalse(colorBlue == colorBlueBis);
        Assert.assertEquals(colorBlue, colorBlueBis);
    }
}

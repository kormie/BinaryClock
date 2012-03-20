import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 10:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConverterTest {

    //Comment

    @Test
    public void shouldConvertBaseTwo() {
        Converter newConverter = new Converter();
        Assert.assertEquals(1, newConverter.convert("0001"));
        Assert.assertEquals(2, newConverter.convert("0010"));
        Assert.assertEquals(3, newConverter.convert("0011"));
        Assert.assertEquals(3, newConverter.convert("00000000011"));
    }

    @Test
    public void testParseStringToIntArray(){
        Converter newConverter = new Converter();
        Assert.assertArrayEquals(new int[] {0,0,1,0}, newConverter.parseStringToIntArray("0010"));
    }


}

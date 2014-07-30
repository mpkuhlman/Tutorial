import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KhushbooTutorialTest {

    @Test
    public void testGetMesg() throws Exception {
        Assert.assertEquals("Khushboo said hi", new KhushbooTutorial().GetMesg());

    }
}
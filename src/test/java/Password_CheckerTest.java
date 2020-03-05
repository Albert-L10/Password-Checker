import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Password_CheckerTest {

    @Test
    public void Password() {
        String password="Albert~122";

        Assert.assertEquals("Albert~122",password);
    }
}

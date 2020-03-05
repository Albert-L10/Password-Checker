import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Password_CheckerTest {

    @Test
    public void Password() {
        String password="Allie1000";

        Assert.assertEquals("your password is valid","Allie1000",password);
    }
}

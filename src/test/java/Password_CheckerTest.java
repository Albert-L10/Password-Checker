import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Password_CheckerTest {

    @Test
    public void Password() {
        String password;
        Scanner key=new Scanner(System.in);
        password=key.next();

        Assert.assertEquals("Albert~122",password);
    }
}

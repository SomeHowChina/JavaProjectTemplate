import base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.SpringProperties;

import java.util.Properties;

/**
 * Created by songhao on 16/7/7.
 */
public class UTest extends BaseTest{
    @Value("#{configProperties['db.mysql.url']}")
    private String userName;

    @Value("#{configProperties}")
    private Properties springProperties;
    @Test
    public void testProperties() {
        System.out.println(userName);
        System.out.println(springProperties);
    }
}

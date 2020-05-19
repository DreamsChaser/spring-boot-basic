import org.dream.chaser.web.Application;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/19 15:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PasswordTest {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void getPass() {
        String password = encryptor.encrypt("tesst");
        System.out.println(password);
    }
}

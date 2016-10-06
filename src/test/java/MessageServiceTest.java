import com.rh.internship.hello.services.MessageService;
import com.rh.internship.hello.services.MessageServiceFa;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Saeed Zarinfam
 */

public class MessageServiceTest {

    @Test
    public void getHelloMessage_getFaMessage_returnCorrectFaMessage() {
        MessageService messageService = new MessageServiceFa();

        assertThat(messageService.getHelloMessage(), equalTo("خوش آمدید"));
    }


}

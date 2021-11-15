package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutTest {

    @Test
    @Timeout(2)
    @DisplayName("시간 초과 테스트")
    public void test() throws Exception {
        Thread.sleep(4000);
    }

}

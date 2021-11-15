package junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {

    @Test
    @Disabled("테스트 환경 구성 필요")
    public void test() {
        System.out.println("test");
    }

}

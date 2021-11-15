package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatTest {

    @Test
    @RepeatedTest(3)
    @DisplayName("반복 횟수 만큼 테스트")
    public void test(){
        System.out.println("test");
    }

}

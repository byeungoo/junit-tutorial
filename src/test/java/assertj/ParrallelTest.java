package assertj;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

//@Execution(ExecutionMode.CONCURRENT)
public class ParrallelTest {

    @Test
    @DisplayName("병렬 테스트 1")
    public void test1() throws Exception {
        Thread.sleep(4000);
    }

    @Test
    @DisplayName("병렬 테스트 2")
    public void test2() throws Exception {
        Thread.sleep(4000);
    }

    @Test
    @DisplayName("병렬 테스트 3")
    public void test3() throws Exception {
        Thread.sleep(4000);
    }

}

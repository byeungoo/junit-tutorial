package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowTest {

    @Test
    @DisplayName("에러 발생 확인 테스트")
    void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () -> divide(1, 0));
    }

    private int divide(int op1, int op2) {
        return op1 / op2;
    }

}

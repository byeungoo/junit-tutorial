package assertj;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class ExceptionTest {

    @Test
    public void exceptionAssertionTest1() {
        // WHEN
        Throwable thrown = catchThrowable(() -> { throw new Exception("boom!"); });

        // THEN
        assertThat(thrown).isInstanceOf(Exception.class)
                .hasMessageContaining("boom");
    }

    @Test
    public void exceptionAssertionTest2() {
        assertThatThrownBy(() -> { throw new Exception("boom!"); })
                .isInstanceOf(Exception.class)
                .hasMessageContaining("boom");
    }

    @Test
    public void exceptionAssertionTest3() {
        assertThatIOException().isThrownBy(() -> { throw new IOException("boom!"); })
                .withMessage("%s!", "boom")
                .withMessageContaining("boom")
                .withNoCause();
    }


}

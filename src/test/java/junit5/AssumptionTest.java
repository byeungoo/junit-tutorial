package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumptionTest {

    @Test
    @DisplayName("window에서 테스트 실행")
    void runTest_IfWindonw() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"));
        assertEquals(2, 2);
    }

    @Test
    @DisplayName("linux에서 테스트 실행")
    void runTest_IfLinux() {
        assumeTrue(() -> System.getProperty("os.name").startsWith("Linux"));
        assertEquals(2, 2);
    }

    @Test
    @DisplayName("지정한 가정을 충족한 경우 지정한 검증을 수행")
    void runTest() {
        String osName = System.getProperty("os.name");
        assumingThat(
                osName.startsWith("Linux"), // (1) 가정 boolean 또는 BooleanSupplier
                () -> assertEquals(1, 2) // (2) 가정을 충족할 때 실행할 코드(Executable 타입)
        );
        assertEquals(1, 1); // (3)
    }

}
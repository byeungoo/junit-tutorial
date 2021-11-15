package junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllTest {

    @Test
    @DisplayName("assert all 여러개 검증")
    void assertAllSample() {
        int score1 = 100;
        int score2 = 150;
        assertAll(
                () -> assertEquals(100, score1),
                () -> assertEquals(150, score2)
        );
    }

}

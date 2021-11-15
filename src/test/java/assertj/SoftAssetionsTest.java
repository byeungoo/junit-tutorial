package assertj;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SoftAssetionsTest {

    @Test
    @DisplayName("soft assertions로 한번에 검증")
    public void softAssertionsTest() {
        int num1 = 3;
        int num2 = 5;
        String str = "hello";

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(num1).as("num1 is %d", num1).isEqualTo(5);
        softly.assertThat(num2).as("num2 is %d", num2).isEqualTo(6);
        softly.assertThat(str).as("str is %s", str).isEqualTo("hi");
        softly.assertAll();
    }

}

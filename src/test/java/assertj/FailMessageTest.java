package assertj;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FailMessageTest {

    class Member {
        private String name;
        private int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }

    @Test
    @DisplayName("에러 메세지 출력")
    public void test() {
        Member frodo = new Member("Frodo", 33);
        frodo.getAge();
        // failing assertion, remember to call as() before the assertion, not after !
        assertThat(frodo.getAge())
                .as("check %s's age", frodo.getName())  // as를 assertion 이전에 넣는다.
                .isEqualTo(100);
    }
}

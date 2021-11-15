package assertj;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ExtractTest {

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
    @DisplayName("특정 속성 추출 테스트")
    public void extractTest() {
        //given
        List<Member> list = new ArrayList<>();
        Member kim = new Member("Kim", 22);
        Member park = new Member("Park", 25);
        Member lee = new Member("Lee", 22);
        Member amy = new Member("Amy", 25);
        Member jack = new Member("Jack", 22);

        list.add(kim);
        list.add(park);
        list.add(lee);
        list.add(amy);
        list.add(jack);

        // then
        assertThat(list).extracting("name")
                .contains("Kim", "Park", "Lee", "Amy", "Jack");
    }

    @Test
    @DisplayName("특정 속성 추출 테스트2")
    public void extractTest2() {
        //given
        List<Member> list = new ArrayList<>();
        Member kim = new Member("Kim", 22);
        Member park = new Member("Park", 25);
        Member lee = new Member("Lee", 22);
        Member amy = new Member("Amy", 25);
        Member jack = new Member("Jack", 22);

        list.add(kim);
        list.add(park);
        list.add(lee);
        list.add(amy);
        list.add(jack);

        // then
        assertThat(list).extracting("name", "age")
                .contains(tuple("Kim", 22),
                        tuple("Park", 25),
                        tuple("Lee", 22),
                        tuple("Amy", 25),
                        tuple("Jack",22));
    }

}

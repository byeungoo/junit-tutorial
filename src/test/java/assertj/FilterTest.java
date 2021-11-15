package assertj;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FilterTest {

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
    @DisplayName("람다식을 이용한 필터링")
    public void filterTest() {
        //given
        List<Member> list = new ArrayList<>();
        Member kim = new Member("Kim", 22);
        Member park = new Member("Park", 25);
        Member lee = new Member("Lee", 22);
        Member amy = new Member("Amy", 25);
        Member jack = new Member("Jack", 22);

        list.add(kim); list.add(park);
        list.add(lee); list.add(amy);
        list.add(jack);

        // then
        assertThat(list).filteredOn(human -> human.getName().contains("a"))
                .containsOnly(park, jack);
    }

    @Test
    @DisplayName("객체 프로퍼티 검증")
    public void filterTest2() {
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
        assertThat(list).filteredOn("age", 25)
                .containsOnly(park, amy);
    }

    @Test
    @DisplayName("객체 프로퍼티 검증 notIn")
    public void filterTest3() {
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
        assertThat(list).filteredOn("age", notIn(22))
                .containsOnly(park, amy);
    }

}
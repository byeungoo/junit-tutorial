package junit5;

import org.junit.jupiter.api.*;

/**
 * 테스트 라이프 사이클 테스트
 */
public class LifeCycleTest {

    @BeforeEach
    public void beforeTest() {
        System.out.println("before each");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("after each");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }
}

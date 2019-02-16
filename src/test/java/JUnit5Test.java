import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class JUnit5Test {
    private boolean condition=false;

    @BeforeAll
    static void initAll() {
        System.out.println("Run before all methods once");
    }

    @BeforeEach
    void init() {
        System.out.println(" Run before each test methods ");
    }

    @DisplayName("First test")
    @Test
    void testMethod1() {
        System.out.println("Test method 1");
    }

    @Test
    @Disabled
    void testMethod2() {
        System.out.println("  Test method 2");
    }

    @Test
    void testMethod3() {
        System.out.println("    Test method 3");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Run after each test methods ");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println(" Run after all test methods once");
    }

    @Test
    void testMethod11() {
        assumeTrue(condition);
        System.out.println("    Test method 1");
    }

    @Test
    void testMethod21() {
        assumeFalse(condition);
        System.out.println("    Test method 2");
    }

    @Test
    void testMethod31() {
        fail("Hello! :)");
        System.out.println("    Test method 3");
    }

}

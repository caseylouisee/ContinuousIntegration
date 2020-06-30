package softwaretesting.continuousintegration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ContinuousintegrationApplicationTests {

    @Test
    void fakeTest() {
        assertEquals(true,true);
    }

    @Test
    void fakeTest2() {
        assertEquals(true, true);
    }


}

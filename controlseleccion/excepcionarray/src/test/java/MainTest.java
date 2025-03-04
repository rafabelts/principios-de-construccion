import org.junit.jupiter.api.*;
import homework.code.Main;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    @DisplayName("Out of bound")
    void testGetOutOfBound() {
        ArrayIndexOutOfBoundsException exception = assertThrowsExactly(
            ArrayIndexOutOfBoundsException.class, () -> {
                Main.getElementOfArray(Main.arr, 5);
            }
        );

        assertEquals("Out of bound", exception.getMessage());
    }

    @Test
    @DisplayName("Not out of bound")
    void  testNotOutOfBound() {
        assertDoesNotThrow(() -> {
            Main.getElementOfArray(Main.arr, 4);
        });
    }




}

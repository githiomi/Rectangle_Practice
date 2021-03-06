import org.junit.*;
import static org.junit.Assert.*;
//import java.awt.Rectangle;

public class RectangleTest {

    @Test
    public void newRectangle_instanceOfRectangle_true(){
        Rectangle testRectangle = new Rectangle(2,4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getsLength_2(){
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getLength());
    }

    @Test
    public void newRectangle_getsWidth_4(){
        Rectangle testRectangle = new Rectangle(2,4 );
        assertEquals(4, testRectangle.getWidth());
    }

    @Test
    public void newRectangle_checkIfSquare_true() {
        Rectangle testRectangle = new Rectangle(2,2);
        assertEquals(true, testRectangle.ifSquare());
    }

    @Test
    public void newRectangle_whenNotASquare_false() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(false, testRectangle.ifSquare());
    }
}
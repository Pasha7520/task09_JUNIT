import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MyClassTest {

    @InjectMocks
    MyClass myClass;

    @Mock
    MyInterfase myInterfase;

    @Test
    public void testAdd(){
        when(myClass.add(11.0,15.0)).thenReturn(26.00);
        assertEquals(myClass.add(11.0,15.0),26.00);

    }

    @Test
    public void testMultiply(){
        MyInterfase serv = Mockito.mock(MyInterfase.class);
        MyClass myClass = new MyClass(serv);

        when(serv.multiply(21, 10)).thenReturn(210.0);
        assertEquals(myClass.multiply(21, 10), 210.0);
    }

    @Test
    public void testSubtract(){
        when(myInterfase.subtract(300.0, 100.0)).thenReturn(200.00);
        assertEquals(myClass.subtract(300.0, 100.0), 200.0, 0.000001);
        verify(myInterfase).subtract(300.0, 100.0);
    }
    @Test
    public void testDivide(){
        when(myClass.divide(100.0,100.0)).thenReturn(10.0);
        assertNotEquals(myClass.divide(100.0,100.0),101.0);
    }
    @Test
    public void testBiggerInt(){
        when(myInterfase.bigger(301.0, 101.0)).thenReturn(301.0);
        assertEquals(myClass.bigger(301.0, 101.0), 301.0);
    }

    @Test
    void testPrintList() throws Exception {
        List<Integer> list = new ArrayList<>();
        assertThrows(Exception.class, ()->myClass.printList(list));
    }


}

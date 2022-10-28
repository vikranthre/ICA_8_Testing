import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class urinalsTest {
    Urinals urinals = new Urinals();
    @Test
    public void testgoodString1()
    {
        System.out.println("==========VIKRANTH REDDY TRIPURAM=Test one executed========");
        assertEquals(true,urinals.goodString("0001001"));

    }
    @Test
    public void testgoodString2()
    {
        System.out.println("==========VIKRANTH REDDY TRIPURAM==Test 2 executed========");
        assertEquals(false,urinals.goodString("000vamsi001"));
    }
    @Test
    public void testgoodString3()
    {
        System.out.println("==========VIKRANTH REDDY TRIPURAM==Test 3 executed========");
        assertEquals(true,urinals.goodString("0001001"));
    }
    @Test
    public void testCodeUrinals1()
    {
        System.out.println("==========VIKRANTH REDDY TRIPURAM==Test 4 executed========");
        assertEquals(1,urinals.countUrinals("0001001"));
    }
    @Test
    public void testCodeUrinals2()
    {
        System.out.println("==========VIKRANTH REDDY TRIPURAM==Test 5 executed========");
        assertEquals(-1,urinals.countUrinals("1101001"));
    }
}



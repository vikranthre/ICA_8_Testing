import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class urinalsTest {

    @Test
    void test1(String str) {

    }
    @Test
    void testForWrongInput() {
        Execution ex = new Execution();
        boolean b = ex.goodString("Vikranth");
        System.out.println("====== VIKRANTH REDDY TRIPURAM == TEST ONE EXECUTED =======");
        Assertions.assertEquals(false,b);
    }

}

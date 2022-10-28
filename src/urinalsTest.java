import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class urinalsTest {


    @Test
    void testForWrongInput() {
        Execution ex = new Execution();
        boolean b = Execution.goodString("Vikranth");
        System.out.println("====== VIKRANTH REDDY TRIPURAM == TEST ONE EXECUTED =======");
        Assertions.assertEquals(false,b);
    }
    @Test
    void testingFailedScenarioForCountUrinals() {
        Execution ex = new Execution();
        int b = Execution.countUrinals("10000000");
        System.out.println("====== VIKRANTH REDDY TRIPURAM == TEST Two EXECUTED =======");
        Assertions.assertEquals(3,b);
    }

    @Test
    void FileOpenError(){
        Execution ex = new Execution();
        System.out.println("====== VIKRANTH REDDY TRIPURAM == TEST THREE EXECUTED =======");
        Assertions.assertEquals(false,ex.openFile());
    }


}

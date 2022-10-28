import java.util.Scanner;

//author:Vikranth Reddy Tripuram
public class Urinals {
    private static String string;

    public static void main(String[] args) {
        System.out.println("Executing the ICA8Junit Assignment");
    /*    System.out.println("Enter the string");
        Execution ex = new Execution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Integer in = ex.countUrinals(str);
        System.out.println("o/p is " + in);
*/
    }


    public boolean goodString(String s) {
        for(int j=0;j<s.length();j++)
        {
            if(j+1<s.length())
            {
                if(s.charAt(j)=='1' && s.charAt(j+1)=='1')
                    return  false;
            }
            if(s.charAt(j)!='0' && s.charAt(j)!='1')
            {
                return false;
            }
        }
        return true;
    }
}


public class Execution {

    public void openFile()
    {

    }
    public String getString()
    {
        return null;
    }


    static Boolean goodString(String s)
    { // checks to see if valid string
        for(int i=0;i<s.length();i++)
        {
            if(i+1<s.length())
            {
                if(s.charAt(i)=='1' && s.charAt(i+1)=='1')
                    return  false;
            }
            if(s.charAt(i)!='0' && s.charAt(i)!='1')
            {
                return false;
            }
        }
        return true;
    }
    public static int countUrinals(String s)
    {
        System.out.println("Not yet implemented");
        return 0;

    }

}

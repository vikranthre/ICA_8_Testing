

public class Execution {




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


}

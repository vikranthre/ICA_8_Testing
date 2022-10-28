import java.io.*;
import java.util.Scanner;

//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

public class Execution {

    public static boolean goodString(String s) {
        for (int j = 0; j < s.length(); j++) {
            if (j + 1 < s.length()) {
                if (s.charAt(j) == '1' && s.charAt(j + 1) == '1')
                    return false;
            }
            if (s.charAt(j) != '0' && s.charAt(j) != '1') {
                return false;
            }
        }
        return true;
    }


    public boolean openFile() throws IOException  {
        FileReader file =  new FileReader(new File("src/urinal.dat"));;
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();;
        System.out.println(line);
        System.out.println("Urinals count : " + countUrinals(line));
        while (line != null) {
            if(line.equals("-1")){
                break;
            }
            System.out.println(line);
            System.out.println("Urinals count : " + countUrinals(line));
        }
        return false;

    }

    public String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String str = sc.nextLine();
        return str;

    }


    /*    static Boolean goodString(String s)
        { // checks to see if valid string
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
        }*/
    public static int countUrinals(String str) {
        Urinals un = new Urinals();
        boolean isTrue = un.goodString(str);
        if (!isTrue)
            return -1;
        String[] s = str.split("");
        int count = 0;
        int len = s.length;
        int status[] = new int[len];
        for (int i = 0; i < len; i++) {
            status[i] = Integer.parseInt(String.valueOf(s[i]));
        }
        if (len == 1) {
            if (status[0] == 0) {
                count = 1;
                status[0] = 1;
            }
        } else {
            int i = 0;
            if (status[i] == 0 && status[i + 1] != 1) {
                status[i] = 1;
                count++;

            }
            for (i = 1; i < len - 1; i++) {
                if (status[i] == 0 && status[i - 1] != 1 && status[i + 1] != 1) {
                    status[i] = 1;
                    count++;
                }
            }
            if (status[i] == 0 && status[i - 1] != 1) {
                count++;
                status[i] = 1;
            }
        }

        return count;

    }}

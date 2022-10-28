import java.io.*;
import java.util.Scanner;

/**
 * Title: ICA-8 Testing Urinals
 *
 * @author: Vikranth Reddy Tripuram
 */

public class Urinals { //Main class
    public static void main(String[] args)
    {
        Urinals urinals = new Urinals(); // Object creation
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1 for User Input");
        System.out.println("Enter 2 for value from file input");
        int in=scan.nextInt();
        String s = "";
        if(in==1)
        {
            System.out.println("Please enter the input string");
            s=scan.next();
            int uc=urinals.countUrinals(s);
            if(uc==-1)
                System.out.println("Invalid String");
            else
                System.out.println(uc);
        }
        else if(in == 2)
        {
            urinals.openFile("src/urinal.dat");
        }
        else
        {
            System.out.println("Please enter 1 or 2");
        }

    }
    Boolean goodString(String s)
    {
        int k = s.length();
        Boolean t = false;
        for(int j=0;j<k;j++)
        {
            if(j+1<k)
            {
                if(s.charAt(j)=='1' && s.charAt(j+1)=='1')
                    return  t;
            }
            if(s.charAt(j)!='0' && s.charAt(j)!='1')
            {
                return t;
            }
        }
        return true;
    }
    int countUrinals(String s)
    {
        if(goodString(s)==false)
        {
            return -1;
        }
        ///input string aray to char array
        char[] input_str = s.toCharArray();

        int count=0;
        for(int j=0;j<s.length();j++)
        {
            if(input_str[j]=='0')
            {
                if(j>0 && j<s.length()-1)
                {
                    if(input_str[j-1]=='0' && input_str[j+1]=='0')
                    {
                        count++;
                        input_str[j]='1';
                    }

                }
                else if(j==0)
                {
                    if(input_str[j+1]=='0')
                    {
                        count++;
                        input_str[j]='1';
                    }
                }
                else
                {
                    if(input_str[j-1]=='0')
                    {
                        count++;
                        input_str[j]='1';
                    }
                }

            }

        }
        return count;
    }
// opening the new file function
    public boolean openFile1(String path) {
        try{
            Urinals ur = new Urinals();
            FileReader file = new FileReader(new File(path));
            BufferedReader br = new BufferedReader(file);
            String input_str = br.readLine();

            System.out.println("Urinals count  : " + ur.countUrinals(input_str));
            while (input_str != null) {
                input_str = br.readLine();
                if (input_str.equals("-1")) {
                    break;
                }
               System.out.println("Urinals of count can be here : " + ur.countUrinals(input_str));
            }

            return true;
        }
        catch (IOException e) {
            return true;
        }
    }
    public int openFile(String filepath) {
        try{
            Urinals obj=new Urinals();

            File file=new File(filepath);
            if(file==null)
                throw new IOException();

            File cfile=new File("src/counter.txt"); // opening the file
            if(cfile==null)
                throw new IOException();
            Scanner c=new Scanner(cfile);
            int counter=Integer.parseInt(c.nextLine());

            String outputfile="src/rule.txt";
            if(counter!=0)
                outputfile="src/rule"+counter+".txt";

            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                if(s.equals("-1"))
                    break;
                int vacancies=obj.countUrinals(s);
                obj.writeToFile(outputfile,vacancies);

            }

            FileWriter fw=new FileWriter("src/counter.txt");

            if(fw==null)
                throw new IOException();
            fw.write(Integer.toString(counter+1));

            fw.close();

            System.out.println("Successfully written output to "+outputfile);
            return 1;
        }
        catch(IOException e)
        {
            System.out.println("Error in opening file");
            e.printStackTrace();
            return 0;
        }

    }
    public int writeToFile(String opfile,int v){
        try {
            FileWriter fw = new FileWriter(opfile, true);
            if(fw==null)
                throw new IOException();
            BufferedWriter bw=new BufferedWriter(fw);
            if(bw==null)
                throw new IOException();

            bw.write(Integer.toString(v));
            bw.newLine();
            bw.close();
            return 1;
        }
        catch(IOException e){
            System.out.println("Opening error file");
            e.printStackTrace();
            return  0;
        }
    }
}

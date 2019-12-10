/**
 * Write a description of class SecretSnowman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class SecretSnowman
{
    public static void main (String[] args)
    {
        ArrayList<String> one= new ArrayList<String>();
        ArrayList<String> two= new ArrayList<String>();
        Scanner myFile;
        try
        {
            myFile = new Scanner(new File("names.txt"));
        }
        catch (java.io.FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        while(myFile.hasNextLine())
        {
            while(myFile.hasNextLine())
            {
             String line = myFile.nextLine();
             one.add(line);
            }
            while(0 < one.size())
            {
                int object = (int)(Math.random()*one.size());
                two.add(one.get(object));
                one.remove(object);
            }
            for(int r = 0; r < two.size(); r++)
            {
                if(two.size() == 1)
                {   
                    System.out.println("you are the only one");
                    return;
                }
                if(r == two.size()-1)
                {
                    System.out.println(two.get(r) + " is buying a gift for " 
                        + two.get(0));
                }

                else    
                    System.out.println(two.get(r) + " is buying a gift for "
                        + two.get(r+1));
            }
        }

    }
}


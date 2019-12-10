
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
        ArrayList<String> buyer= new ArrayList<String>();
        ArrayList<String> giver= new ArrayList<String>();
        Scanner myFile;
        try
        {
            myFile = new Scanner(new File("names.txT"));
        }
        catch (java.io.FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: " + e.getMessage());
            return;
        }
        while(myFile.hasNextLine())
        {
            String line = myFile.nextLine();
            buyer.add(line);
            for (int i = 0; i< buyer.size()/2; i++)
            {
                giver.add(line);
            }
        }
        
    }
}


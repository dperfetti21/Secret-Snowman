/**
 * Pairs names from a file to assemble gift giving and receiving pairs. 
 *
 * @author (Willow Adler, Declinda Perfetti)
 * @version (December 2019)
 */
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class SecretSnowman
{
 /**
  * takes the names from a file of an even number of names and puts them 
  * into an array to be randomized.Then each name is assigned to another 
  * object so that no single person is left un-paired. 
  * 
  */   
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


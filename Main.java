import java.util.ArrayList;
import java.util.Scanner;
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
import java.io.FileReader;
import java.io.BufferedReader;

public class Main
{
    private static ArrayList<University> uniList = new ArrayList<University>();

    public static void main(String args[]) throws IOException
    {               
        Scanner input = new Scanner(System.in); 

        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX         //calls method

        for(University x : uniList) {    //example of enhanced for loop
            System.out.println(x);
        }
    }

    private static void getDataFromTextFile()  throws IOException     //this method gets the data from the text file and puts it into uniList
    {
        FileReader fr = new FileReader("code.txt");     //file included in same folder as project so no path required, data is separated by commas
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null ) {
            XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  // splits lines by comma into a String array called values
            XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      // create a new University object with data from values array
            XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX           //add the object to the arrayList
        }
        br.close();
    }
}


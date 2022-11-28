//Sarah Hoekema
//CS 145
//Interactive Tea Guide
//Time spent: 10-12 hours

import java.io.*;
import java.util.*;

//TeaGuideMain.java reads in the TeaTypes.txt file to create an ArrayList of type TeaEntry,
//then constructs a GUI for the interactive tea guide.
public class TeaGuideMain {
    public static void main(String[] args) throws FileNotFoundException {
        //construct a Scanner to read file input from TeaTypes.txt
        Scanner fileInput = new Scanner(new File("TeaTypes.txt"));
        //construct an ArrayList to store tea information
        ArrayList<TeaEntry> teaInformation = new ArrayList<TeaEntry>();
        //read through the tea types file
        while(fileInput.hasNext()){
            //store the tea name
            String teaName = fileInput.nextLine();
            String teaDescription = "";
            String s;
            //iterate through each line of the file until hitting the escape word "end"
            do{
                s = fileInput.nextLine();
                //add line to description with a new line escape sequence
                teaDescription += s + "\n";
            } while(!s.equals("end"));
            //remove the escape word from the description
            teaDescription = teaDescription.substring(0, teaDescription.length()-4);
            //add a new TeaEntry to the teaInformation ArrayList
            teaInformation.add(new TeaEntry(teaName, teaDescription));
        }
        //construct a TeaGuideGUI using the teaInformation ArrayList
        new TeaGuideGUI(teaInformation);
    }
}
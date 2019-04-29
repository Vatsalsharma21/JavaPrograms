package CorrectThePath;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String str1 = "src\\usr\\vatsal\\.\\sports\\cricket\\..\\..\\movies\\thor\\blond\\..\\..\\batman";

        List<String> myList = new ArrayList<String>(Arrays.asList(str1.split(Pattern.quote(File.separator))));

        System.out.println(myList);

        List<String> newList = new ArrayList<>();

        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
            if(myList.get(i).equals(".."))
            {
                System.out.println("Removing : " + newList.get(newList.size()-1));
               newList.remove(newList.size() - 1);
            }
            else if(myList.get(i).equals("."))
            {
                //do nothing
                System.out.println("Nothing");
            }
            else
            {
                newList.add(myList.get(i));
                System.out.println("Added");
            }
            System.out.println("***********************");
        }

        System.out.println(newList);
        System.out.println(String.join(File.separator,newList));
    }

}

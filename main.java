 
import java.time.LocalTime;

import java.util.*;
public class main {
    static String[] words={ "sink",
    "apple",
    "landing",
    "mask",
    "batsman",
    "never",
    "evincement",
    "sad",
    "begining",
    "imminution",
    "environmental",
    "sleepify",
    "nope",
    "wauken",
    "guidenece",
    
}; 
 

public static void main(String[] args) throws InterruptedException {
    Random rand=new Random();   // Random class to generate random words from a set of words
    int counter =0; // counts the incorrect words
    String str[]=new String[10]; //store random word generated  
    String s=""; //store the paragraph to be typed by the user
    int len=0;        //Intially the wrong word type will be zero
    for(int i=0;i<10;i++)
    {
        str[i]=words[rand.nextInt(9)] +"";//generate random words and store in variable str
        s+=str[i]+" ";//store random words in s variable
        len++;//count number of random words generated
    }
    System.out.println("\n string-->"+s+"\n\n");
    Scanner sc =new Scanner(System.in);//using scanner class
    System.out.println("Start Typing and press enter after each word:\n");//tell user to start typing
    String typedwords="";//store all the words type by the user
    for(int i=0;i<len;i++){//accept n number of words in paragraph
        String currentWord =sc.nextLine();//take input (words type by user) from user
        typedwords+=currentWord;//add current word type by user to the paragraph written by user
        if (!currentWord.equals(str[i])) {//check word type by user to word in paragraph
            System.out.println("Wrong Input!!!");//if word does not match with type word  
            counter++;//count number of incorrect word typed
        } 
    }
    
    
    System.out.println("WRONG WORDS ARE :"  +counter);//printing number of wrong word typed
    int cpm=typedwords.length();     // caluclates the total number of characters typed by the user
    int wpm =(int)(cpm/5);           //caluclates the total number of words typed by the user (by formualae)
    int incorrectwords = counter;    // It gives the total incorrect words typed by the user 
    int netwpm=(int)(cpm/5)- incorrectwords;   //caluclates the net words typed by the user
    double accruacy =(((double)netwpm/wpm)*100);   //caluclates the accuracy of the user (by using the formuale)
    System.out.println("YOUR GROSS WPM  IS :"+wpm +"!");//printing gross word per minute
    System.out.println("YOUR NET WPM IS :"+netwpm);//printing net word per minute
    System.out.println("\n YOUR CPM IS :" +cpm);//printing character per minute
    System.out.format("YOUR TYPING ACCURACY IS %.2f :",accruacy);//printing typing accuracy
   
    //telling user about typing accuracy status
   if (accruacy <50) {
    System.out.println("You should improve at your typing Skills");
   } else {
      System.out.println("You are GOOD at your Typing skills,Keep improving");
   }
    sc.close();//closing the scanner class
}
}


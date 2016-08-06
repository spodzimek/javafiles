
package hangman;

import java.util.ArrayList;
import java.util.Random;

public class Words
{

   private static ArrayList<String> dictionary=new ArrayList<String>();
   private static Random random=new Random();
 
   
   private static void generateWords()
   {
       String[] words={"ALCOHOL","AMBULANCE","ANSWER", "AUDIENCE", "AUTOMN", 
           "BLANKET", "BRIDGE",
           "CARPENTER", "CHICKEN", "COMFORTABLE", "COMPUTER", "CONFIDENCE", "COUNTRY",
           "DANGEROUS", "DAUGHTER", "DESCRIBE", "DIRECTLY", "DISTANCE",
           "EQUIPMENT", "EXAMPLE", "EXPERIMENT",
           "FAIRYTALE", "FISHERMAN", "GOVERNMENT",
           "IMAGINATION", "IMPORTANCE", "INDUSTRY", "INFLUENCE", "INSTRUMENT",
           "KEYHOLE", "KNOWLEDGE",
           "LANGUAGE", "MACHINE", "NATURAL", "ORDINARY",
           "PICTURE", "PLEASURE", "POPULATION", "POWERFUL", "QUESTION",
           "STRANGE", "SUBSTANCE", "SURFACE", "SURPRISE", "SYSTEM",
           "TEMPERATURE", "TRIANGLE",
           "UNKNOWN", "WORKER", "YOUTHFUL"};
       for(int i=0;i<words.length;i++)
        dictionary.add(words[i]);
   }
   public static String randomWord()
   {
       generateWords();
       return (String) dictionary.get(random.nextInt(dictionary.size()));
   }
}

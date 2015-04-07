import java.text.NumberFormat;
import java.util.Locale;


public class Foothill
{

   public static void main(String[] args) throws Exception
   {
     // for formatgin output neatly
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(4);
      
      // how we time our algorithms
      long startTime, stopTime;
      startTime = System.nanoTime();
      
      // run the algorthim
      // foo bar
      
      // how we determine the time elapsed
      stopTime = System.nanoTime();
      
      // report algorithm time
      System.out.println("\nAlgorithm Elapsed Time: "
         + tidy.format( (stopTime - startTime) / 1e9)
         + "seconds.");    
   }
   
}

import java.util.*;
public class CalenderClassJava implements Runnable {

    public static void main(String[] args) {
        
        Thread t= new Thread(this);
        t.start();

        public void run() {  
            try {  
               while (true) {  
        
                  Calendar cal = Calendar.getInstance();  
                  int hours = cal.get( Calendar.HOUR_OF_DAY );  
                  if ( hours > 12 ) hours -= 12;  
                 int minutes = cal.get( Calendar.MINUTE );  
                 int seconds = cal.get( Calendar.SECOND );  
        
                  SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
                  Date date = cal.getTime();  
                  timeString = formatter.format( date );  
        
                  repaint();  
                  t.sleep( 1000 );  // interval given in milliseconds  
               }  
            }  
            catch (Exception e) { }  
         }

    }


}
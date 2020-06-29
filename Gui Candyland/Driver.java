import javax.swing.SwingUtilities;

class Driver {

   // main
   public static void main(String[] args) {

      // build and show app using the event-dispatching thread
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            Candyland app = new Candyland();
         }
      });

   } // end main

}

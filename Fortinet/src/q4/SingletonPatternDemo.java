package q4;
public class SingletonPatternDemo {
   public static void main(String[] args) {

      //Get the only object available
      ImplementSingleton object = ImplementSingleton.getInstance();

      //show the message
      object.showMessage();
   }
}
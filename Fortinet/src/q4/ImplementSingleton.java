package q4;
public class ImplementSingleton {

	//the variable will be created when the class is loaded 
	//thread safe but not lazy initialized
   private static final ImplementSingleton instance = new ImplementSingleton();

   //make the constructor private so that this class cannot be instantiated
   private ImplementSingleton(){}

   //Get the only object available
   public static ImplementSingleton getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
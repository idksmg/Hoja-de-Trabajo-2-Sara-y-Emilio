import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class main {
  public static void main(String[] args) {
    IPostfixCalculator myCalculator = new CalculatorEmilio(); 

    ArrayList<String> listaDeCadenas = new ArrayList<String>(); 
	  System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
	  Scanner in = new Scanner(System.in);
	  String fpath = in.nextLine();
	  if(fpath == ""){
      fpath = "C:\\codigo\\SEMESTRE 3\\Calculator\\example1.txt"; 
    }
  }
}
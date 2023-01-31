import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class main {
  public static void main(String[] args) {
    IPostfixCalculator myCalculator = new CalculatorEmilioSara(); 

    ArrayList<String> listaDeCadenas = new ArrayList<String>(); 
	  System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
	  Scanner in = new Scanner(System.in);
	  String fpath = in.nextLine();
	  if(fpath == ""){
      fpath = "C:\\codigo\\SEMESTRE 3\\Calculator\\example1.txt"; 
    }

    try {
      File myObj = new File(fpath);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        listaDeCadenas.add(data); 
        System.out.println(data);
      }
      myReader.close();
      try{
        Integer resultado = myCalculator.Calculate(listaDeCadenas); 
        System.out.println(resultado);
      }
      catch(Exception e){
        System.out.println(e.getMessage());
      }

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
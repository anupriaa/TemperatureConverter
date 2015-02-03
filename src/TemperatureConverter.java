import java.util.Scanner;

/**
 * Created by Anupriya on 2/2/2015.
 */
public class TemperatureConverter {
  public static void main(String[] args){
    double celsius, fahrenheit;
    if(args.length != 2){
     System.out.print("Illegal parameters");
      System.exit(1);
    }
    if((!args[0].equalsIgnoreCase("-C")) && ( !args[0].equalsIgnoreCase("-F"))){
        System.out.print("Illegal parameters 2");
        System.exit(1);
    }
    if(isInteger(args[1]) == false)
      System.out.print("Illegel second argument");

    if(args[0].equalsIgnoreCase("-F")){
      celsius = (Integer.parseInt(args[1]) -32) *(5/9);
      System.out.println("Converted temperature "+ celsius +"-C" );
    }else{
      fahrenheit =(Integer.parseInt(args[1]) * (9/5))+32;
      System.out.println("Converted temperature "+ fahrenheit +"-F" );
    }
  }
  public static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
    } catch(NumberFormatException e) {
      return false;
    }
    return true;
  }
}

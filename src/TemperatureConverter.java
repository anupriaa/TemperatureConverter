/**
 * Implements Temperature Converter.
 */
public class TemperatureConverter {
  /**
   * Computes and prints the corresponding value in the other temperature unit.
   * @param args [-C, -F]. Indicates whether the value is in fahrenheit or celsius units.
   *             An integer. The temperature value in either F or C.
   */
  public static void main(String[] args) {
    double celsius, fahrenheit;
    if (args.length != 2) {
     System.out.print("Illegal parameters");
      System.exit(1);
    }
    if ((!args[0].equalsIgnoreCase("-C")) && (!args[0].equalsIgnoreCase("-F"))) {
        System.out.print("Illegal parameters 2");
        System.exit(1);
    }
    if (!(isInteger(args[1]))) {
      System.out.print("Illegal second argument");
    }
    if (args[0].equalsIgnoreCase("-F")) {
      celsius = (Integer.parseInt(args[1]) - 32) * (5 / 9);
      System.out.println("Converted temperature " + celsius + "-C");
    }
    else {
      fahrenheit = ((Integer.parseInt(args[1])) * (9 / 5)) + 32;
      System.out.println("Converted temperature " + fahrenheit + "-F");
    }
  }

  /**
   * Checks if the second argument is an integer or not.
   * @param s Second argument.
   * @return true if value is an integer.
   */
  public static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch (NumberFormatException e) {
      return false;
    }
  }
}

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner myInput = new Scanner (System.in);
    String str = myInput.nextLine ();
    String[] strArray = str.split(" ");
    for (int i = 0; i < strArray.length; i++)
      {
	if (Integer.parseInt (strArray[i]) % 3 == 0)
	  {
	    System.out.print (strArray[i]);
	    System.out.print (' ');
	  }
      }
  }
}

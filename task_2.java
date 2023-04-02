import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String vyacheslav = "Вячеслав";
	    Scanner myInput = new Scanner( System.in);
      String str = myInput.nextLine();
      if (str.equals(vyacheslav)) {
          System.out.println("Привет, Вячеслав");
      }
      else{
          System.out.println("Нет такого имени");
      }
	}
}

import java.util.Scanner;

class Alphabet
{
	public static void main(String[]args)
	{
	Scanner sc1= new Scanner(System.in);

	System.out.print("Input an key: ");
    String input = sc1.next();

    boolean small = input.charAt(0) >= 65 && input.charAt(0) <= 90;
    boolean capital = input.charAt(0) >= 97 && input.charAt(0) <= 122;
    boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("A") || input.equals("E") || input.equals("I")
    || input.equals("O") || input.equals("U");

     if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(small || capital))
        {
            System.out.println("Error. Not a letter. Enter small or capital letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}
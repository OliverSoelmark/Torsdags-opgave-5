import java.util.Scanner;


class Main{
	public static void main(String[] args){

System.out.println("Please type your name");

//Scanner object
Scanner scan = new Scanner(System.in);

String input = scan.nextLine();
String name = input;

System.out.println("Hello " + name + "Please enter your age");

int input2 = scan.nextInt();
int age = input2;

System.out.println("You are" + age + "years old");

int untilRetire = 67-age;

System.out.println(" You have " + untilRetire + " years until retirement ");

	}
}
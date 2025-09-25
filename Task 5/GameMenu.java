import java.util.Scanner;
import java.util.ArrayList;

class GameMenu{
	

private ArrayList<String> actions;

GameMenu(ArrayList<String> actions){
this.actions = actions;
}

public void displayMenu(){
System.out.println(" Game Menu ");
for(String a:actions){
	System.out.println(a);
}
}
public String promptUser(){
System.out.println(" Type a number to choose an action " + actions);
for(String a:actions){
System.out.println(a);
}

Scanner scan = new Scanner(System.in);
String choice = scan.nextLine();
return choice;

}


}


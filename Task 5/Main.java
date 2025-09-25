import java.util.ArrayList;

class Main{
	public static void main(String[] args){

	ArrayList<String> actions = new ArrayList<String>();

	actions.add("1) Start Game");
	actions.add("2) Resume Game");
	actions.add("3) Pause Game");
	actions.add("4) End Game");

	// instantiere GameMenu med listen
	GameMenu menu = new GameMenu(actions);

	// tester displayMenu
	menu.displayMenu();

// Display menu options
String userChoice = menu.promptUser();
int action=Integer.parseInt(userChoice);
doAction(action);
}

// udfører valgt handling
public static void doAction(int action){

	// switch case for de 4 valgte muligheder
switch(action){
case 1:
	System.out.println("Starting Game");
break;
case 2:
	System.out.println("Resuming Game");
break;
case 3:
	System.out.println("Pausing Game");
break;
case 4:
	System.out.println("Ending Game");
break;
default:
	System.out.println("Unknown action " + action);


}
}

}
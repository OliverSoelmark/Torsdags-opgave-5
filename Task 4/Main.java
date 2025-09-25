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
}
}
import java.util.ArrayList;

//Entity class
class GameMenu{
	
private ArrayList<String> actions;();

//Constructor
GameMenu(ArrayList<String> actions){
this.actions = actions;
}

public void displayMenu(){
System.out.println(" Game Menu ");
for(String a:actions){
	System.out.println(a);
}


}

}
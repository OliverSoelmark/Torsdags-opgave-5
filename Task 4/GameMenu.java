import java.util.ArrayList;

class GameMenu{
	
private ArrayList<String> actions = new ArrayList<String>();

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
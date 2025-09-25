import java.util.ArrayList;

public class Team{
	
// Attributes
private String name;
private int rank;
private ArrayList<String> players = new ArrayList<>();	
private String playerName;

//1.f
// constructor der sætter navn
public Team (String name){
this.name = name;
}
//1.h 
//sætter rang
public void setRank(int rank){
this.rank = rank;
}
//1.l
// tilføj spiller
public void addPlayer(String playerName){
players.add(playerName);
}

//1.m
//toString metode
@Override
public String toString(){
String result = " Hold: " + name + " Rang: " + rank;

if(!players.isEmpty()){
result += " Spillere: ";
for (String p:players){
result += " - " + p;

}
}
return result;

}
}
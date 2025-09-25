public class Main {
	public static void main(String[] args) {

//instance 
Team t1 = new Team("Oliver's Bitches ");
// første hold
t1.setRank(1);
t1.addPlayer("Oliver");
t1.addPlayer("Mathias");
t1.addPlayer("Jonas");

//Flere hold
Team t2 = new Team("Warriors ");
t2.setRank(2);
t2.addPlayer("Morten");
t2.addPlayer("Carl");

Team t3 = new Team("Knupperne ");
t3.setRank(3);
t3.addPlayer("Frank");
t3.addPlayer("Erik");

Team t4 = new Team("Vennerne ");
t4.setRank(4);
t4.addPlayer("Egon");
t4.addPlayer("Charlie");

Team t5 = new Team("Knold Totterne ");
t5.setRank(5);
t5.addPlayer("James");
t5.addPlayer("Carlo");



System.out.println(t1);
System.out.println();
System.out.println(t2);
System.out.println();
System.out.println(t3);
System.out.println();
System.out.println(t4);
System.out.println();
System.out.println(t5);
	}

}
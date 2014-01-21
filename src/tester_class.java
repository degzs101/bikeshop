import java.util.Scanner;//import scanner class
public class tester_class {
	public tester_class() {// setup class
	}
	public static void main(String [] args) {
		
		employees[] roster = new employees[5];	// create a array of sales persons and agent
		Scanner input = new Scanner(System.in);	
		roster[0] = new sales_person("Jane Doe", 1245);	// set name and pps number
		roster[1] = new sales_person("Ringo Star", 1234);	
		roster[2] = new sales_agent("John Doe", 1342);	// create a new objects of sales person and agent
		roster[3] = new sales_agent("George Harrison", 3212);	
		roster[4] = new sales_agent("John Lennon", 1432);	
		for (int i = 0; i < roster.length; i++) {	// go through the array
			for(int j = 0; j < roster.length; j++){	
		System.out.printf("Enter amount of sales \n");// print sales
		String  settotalsale=  input.next();
		
		roster[i].settotalsale(j);}// 
			roster[i].gettotalsales();	//call total sales from the 2 classes
		}
		for (int i = 0; i < roster.length; i++) {	
		roster[i].gettotalsales();
		}
		for (int i = 0; i < roster.length; i++) {	
	System.out.println("name is \n " + roster[i].getname() + " \n ppsnumber is \n"
			+ roster[i].getppsnumber() + " " + " totalsales is \n " + roster [i].gettotalsales());
		 // print all details of sales agent and person
		}
	
	
}// close method and class
}
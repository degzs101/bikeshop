
public class employees {// setup class
	// Data Members
    protected static  double  sales;//declare all variables 
    private    String   name;// private	data	members	and	methods	are	accessible to instances	of the	class.
    private int      ppsnumber;
    protected static double totalsale;
    
   // Constructor
    
    public employees(String newname, int newsales, int newpps,int newtotalsale)  {
        name = newname;
       sales = newsales ;
        ppsnumber = newpps;
       totalsale= newtotalsale;
    }
 // methods
	public employees() {
		this( "Not Given");
	
	}
	public employees(String string) {
		
	}

	public String getname(){// setup getters
    	return name;
    }
    public static double getsales(){
    	return sales;
    }
    public int getppsnumber(){
    	return ppsnumber;
    }
    public double gettotalsales(){
    	return totalsale;
    
    }
    public double settotalsale(double totalsale) {	
    	return totalsale;	// setup a setter for total sales
    	 }

	
		
	}
    


    

      
    	
    		
      
      
      






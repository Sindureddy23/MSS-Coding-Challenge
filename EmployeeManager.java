import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
//import java.util.Map;

class ReportingDetails
{
	String manager;
	int numOfReportees;
	public void addValues(String mgr, int numofreportees)
	{
		this.manager = mgr;
		this.numOfReportees += numofreportees; 
		// from this, we get number of employees who report directly to each manager
		// yet to implement the part to get total number of employees reporting to a manager
	}

}
public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	empManagerReportingDetails(); 
	}
	public static void empManagerReportingDetails()
	{
		HashMap<String, String> emp = new HashMap<String, String>();
	
	/*
	 * I have tried to load the excel file provided, 
	 * but couldn't finish it in time. 
	 * So here is the logic I implemented using the hard coded input
	 */
	
	emp.put("a","c"); 
	emp.put("b","c");
	emp.put("c","f");
	emp.put("d","e");
	emp.put("e","f");
	emp.put("f","f");
	ArrayList<ReportingDetails> reportingValues = new ArrayList<ReportingDetails>();
	int count=0;
	for (HashMap.Entry<String, String> i : emp.entrySet()) {
	    String key = i.getKey();
	    String value = i.getValue();
	    
	  //  reportingValues.addValues(value, 1);
	    
	}

	}

}

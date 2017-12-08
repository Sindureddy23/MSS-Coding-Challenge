import java.lang.Thread;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class ThreadClass extends Thread
{
	String threadName1 = new String();
	ThreadClass(String threadName)
	{
		this.threadName1 = threadName; //Assigning thread a name and storing it here
	}
	public void run()
	{
		State threadState = Thread.currentThread().getState(); //To print current state of the thread
		String tname = Thread.currentThread().getName(); 
		DateFormat ymdhms = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss:sss"); //to store the current date and time of execution
		Calendar calender = Calendar.getInstance();
	//System.out.println("$$$$$");
		if(tname.equals("Thread-1")) //just to check the time after a thread sleeps for 5 seconds
		{
			try {
				sleep(5000);
				System.out.println("Current time after sleep is: "+ymdhms.format(calender.getTime()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread name is: "+Thread.currentThread().getName()); 
		System.out.println("Current state of my thread is: "+threadState+" & execution date and time in ms: "+ymdhms.format(calender.getTime()));  
	}
}
public class Threads{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadClass t1 = new ThreadClass("Thread-1");
		ThreadClass t2 = new ThreadClass("Thread-2");
		ThreadClass t3 = new ThreadClass("Thread-3");
		t1.start();
		t2.start();
		t3.start();
	
	}

}

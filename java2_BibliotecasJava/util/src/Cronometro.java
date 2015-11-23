import java.util.Timer;
import java.util.TimerTask;

//cronometro de 10 segundos
public class Cronometro
{
	public static void main (String args[])
	{
		//declaramos las variables

		Timer timer=new Timer();
	
   		System.out.println("Cronometro que cuenta hasta 10 segundos");

		TimerTask timertask = new TimerTask()
		{
			int segundo=1;
			public void run() 
         	{
           		System.out.println(segundo++);
        					
				if (segundo>10)
				{
					System.exit(1);
				}
			}
		};

		timer.schedule(timertask, 0, 1000);
	}
}
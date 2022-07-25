public class Threadproject extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		 Threadproject mt = new   Threadproject();
  		mt.start();
 	}
}
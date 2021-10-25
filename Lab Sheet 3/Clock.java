import java.util.Calendar;
public class Clock
{
    public static void main(String args[])
    {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
        while(true)
        {
            t.tick();
            System.out.println(t);
            if(t.getSecond() == 0)
            {
                break;
            }
            try 
            {
                Thread.sleep(1000 - System.currentTimeMillis() % 1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
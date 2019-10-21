import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args) {
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        System.out.println(month);
    }
}

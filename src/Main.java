import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
	public static void main(String ar[])
	{
		String date = "2021-08-03";
		Timestamp convertedDate = null;
		final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
			Date dateFromString = dateFormat.parse(date);
			System.out.println(dateFromString);
			convertedDate = new Timestamp(dateFromString.getTime());

		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		System.out.println(convertedDate);
	}
}

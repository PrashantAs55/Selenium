package ScriptExecution;

import java.util.Date;

public class Script_Date_Time 
{
		public static void main(String[] args) 
		{
			Date d = new Date();
			System.out.println(d);
			
			
			String ds = d.toString();
			String a = ds.replaceAll(":","-");
			System.out.println(a);
		}
}

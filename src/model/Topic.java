package model;

public class Topic extends DAO{
	public static String JsonAllResult(String str, String dbname)
	{
		return JsonSearch("select * from saved_topic where view_id="+str, dbname);
	}
}
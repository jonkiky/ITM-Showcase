package model;

public class Result extends DAO{
	public static String JsonAllResult(String str, String dbname)
	{
		return JsonSearch("select * from topic_temp where topic_id='"+str+"'", dbname);
	}
}
package model;

public class Train extends DAO{
	public static String JsonAllResult(String dbname)
	{
		return JsonSearch("select * from train_request;", dbname);
	}
}

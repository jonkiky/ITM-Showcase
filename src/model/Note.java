package model;

public class Note extends DAO{
	public static String JsonAllResult(String str, String dbname)
	{
		//return JsonSearch("select * from note_table where (note_id="+str+");");
		return JsonSearch("select * from note_table where (id="+str+");", dbname);
	}
}

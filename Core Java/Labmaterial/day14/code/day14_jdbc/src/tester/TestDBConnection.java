package tester;
import static utils.DBUtils.openConnection;

import java.sql.Connection;
public class TestDBConnection {

	public static void main(String[] args) {
		try(Connection conn=openConnection())
		{
			System.out.println("connected to db...."+conn);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}

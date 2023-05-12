package tester;

import static utils.DBUtils.openConnection;

import java.sql.*;

public class TestStatement {

	public static void main(String[] args) {
		try (// establish db connection
				Connection conn = openConnection();
				// create empty Statement obj which will later wrap sql.
				Statement st = conn.createStatement();
		// exec query : Statement API : public ResultSet executeQuery(String sql) throws
		// SQLException
				ResultSet rst=st.executeQuery("select * from users order by reg_date");
		) {
			//RST processing
			while(rst.next())
				System.out.println("User details ID "+rst.getInt(1)
				+" Complete Name "+rst.getString(2)+" "
						+rst.getString(3)+" email "+rst.getString(4)
				+" reg amount" +rst.getDouble(6)+" reged on "+rst.getDate(7));
		} //rst.close , st.close , cn.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}

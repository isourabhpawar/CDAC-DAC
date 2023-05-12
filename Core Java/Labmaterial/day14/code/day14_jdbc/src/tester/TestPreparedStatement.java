package tester;

//Display complete name , reg date , reg amount for all users reged between 2 dates
import java.sql.*;
import java.util.Scanner;

import static utils.DBUtils.openConnection;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try (// sc
				Scanner sc = new Scanner(System.in);
				// cn
				Connection cn = openConnection();
				// pst : pre parsed n pre compiled stmt : holds the query
				PreparedStatement pst = cn.prepareStatement(
						"select first_name,last_name,reg_date,reg_amt from users where reg_date between ? and ?");) {
			// prompt user
			System.out.println("Enter begin n end date");
			// set IN params : API of PST --public void setType(int paramPos,Type val)
			// throws SE
			pst.setDate(1, Date.valueOf(sc.next()));
			pst.setDate(2, Date.valueOf(sc.next()));
			// exec --API of PST : public RST executeQuery() throws SE
			try (ResultSet rst = pst.executeQuery()) {
				while (rst.next())
					System.out.println("Name " + rst.getString(1) + " " + rst.getString(2) + " reged on "
							+ rst.getDate(3) + " reg amount " + rst.getDouble(4));
			}//rst.close

		}//pst.close , cn.close , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package DaoClasses;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Crime;
import Beans.Criminal;
import Exceptions.CrimeNotFoundException;
import Exceptions.CriminalNotFoundException;
import UtilDB.UtilDB;

public class CriminalDaoImpl  implements CriminalDao{

	@Override
	public List<Crime> getAllCrimes() throws CrimeNotFoundException {
        List<Crime> emp = new ArrayList<>();
		
		try (Connection conn = UtilDB.getConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int crimeId = rs.getInt("crimeId");
				Date crimedate = rs.getDate("crimedate");
				String place_of_crime = rs.getString("place_of_crime");
				String type_crime = rs.getString("Type_crime");
				int no_victims = rs.getInt("No_victims");
				String crime_discription = rs.getString("crime_discription");
				String suspected_name = rs.getString("suspected_name");
				Boolean case_solved = rs.getBoolean("case_solved");
		
				Crime e = new Crime(crimeId, crimedate, place_of_crime, type_crime, no_victims, crime_discription, suspected_name, case_solved);
				
				emp.add(e);
			}
			
			if(emp.isEmpty()) {
				throw new CrimeNotFoundException("There no crime data in this table");
			}
				
			
		} catch (SQLException e) {
			throw new CrimeNotFoundException(e.getMessage());
		}
		
		return emp;
	}

	@Override
	public List<Criminal> getAllCriminals() throws CriminalNotFoundException {
		// TODO Auto-generated method stub
      List<Criminal> emp = new ArrayList<>();
		
		try (Connection conn = UtilDB.getConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int crimeId = rs.getInt("crimeId");
				Date crimedate = rs.getDate("crimedate");
				String place_of_crime = rs.getString("place_of_crime");
				String type_crime = rs.getString("Type_crime");
				int no_victims = rs.getInt("No_victims");
				String crime_discription = rs.getString("crime_discription");
				String suspected_name = rs.getString("suspected_name");
				Boolean case_solved = rs.getBoolean("case_solved");
		
				Criminal e = new Criminal();
				
				emp.add(e);
			}
			
			if(emp.isEmpty()) {
				throw new CriminalNotFoundException("There no crimimal data in this table");
			}
				
			
		} catch (SQLException e) {
			throw new CriminalNotFoundException(e.getMessage());
		}
		
		return emp;
	}

	@Override
	public int countNoOfSolvedCases() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Crime> getAllCrimesThisMonth() throws CrimeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

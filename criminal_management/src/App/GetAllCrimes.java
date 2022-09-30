package App;

import java.util.List;

import Beans.Crime;
import DaoClasses.CriminalDao;
import DaoClasses.CriminalDaoImpl;
import Exceptions.CrimeNotFoundException;

public class GetAllCrimes {

public static void main(String[] args) {
		
		CriminalDao eDao = new CriminalDaoImpl();
		
		try {
			List<Crime> emp = eDao.getAllCrimes();
			
			emp.forEach( e ->{
				System.out.println(e);
				System.out.println("*************************");
			});
			
		} catch (CrimeNotFoundException e) {
			e.printStackTrace();
		}

	}
}

package App;

import java.util.List;


import Beans.Criminal;
import DaoClasses.CriminalDao;
import DaoClasses.CriminalDaoImpl;

import Exceptions.CriminalNotFoundException;

public class GetAllCriminals {

	
public static void main(String[] args) {
		
		CriminalDao eDao = new CriminalDaoImpl();
		
		try {
			List<Criminal> emp = eDao.getAllCriminals();
			
			emp.forEach( e ->{
				System.out.println(e);
				System.out.println("*************************");
			});
			
		} catch (CriminalNotFoundException e) {
			e.printStackTrace();
		}

	}
}

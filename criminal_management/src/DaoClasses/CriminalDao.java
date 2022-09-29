package DaoClasses;

import java.util.List;

import Beans.Crime;
import Beans.Criminal;
import Exceptions.CrimeNotFoundException;
import Exceptions.CriminalNotFoundException;

public interface CriminalDao {

	public List<Crime> getAllCrimes()throws CrimeNotFoundException;
	
	public List<Criminal> getAllCriminals()throws CriminalNotFoundException;
	
	public int countNoOfSolvedCases();
	
	public List<Crime> getAllCrimesThisMonth()throws CrimeNotFoundException;
	
	

	
	
}

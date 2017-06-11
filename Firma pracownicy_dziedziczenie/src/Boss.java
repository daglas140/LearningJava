
public class Boss extends Employer{
	public int premia;
	private String departament;

	public Boss(String name, String surname, int age, int year, int month, int day, int salary, int premia, String departament) {
		super(name, surname, age, year, month, day, salary);
		this.premia = premia;
		this.departament = departament;
	}

	public int getPremia(){
		return premia;
	}

	public String getDepartament(){
		return departament;
	}

	public int getBossSalary(){
		return getSalary() + getPremia();
	}
}

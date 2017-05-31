import java.util.Date;
import java.util.GregorianCalendar;

public class Employer {
	private String name;
	private String surname;
	private int age;
	private int salary;
	private Date hireDay;

	public Employer(){
		name = " ";
		surname = " ";
		age = 0;
		hireDay = new Date();
		salary = 0;
	}
	
	public Employer(String name, String surname,int age, int year, int month, int day, int p){
		this.name = name;
		this.surname = surname;
		this.age = age;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		this.hireDay = calendar.getTime();
		this.salary = p;
	}

	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}

	public Date getHireDay(){
		return hireDay;
	}

	public int getSalary(){
		return salary;
	}

}


public class Employer {
String name;
String surname;
int age;
int salary;

	public Employer(){
		name = " ";
		surname = " ";
		age = 0;
		salary = 0;
	}
	
	public Employer(String name, String surname,int age, int p){
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = p;
	}
}

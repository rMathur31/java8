package java8Practice;

public class Employee {

	private Integer salary;
	private String name;
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(Integer salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	
}


public class EmpDriver {

	public static void main(String[] args) {
		
	 Employee m1 = new Employee("kemal", 2000.0, 45, 1985);
	 
		System.out.println("Tax: " + m1.tax());
		System.out.println("Bonus: " + m1.bonus());
		System.out.println("Raise of Salary: " + m1.increase());
		
		double totalSalary = m1.salary - m1.tax() + m1.bonus();
		System.out.println("Total salary with tax and bonus: " + totalSalary);
		System.out.println("Total salary with the raise of salary: " + (m1.salary + m1.increase()));
		
		

	}

}

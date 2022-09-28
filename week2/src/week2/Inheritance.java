package week2;

public class Inheritance {

	public static void main(String[] args) {
		CustomerInheritance customer=new CustomerInheritance();
		Employee employee=new Employee();
		customer.age=20;
		employee.age=25;
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManagerInheritance customerManager=new CustomerManagerInheritance();
		employeeManager.Add();
		customerManager.Add();
	}

}

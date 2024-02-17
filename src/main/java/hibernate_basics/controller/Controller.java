package hibernate_basics.controller;

import hibernate_basics.dao.EmployeeDao;
import hibernate_basics.dto.Employee;

public class Controller {
	public static void main(String[] args) {	
		EmployeeDao dao = new EmployeeDao();
		Employee emp = new Employee();
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter ID");
//		int id = input.nextInt();
//		
//		System.out.println("Enter Name");
//		String name = input.next();
//		
//		System.out.println("Sal");
//		int sal = input.nextInt();
//		
//		System.out.println("Department no:");
//		int deptno = input.nextInt();
//		
//		input.close();
//		emp.setE_id(id);
//		emp.setE_name(name);
//		emp.setE_sal(sal);
//		emp.setDept_no(deptno);
		
		//This creates the table
//		dao.create(emp);
		
		//This actually fetches all and then we can fetch individual rows
//		List<Employee> list = dao.findAll();
//		for(Employee em : list) {
//			System.out.println(em.getE_name());
//		}
		//This fetches the name by ID
		Employee em = dao.findByID(1);
		System.out.println(em.getE_name());
		
		
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Address;
import model.entities.Department;
import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address adress = new Address(email, phone);
		Department dept = new Department(departmentName, payDay, adress);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionário " + i + ":");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(name, salary);
			dept.addEmployee(employee);
		}
		
		showReport(dept);
		
		sc.close();
	}

	private static void showReport(Department dept) {
		System.out.println(dept);		
	}

}

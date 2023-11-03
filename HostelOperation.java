package Hostel;

import java.util.ArrayList;
import java.util.Scanner;

public class HostelOperation 
{
	Scanner scanner = new Scanner(System.in);
	
	public  void registration(ArrayList <Student> students)
	{
		
		System.out.println("Please Enter Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Please Enter Id: ");
		String id = scanner.next();
		
		System.out.println("Please Enter Phone: ");
		String phone = scanner.next();
		
		System.out.println("Please Enter Batch: ");
		String batch = scanner.next();
		
		System.out.println("Please Enter Room: ");
		String room = scanner.next();
		
		System.out.println("Please Enter Department: ");
		String department = scanner.next();
		
		System.out.println("Please Enter Year: ");
		String year = scanner.next();
		
		System.out.println("Please Enter Blood_Group: ");
		String blood_group = scanner.next();
		
		System.out.println("Please Enter Parents_Contact: ");
		String parents_contact = scanner.next();
		
		scanner.nextLine();
		Student student = new Student(name, id, phone, batch, room, department, year, blood_group, parents_contact);
		
		students.add(student);
		System.out.println("One student is inserted. Now total student are: "+students.size()+"\n");
		System.out.println("\n");
	}
	
	
	
	public void serchbyId(ArrayList <Student> students) 
	{
		System.out.printf("Please Enter A Valid Id: ");
		String id = scanner.next();
		
		for(Student s : students)
		{
			if(id.equalsIgnoreCase(s.id) == true) 
			{
				this.display(s);
				System.out.println(s.name+"this student is removed");
				students.remove(s);
				System.out.println("Removed successful, total student are: "+students.size());
				return;
			}	
		}
		System.out.println("No student found");
	}
	  
	
	
	public void serchbyYear(ArrayList <Student> students) 
	{
		System.out.printf("Please Enter A Valid Yrar: ");
		String year = scanner.next();
		
		System.out.println("Searching student...Year: ");
		for(Student s : students)
		{
			if(s.year == year) 
			{
				this.display(s);	
			}	
		}
	 }
	
	
	
	public void delete(ArrayList <Student> students) 
	{
		System.out.printf("Please Enter A Valid Id: ");
		String id = scanner.next();
		
		for(Student s : students)
		{
			if(id.equalsIgnoreCase(s.id) == true) 
			{
				this.display(s);
				return;
			}	
		}
		System.out.println("No student found");
	}
	
	
	public void display(Student students)
	{
		System.out.println("Name: "+ students.name+"\n");
		System.out.println("Id: "+ students.id+"\n");
		System.out.println("Phone: "+ students.phone+"\n");
		System.out.println("Batch: "+ students.batch+"\n");
		System.out.println("Room: "+ students.room+"\n");
		System.out.println("Department: "+ students.department+"\n");
		System.out.println("year: "+ students.year+"\n");
		System.out.println("Blood_group: "+ students.blood_group+"\n");
		System.out.println("Parents_Contact: "+ students.parents_contact+"\n");
		System.out.println();
	}
}

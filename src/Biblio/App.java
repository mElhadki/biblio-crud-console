package Biblio;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static int menu () {

        int selection;
        
        //Read the data inserted into console
        
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices :");
        System.out.println("-------------------------\n");
        System.out.println("1 - Student management");
        System.out.println("2 - Employee management");
        System.out.println("3 - Book management");
        System.out.println("4 - Quit");

        //next it's the value
        
        selection = input.nextInt();
        return selection;    
    }
public static int submenu() {

    int selection;
    Scanner input = new Scanner(System.in);

    /***************************************************/

    System.out.println("Choose from these choices :");
    System.out.println("-------------------------\n");
    System.out.println("1 - Create ");
    System.out.println("2 - Update");
    System.out.println("3 - Delete");
    System.out.println("4 - Read");
    System.out.println("5 - Back");

    selection = input.nextInt();
    return selection;    
}

public static void main(String[] args) {	
	Scanner input = new Scanner(System.in);
  ArrayList<student> students = new ArrayList<student>();
  ArrayList<worker> workers = new ArrayList<worker>();
  ArrayList<book> books = new ArrayList<book>();
  int out = 0;
  int back = 0;
  do {
	  
switch (menu()) {

case 1:
	 do
	 { 
		 switch (submenu()) {
	
     case 1:   		
    	 int age;
    	 int id;
    	 String firstName;
    	 String lastName;
    	 String email;
    	 String adress;
    	 
    	  id= students.size()+1;
    	 System.out.println("First name :");
    	 firstName = input.next();
    	 System.out.println("last name :");
    	 lastName = input.next();
    	 System.out.println("Age :");
    	 age = input.nextInt();
    	 System.out.println("Email :");
    	 email = input.next();
    	 System.out.println("Adress :");
    	 adress = input.next();
    	 student student = new student(firstName,lastName,email,id,age,adress);
    	 student.setId(id);
    	 student.setAdress(adress);
    	 student.setAge(age);
    	 student.setEmail(email);
    	 student.setFirstName(firstName);
    	 student.setLastName(lastName);
    	 students.add(student);
			System.out.println("Successfully added !");
         break;
     case 2:
    	 System.out.println(" tapez le id ");
    	 id = input.nextInt();
    	 System.out.println("First name :");
    	 firstName = input.next();
    	 System.out.println("last name :");
    	 lastName = input.next();
    	 System.out.println("Age :");
    	 age = input.nextInt();
    	 System.out.println("Email :");
    	 email = input.next();
    	 System.out.println("Adress :");
    	 adress = input.next();
    	 student updateStudent = new student(firstName,lastName,email,id,age,adress);
    	 updateStudent.setId(id);
    	 updateStudent.setAdress(adress);
    	 updateStudent.setAge(age);
    	 updateStudent.setEmail(email);
    	 updateStudent.setFirstName(firstName);
    	 updateStudent.setLastName(lastName);
    	 students.set(id-1, updateStudent);
    	 System.out.println("Successfully modified !");
         break;
     case 3:
    	 System.out.println(" Enter the identification number  :");
    	 id = input.nextInt();
    	 students.remove(id-1);
    	 System.out.println("Successfully removed !");
         break;
     case 4:
    	 	System.out.println(students);
      	
          break;
     case 5:
     	back = 1;
     	
         break;
     default:
         System.out.println(" Input error !!");
         
 };
	 } while (back == 0);
   
    break;
case 2:
	 do { switch (submenu()) {
	
 case 1:   		
	 int id;
	 String firstName;
	 String lastName;
	 String email;
	 String regNumber;
	 
	  id= workers.size()+1;
	 System.out.println("First name:");
	 firstName = input.next();
	 System.out.println("Last name :");
	 lastName = input.next();
	 System.out.println("email :");
	 email = input.next();
	 System.out.println("Regestring number :");
	 regNumber = input.next();
	 worker worker = new worker(firstName,lastName,email,id,regNumber);
	 worker.setId(id);
	 worker.setRegNumber(regNumber);
	 worker.setEmail(email);
	 worker.setFirstName(firstName);
	 worker.setLastName(lastName);
	 
	 workers.add(worker);
		System.out.println("Successfully added !");
     break;
 case 2:
	 System.out.println(" Enter the identification number  : ");
	 id = input.nextInt();
	 System.out.println("Fisrt name :");
	 firstName = input.next();
	 System.out.println("last name :");
	 lastName = input.next();
	 System.out.println("Email :");
	 email = input.next();
	 System.out.println("RegNumber :");
	 regNumber = input.next();
	 worker upWorker = new worker(firstName,lastName,email,id,regNumber);
	   upWorker.setId(id);
	   upWorker.setRegNumber(regNumber);
	   upWorker.setEmail(email);
	   upWorker.setFirstName(firstName);
	   upWorker.setLastName(lastName);
	   workers.set(id-1, upWorker);
	 System.out.println("Successfully modified !");
     break;
 case 3:
	 System.out.println("  Enter the identification number  : ");
	 id = input.nextInt();
	 workers.remove(id-1);
     break;
 case 4:
	 	System.out.println(workers);
  	
      break;
 case 5:
 	back = 1;
 	
     break;
 default:
     System.out.println(" Input error !!! ");
     
};
 } while (back == 0);
    break;
case 3:
	 do { switch (submenu()) {
	
 case 1:   		

	 int id;
	 String label;
	 String name;
	 String writer;
	 
	 book book = new book();
	 id= books.size()+1;
	 System.out.println("Label :");
	 label = input.next();
	 System.out.println("Name :");
	 name = input.next();
	 System.out.println("Writer :");
	 writer = input.next();

	 book.setId(id);
	 book.setLabel(label);
	 book.setName(name);
	 book.setWriter(writer);
	

	 books.add(book);
		System.out.println("Successfully added !");
     break;
 case 2:
	 System.out.println(" Enter the identification number  :");
	 id = input.nextInt();
	 System.out.println("label :");
	 label = input.next();
	 System.out.println(" Name :");
	 name = input.next();
	 System.out.println("Writer :");
	 writer = input.next();
	 book upwriter = new book();
	 upwriter.setId(id);
	 upwriter.setLabel(label);
	 upwriter.setName(name);
	 upwriter.setWriter(writer);

	 books.set(id-1,upwriter );
	 System.out.println("Successfully modified !");
     break;
 case 3:
	 System.out.println(" Enter the identification number  : ");
	 id = input.nextInt();
	 books.remove(id-1);
	 System.out.println(" Successfully removed ");
     break;
 case 4:
	 	System.out.println(books);
  	
      break;
 case 5:
 	back = 1;
 	
     break;
 default:
     System.out.println(" Input error");
     
};
 } while (back == 0);
    break;
case 4:
	System.exit(0);
	
    break;
default:
    System.out.println(" Input error");
}

  } 
  
  while (out == 0);
   
}


}

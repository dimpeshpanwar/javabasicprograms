import java.util.Scanner;

class Student {
    private int id;
	private String name;
	private double marks;
	private int age;
	
	public Student(int id, String name, double marks, int age){
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getMarks(){
		return marks;
	}
	public void setMarks(double marks){
		this.marks=marks;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
};
class Solution{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
         int n = sc.nextInt();sc.nextLine();
         Student[] student= new Student[n]; 
         
  for(int i=0;i<4;i++) 
  { 
            int id=sc.nextInt();sc.nextLine();
            String name=sc.nextLine();
            double marks = sc.nextDouble();sc.nextLine();
            int age=sc.nextInt();sc.nextLine();
            student[i]= new Student(id, name, marks, age); 
  } 
  
   double marks=sc.nextDouble();sc.nextLine();
   
   Student std = searchStudentbyMarks(student, marks);
    if(std != null){
        System.out.println("id - "+std.getId());
        System.out.println("name - "+std.getName());
        System.out.println("marks - "+std.getMarks());
        System.out.println("age - "+std.getAge());
    }else{
        System.out.println("NO Student found with mentioned marks");
    }
    
    Student maxage_student = findStudentWithMaximumAge(student);
    
        System.out.println("id - "+maxage_student.getId());
        System.out.println("name - "+maxage_student.getName());
        System.out.println("marks - "+maxage_student.getMarks());
        System.out.println("age - "+maxage_student.getAge());
    
  
    }
    
    public static Student searchStudentbyMarks(Student[] student, double marks)
	{
     if(student!=null) 
     {      
         for(int i=0;i<4;i++) 
         {  
             if(marks == student[i].getMarks()){
                 return student[i];
             }
                
             } 
             
         } 
    return null;
 } 
 
 public static Student findStudentWithMaximumAge(Student[] student)
	{
	     int max_age = 0;
        int leastindex = -1;
     if(student!=null) 
     {      
         for(int i=0;i<4;i++) 
         {  
              if(student[i].getAge() > max_age){
                    max_age = student[i].getAge();
                    leastindex = i;
                   }
                
             } 
             return student[leastindex];
         } 
    return null;
 }
	}

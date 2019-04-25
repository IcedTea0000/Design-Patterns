package DAO_pattern;

public class Main {

	public static void main(String[] args){
		StudentDao studentDao=new StudentDaoImpl();
		
		Student s1=new Student("Victor",1);
		Student s2=new Student("Lucas",2);
		Student s3=new Student("John",3);
		
		studentDao.addStudent(s1);
		studentDao.addStudent(s2);
				
		studentDao.deleteStudent(s2);
	}
	
}

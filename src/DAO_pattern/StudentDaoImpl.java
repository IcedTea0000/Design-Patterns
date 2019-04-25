package DAO_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	List<Student> students;
	
	public StudentDaoImpl(){
		students =new ArrayList<Student>();
	}
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return students.get(id);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getId()).setName(student.getName());
		System.out.println("update info successfully");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student);
		System.out.println("remove student "+student.getName()+" successfully");
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		System.out.println("add student "+student.getName()+" successfully");
	}

}

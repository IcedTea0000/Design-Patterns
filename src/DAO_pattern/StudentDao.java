package DAO_pattern;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudent();
	public Student getStudent(int id);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public void addStudent(Student student);
}

package task1;
import task1.Student;
import java.util.ArrayList;
import java.util.List;
public class Service {
	List<Student>studentList=new ArrayList<>();
	public Service() {
		addDefaultData();
	}
	public void addDefaultData() {
		Student stu=new Student();
		stu.setStudentName("Kapish");
		stu.setStudentSection("Y");
		stu.setStudentGrade("A");
		addStudent(stu);
	}
	public List<Student>getAllData(){
		return studentList;
	}
	public void addStudent(Student student) {
		if(student!=null) {
			studentList.add(student);
		}
	}
	public void update(String name,String section) {
		for(Student student:studentList) {
			if(student.getStudentName().equals(name)) {
				student.setStudentSection(section);
				break;
			}
		}
		
		
	}
	public List<Student>searchByName(String name){
		List<Student>studentListByName=new ArrayList<>();
		for(Student student:studentList) {
			if(student.getStudentName().equals(name)) {
				studentListByName.add(student);
			}
		}
		if(studentListByName.isEmpty()) {
			
		}
		return studentListByName;
	}
	public void deleteStudent(String section) {
		for(Student student:studentList) {
			if(student.getStudentSection().equals(section)) {
				studentList.remove(student);
				break;
			}
		}
	}
	

}

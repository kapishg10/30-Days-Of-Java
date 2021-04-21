package task3;

import java.util.ArrayList;
import java.util.List;

class TeacherDaoImpl {
	
	List<Teacher> teachers;

	   public TeacherDaoImpl(){
		   teachers = new ArrayList<Teacher>();
		   Teacher teacher1 = new Teacher("Pardeep",0);
		   Teacher teacher2 = new Teacher("Amanpreet",1);
	      teachers.add(teacher1);
	      teachers.add(teacher2);		
	   }

	   public void deleteTeacher(Teacher student) {
		   teachers.remove(student.getTeacherId());
	      System.out.println("Teacher: Id " + student.getTeacherId() + ", deleted from database");
	   }

	   public List<Teacher> getAllTeachers() {
	      return teachers;
	   }

	   public Teacher getTeacher(int rollNo) {
	      return teachers.get(rollNo);
	   }


	   public void updateTeacher(Teacher teacher) {
	      teachers.get(teacher.getTeacherId()).setTeacherName(teacher.getTeacherName());
	      System.out.println("Teacher: Id " + teacher.getTeacherId() + ", updated in the database");
	   }
}

package task3;

import java.util.ArrayList;
import java.util.List;

class TeacherDaoImpl implements TeacherDao{
	
	List<Teacher> teachers;

	   public TeacherDaoImpl(){
		   teachers = new ArrayList<Teacher>();
		   Teacher teacher1 = new Teacher("Pardeep",0);
		   Teacher teacher2 = new Teacher("Amanpreet",1);
	      teachers.add(teacher1);
	      teachers.add(teacher2);		
	   }

	   public void deleteTeacher(Teacher teacher) {
		   teachers.remove(teacher.getTeacherId());
	      System.out.println("Teacher: Id " + teacher.getTeacherId() + ", deleted from database");
	   }

	   public List<Teacher> getAllTeachers() {
	      return teachers;
	   }

	   public Teacher getTeacher(int teacherId) {
	      return teachers.get(teacherId);
	   }


	   public void updateTeacher(Teacher teacher) {
	      teachers.get(teacher.getTeacherId()).setTeacherName(teacher.getTeacherName());
	      System.out.println("Teacher: Id " + teacher.getTeacherId() + ", updated in the database");
	   }
}

package task3;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherDaoImpl teacherDao = new TeacherDaoImpl();

	      //print all students
	      for (Teacher student : teacherDao.getAllTeachers()) {
	         System.out.println("Teacher: [Id : " + student.getTeacherId() + ", Name : " + student.getTeacherName() + " ]");
	      }


	      //update student
	      Teacher teacher = teacherDao.getAllTeachers().get(0);
	      teacher.setTeacherName("Manpreet");
	      teacherDao.updateTeacher(teacher);

	      //get the student
	      teacherDao.getTeacher(0);
	      System.out.println("Teacher: [Id : " + teacher.getTeacherId() + ", Name : " + teacher.getTeacherName() + " ]");	
	}

}

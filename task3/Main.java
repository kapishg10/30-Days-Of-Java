package task3;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherDaoImpl teacherDao = new TeacherDaoImpl();

	      //print all teachers
	      for (Teacher teacher : teacherDao.getAllTeachers()) {
	         System.out.println("Teacher: [Id : " + teacher.getTeacherId() + ", Name : " + teacher.getTeacherName() + " ]");
	      }


	      //update teacher
	      Teacher teacher = teacherDao.getAllTeachers().get(0);
	      teacher.setTeacherName("Manpreet");
	      teacherDao.updateTeacher(teacher);

	      //get the teacher
	      teacherDao.getTeacher(0);
	      System.out.println("Teacher: [Id : " + teacher.getTeacherId() + ", Name : " + teacher.getTeacherName() + " ]");	
	}

}

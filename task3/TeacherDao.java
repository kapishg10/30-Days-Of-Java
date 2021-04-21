package task3;

import java.util.List;

class interface TeacherDao {
	
	public List<Teacher> getAllTeachers();
	public Teacher getTeacher(int teacherId);
	public void updateTeacher(Teacher teacher);
	public void deleteTeacher(Teacher teacher);
}

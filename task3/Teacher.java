package task3;

class Teacher {
	
	private String teacherName;
	   private int teacherID;

	   Teacher(String teacherName, int teacherID){
	      this.teacherName = teacherName;
	      this.teacherID = teacherID;
	   }

	   public String getTeacherName() {
	      return teacherName;
	   }

	   public void setTeacherName(String teacherName) {
	      this.teacherName = teacherName;
	   }

	   public int getTeacherId() {
	      return teacherID;
	   }

	   public void setTeacherID(int teacherID) {
	      this.teacherID = teacherID;
	   }
}

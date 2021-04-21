package task1;
import task1.Service;
public class Main {

	
       public static void main(String[] args) {

       Service ser=new Service();

//       addStudent
       Student st=new Student();
       st.setStudentName("Kashish");
       st.setStudentSection("Z");
       
       ser.addStudent(st);       
       

//       searchByName
       for(Student datum: ser.searchByName("Kashish")) {
    	   System.out.println(datum.getStudentSection()+" "+datum.getStudentName());
       }  
       
//       deleteStudent
       ser.deleteStudent("Z");
       
//       getAllData
       for(Student datum: ser.getAllData()) {
    	   System.out.println("\n"+datum.getStudentSection()+" "+datum.getStudentName());
       }  
       
//		update       
       ser.update("Kapish", "X");
       for(Student datum: ser.getAllData()) {
    	   System.out.println("\n"+datum.getStudentSection()+" "+datum.getStudentName());
       } 
}
}

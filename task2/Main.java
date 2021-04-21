package task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee model  = fromDatabase();

	      //Create a view : to write student details on console
	      EmployeeView view = new EmployeeView();

	      EmployeeController controller = new EmployeeController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setEmployeeName("Kashish");
	      controller.setEmployeeId("2");
	      controller.updateView();
	}
	private static Employee fromDatabase(){
		Employee em = new Employee();
	      em.setEmployeeName("Kapish");
	      em.setEmployeeId("1");
	      return em;

}
}

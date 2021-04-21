package task2;
public class EmployeeController {
   private Employee model;
   private EmployeeView view;

   public EmployeeController(Employee model, EmployeeView view){
      this.model = model;
      this.view = view;
   }

   public void setEmployeeName(String name){
      model.setEmployeeName(name);		
   }

   public String getEmployeeName(){
      return model.getEmployeeName();		
   }

   public void setEmployeeId(String rollNo){
      model.setEmployeeId(rollNo);		
   }

   public String getEmployeeId(){
      return model.getEmployeeId();		
   }

   public void updateView(){				
      view.printEmployeeDetails(model.getEmployeeName(), model.getEmployeeId());
   }	
}
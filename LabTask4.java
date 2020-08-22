//Author:Devendra Srivastava(DEV-PROG-Spec)
//Sec:B
package labWork;

//LabTask4:Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.
public class LabTask4 {
	static int taskNumber = 4;
	String taskName = "Lab Work";
	void taskTopic() {
		System.out.println("You have to write a code");
	}
	static void taskPledge() {
		System.out.println("Hum code copy nahi karenge ");
	}
	public static void main(String[] args) {
		LabTask4 task = new LabTask4();
	        //System.out.println(LabTask4.taskName); //Error:can't use non-static field with class
		System.out.println(task.taskName); // can only use non-static field with object
		System.out.println(LabTask4.taskNumber);// can use static field with class ony
		task.taskTopic();// can use non-static method with object
		//LabTask4.taskTopic(); //error:can't use non static method with class
		LabTask4.taskPledge(); // static method with class..
	}
}

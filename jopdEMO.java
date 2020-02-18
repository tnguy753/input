import javax.swing.JOptionPane;
public class jopdEMO {
public static void main(String [] args) {
	String name, ageStr;
	int age;
	JOptionPane.showMessageDialog(null, "Welcome to CMSC 203");
	name = JOptionPane.showInputDialog("Enter your name: ");
	
	JOptionPane.showMessageDialog(null, "You entered " + name);
	
	ageStr = JOptionPane.showInputDialog("Enter your age: ");
	 
	age = Integer.parseInt(ageStr);
	
	JOptionPane.showMessageDialog(null, "Hi" + name + "You are \n" + age + "Years old");
	
}
}

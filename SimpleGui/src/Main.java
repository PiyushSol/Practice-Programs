import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What is your Name?");
		JOptionPane.showMessageDialog(null, "Hello"+ name);
		int age =Integer.parseInt(JOptionPane.showInputDialog("What is your Age?"));
		JOptionPane.showMessageDialog(null, "Hello Your Are "+age+ " years old.");
		
		}

}

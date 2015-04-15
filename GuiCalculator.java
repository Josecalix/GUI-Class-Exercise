 
 import java.awt.Color;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.JButton;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JPanel;
 import javax.swing.JTextField;

 public class GuiCalculator implements ActionListener{

		private JFrame frame;
		private JPanel panel;
		private JLabel label;
		private JLabel output;
		private JTextField textField1;
		private JTextField textField2;
		private JButton button;
		
	
		public GuiCalculator(){
			frame = new JFrame("CALCULATOR");
			frame.setForeground(Color.blue);
			frame.setVisible(true);
			frame.setSize(300,120 );
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panel = new JPanel();
			panel.setBackground(Color.yellow);
			
			label = new JLabel();
			label.setText("ENTER TWO NUMBERS");
			label.setForeground(Color.black);
			
			output = new JLabel();
			output.setText("_______");
			
			textField1 = new JTextField(5);
			textField2 = new JTextField(5);
			
			button = new JButton();
			button.setBackground(Color.LIGHT_GRAY);
			button.setText("FIND SUM");
			button.addActionListener(this);
			button.setForeground(Color.BLACK);
			
			panel.add(label);
			panel.add(textField1);
			panel.add(textField2);
			panel.add(button);
			panel.add(output);
			frame.add(panel);		
	}
	
  public void actionPerformed(ActionEvent e){
	
		double number1 = Double.parseDouble(textField1.getText());
		double number2 = Double.parseDouble(textField2.getText());
		double sum = number1 + number2;
		
		output.setText(String.valueOf(sum)); 
		
	}
	
  public static void main(String[] args) {

		new GuiCalculator();
	}

  }

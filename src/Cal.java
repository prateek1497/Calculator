import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class Cal {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Prateks Calci");
		frame.setBounds(0, 0, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 100,284,261);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		textField = new JTextField();
		textField.setBounds(0, 36, 284, 53);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		Font fo=new Font("serif",Font.BOLD,20);
		textField.setFont(fo);
		textField.setText("");
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 100,284,261/5);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel.add(panel2);
		
		JButton spbt_1 = new JButton("CE");
		spbt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ce=textField.getText();
				char last=ce.charAt(ce.length()-1);
				if(last=='+' ||last=='-' ||last=='*' ||last=='/' ||last=='%' )
				{
					ce=ce.substring(0, ce.length()-1);
				}else
				{
					int i=1;
					while(ce.charAt(ce.length()-i)!='+' ||ce.charAt(ce.length()-i)!='-' ||ce.charAt(ce.length()-i)!='*' ||
							ce.charAt(ce.length()-i)!='/')
					{
						i++;

					}
					ce=ce.substring(0, ce.length()-i);

				}
				
				textField.setText(ce);
			}
		});
		panel2.add(spbt_1);
		
		JButton spbt_2 = new JButton("C");
		spbt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField.requestFocus();


			}
		});
		panel2.add(spbt_2);
		
		JButton spbt_3 = new JButton("BACK");
		spbt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back=textField.getText();
				char last=back.charAt(back.length()-1);				
				
				back=back.substring(0, back.length()-1);
				textField.setText(back);
				textField.requestFocus();


			}
		});
		panel2.add(spbt_3);
		
		JButton operatorbt_4 = new JButton("/");
		operatorbt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String text=  operatorbt_4.getLabel();
					String jtext=textField.getText();
					checkValidEntry(jtext);
					textField.setText(textField.getText() + text);
					
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				}
				

			}
		});
		panel2.add(operatorbt_4);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, (int) (100+261*.2),284,261/5);
		panel3.setBackground(Color.LIGHT_GRAY);
		panel.add(panel3);
		
		JButton digitbt_7 = new JButton("7");
		digitbt_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_7.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel3.add(digitbt_7);
		
		JButton digitbt_8 = new JButton("8");
		digitbt_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_8.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel3.add(digitbt_8);
		
		JButton digitbt_9 = new JButton("9");
		digitbt_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_9.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel3.add(digitbt_9);
		
		JButton operatorbt_3 = new JButton("*");
		operatorbt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String text=  operatorbt_3.getLabel();
					String jtext=textField.getText();
					checkValidEntry(jtext);
					textField.setText(textField.getText() + text);
					
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				}
				
				

			}
		});
		panel3.add(operatorbt_3);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, (int) (100+261*.4),284,261/5);
		panel4.setBackground(Color.LIGHT_GRAY);
		panel.add(panel4);
		
		JButton digitbt_4 = new JButton("4");
		digitbt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_4.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel4.add(digitbt_4);
		
		JButton digitbt_5 = new JButton("5");
		digitbt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_5.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel4.add(digitbt_5);
		
		JButton digitbt_6 = new JButton("6");
		digitbt_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_6.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel4.add(digitbt_6);
		
		JButton operatorbt_1 = new JButton("-");
		operatorbt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try{
				String text=  operatorbt_1.getLabel();
				String jtext=textField.getText();
				checkValidEntry(jtext);
				textField.setText(textField.getText() + text);
				
				
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry");
			}
			
			
			}
		});
		panel4.add(operatorbt_1);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(0, (int) (100+261*.6),284,261/5);
		panel5.setBackground(Color.LIGHT_GRAY);
		panel.add(panel5);
		
		JButton digitbt_1 = new JButton("1");
		digitbt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_1.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel5.add(digitbt_1);
		
		JButton digitbt_2 = new JButton("2");
		digitbt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_2.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel5.add(digitbt_2);
		
		JButton digitbt_3 = new JButton("3");
		digitbt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_3.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel5.add(digitbt_3);
		
		JButton operatorbt_2 = new JButton("+");
		operatorbt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String text=  operatorbt_2.getLabel();
					String jtext=textField.getText();
					checkValidEntry(jtext);
					textField.setText(textField.getText() + text);
					
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				}
				
				

			}
		});
		panel5.add(operatorbt_2);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(0, (int) (100+261*.8),284,261/5);
		panel6.setBackground(Color.LIGHT_GRAY);
		panel.add(panel6);
		
		JButton operatorbt_5 = new JButton("%");
		operatorbt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String text=  operatorbt_5.getLabel();
					String jtext=textField.getText();
					checkValidEntry(jtext);
					textField.setText(textField.getText() + text);
					
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				}
				
				

			}
		});
		panel6.add(operatorbt_5);
		
		JButton digitbt_0 = new JButton("0");
		digitbt_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text=  digitbt_0.getLabel();
				textField.setText(textField.getText() + text);
				
				
				

			}
		});
		panel6.add(digitbt_0);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String text=  dot.getLabel();
					String jtext=textField.getText();
					checkValidEntry(jtext);
					textField.setText(textField.getText() + text);
				
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Invalid Entry");
				}
				
			}
		});
		panel6.add(dot);
		
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String	 textFinal=textField.getText();
			double x	= calculate(textFinal);
			
			textField.setText("");
			textField.requestFocus();
			textField.setText(Double.toString(x));
			
			}

		});
		
		panel6.add(equals);
		
		}

		

		
		
	
	protected double calculate(String textFinal) {

        Stack<Integer> op  = new Stack<Integer>();
        Stack<Double> val = new Stack<Double>();
        /* Create temporary stacks for operators and operands */
        Stack<Integer> optmp  = new Stack<Integer>();
        Stack<Double> valtmp = new Stack<Double>();
        /* Accept expression */
        
        String input = textFinal;
        input = "0" + input;
        input = input.replaceAll("-","+-");
        /* Store operands and operators in respective stacks */
        String temp = "";
        for (int i = 0;i < input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' &&  ch != '*' && ch != '/')
               temp = temp + ch;
            else
            {
                val.push(Double.parseDouble(temp));
                op.push((int)ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        /* Create char array of operators as per precedence */
        /* -ve sign is already taken care of while storing */
        char operators[] = {'/','*','+'};
        /* Evaluation of expression */
        for (int i = 0; i < 3; i++)
        {
            boolean it = false;
            while (!op.isEmpty())
            {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i])
                {
                    /* if operator matches evaluate and store in temporary stack */
                    if (i == 0)
                    {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1)
                    {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2)
                    {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }                                        
                }
                else
                {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }                
            }    
            /* Push back all elements from temporary stacks to main stacks */            
            while (!valtmp.isEmpty())
                val.push(valtmp.pop());
            while (!optmp.isEmpty())
                op.push(optmp.pop());
            /* Iterate again for same operator */
            if (it)
                i--;                            
        }    
        		 
    
	
		// TODO Auto-generated method stub
		return val.pop();
	}

	protected void checkValidEntry(String jtext) throws Exception{
		if(jtext.charAt(jtext.length()-1)=='/' || jtext.charAt(jtext.length()-1)=='*' || jtext.charAt(jtext.length()-1)=='+' 
				|| jtext.charAt(jtext.length()-1)=='-' || jtext.charAt(jtext.length()-1)=='.')
		{
			throw new Exception();
		}
		
	}
	
}

package iS_Lab4;
import java.awt.*;
import javax.swing.*;

public class Gui_view extends JFrame{
	//... Components
	private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf     = new JTextField(20);
    private JButton    m_multiplyBtn = new JButton("Multiply");
    private JButton    m_clearBtn    = new JButton("Clear");
    
	public Gui_view() {
		//... Layout the components.        
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        content.add(m_multiplyBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);	
        m_totalTf.setEditable(false);
        
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Simple Calc - Presentation-Model");	
        this.setVisible(true);
	}
	
	public JTextField getInputTxt() {
		return m_userInputTf;
	}
	
	public void setOutputTxt(String txt) {
		m_totalTf.setText(txt);
	}
	
	public JButton m_multiplyBtn(){
		return this.m_multiplyBtn;
	}
	
	public JButton m_clearBtn(){
		return this.m_clearBtn;
	}
}

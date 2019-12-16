package iS_Lab4;
import javax.swing.*;
public class Gui_controller {
	private static final String INITIAL_VALUE = "1";
	private CalcModel model;
	private Gui_view view;
	
	public Gui_controller(CalcModel model, Gui_view view) {
		this.model=model;
		model.setValue(INITIAL_VALUE);
		this.view=view;
		initView();
	}
	
	public void initView() {
		 view.setOutputTxt(model.getValue());
	}
	
	public void initController() {
		view.m_multiplyBtn().addActionListener(e -> MultiplyListener());
        view.m_clearBtn().addActionListener(e-> ClearListener());
	}
	
	private void MultiplyListener() {
		String userInput = "";
        try {
            userInput = view.getInputTxt().getText();
            model.multiplyBy(userInput);
            view.setOutputTxt(model.getValue());
        } catch (NumberFormatException nfex) {
            JOptionPane.showMessageDialog(view, 
                                  "Bad input: '" + userInput + "'");
        }
	}
	
	private void ClearListener() {
		model.reset();
        view.setOutputTxt(model.getValue());
        //Setta a 1 la initial value per poter continuare ad usare il programma
        model.setValue(INITIAL_VALUE);
	}
}

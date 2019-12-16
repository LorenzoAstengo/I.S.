package iS_Lab4;

public class CalcV3 {
	public static void main(String[] args) {     
        Gui_view view = new Gui_view();
        CalcModel model= new CalcModel();
        Gui_controller controller= new Gui_controller(model, view);
        controller.initController();
	}
}

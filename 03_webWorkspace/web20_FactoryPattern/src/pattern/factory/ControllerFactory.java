package pattern.factory;

import pattern.action.AddController;
import pattern.action.Controller;
import pattern.action.DeleteController;
import pattern.action.UpdateController;

public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {
		System.out.println("ControllerFactory...Creating...");
	}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	//Controller�� �����ϴ� ���
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("INSERT")) {
			controller = new AddController();
			System.out.println("AddController...����");
		}else if(command.equals("UPDATE")) {
			controller = new UpdateController();
			System.out.println("UpdateController...����");
		}else if(command.equals("DELETE")) {
			controller = new DeleteController();
			System.out.println("DeleteController...����");
		}
		return controller;
	}

}
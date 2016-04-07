package abstractFactoryModel;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SkinFactory factory;
		Buttons buttons;
		TextField texts;
		ComboBox com;
		factory = new SpringSkinFactory();
		buttons = factory.creatButton();
		texts = factory.creatTextField();
		com = factory.creatCombox();
		buttons.display();
		texts.display();
		com.display();
		
	}

}

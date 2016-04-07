package abstractFactoryModel;

public class SpringSkinFactory implements SkinFactory {

	public Buttons creatButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

	public TextField creatTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	public ComboBox creatCombox() {
		// TODO Auto-generated method stub
		return new SpringComboBox();
	}

}

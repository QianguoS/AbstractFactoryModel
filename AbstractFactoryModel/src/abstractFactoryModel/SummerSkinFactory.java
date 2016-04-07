package abstractFactoryModel;

public class SummerSkinFactory implements SkinFactory {

	public Buttons creatButton() {
		// TODO Auto-generated method stub
		return new SummerButtons();
	}

	public TextField creatTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	public ComboBox creatCombox() {
		// TODO Auto-generated method stub
		return new SummerComboBox();
	}

}

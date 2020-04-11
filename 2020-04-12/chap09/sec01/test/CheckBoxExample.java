package sec01.test;

public class CheckBoxExample {
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListener( new BackgroundChangeListener());
		checkBox.select();
	}

}

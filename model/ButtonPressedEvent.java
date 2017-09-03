package model;

public class ButtonPressedEvent {

	private int index;
	public ButtonPressedEvent(int index) {
		this.index = index;
	}
	public int getPressedButton() {
		return index;
	}
}

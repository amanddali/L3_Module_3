package interfaces;

import javax.swing.JOptionPane;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String og = JOptionPane.showInputDialog("Type a sentence");
		
		return null;
	}
	
}

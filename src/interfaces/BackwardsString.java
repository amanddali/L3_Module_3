package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r += s.charAt(s.length() - i - 1);
		}
		return r;
	}

}

package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		char[] a = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				a[i] = Character.toLowerCase(a[i]);
			} else {
				a[i] = Character.toUpperCase(a[i]);
			}
		}

		for (char c : a) {
			r += c;
		}
		return r;
	}

}

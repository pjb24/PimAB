package controller;

public class TestServiceImpl implements TestService {

	@Override
	public String setTextArea(String s) {
		String str = "";
		for (int row = 2; row <= 9; row++) {
			for (int col = 1; col <= 9; col++) {
				str = str + row + "*" + col + "=" + (row * col) + "\n";
			}
		}
		return str;
	}
	
	@Override
	public String appendTextArea(String s) {
		// TODO Auto-generated method stub
		String str = "Hello JavaFX" + s + "\n"; 
		return str;
	}

}

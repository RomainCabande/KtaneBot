package Passwords;

public class MainPasswords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passwords passc = new Passwords();
		//System.out.println(passc.listWords());
		
		passc.addLetter1("wmlkj");
		passc.addLetter3("ikkkk");
		passc.addLetter5("hkkkkk");
		System.out.println(passc.wordSearch());
	}

}

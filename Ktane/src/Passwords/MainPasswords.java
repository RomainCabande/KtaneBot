package Passwords;

public class MainPasswords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passwords passc = new Passwords();
		//System.out.println(passc.listWords());
		
		passc.addLetter("wmlkj", 0);
		passc.addLetter("kikkk", 1);
		passc.addLetter("kkhkkk", 2);
		System.out.println(passc.wordSearch());
				
		
	}

}

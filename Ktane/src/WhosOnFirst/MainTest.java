package WhosOnFirst;

public class MainTest {

	public static void main(String[] args) {
		WhosOnFirst whoson = new WhosOnFirst(TopWord.BLANK, MiddleWord.LEFT, MiddleWord.OKAY, MiddleWord.PRESS, MiddleWord.UHHH, MiddleWord.BLANK, MiddleWord.NO);
		System.out.println(whoson.getMiddleWordForSolving());
		System.out.println(whoson.solveModule());

	}

}

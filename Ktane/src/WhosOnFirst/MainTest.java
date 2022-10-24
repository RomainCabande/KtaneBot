package WhosOnFirst;

public class MainTest {

	public static void main(String[] args) {
		WhosOnFirst whoson = new WhosOnFirst(TopWord.YES, MiddleWord.UHHH, MiddleWord.PRESS, MiddleWord.LEFT, MiddleWord.MIDDLE, MiddleWord.WAIT, MiddleWord.BLANK);
		System.out.println(whoson.getMiddleWordForSolving());
		System.out.println(whoson.solveModule());
	}

}

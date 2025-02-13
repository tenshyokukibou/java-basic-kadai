package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMychoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
	    String input = "";

        while(true) {
            input = scanner.next();
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				break;
			}else {
				System.out.println("無効な入力です。もう一度試してください。");
			}
		}
		return input;
	}
	public String getRandom() {
		String[] jankenArray = {"r","s","p"};
		int i = (int)Math.floor(Math.random() * 3);
		
		return jankenArray[i];	
		
	}
	public void playGame() {
		HashMap<String, String> result = new HashMap<>();
		result.put("r", "グー");
		result.put("s", "チョキ");
		result.put("p", "パー");
		
		String mychoice = getMychoice();
		String jankenArray = getRandom();
		
		System.out.println("自分の手は" + result.get(mychoice) + ",対戦相手の手は" + result.get(jankenArray));
		if (mychoice.equals(jankenArray)) {
            System.out.println("あいこです");
        } else if ((mychoice.equals("r") && jankenArray.equals("s")) ||
                   (mychoice.equals("s") && jankenArray.equals("p")) ||
                   (mychoice.equals("p") && jankenArray.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
	}
}

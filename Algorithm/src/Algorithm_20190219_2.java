
public class Algorithm_20190219_2 {
	public String Solution(String[] seoul) {
		int x = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i] == "Kim") {
				x = i;
			}
		}

		return "김서방은 " + x + "에 있다";
	}
}

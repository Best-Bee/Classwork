
public class ArrayWork2 {

	public static void main(String[] args) {
		System.out.println(pickACard());
	}

	public static String pickACard() {
		String card = "";
		int num = (int) (Math.random() * 52);
		if (num / 13 == 0) {
			card += "Spade: ";
			card += ((num % 13) + 1);
		} else if (num / 13 == 1) {
			card += "Club: ";
			card += ((num % 13) + 1);
		} else if (num / 13 == 2) {
			card += "Diamond: ";
			card += ((num % 13) + 1);
		} else if (num / 13 == 3) {
			card += "Heart: ";
			card += ((num % 13) + 1);
		}
		return card;
	}
}

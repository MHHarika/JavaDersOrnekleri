package onaltý.mart.com;

public class DiziTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] satir = { "1", "2", "3" };
		String[] sutun = { "A", "B", "C", "D" };
		String[][] tablo = new String[satir.length][sutun.length];

		for (int i = 0; i < satir.length; i++) {
			for (int j = 0; j < sutun.length; j++) {

				tablo[i][j] = satir[i] + sutun[j];
				System.out.print(tablo[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}

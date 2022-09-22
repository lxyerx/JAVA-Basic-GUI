import java.util.Random;
import javax.swing.JOptionPane;

public class TasKagitMakas {

	public static void main(String[] args) {

		Random rsayi = new Random();
		int random = rsayi.nextInt(3) + 1;
		System.out.println(random);

		String Secim = JOptionPane.showInputDialog(null, "Taş = 1:  Kagit = 2:  Makas = 3:", "Tas Kagit Makas",
				JOptionPane.INFORMATION_MESSAGE);

		Integer tahmin = Integer.valueOf(Secim);

		if (tahmin >= 4 || tahmin <= 0) {
			JOptionPane.showMessageDialog(null, "Yanlış aralıkta giriş yaptınız", "Hata Mesajı",
					JOptionPane.ERROR_MESSAGE);

		} else if (tahmin == 1) {
			if (random == 1) {
				JOptionPane.showMessageDialog(null, "Berabere - Makine Taş Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
			if (random == 2) {
				JOptionPane.showMessageDialog(null, "Kaybettin - Makine Kagit Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
			if (random == 3) {
				JOptionPane.showMessageDialog(null, "Kazandin - Makine Makas Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

		else if (tahmin == 2) {
			if (random == 1) {
				JOptionPane.showMessageDialog(null, "Kazandın - Makine Taş Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
			if (random == 2) {
				JOptionPane.showMessageDialog(null, "Berabere - Makine Kagit Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
			if (random == 3) {
				JOptionPane.showMessageDialog(null, "Kaybettin - Makine Makas Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (tahmin == 3) {
			if (random == 3) {
				JOptionPane.showMessageDialog(null, "Berabere - Makine Makas Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
			if (random == 1) {
				JOptionPane.showMessageDialog(null, "Kaybettin - Makine Taş Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
			if (random == 2) {
				JOptionPane.showMessageDialog(null, "Kazandin - Makine Kagit Yapmıştı", "Tas Kagit Makas",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}
}

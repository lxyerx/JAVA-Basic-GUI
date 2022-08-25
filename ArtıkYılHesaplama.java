public class ArtikYil {

	public static void ArtikYilHesaplama(int Yil) {

		boolean artikyil = false;
		if (Yil % 4 == 0) {
			if (Yil % 100 == 0) {
				if (Yil % 400 == 0)
					artikyil = true;
				else
					artikyil = false;
			} else
				artikyil = true;
		} else
			artikyil = false;

		if (artikyil)
			JOptionPane.showMessageDialog(null, Yil + " - Artık Yıldır", "Artık Yıl Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, Yil + " - Artık Yıl Degildir", "Artık Yıl Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {

		String Yil = JOptionPane.showInputDialog(null, "Hesaplanacak Yılı giriniz: ", "Artık Yıl Hesaplama",
				JOptionPane.INFORMATION_MESSAGE);

		try {
			int YeniYil = Integer.valueOf(Yil);
			ArtikYilHesaplama(YeniYil);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Hatalı giris yaptiniz", "Üzgünüm", JOptionPane.ERROR_MESSAGE);
		}

	}

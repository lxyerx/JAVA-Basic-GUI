	public static void enbuyukbulma(float x, float y, float z) {

		float maks = x;
		if (y > maks) {
			maks = y;

		}
		if (z > maks) {
			maks = z;
		}
		JOptionPane.showMessageDialog(null, "Girdiginiz en büyük sayi: " + maks, "Girilen en büyük sayıyı bulma",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {

		try {

			String NumberOne = JOptionPane.showInputDialog(null, "1. Sayiyi Giriniz", "Girilen en büyük sayıyı bulma",
					JOptionPane.INFORMATION_MESSAGE);

			String NumberTwo = JOptionPane.showInputDialog(null, "2. Sayiyi Giriniz", "Girilen en büyük sayıyı bulma",
					JOptionPane.INFORMATION_MESSAGE);

			String NumberThree = JOptionPane.showInputDialog(null, "3. Sayiyi Giriniz", "Girilen en büyük sayıyı bulma",
					JOptionPane.INFORMATION_MESSAGE);

			float x = Float.valueOf(NumberOne);
			float y = Float.valueOf(NumberTwo);
			float z = Float.valueOf(NumberThree);

			enbuyukbulma(x, y, z);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "İnt tipinde bir sayı giriniz", "Hata Mesajı",
					JOptionPane.ERROR_MESSAGE);
		}

	}

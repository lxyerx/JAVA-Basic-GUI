public static void tekmi(int y) {

		if (y % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Cevabınız Çift", "Tek Çift Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Cevabınız Tek", "Tek Çift Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

		}

	}

	public static void main(String[] args) {

		try {

			String x = JOptionPane.showInputDialog(null, "Sayi Giriniz", "Tek Çift Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

			Integer yeniX = Integer.valueOf(x);

			tekmi(yeniX);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "İnt deger girmediniz", "Hata Mesajı", JOptionPane.ERROR_MESSAGE);

		}

	}

	static void asalHesaplama(int sayi) {

		int sayac = 0;

		for (int i = 2; i <= sayi; i++) {
			if (sayi % i == 0) {
				sayac++;
			}
		}

		if (sayac == 1) {
			JOptionPane.showMessageDialog(null, "Asal sayidır", "Asal sayi bulma", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Asal sayi degildir", "Asal sayi bulma",
					JOptionPane.INFORMATION_MESSAGE + JOptionPane.CLOSED_OPTION);
		}

	}

	public static void main(String[] args) {
		try {

			String x = JOptionPane.showInputDialog(null, "Sayiyi giriniz", "Asal sayi bulma",
					JOptionPane.INFORMATION_MESSAGE);

			Integer sayi = Integer.valueOf(x);

			asalHesaplama(sayi);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Hatalı giriş yaptiniz int giriniz", "Error Mesajı",
					JOptionPane.ERROR_MESSAGE);
		}

	}

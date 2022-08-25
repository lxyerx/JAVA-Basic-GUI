public static void faktoriyel(int n) {

		int faktoriyello = 1;

		for (int i = 1; i <= n; i++) {
			faktoriyello *= i;
		}
		JOptionPane.showMessageDialog(null, n + "! = " + faktoriyello, "Faktoriyel Hesaplama",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {

		try {

			String x = JOptionPane.showInputDialog(null, "Sayı Giriniz ", "Faktoriyel Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);
			Integer y = Integer.valueOf(x);
			faktoriyel(y);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "İnt deger girmediniz", "Hata Mesajı", JOptionPane.ERROR_MESSAGE);
		}

	}

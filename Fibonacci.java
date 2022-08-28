	public static int fib10(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib10(n - 1) + fib10(n - 2);
	}

	public static void main(String[] args) {

		String PaneVeriAlimi= JOptionPane.showInputDialog(null, "Sayi Giriniz ", "Fibonacci hesaplama",
				JOptionPane.INFORMATION_MESSAGE);

		Integer DonusturduktenSonraPane = Integer.valueOf(PaneVeriAlimi);

		int yeniFibon = fib10(DonusturduktenSonraPane);

		JOptionPane.showMessageDialog(null, PaneVeriAlimi + " - " + " Sayısı " + yeniFibon + " Fibonacci eder",
				"Fibonacci hesaplama", JOptionPane.INFORMATION_MESSAGE);

	}

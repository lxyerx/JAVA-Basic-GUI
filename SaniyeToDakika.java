	public static void main(String[] args) {

		String veri = JOptionPane.showInputDialog(null, "Dönüştüreceğiniz Saniyeyi Giriniz ", "SaniyeToDakika",
				JOptionPane.INFORMATION_MESSAGE);

		Integer saniye = Integer.valueOf(veri);

		int dakika = saniye / 60;

		dakika = dakika % 60;
		saniye = saniye % 60;

		JOptionPane.showMessageDialog(null, dakika + " dakika yapar", "SaniyeToDakika",
				JOptionPane.INFORMATION_MESSAGE);
	}

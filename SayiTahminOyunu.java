	public static void main(String[] args) {

		Random rdr = new Random();
		int sayac = 1;
		int rastgelesayi = rdr.nextInt(101);
		System.out.println(rastgelesayi);

		while (true) {
			try {
				String tahmin = JOptionPane.showInputDialog(null, "Sayıyı Tahmin Etmeyi Deneyiniz", "Sayı Tahmin Oyunu",
						JOptionPane.INFORMATION_MESSAGE);
				Integer DonusturulmusTahmin = Integer.valueOf(tahmin);

				if (DonusturulmusTahmin > rastgelesayi) {
					JOptionPane.showMessageDialog(null, "Sayiyi Kücültün", "Sayı Tahmin Oyunu",
							JOptionPane.INFORMATION_MESSAGE);

				} else if (DonusturulmusTahmin < rastgelesayi) {
					JOptionPane.showMessageDialog(null, "Sayiyi büyültün", "Sayı Tahmin Oyunu",
							JOptionPane.INFORMATION_MESSAGE);

				} else if (DonusturulmusTahmin == rastgelesayi) {
					JOptionPane.showMessageDialog(null, "Tebrikler " + sayac + " hak kullanrak bildiniz",
							"Sayı Tahmin Oyunu", JOptionPane.INFORMATION_MESSAGE);
					break;

				}
				sayac++;

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Hatalı giriş yaptiniz İnt giriniz",
						"Error Mesajı" , JOptionPane.ERROR_MESSAGE);
				break;
			}

		}

	}

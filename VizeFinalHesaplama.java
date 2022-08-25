	public static void GectiKaldi(float Ortalama) {

		if (Ortalama >= 60) {
			JOptionPane.showMessageDialog(null, "Tebrikler " + Ortalama + " ile geçtiniz", "Vize Final Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Üzgünüm " + Ortalama + " ile kaldınız", "Vize Final Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public static void main(String[] args) {

		
		try {
			
			String Yuzde1 = JOptionPane.showInputDialog(null, "Vize Yüzdesini Giriniz ", "Vize Final Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

			float VizeYuzde = Float.valueOf(Yuzde1);

			// Üst kısım Vize Yüzdesini kullanıcıdan alır ve float a dönüştürür

			String Yuzde2 = JOptionPane.showInputDialog(null, "Final Yüzdesini Giriniz ", "Vize Final Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

			float FinallYuzde = Float.valueOf(Yuzde2);

			// Üst kısım Final Yüzdesini kullanıcıdan alır ve float a dönüştürür

			String Vize1 = JOptionPane.showInputDialog(null, "Vize Notunu Giriniz ", "Vize Final Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

			float Vize = Float.valueOf(Vize1);

			// Üst kısım Kullanıcıdan Vize notunu alır float a dönüştürür

			String Final1 = JOptionPane.showInputDialog(null, "Final Notunu Giriniz ", "Vize Final Hesaplama",
					JOptionPane.INFORMATION_MESSAGE);

			float Finall = Float.valueOf(Final1);

			// Üst kısım Kullanıcıdan Final notunu alır float a dönüştürür
			

			float Ortalama = (Vize * (VizeYuzde / 100)) + (Finall * (FinallYuzde / 100));

			GectiKaldi(Ortalama);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "İnt deger girmediniz", "Hata Mesajı", JOptionPane.ERROR_MESSAGE);

		}

	}


public class MakineMuhendisi implements IMuhendis {

	private boolean askerlik;
	private boolean adli_sicil;

	public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {

		if (askerlik) {
			System.out.println("Askerlik Yapti");
		} else {
			System.out.println("Askerlik Yapmadi");
		}
	}

	@Override
	public String mezuniyet_ortalamasi(double derece) {
		return "Ortalamam " + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli Sicil Var");

		} else {
			System.out.println("Adli Sicil Yok");
		}

	}

	@Override
	public void is_tecrubesi(String[] array) {

		System.out.println("Bilgisayar Muhendisi");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}

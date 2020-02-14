package INTERFACE;

public class Pc_Muh implements IMuhendis { // IMPLEMENT INTERFACE

	private boolean askerlik;
	private boolean adli_sicil;
	
	public Pc_Muh(boolean askerlik, boolean adli_sicil) {
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}
	@Override
	public void askerlik_sorgula() {
	if(askerlik) {
		System.out.println("Askerlik Yaptim.");
	}
	else {
		System.out.println("Askerlik Yapmadim.");
	}
}
	@Override
	public String mezuniyet_ortalama(double derece) {
		return "Ortalamam: " + derece;
	}
	@Override
	public void adli_sicil_sorgula() {
		if(adli_sicil) {
			System.out.println("Adli Sicil Kaydim Var.");
		}
		else {
			System.out.println("Adli Sicil Kaydim Yok.");
		}
	}
	@Override
	public void is_tecrubesi(String[] array) {
	
		System.out.println("Bilgisayar Muhendisi Olarak"
				+ ", Su sirketlerde çalistim");
		
		for (int i = 0; i < array.length;i++) {
			System.out.print(array[i]);
		}  
	}
}


public class Main {

	public static void main(String[] args) {

		PcMuhendisi muhendis1 = new PcMuhendisi(true, false);

		muhendis1.adli_sicil_sorgula();
		muhendis1.askerlik_durumu_sorgula();
		String[] tecrube = { "Toshiba", "Samsung" };
		muhendis1.is_tecrubesi(tecrube);
		System.out.println(muhendis1.mezuniyet_ortalamasi(4.5));
		muhendis1.calis();
		muhendis1.calis();

	}
}

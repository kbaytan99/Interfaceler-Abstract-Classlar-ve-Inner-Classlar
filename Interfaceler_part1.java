package INTERFACE;
public class Interfaceler_part1 {

	public static void main(String[] args) {
		
		
		//IMuhendis muhendis1 = new IMuhendis();
		Pc_Muh muh1 = new Pc_Muh(false, false);
		
		muh1.askerlik_sorgula();
		muh1.adli_sicil_sorgula();
		System.out.println(muh1.mezuniyet_ortalama(3.5));
		String[] tecrube = {"Vestel, ","Ikea, ","Carefour"};
		muh1.is_tecrubesi(tecrube);
	}
}

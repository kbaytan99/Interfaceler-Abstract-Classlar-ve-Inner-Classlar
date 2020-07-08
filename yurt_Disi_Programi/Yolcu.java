package yurt_Disi_Programi;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurum;
	
	public Yolcu() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yatirdiginiz harc bedeli: ");
		this.harc = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Siyasi yasaginiz bulunuyormu ? (evet/hayir)");
		String cevap = scanner.nextLine();
		
		if(cevap.equals("evet")) {
			this.siyasiYasak = true;
		}else {
			this.siyasiYasak = false;
		}
		System.out.println("Vizeniz varmi ? (evet/hayir)");
		String cevap2 = scanner.nextLine();
		
		if(cevap2.contentEquals("evet")) {
			this.vizeDurum = true;
		}else {
			this.vizeDurum = false;
		}
	}
	
	@Override
	public boolean yurtDisiHarci() {
		if(this.harc < 15) {
			System.out.println("Lutfen yurt disi harcinizi tam yatiriniz.");
			return false;
		}else {
			System.out.println("Sorunsuz yatirilmis harc");
			return true;
		}
	}

	@Override
	public boolean siyasiYasak() {
		if(this.siyasiYasak == true) {
			System.out.println("Siyasi yasaginiz var");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean vizeDurumu() {
		if(this.vizeDurum == true) {
			System.out.println("Vize islemleri tamam");
			return true;
		}else {
			System.out.println("Vizeniz yok");
			return false;
		}
	}

}

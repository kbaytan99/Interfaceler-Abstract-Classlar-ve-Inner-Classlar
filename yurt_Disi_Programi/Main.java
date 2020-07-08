package yurt_Disi_Programi;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sabiha gokçen havalimanina hosgeldiniz...");

		String sartlar = "yurtdisi çikis kurallari...\n"
				+ "Vizenin yaninizda, harciniz yatirilmis ve siyasi yasaginiz olmamali";

		String message = "yurt disi sartlarindan hepsini saglamaniz gerekmektedir";

		while (true) {
			System.out.println("**************************************");
			System.out.println(message);
			System.out.println("***************************************");
			System.out.println(sartlar);

			Yolcu yolcu = new Yolcu();
			System.out.println("Harç bedeli kontrol ediliyor");
			Thread.sleep(3000);
			if (yolcu.yurtDisiHarci() == false) {
				Thread.sleep(5000);
				System.out.println(message);
				continue;
			}
			System.out.println("Siyasi yasak kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.siyasiYasak() == false) {
				Thread.sleep(5000);
				System.out.println(message);
				continue;
			}
			System.out.println("Vize kontrol ediliyor");
			Thread.sleep(3000);
			if(yolcu.vizeDurumu() == false) {
				Thread.sleep(5000);
				System.out.println(message);
				continue;
			}
			System.out.println("Hersey sorunsuz, iyi yolculuklar.");
			break;

		}

	}

}

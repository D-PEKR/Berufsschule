package debekaPH1;

public class Lotto {

	public static void main(String[] args) {
		//Variablen Initialisierung
		int LottoZahlen[] = new int[6];
		int i=0;
		
		while(i<6) {
		LottoZahlen[i] = mathRandom(LottoZahlen[i]);
		try{
		    Thread.sleep(1000);
		}catch(InterruptedException e){
		    e.printStackTrace();
		}
		System.out.println("Hier steht die Lotto Zahl " + i + ": " + LottoZahlen[i]);
		i++;
		}
	}
	public static int mathRandom(int lottoZahlen) {
		lottoZahlen = (int) (Math.random()*49);
			return lottoZahlen;
	}

}

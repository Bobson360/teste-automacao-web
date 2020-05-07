package support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Generator {
    
	public static String dataHoraParaArquivo (){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd-MM-yyyy-hhmmss").format(ts); //yyyyMMddhhmmss
    }
	
	public static int aleatorio() {
		Random rand = new Random();
		int numero = rand.nextInt(100);
		return numero;
	}
}

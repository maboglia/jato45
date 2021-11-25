package sistema;

import java.util.Properties;

public class ProprietaSistema {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		
//		properties.list(System.out);
		System.out.println("versione di java in uso:");
		System.out.println(System.getProperty("java.specification.version"));

	}

}

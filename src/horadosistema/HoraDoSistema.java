package horadosistema;

import java.util.*;

public class HoraDoSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date relogio = new Date();
		System.out.println("A hora do sistema é: ");
		System.out.println(relogio.toString());

		 Properties p = System.getProperties(); 
		 System.out.println(p);
	}

}

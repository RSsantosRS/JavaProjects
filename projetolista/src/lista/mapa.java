package lista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class mapa {
	public static void main(String[] args) {

		Map<String, Object> mapa = new HashMap<String, Object>();

		mapa.put("chave-1", LocalDate.now());
		mapa.put("chave-2", LocalDateTime.now());
		mapa.put("chave-3", Boolean.TRUE);
		mapa.put("chave-4", new Date("10/08/2024 20:02:10"));
		System.out.println(mapa.get("chave-4"));

		for (String pos : mapa.keySet()) {
			;
			System.out.println(mapa.get(pos));
		}
	}

}

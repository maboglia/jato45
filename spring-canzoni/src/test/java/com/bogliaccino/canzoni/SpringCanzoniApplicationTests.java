package com.bogliaccino.canzoni;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bogliaccino.canzoni.entities.Cantante;
import com.bogliaccino.canzoni.entities.Canzone;
import com.bogliaccino.canzoni.services.CantanteService;
import com.bogliaccino.canzoni.services.CanzoniService;
import com.bogliaccino.canzoni.services.DBCantanti;

@SpringBootTest
class SpringCanzoniApplicationTests {

	@Autowired
	private CantanteService service;

	@Autowired
	private CanzoniService serviceCanzoni;
	
	@Test
	void scriviSuTabellaCantanti() {
		
		List<String[]> canzoni = DBCantanti.getCanzoni();
		
		for (String[] canzone : canzoni) {
			String titolo = canzone[0];
			String nome = canzone[1];
			Cantante c = caricaDati(titolo, nome);
		}
		
	}

	private Cantante caricaDati(String titolo, String nome) {
		
		Cantante c = null;
		
		if (this.service.getCantanteByNome(nome)!=null) {
			c = this.service.getCantanteByNome(nome);
		} else {
			c = new Cantante();
			c.setNome(nome);
		}
		
		
		this.service.addCantante(c);
		
		Canzone cnz = new Canzone();
		cnz.setTitolo(titolo);
		cnz.setCantante(c);
		this.serviceCanzoni.addCanzone(cnz);
		return c;
	}

}

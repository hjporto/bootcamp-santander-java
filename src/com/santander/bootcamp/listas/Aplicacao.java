package com.santander.bootcamp.listas;

import java.util.ArrayList;
import java.util.List;
import com.santander.bootcamp.listas.ListaPessoas;

public class Aplicacao {

	public static void main(String[] args) {
		List<ListaPessoas> lista = new ArrayList<ListaPessoas>();
		ListaPessoas pessoa1 = new ListaPessoas("João", 1234, 1.68);
		ListaPessoas pessoa2 = new ListaPessoas("Maria", 5678, 1.86);
		ListaPessoas pessoa3 = new ListaPessoas("José", 9876, 1.54);

		lista.add(pessoa1);
		lista.add(pessoa2);
		lista.add(pessoa3);

		pessoa1.imprimir();
		pessoa2.imprimir();
		pessoa3.imprimir();
	}
}
package br.usjt.previsaotempo.sevice;

import javax.persistence.Persistence;

public class CriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}
}

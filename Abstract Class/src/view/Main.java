package view;

//import java.util.ArrayList;
//import java.util.list;

import model.Comissionado;
import model.Horista;

public class Main {

	public static void main(String[] args) {
		Comissionado comissionado = new Comissionado("Juan:", "99...", 500,50, 100);	

		Horista horista = new Horista("Maria:", "88...");
		horista.setValorHora(80);
		horista.setTotalHoras(200); 

		System.out.println("Salário Comissionado");
		System.out.println(comissionado.getNome() + " " +comissionado.salario());

		System.out.println("\nSalário Horista");
		System.out.println(horista.getNome() + " " + horista.salario());

	}

}

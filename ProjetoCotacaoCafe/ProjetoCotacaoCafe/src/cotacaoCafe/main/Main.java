package cotacaoCafe.main;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import cotacaoCafe.observer.*;

import cotacaoCafe.context.Arabica;
import cotacaoCafe.context.Cafe;
import cotacaoCafe.context.Conilon;
import cotacaoCafe.context.Robusta;

public class Main {
	
	private static String getDateTime() {
	    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    return dateFormat.format(date);
	}
	
	public static String arredondar(double valor) {
        return new DecimalFormat("#,##0.00").format(valor);
    }
	
	public static void main(String[] args) {

		
		ApiBolsaDeValores api = new ApiBolsaDeValores(); 
		
		Cafe arabica = new Arabica(api);
		Cafe robusta = new Robusta(api);
		Cafe conilon = new Conilon(api);
		
		double queda = 0.05;
		
		System.out.println("------------ Sistema de monitoramento da correlação do café com o dolar -------------");
		System.out.println("  Atualização da bolsa identificada em: " + getDateTime() + " com " + arredondar((queda%1)*100) + "% de queda"); 
		System.out.println("-------------------------------------------------------------------------------------");
		
		api.setMedicoes(queda);
		api.setMedicoes(queda);
		
		
		/*
		System.out.println("  Atualizando valor do café arábica...");
		System.out.println("  Valor Atual: " + arabica.getValorAtual());
		System.out.println("  Usando calculo do Tipo 1");
		System.out.println("  Valor Reajustado: " + arabica.getValorAtualizado());
		
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("  Atualizando valor do café robusta...");
		System.out.println("  Valor Atual: " + robusta.getValorAtual());
		System.out.println("  Usando calculo do Tipo 2");
		System.out.println("  Valor Reajustado: " + robusta.getValorAtualizado());
		
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("  Atualizando valor do café conilon...");
		System.out.println("  Valor Atual: " + conilon.getValorAtual());
		System.out.println("  Usando calculo do Tipo 2");
		System.out.println("  Valor Reajustado: " + conilon.getValorAtualizado());
		*/
	}
}

package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraSalario {

	public BigDecimal getSalarioLiquido(BigDecimal salarioBruto, BigDecimal percentualImpostoINSS) {
		
		if(validar(salarioBruto))
		{
			if (salarioBruto(new BigDecimal("1693.72"))<= 0) 
			{
				percentualImpostoINSS = percentualImpostoINSS.add(new BigDecimal("8.0"));
				return salarioBruto.subtract((percentualImpostoINSS).divide(new BigDecimal("100.00")));
			}
			
			else if (salarioBruto(new BigDecimal("1693.73")) >= 0 ) 
			{
				percentualImpostoINSS = percentualImpostoINSS.add(new BigDecimal("9.0"));
				return salarioBruto.subtract((percentualImpostoINSS).divide(new BigDecimal("100.00")));
			}
			
			else if (salarioBruto(new BigDecimal("2822.91")) >= 0 )
			{
				percentualImpostoINSS = percentualImpostoINSS.add(new BigDecimal("11.0"));
				return salarioBruto.subtract((new BigDecimal("11.0").divide(new BigDecimal("100.00"))));
			}		
		}
	}

	public BigDecimal getValorINSS(BigDecimal salarioBruto) {
		
		if(validar(salarioBruto))
		{
			if(salarioBruto.compareTo(new BigDecimal("1693.72")) <= 0)
			{
				return salarioBruto.multiply(new BigDecimal("8.0")).divide(new BigDecimal("100.00")).setScale(2, BigDecimal.ROUND_HALF_UP);
			}
			else if(salarioBruto.compareTo(new BigDecimal("1693.73")) >= 0 && salarioBruto.compareTo(new BigDecimal("2822.90")) <= 0)
			{
				return salarioBruto.multiply(new BigDecimal("9.0")).divide(new BigDecimal("100.00")).setScale(2, BigDecimal.ROUND_HALF_UP);
			}
			else if(salarioBruto.compareTo(new BigDecimal("2822.91")) >= 0)
			{
				return salarioBruto.multiply(new BigDecimal("11.0")).divide(new BigDecimal("100.00")).setScale(2, BigDecimal.ROUND_HALF_UP);
			}
		}
			
		throw new IllegalArgumentException();
	}

	public BigDecimal getValorPlanoDeSaude(Integer idade) {
		// TODO Auto-generated method stub
		if(validar(idade))
		{
			if(idade >= 0 && idade <=9)
				return new BigDecimal("75.00");
			else if(idade >= 10 && idade <= 19)
				return new BigDecimal("112.50");
			else if(idade >= 20 && idade <= 29)
				return new BigDecimal("168.75");
			else if(idade >= 30 && idade <= 39)
				return new BigDecimal("253.13");
			else if(idade >= 40 && idade <= 49)
				return new BigDecimal("379.69");
			else if(idade >= 50 && idade <= 59)
				return new BigDecimal("569.54");
			else
				return new BigDecimal("854.30");
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	
	public Boolean validar(BigDecimal valor) {
		if(valor == null)
		{
			return false;
		}
		
		return true;
	}
	
	public Boolean validar(Integer idade) {
		if(idade < 0)
		{
			return false;
		}
		
		return true;
	}
}

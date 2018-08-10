package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

    public BigDecimal getMaiorNota(BigDecimal[] notas) {

        BigDecimal maior = BigDecimal.ZERO;
        if (validar(notas)) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i].compareTo(maior) > 0) 
                {
                    maior = notas[i];
                    return maior;
                }
            }
        }
          throw new IllegalArgumentException();
    }

    public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
        if (validar(nota1) && validar(nota2) && validar(nota3)) 
        {
        	BigDecimal media = BigDecimal.ZERO;
        	media = nota1.add(nota2.add(nota3)).divide(BigDecimal.valueOf(3), 2, BigDecimal.ROUND_HALF_UP);
        	return media;
        }
        
        throw new IllegalArgumentException();
    }

            
    public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
       
       if(validar(nota1) && validar(nota2) && validar(nota3))
       {
    	   BigDecimal media = getMedia(nota1, nota2, nota3);

        if (media.compareTo(BigDecimal.valueOf(6)) >= 0) 
        {
            System.out.println("APROVADO");
        }

        else if (media.compareTo(BigDecimal.valueOf(4)) < 0) 
        {
            System.out.println("REPROVADO");
        }

        System.out.println("PROVA_FINAL");
        
       }

        throw new IllegalArgumentException();
}
    
    public Boolean validar(BigDecimal valor){
    	if (valor != null && valor.compareTo(BigDecimal.TEN) <= 0 && valor.compareTo(BigDecimal.ZERO) > 0)
    	{
    		return true;
    	}
    	
    	return false;
    }
}

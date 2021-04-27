package exercicio08;

import java.util.ArrayList;

public class CalculadorDeAreas{
    
     public static void main(String [] args){
           ArrayList<Figura> figuras = new ArrayList<Figura>();
           figuras.add(new Quadrado(2));
           figuras.add(new Quadrado(4));
           figuras.add(new Triangulo(5, 2));
           
           double areaTotal = 0.0;
           for (Figura f: figuras){
        	   double areaDaFigura = f.calcularArea();
               System.out.println(areaDaFigura);
               areaTotal += areaDaFigura;
           }
           
           System.out.printf("Área total: %.1f\n", areaTotal);
     }
     
}
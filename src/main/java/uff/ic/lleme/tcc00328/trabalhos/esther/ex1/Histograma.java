package uff.ic.lleme.tcc00328.trabalhos.esther.ex1;

/**
EXERCICIO 1
Faça um programa Java para criar um vetores de números inteiros entre 0 e 99 e,
depois calcular, imprimir e gravar em um arquivo um histograma com a frequência 
percentual de cada um desses números.
**/

import java.util.Random; //importando biblioteca que gera numeros aleatorios
import java.util.Arrays;
        
public class Histograma {    
    
    public static int N = 100;
    public static int[] vetor = new int[1000];
    public static int[] contador = new int[N];  
    public static double[] freqRelativa = new double[N];
   
    public static void main(String args[]){
        Random random = new Random();
       
        for (int i=0; i<vetor.length; i++){
            vetor[i]= random.nextInt(100);
            contador[vetor[i]]++; 
            
            //System.out.println("Frequência absoluta do " + vetor[i] + "é:" +contador[i]);
        }
        System.out.println(Arrays.toString(vetor)); //converte o endereço para  array
        
       for (int i = 0; i < contador.length; i++) {
            // 2. ARMAZENAR O CÁLCULO NO NOVO VETOR
            freqRelativa[i] = ((double) contador[i] / vetor.length) * 100.0;
        }    
        // 3. IMPRIMIR O VETOR DE FREQUÊNCIAS RELATIVAS (com casas decimais)
        System.out.println(Arrays.toString(freqRelativa));
    
            
    }
    }
    
 

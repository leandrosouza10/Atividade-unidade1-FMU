public class criandoVetor {
    public static void main(String[] args) {
        
        int soma = 0;
        int vetor[] = new int [10];
        

        for (int i = 0 ; i < 8 ; i ++){
            vetor [i] = i * 5;

            System.out.println(vetor [i]);
            
            soma = soma + vetor[i];
        }        
    
        System.out.println("Soma dos números armazenados no vetor: " + soma);


    }
    
}

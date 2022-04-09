public class criandoVetor {
    public static void main(String[] args) {
        
        int soma = 0;
        int vetor[] = new int [10];
        int  trocar = 5;
        

        for (int i = 0 ; i < 8 ; i ++){
            vetor [i] = i * trocar;

            System.out.println(vetor [i]);
            
            soma = soma + vetor[i];
        }        
    
        System.out.println("Soma dos números armazenados no vetor: " + soma);


    }
    
}

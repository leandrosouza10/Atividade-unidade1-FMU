/*
    Uma estrutura de dados é considerada homogênea quando as informações armazenadas possuem o mesmo tipo. 
    Ela pode ser composta por variáveis unidimensionais e multidimensionais, a depender da necessidade.

Sendo assim, implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, 
seguindo os seguintes critérios:

·         criar um array unidimensional do tipo string para cadastrar o nome de 25 alunos;

·         garantir que o array seja totalmente preenchido. 

Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais cinco novos alunos. 

Agora, após o processo de implementação, qual é a dificuldade de inserir os novos alunos nessa estrutura de dados? 
Como pode ser resolvido o problema? Justifique sua resposta a partir dos conceitos de gerenciamento de memória estudados ao longo da unidade.
*/

import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String alunos[] = new String [25];  
        int i;      

        for (i = 0 ; i < 25 + 5; i++){

            System.out.println("Digite o nome do aluno: ");            
            alunos[i]=scan.nextLine();                     
            
        }      

    }
    
}

/*
    Adicionar mais 5 alunos, após o  preenchimento total do vetor,
    causaria um problema de overflow, pois o vetor não possui mais espaço livre. 
    Os arrays, em geral, possuem tamanho fixo, que , se estourado, gera overflow.
*/

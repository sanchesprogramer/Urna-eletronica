package UrnaOOP;
import java.util.Scanner;
public class Main {
public static void main(String[] args){
    try(Scanner Input = new Scanner(System.in)){
        int Opcao = 0;
        do{
        Menu.Options();
        Opcao = Input.nextInt();
        while(Opcao > 6 || Opcao < 1){
            System.out.println("Opção Inválida, favor digitar novamente.");
            Menu.Options();
            Opcao = Input.nextInt();
        }
        if(Opcao == 6){
            System.out.println("Programa encerrado com sucesso!");
        }
        else if(Opcao == 1){
            Menu.Opcao1_CadastraCandidato(Input);
        }
        else if (Opcao == 2){
            Menu.Opcao2_CadastraEleitor(Input);  
        }
        else if (Opcao == 3){
            Menu.Votar(Input);
        }
        else if (Opcao == 4){
            Menu.Opcao4_ApuraResultados();
        }
        else{
            Menu.Opcao5_Relatorio();
        }
    }while(Opcao != 6);
}
}
}
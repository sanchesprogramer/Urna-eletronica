package UrnaOOP;
import java.util.ArrayList;
import java.util.Scanner;
public class Eleitor {
    static ArrayList<String> ListaNomes = new ArrayList<String>();
    static ArrayList<String> ListaCPF = new ArrayList<String>();

public static void CadastrarEleitor(String x, String y){
    ListaNomes.add(x);
    ListaCPF.add(y);
    System.out.println("Eleitor " +x +" com CPF " +y+" cadastrado com sucesso!");
    }
public static void ValidaCPF(String CPFEleitor, Scanner Input, String NomeEleitor){
    boolean Fraude = false;
    while(CPFEleitor.length() != 11){
        System.out.println("CPF Inválido, favor digite novamente!");
        CPFEleitor = Input.next();
    }
    for(int i = 0; i < ListaCPF.size(); i++){
        if (CPFEleitor.equals(ListaCPF.get(i))){
            System.out.println("CPF ja cadastrado em sistema!");
            Fraude = true;
            break;
        }
    }
    if(Fraude == false){
        CadastrarEleitor(NomeEleitor, CPFEleitor);
    }
}
}
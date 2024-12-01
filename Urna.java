package UrnaOOP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Urna {
    public static int VotosInvalidosPref =0;
    public static int VotosValidosPref =0;
    public static int VotosInvalidosGov =0;
    public static int VotosValidosGov =0;
    public static int VotosInvalidosPres =0;
    public static int VotosValidosPres =0;
    static ArrayList<String> VotosPrefeito = new ArrayList<String>();
    static ArrayList<String> VotosGovernador = new ArrayList<String>();
    static ArrayList<String> VotosPresidente = new ArrayList<String>();
    static ArrayList<String> EleitoresVoto = new ArrayList<String>();
public static void RegistraVotoPref(String x){
    VotosPrefeito.add(x);
}
public static void RegistraVotoGov(String x){
    VotosGovernador.add(x);
}

public static void RegistraVotoPres(String x){
    VotosPresidente.add(x);
}
public static void SalvaEleitor(String x){
    EleitoresVoto.add(x);
}
public static void Wipe(){
    VotosInvalidosPref =0;
    VotosValidosPref =0;
    VotosInvalidosGov =0;
    VotosValidosGov =0;
    VotosInvalidosPres =0;
    VotosValidosPres =0;
    System.out.println("Urna zerada, todos os votos previos removidos.");
}    
public static void VotaPrefeito(Scanner Input){
    int Confirma = 0; 
    do{
        System.out.println("Digite o numero do candidato para votar, ou digite -1 para votar em branco, digite -2 para votar nulo.");
        System.out.println("Digite o seu voto para prefeito");
        int NumVoto = Input.nextInt();
        for(int x = 0; x<Candidato.ListaPrefeito.size(); x++){
            if(NumVoto == Candidato.ListaPrefeito.get(x).numero){
                System.out.println(Candidato.ListaPrefeito.get(x).nome);
                System.out.println(Candidato.ListaPrefeito.get(x).partido);
                System.out.println("Confirma o voto? Digite 1 para sim e 2 para não");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoPref(Candidato.ListaPrefeito.get(x).nome);
                    Candidato.ListaPrefeito.get(x).Votos++;
                    VotosValidosPref++;
                    break;
                }
                }
            else if(NumVoto == -1){
                System.out.println("Confirma o voto branco?");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoPref("Branco");
                    VotosInvalidosPref++;
                    break;
                }
            }
            else if(NumVoto == -2){
                System.out.println("Confirma o voto nulo?");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoPref("Nulo");
                    VotosInvalidosPref++;
                    break;
                }
            }
            else{
                System.out.println("Voto inválido!");
                break;
            }
            }
        }while(Confirma != 1);
    }
public static void VotaGovernador(Scanner Input){
    int Confirma = 0;
    do{
        System.out.println("Digite o numero do candidato para votar, ou digite -1 para votar em branco, digite -2 para votar nulo.");
        System.out.println("Digite o seu voto para governador");
        int NumVoto = Input.nextInt();
        for(int x = 0; x<Candidato.ListaGovernador.size(); x++){
            if(NumVoto == Candidato.ListaGovernador.get(x).numero){
                System.out.println(Candidato.ListaGovernador.get(x).nome);
                System.out.println(Candidato.ListaGovernador.get(x).partido);
                System.out.println("Confirma o voto? Digite 1 para sim e 2 para não");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoGov(Candidato.ListaGovernador.get(x).nome);
                    Candidato.ListaGovernador.get(x).Votos++;
                    VotosValidosGov++;
                    break;
                }
                }
            else if(NumVoto == -1){
                System.out.println("Confirma o voto branco?");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoGov("Branco");
                    VotosInvalidosGov++;
                    break;
                }
            }
            else if(NumVoto == -2){
                System.out.println("Confirma o voto nulo?");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoGov("Nulo");
                    VotosInvalidosGov++;
                    break;
                }
            }
            else{
                System.out.println("Voto inválido!");
                break;
            }
            }
        }while(Confirma != 1);
}
public static void VotaPresidente(Scanner Input){
    int Confirma = 1;
    do{
        System.out.println("Digite o numero do candidato para votar, ou digite -1 para votar em branco, digite -2 para votar nulo.");
        System.out.println("Digite o seu voto para presidente");
        int NumVoto = Input.nextInt();
        for(int x = 0; x<Candidato.ListaPresidente.size(); x++){
            if(NumVoto == Candidato.ListaPresidente.get(x).numero){
                System.out.println(Candidato.ListaPresidente.get(x).nome);
                System.out.println(Candidato.ListaPresidente.get(x).partido);
                System.out.println("Confirma o voto? Digite 1 para sim e 2 para não");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoPres(Candidato.ListaPresidente.get(x).nome);
                    Candidato.ListaPresidente.get(x).Votos++;
                    VotosValidosPres++;
                    break;
                }
                }
            else if(NumVoto == -1){
                System.out.println("Confirma o voto branco?");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoPres("Branco");
                    VotosInvalidosPres++;
                    break;
                }
            }
            else if(NumVoto == -2){
                System.out.println("Confirma o voto nulo?");
                Confirma = Input.nextInt();
                if (Confirma == 1){
                    RegistraVotoPres("Nulo");
                    VotosInvalidosPres++;
                    break;
                }
            }
            else{
                System.out.println("Voto inválido!");
                break;
            }
            }
        }while(Confirma != 1);
}
public static void ExibirEleitores(){
    Collections.sort(Urna.EleitoresVoto);
    for (int i = 0; i < Urna.EleitoresVoto.size(); i++){
        System.out.println(Urna.EleitoresVoto.get(i));
    }
}
public static void Auditoria(){
    if(Urna.VotosPrefeito.size() == EleitoresVoto.size()){
        System.out.println("A quantidade de eleitores é igual ao total de votos registrados.");
    }
    else{
        System.out.println("Eleição Fraudelenta");
    }
}
public static int ApuraPrefeito(){
    int GanhadorPrefeito = 0;
    int index = 0;
    for(int i = 0; i < Candidato.ListaPrefeito.size(); i++){
        if(Candidato.ListaPrefeito.get(i).Votos > GanhadorPrefeito){
            GanhadorPrefeito = Candidato.ListaPrefeito.get(i).Votos;
            index = i;
        }
    }
    return index;
}
public static int ApuraGov(){
    int GanhadorGov = 0;
    int index = 0;
    for(int i = 0; i < Candidato.ListaGovernador.size(); i++){
        if(Candidato.ListaGovernador.get(i).Votos > GanhadorGov){
            GanhadorGov = Candidato.ListaGovernador.get(i).Votos;
            index = i;
        }
    }
    return index;
}
public static int ApuraPresidente(){
    int GanhadorPres = 0;
    int index = 0;
    for(int i = 0; i < Candidato.ListaPresidente.size(); i++){
        if(Candidato.ListaPresidente.get(i).Votos > GanhadorPres){
            GanhadorPres = Candidato.ListaPresidente.get(i).Votos;
            index = i;
        }
    }
    return index;
}

}

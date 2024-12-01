package UrnaOOP;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import UrnaOOP.*;
public class Menu{
    public static void Options(){
        System.out.println("Menu - Simulador do Sistema de Votação");
        System.out.println("1- Cadastrar Candidatos");
        System.out.println("2 - Cadastrar Eleitores");
        System.out.println("3- Votar");
        System.out.println("4 - Apurar Resultados");
        System.out.println("5 - Relatório e Estatísticas");
        System.out.println("6 - Encerrar");
        System.out.println("Opção Escolhida: ");
    }
    public static void Opcao1_CadastraCandidato(Scanner Input){
        String Catcher = "";
        while(!Catcher.equals("NAO")){
            System.out.println("Digite o nome do candidato:");
            String NomeCandidato = Input.next();
            System.out.println("Digite o cargo do candidato em letras:");
            String CargoCandidato = Input.next().toUpperCase();
            System.out.println("Digite o partido do candidato:");
            String PartidoCandidato = Input.next();
            System.out.println("Digite o numero do candidato:");
            int NumeroCandidato = Input.nextInt();
            if (CargoCandidato.toUpperCase().equals("PREFEITO")){
                Prefeito p = new Prefeito(NomeCandidato, PartidoCandidato, NumeroCandidato);
                Candidato.ListaPrefeito.add(p);
            }
            else if(CargoCandidato.toUpperCase().equals("GOVERNADOR")){
                Governador g = new Governador(NomeCandidato, PartidoCandidato, NumeroCandidato);
                Candidato.ListaGovernador.add(g);
            }
            else{
                Presidente s = new Presidente(NomeCandidato, PartidoCandidato, NumeroCandidato);
                Candidato.ListaPresidente.add(s);
            }
            System.out.println("Deseja continuar? Digite NAO para Não");
            Catcher = Input.next();
        }
    }
    public static void Opcao2_CadastraEleitor(Scanner Input){
        String Catcher = "";
        while(!Catcher.equals("NAO")){
            System.out.println("Digite o nome do eleitor");
            String NomeEleitor = Input.next();
            System.out.println("Digite o CPF do eleitor");
            String CPFEleitor = Input.next();
            Eleitor.ValidaCPF(CPFEleitor, Input, NomeEleitor);
            System.out.println("Deseja cadastrar outro eleitor? Digite NAO para sair.");
            Catcher = Input.next();
        }   
    }
    public static void Votar(Scanner Input){
        System.out.println("Bem vindo ao Sistema de Votação");
        Urna.Wipe();
        for(int i = 0; i < Eleitor.ListaNomes.size(); i++){
            System.out.println("Bem vindo: " +Eleitor.ListaNomes.get(i));
            Urna.VotaPrefeito(Input);
            Urna.VotaGovernador(Input);
            Urna.VotaPresidente(Input);
            Urna.SalvaEleitor(Eleitor.ListaNomes.get(i));
            }
    }
        public static int PrefeitoGanhador = Urna.ApuraPrefeito();
        public static int GovGanhador = Urna.ApuraGov();
        public static int PresGanhador = Urna.ApuraPresidente();
    public static void Opcao4_ApuraResultados(){
        double PrefPercent = Candidato.ListaPrefeito.get(PrefeitoGanhador).Votos;
        PrefPercent = (PrefPercent/Urna.VotosValidosPref)*100;
        double GovPercent = Candidato.ListaGovernador.get(GovGanhador).Votos;
        GovPercent = (GovPercent/Urna.VotosValidosGov)*100;
        double PresPercent = Candidato.ListaPresidente.get(PresGanhador).Votos;
        PresPercent = (PresPercent/Urna.VotosValidosPres)*100;
        System.out.println("Nome do prefeito ganhador: " +Candidato.ListaPrefeito.get(PrefeitoGanhador).nome);
        System.out.println("Partido: " +Candidato.ListaPrefeito.get(PrefeitoGanhador).partido);
        System.out.println("Quantidade de votos: " +Candidato.ListaPrefeito.get(PrefeitoGanhador).Votos);
        System.out.println("% dos Votos Validos: " +PrefPercent +"%");
        System.out.println("Nome do Governador ganhador: " +Candidato.ListaGovernador.get(GovGanhador).nome);
        System.out.println("Partido: " +Candidato.ListaGovernador.get(GovGanhador).partido);
        System.out.println("Quantidade de votos: " +Candidato.ListaGovernador.get(GovGanhador).Votos);
        System.out.println("% dos Votos Validos: " +GovPercent + "%");
        System.out.println("Nome do presidente ganhador: " +Candidato.ListaPresidente.get(PresGanhador).nome);
        System.out.println("Partido: " +Candidato.ListaPresidente.get(PresGanhador).partido);
        System.out.println("Quantidade de votos: " +Candidato.ListaPresidente.get(PresGanhador).Votos);
        System.out.println("% dos Votos Validos: " +PresPercent+"%");
    }
    public static void Opcao5_Relatorio(){
       Urna.ExibirEleitores();
       Urna.Auditoria();
       Candidato.ComparaPartidos();
    }
}
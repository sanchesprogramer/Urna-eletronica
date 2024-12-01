package UrnaOOP;
import java.util.ArrayList;
public class Candidato {
    static ArrayList<Prefeito> ListaPrefeito = new ArrayList<Prefeito>();
    static ArrayList<Governador> ListaGovernador = new ArrayList<Governador>();
    static ArrayList<Presidente> ListaPresidente = new ArrayList<Presidente>();


public static String BuscarPrefeito(String x){
    for(int i = 0; i < Candidato.ListaPrefeito.size(); i++){
        if(x.equals(Candidato.ListaPrefeito.get(i).nome)){
            return Candidato.ListaPrefeito.get(i).nome;
        }
    }
    return "";
}
public static String BuscarGovernador(String x){
    for(int i = 0; i < Candidato.ListaGovernador.size(); i++){
        if(x.equals(Candidato.ListaGovernador.get(i).nome)){
            return Candidato.ListaGovernador.get(i).nome;
        }
    }
    return "";
}
public static String BuscarPresidente(String x){
    for(int i = 0; i < Candidato.ListaPresidente.size(); i++){
        if(x.equals(Candidato.ListaPresidente.get(i).nome)){
            return Candidato.ListaPresidente.get(i).nome;
        }
    }
    return "";
}
public static void ComparaPartidos(){
    if (Candidato.ListaGovernador.get(Menu.GovGanhador).partido.equals(Candidato.ListaPrefeito.get(Menu.PrefeitoGanhador).partido)){
        System.out.println("O Partido que mais elegeu politicos foi o: " +Candidato.ListaGovernador.get(Menu.GovGanhador).partido);
    }
    else if(Candidato.ListaGovernador.get(Menu.GovGanhador).partido.equals(Candidato.ListaPresidente.get(Menu.PresGanhador).partido)){
        System.out.println("O Partido que mais elegeu politicos foi o: " +Candidato.ListaGovernador.get(Menu.GovGanhador).partido);
    }
    else if(Candidato.ListaPrefeito.get(Menu.PresGanhador).partido.equals(Candidato.ListaPrefeito.get(Menu.PrefeitoGanhador).partido)){
        System.out.println("O Partido que mais elegeu politicos foi o: " +Candidato.ListaPrefeito.get(Menu.PrefeitoGanhador).partido);
    }
    else{
        System.out.println("Todos os partidos elegeram a mesma quantidade de candidatos.");
    }

    }
}


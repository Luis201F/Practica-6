/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_6;


/**
 *
 * @author Luis
 */
class Equipo{
    String nombreEquipo;
    int division;
    String nombreEntrenador;
    int torneosParticipando;
    int torneosGanados;
    int torneosPerdidos;
    static Jugadores[] jugador =new Jugadores[10];

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public int getTorneosParticipando() {
        return torneosParticipando;
    }

    public void setTorneosParticipando(int torneosParticipando) {
        this.torneosParticipando = torneosParticipando;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public int getTorneosPerdidos() {
        return torneosPerdidos;
    }

    public void setTorneosPerdidos(int torneosPerdidos) {
        this.torneosPerdidos = torneosPerdidos;
    }

    public int jugadores(){
            return jugador.length;
        }
    public void setJugadores(int numEquipo) {
        System.out.println("Capturando jugadores del equipo " +(numEquipo+1));
        for(int i=0;i<jugador.length;i++){
            jugador[i] = new Jugadores();
        }
        for(int i=0;i<jugador.length;i++){
            jugador[i].setNombre(CapturaEntrada.capturarCadena("Nombre"));
            jugador[i].setNumUniforme(CapturaEntrada.capturarEntero("Numero del jugador"));
            for(int j=0;j<i;j++){
                while(jugador[i].getNumUniforme() == jugador[j].getNumUniforme()){
                    jugador[i].setNumUniforme(CapturaEntrada.capturarEntero("Ese numero de jugador esta ocupado ingrese otro"));
                }
            }
            jugador[i].setPosicion(CapturaEntrada.capturarCadena("Ingresa la posicion"));
            jugador[i].setEstatura(CapturaEntrada.capturarFlotante("Ingresa la estatura "));
            jugador[i].setPuntosAnotados(CapturaEntrada.capturarEntero("Ingrese los puntos anotados"));
        } 
    }
    public int PuntosAnotadosTotal(){
        int TotalPuntos= 0;
        for(Jugadores i: jugador){
            TotalPuntos+= i.getPuntosAnotados();
        }
        return TotalPuntos;
    }
           
}
class Jugadores{
    int numUniforme;
    String nombre;
    int puntosAnotados;
    String posicion;
    float estatura;

    public int getNumUniforme() {
        return numUniforme;
    }

    public void setNumUniforme(int numUniforme) {
        this.numUniforme = numUniforme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
}
class Torneo{
    String nombreTorneo;
    String region;
    int numEquipos;
    int partidosJugados;
    int partidosPendientes;
    static Equipo equipos[]= new Equipo[5];
    public Torneo(){
           setNombreTorneo("NBA");
           setRegion("Estados Unidos");
           setPartidosJugados(10);
           setNumEquipos(5);
           setPartidosPendientes(72);
           AgregarEquipos();
       }
  
   
    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo =nombreTorneo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos =numEquipos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }

    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

    public void AgregarEquipos(){
        for(int i=0;i<equipos.length;i++){
            System.out.println("Ingreso datos de equipo:");
            equipos[i] = new Equipo();
            equipos[i].setNombreEquipo(CapturaEntrada.capturarCadena("Nombre del Equipo"));
            equipos[i].setDivision(1);
            equipos[i].setNombreEntrenador(CapturaEntrada.capturarCadena("Nombre del entrenador"));
            equipos[i].setTorneosGanados(CapturaEntrada.capturarEntero("Torneos ganados"));
            equipos[i].setTorneosPerdidos(CapturaEntrada.capturarEntero("Torneos perdidos"));
            equipos[i].setTorneosParticipando(CapturaEntrada.capturarEntero("Torneos en los que ha participado"));
            equipos[i].setJugadores(i);
        }

    }
    
}
public class Pract6 {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        System.out.println("Nombre del torneo: " +torneo.getNombreTorneo());
        System.out.println("\nRegion: "+torneo.getRegion());
        System.out.println("\nEquipos que participan en el torneo: " + torneo.getNumEquipos());
        System.out.println("\nPartidos jugados: " +torneo.getPartidosJugados());
        System.out.println("\nPartidos Pendientes:"+torneo.getPartidosPendientes());

        for(int i=0;i<5;i++){
            System.out.println("Nombre del equipo :"+ Torneo.equipos[i].getNombreEquipo());
            System.out.println("Division: "+ Torneo.equipos[i].getDivision());
            System.out.println("Jugadores: " + Torneo.equipos[i].jugadores());
            System.out.println("Puntos: " + Torneo.equipos[i].PuntosAnotadosTotal());
            for(int j=0;j<Torneo.equipos[i].jugador.length;j++){
                System.out.println("Jugador: " + Torneo.equipos[i].jugador[j].getNombre());
                System.out.println("Numero del jugador: " + Torneo.equipos[i].jugador[j].getNumUniforme());
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carloslagos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clago
 */
public class Examen1P2_CarlosLagos {

    /**
     * @param args the command line arguments
     */
    
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) throws MiEx {
        ArrayList listrobot = new ArrayList();
        int id = 0,x = 0, y = 0, servomot = 0, capmax = 0, cantllantas = 0, cont = 1111, optipo = 0;
        boolean carga = false;
        String fecha = "";
        double altura = 0.0, peso = 0.0, velocidadpunta = 0.0;
        
        Robot r = new RobotMovilPesado();
        
        boolean centinela = true;
        
        while (centinela == true) {            
            System.out.println("Examen 2 \n");
            System.out.println("1) Crear Robot");
            System.out.println("2) Listar Robot");
            System.out.println("3) Simular Automaticamente");
            System.out.println("4) Actuar Manualmente \n");
            System.out.println("Ingrese la opcion que desea: ");
            int opcion = lea.nextInt();
            
            switch (opcion){
                
                case 1:{
                    System.out.println("Crear un Robot");
                    id  = cont;
                    boolean c1 = false;
                    while (c1 == false) {  
                        try{
                            System.out.println("Ingrese la posicion en x: ");
                            x = lea.nextInt();
                            r.setX(x);
                            c1 = true;
                        }catch(MiEx ex){
                            System.out.println(ex.getMessage());
                            c1 = false;
                        }
                        
                    }
                    boolean c3 = false;
                    while (c3 == false) {  
                        try{
                            System.out.println("Ingrese la posicion en y: ");
                            y = lea.nextInt();
                            r.setY(y);
                            c3 = true;
                        }catch(MiEx ex){
                            System.out.println(ex.getMessage());
                            c3 = false;
                        }
                        
                    }
                    
                    
                    carga = false;
                    
                    System.out.println("Ingrese la fecha de creacion del robot: ");
                    lea.nextLine();
                    fecha = lea.nextLine();
                    
                    boolean centinela1 = true;
                    while (centinela1 == true) {
                        System.out.println("Tipos de Robot \n");
                        System.out.println("1) Androide");
                        System.out.println("2) Manos Roboticas");
                        System.out.println("3) Robots Moviles Agiles");
                        System.out.println("4) Robots Moviles Pesados");
                        System.out.println("Ingrese el tipo que desea: ");
                        optipo = lea.nextInt();

                        switch (optipo) {
                            case 1: {
                                System.out.println("Androide");
                                System.out.println("Ingrese la altura: ");
                                altura = lea.nextDouble();
                                System.out.println("Ingrese el peso: ");
                                peso = lea.nextDouble();
                                
                                
                                centinela1 = false;
                            }//fin 1
                            break;

                            case 2: {
                                System.out.println("Manos Roboticas");
                                System.out.println("Ingrese la cantidad de servo motores: ");
                                servomot = lea.nextInt();
                                
                                centinela1 = false;
                            }//fin 2
                            break;

                            case 3: {
                                System.out.println("Robots Moviles Agiles");
                                System.out.println("Ingrese la cantidad de llantas del robot: ");
                                cantllantas = lea.nextInt();
                                System.out.println("Ingrese la velocidad de punta del robot: ");
                                velocidadpunta = lea.nextDouble();
                                
                                centinela1 = false;
                            }//fin 3
                            break;
                            
                            case 4: {
                                System.out.println("Robots Moviles Pesados");
                                System.out.println("Ingrese el peso del robot: ");
                                peso = lea.nextDouble();
                                boolean c2 = false;
                                while (c2 == false) {                                    
                                    try {
                                        System.out.println("Ingrese la capacidad maxima que puede cargar: ");
                                        capmax = lea.nextInt();
                                        ((RobotMovilPesado)r).setCapmax(capmax);
                                        c2 = true;
                                    } catch (MiEx e) {
                                        System.out.println(e.getMessage());
                                        c2 = false;
                                    }
                                
                                }
                                
                                
                                centinela1 = false;
                            }//fin 3
                            break;

                            default:
                                System.out.println("Opcion no disponible");
                                centinela1 = true;
                        }//fin switch
                    }//fin while
                    
                    if (optipo == 1) {
                        
                        listrobot.add(new Androide(altura, peso, id, x, y, carga, fecha));
                        cont = cont + 1111;
                        
                    }else if (optipo == 2) {
                        
                        listrobot.add(new ManosRoboticas(servomot, id, x, y, carga, fecha));
                        cont = cont + 1111;
                        
                    }else if (optipo == 3) {
                        
                        listrobot.add(new RobotMovilAgil(cantllantas, velocidadpunta, id, x, y, carga, fecha));
                        cont = cont + 1111;
                        
                    }else if (optipo == 4) {
                        
                        listrobot.add(new RobotMovilPesado(peso, capmax, id, x, y, carga, fecha));
                        cont = cont + 1111;
                        
                    }
                    
                }//fin 1
                break;
                
                case 2:{
                    System.out.println("Listar Robot");
                    
                    System.out.println("Listar los Personajes");
                    String listar = "";
                    for (Object t : listrobot) {
                        if (t instanceof Robot) {
                            listar += listrobot.indexOf(t) + " - " + t + "\n";//get class se puede usar tambien
                        }

                    }
                    System.out.println(listar);
                    System.out.println();
                    System.out.println();
                }//fin 2
                break;
                
                case 3:{
                    System.out.println("Simular Automaticamente");
                    char[][] tablero = new char[8][8];
                    tablero = LlenaTab(8, 8);
                    ImprimeM(tablero, x, y);
                    
                }//fin 3
                break;
                
                case 4:{
                    System.out.println("Actuar Manualmente");
                }//fin 4
                break;
                
                default: 
                    centinela = false;
            }//fin switch
            
        }//fin while
        
        
    }//fin main 
     public static char[][]LlenaTab(int fila, int col){
        char [][]matrizt = new char [fila][col];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                //Obstaculos
                matrizt[3][5] = 'X';
                matrizt[6][2] = 'X';
                matrizt[1][4] = 'X';
                matrizt[4][7] = 'X';
                matrizt[2][1] = 'X';
                
                //Cajas
                matrizt[1][2] = 'C';
                matrizt[3][4] = 'C';
                matrizt[4][6] = 'C';
                matrizt[2][7] = 'C';
                matrizt[5][1] = 'C';
                matrizt[6][5] = 'C';
                
                //Destino
                matrizt[7][7] = 'D';
                
                matrizt[i][j] = ' ';
                
            }
        }
        return matrizt;
    }
      public static void ImprimeM(char [][] matriz, int x, int y){
          System.out.println(x + ""+y);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == x && j == y) {
                    System.out.print("[R] ");
                }else{
                System.out.print("["+matriz[i][j]+"] ");
                } 
                        
            }
            System.out.println();
        }
    }
}//fin clase

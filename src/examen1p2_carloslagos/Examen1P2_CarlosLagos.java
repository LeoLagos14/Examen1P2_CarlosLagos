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
    
    public static void main(String[] args) {
        ArrayList listrobot = new ArrayList();
        int id = 0, x = 0, y = 0, servomot = 0, capmax = 0, cantllantas = 0, cont = 1111, optipo = 0;
        boolean carga = false;
        String fecha = "";
        double altura = 0.0, peso = 0.0, velocidadpunta = 0.0;
        
        boolean centinela = true;
        
        while (centinela = true) {            
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
                    System.out.println("Ingrese la posicion en x: ");
                    x = lea.nextInt();
                    System.out.println("Ingrese la posicion en y: ");
                    y = lea.nextInt();
                    
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
                                System.out.println("Ingrese la capacidad maxima que puede cargar: ");
                                capmax = lea.nextInt();
                                
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
                }//fin 2
                break;
                
                case 3:{
                    System.out.println("Simular Automaticamente");
                }//fin 3
                break;
                
                case 4:{
                    System.out.println("Actuar Manualmente");
                }//fin 4
                break;
                
            }//fin switch
            
        }//fin while
        
  
 
        
    }//fin main 
    
}//fin clase

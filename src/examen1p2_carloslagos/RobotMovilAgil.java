/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carloslagos;

/**
 *
 * @author clago
 */
public class RobotMovilAgil extends Robot{
    
    private int cantllantas;
    private double velocidadpunta;

    public RobotMovilAgil() {
        super();
    }

    public RobotMovilAgil(int cantllantas, double velocidadpunta) {
        this.cantllantas = cantllantas;
        this.velocidadpunta = velocidadpunta;
    }

    public RobotMovilAgil(int cantllantas, double velocidadpunta, int id, int x, int y, boolean carga, String fecha) throws MiEx {
        super(id, x, y, carga, fecha);
        this.cantllantas = cantllantas;
        this.velocidadpunta = velocidadpunta;
    }

    public int getCantllantas() {
        return cantllantas;
    }

    public void setCantllantas(int cantllantas) {
        this.cantllantas = cantllantas;
    }

    public double getVelocidadpunta() {
        return velocidadpunta;
    }

    public void setVelocidadpunta(double velocidadpunta) {
        this.velocidadpunta = velocidadpunta;
    }

    @Override
    public String toString() {
        return super.toString() + "RobotMovilAgil{" + "cantllantas=" + cantllantas + ", velocidadpunta=" + velocidadpunta + '}';
    }
    
    
    public void mov(int x, int y,int xf, int yf, char d){
        if (d == '^') {
            y = y - 1;
                    
        }else if (d == 'V') {
            y = y + 1;
        }else if (d == '>') {
            x = x + 1;
        }else if (d == '<') {
            x = x - 1;
        }
        //this.setX(x);
        //this.setY(y);
    }
    @Override
    public void mnt(){
        
    }
    @Override
    public void unmt(){
        
    }
    @Override
    public void rot(int degrees,char a){
        
    }

    
    
    
}//fin clase

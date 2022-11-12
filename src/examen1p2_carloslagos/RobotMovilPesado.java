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
public class RobotMovilPesado extends Robot{
    
    private double peso;
    private int capmax;

    public RobotMovilPesado() {
        super();
    }

    public RobotMovilPesado(double peso, int capmax) throws MiEx{
        this.peso = peso;
        this.setCapmax(capmax);
    }

    public RobotMovilPesado(double peso, int capmax, int id, int x, int y, boolean carga, String fecha) throws MiEx {
        super(id, x, y, carga, fecha);
        this.peso = peso;
        this.capmax = capmax;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setCapmax(int capmax) throws MiEx {

        if (capmax > 5) {
            this.capmax = capmax;
        } else {
            throw new MiEx("La capacidad maxima debe ser mayor que 5");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "RobotMovilPesado{" + "peso=" + peso + ", capmax=" + capmax + '}';
    }
    
    @Override
    public void mov(int x, int y,int xf, int yf){
        
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

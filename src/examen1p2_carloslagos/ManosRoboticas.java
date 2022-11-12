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
public class ManosRoboticas extends Robot{
    
    private int servomot;

    public ManosRoboticas() {
        super();
    }

    public ManosRoboticas(int servomot) {
        this.servomot = servomot;
    }

    public ManosRoboticas(int servomot, int id, int x, int y, boolean carga, String fecha) throws MiEx {
        super(id, x, y, carga, fecha);
        this.servomot = servomot;
    }

    public int getServomot() {
        return servomot;
    }

    public void setServomot(int servomot) {
        this.servomot = servomot;
    }

    @Override
    public String toString() {
        return super.toString() + "ManosRoboticas{" + "servomot=" + servomot + '}';
    }
    
    @Override
    public int mov(int x, int y,int xf, int yf){
        return 0;
    }
    @Override
    public void mnt(){
        
    }
}//fin clase

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

    public RobotMovilPesado(double peso, int capmax) {
        this.peso = peso;
        this.setCapmax(capmax);
    }

    public RobotMovilPesado(double peso, int capmax, int id, int x, int y, boolean carga, String fecha) {
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

    public void setCapmax(int capmax) {
        
        if (capmax > 5) {
            this.capmax = capmax;
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "RobotMovilPesado{" + "peso=" + peso + ", capmax=" + capmax + '}';
    }
    
    
    
}//fin clase

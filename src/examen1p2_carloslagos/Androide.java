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
public class Androide extends Robot {
    
    private double altura;
    private double peso;

    public Androide() {
        super();
    }

    public Androide(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Androide(double altura, double peso, int id, int x, int y, boolean carga, String fecha) throws MiEx {
        super(id, x, y, carga, fecha);
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Androide{" + "altura=" + altura + ", peso=" + peso + '}';
    }
    
    @Override
    public int mov(int x, int y,int xf, int yf){
        return 0;
    }
    @Override
    public void mnt(){
        
    }
}//fin clase

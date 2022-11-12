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
    public void rot(int degrees,char a){
        
    }

    
}//fin clase

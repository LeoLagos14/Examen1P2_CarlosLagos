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
public abstract class Robot {
    
    private int id;
    private int x;
    private int y;
    private boolean carga;
    private String fecha;

    public Robot() {
    }

    public Robot(int id, int x, int y, boolean carga, String fecha) throws MiEx{
        this.id = id;
        this.setX(x);
        this.y = y;
        this.carga = carga;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws MiEx{
        if (x > 0 && x <= 7) {
            this.x = x;
        }else{
            throw new MiEx("Su coordenada X se pasa del limite");
        }
        
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws MiEx {
        if (y > 0 && y <= 7) {
            this.y = y;
        }else{
            throw new MiEx("Su coordenada Y se pasa del limite");
        }
        
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", x=" + x + ", y=" + y + ", carga=" + carga + ", fecha=" + fecha + '}';
    }
    //Polimorfismo
    
    public [][]char mov(int x, int y,int xf, int yf);
    
}//fin clase

package maridos;
import java.util.ArrayList;

/**
 *
 * @author Felipe Moreira
 */
public class No {
    private int x;
    private int y;
    int z, w, k; // Para canibais
    private String regra;
    ArrayList<No> filhos = new ArrayList();
    
    No (String r, int x, int y) { // Usada em três jarros
        this.x = x;
        this.y = y;
        this.regra = r;
    }
    
    No (String r, int x, int y, int z, int w, int k) { // Usada em canibais
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.k = k;
        this.regra = r;
    }
     
    public String getRegra() {
        return this.regra;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}

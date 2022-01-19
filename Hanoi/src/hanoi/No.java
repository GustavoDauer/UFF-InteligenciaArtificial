package hanoi;
import java.util.ArrayList;

/**
 *
 * @author Felipe Moreira
 */
public class No {
    private int x;
    private int y;
    int z;
    private String regra;
    ArrayList<No> filhos = new ArrayList();
    
    No (String r, int x, int y, int z) { // Usada em três jarros
        this.x = x;
        this.y = y;
        this.z = z;
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
}

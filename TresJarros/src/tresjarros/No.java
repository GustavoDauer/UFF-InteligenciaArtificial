package tresjarros;
import java.util.ArrayList;

/**
 *
 * @author Felipe Moreira
 */
public class No {
    private int x;
    private int y;
    private int z;
    private String regra;
    ArrayList<No> filhos = new ArrayList();
    
    No (String r, int x, int y, int z) {
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
    
    public int getZ() {
        return this.z;
    }
}

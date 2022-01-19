package hanoi;

/**
 *
 * @author Felipe Moreira
 */
public class Arvore {
    public No raiz;
    
    public Arvore (No no) {
        this.raiz = no;
    }
    
    public No getRaiz() {
        return this.raiz;
    }
    
//    public No buscaNo (No n, int x, int y) {
//        if ((n.getX() == x) && (n.getY() == y)) {
//            return n;
//        } else {
//            for (int i = 0; i < n.filhos.size(); i++) {
//                return buscaNo(n.filhos.get(i), x, y);
//            }
//        }
//        return null;
//    }
}

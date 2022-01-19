package tresjarros;

import java.util.ArrayList;

/**
 *
 * @author Felipe Moreira
 */
public class TresJarros {
         
    public static void main(String[] args) {
        //Criando estados finais
        No ef1 = new No(null, 4,4,0);
        ArrayList<No> estadosFinais = new ArrayList();
        estadosFinais.add(ef1); 
                    
        //Inicialização da arvore na janela
        Arvore arvore = new Arvore(new No(null,8,0,0));
        
        //Parte gráfica
        Janela janela = new Janela(arvore, estadosFinais);
        janela.setVisible(true);           
    }
}

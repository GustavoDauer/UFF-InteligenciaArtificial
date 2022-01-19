package maridos;

import java.util.ArrayList;

/**
 *
 * @author Felipe Moreira
 */
public class Maridos {
         
    public static void main(String[] args) {
        //Criando estados finais
//        No ef1 = new No(null, 2,0);
//        No ef2 = new No(null,2,1);
//        No ef3 = new No(null,2,2);
//        No ef4 = new No(null,2,3);
        No ef1 = new No(null, 0,0,123,123,1);

        ArrayList<No> estadosFinais = new ArrayList();
        estadosFinais.add(ef1); 
            
        //Inicialização da arvore na janela
        Arvore arvore = new Arvore(new No(null,123,123,0,0,0));
        
        //Parte gráfica
        Janela janela = new Janela(arvore, estadosFinais);
        janela.setVisible(true);           
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

/**
 *
 * @author Felipe Moreira
 */
public class Janela extends javax.swing.JFrame {

    Arvore arvore;
    ArrayList<No> estadosFinais;
    ArrayList<No> open = new ArrayList();
    ArrayList<No> closed = new ArrayList();
    No solucao;
    boolean terminou;

    /**
     * Creates new form Interface
     *
     * @param a
     * @param e
     */
    public Janela(Arvore a, ArrayList<No> e) {
        initComponents();
        this.arvore = a;
        this.estadosFinais = e;
        this.open.clear();
        this.closed.clear();
        this.terminou = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadio = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelArvore = new javax.swing.JTree();
        botaoProx = new javax.swing.JButton();
        opcaoLargura = new javax.swing.JRadioButton();
        opcaoProfundidade = new javax.swing.JRadioButton();
        labelAtual = new javax.swing.JLabel();
        labelProx = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaOpen = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaClosed = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hanoi");
        setIconImages(null);
        setName("interface"); // NOI18N
        setResizable(false);

        painelArvore.setModel(null);
        jScrollPane1.setViewportView(painelArvore);

        botaoProx.setText("Começar");
        botaoProx.setName("botaoProx"); // NOI18N
        botaoProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProxActionPerformed(evt);
            }
        });

        grupoRadio.add(opcaoLargura);
        opcaoLargura.setSelected(true);
        opcaoLargura.setText("Largura");

        grupoRadio.add(opcaoProfundidade);
        opcaoProfundidade.setText("Profundidade");

        labelAtual.setText("Atual: -");

        labelProx.setText("Próximo: -");

        jScrollPane2.setViewportView(listaOpen);

        jScrollPane3.setViewportView(listaClosed);

        jLabel1.setText("Open:");

        jLabel2.setText("Closed:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelAtual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcaoLargura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelProx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoProx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(opcaoProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opcaoLargura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcaoProfundidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProx)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(botaoProx)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProxActionPerformed
        if (botaoProx.getText().equals("Começar")) {
            if (opcaoLargura.isSelected()) {
                opcaoProfundidade.setEnabled(false);
            } else {
                opcaoLargura.setEnabled(false);
            }

            atualizaArvore();

            botaoProx.setText("Próximo");
            this.terminou = false;
            open.add(this.arvore.getRaiz());
        } else if (botaoProx.getText().equals("Limpar")) {
            //Limpa labels
            labelAtual.setText("Atual: -");
            labelProx.setText("Próxima: -");

            //Limpa e redefine arvore e JTree
            DefaultTreeModel modeloVazioArvore = new DefaultTreeModel(null);
            painelArvore.setModel(modeloVazioArvore);
            botaoProx.setText("Começar");
            this.arvore = new Arvore(new No(null, 0, 0, 123));

            //Limpa ArrayLists e JLists
            open.clear();
            atualizaOpen();
            closed.clear();
            atualizaClosed();

            //Reseta os JRadios
            if (opcaoLargura.isEnabled()) {
                opcaoProfundidade.setEnabled(true);
            } else {
                opcaoLargura.setEnabled(true);
            }
        } else {
            busca(this.arvore, this.estadosFinais);
            if (!terminou) {
                atualizaOpen();
                atualizaClosed();
            }
        }
    }//GEN-LAST:event_botaoProxActionPerformed

    public DefaultMutableTreeNode calculaArvore(No n, No raiz, int nivel) {
        DefaultMutableTreeNode noCorrente;
        if (n == this.arvore.getRaiz()) {
            //noCorrente = new DefaultMutableTreeNode("(" + n.getX() + "," + n.getY() + ")");
            noCorrente = new DefaultMutableTreeNode("(" + n.getX() + "," + n.getY() + "," + n.getZ() + ")");
        } else {
            //noCorrente = new DefaultMutableTreeNode(n.getRegra() + "(" + n.getX() + "," + n.getY() + ")");
            noCorrente = new DefaultMutableTreeNode(n.getRegra() + n.getX() + "," + n.getY() + "," + n.getZ() + ")");
        }
        if (!n.filhos.isEmpty()) {
            for (int i = 0; i < n.filhos.size(); i++) {
                noCorrente.add(calculaArvore(n.filhos.get(i), n, nivel + 1));
            }
        }
        return noCorrente;
    }

    public void atualizaArvore() {
        DefaultTreeModel modelo = new DefaultTreeModel(calculaArvore(this.arvore.getRaiz(), null, 1));
        this.painelArvore.setModel(modelo);
        expandirArvore(painelArvore);
    }

    public void expandirArvore(JTree arvore) {
        int x = 1;
        int linhas = arvore.getRowCount();
        while ((linhas - 1) >= x) {
            arvore.expandPath(arvore.getPathForRow(x));
            linhas = arvore.getRowCount();
            x++;
        }
    }

    public void atualizaOpen() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < open.size(); i++) {
//            modelo.addElement("(" + open.get(i).getX() + "," + open.get(i).getY() + ")");
            modelo.addElement("(" + open.get(i).getX() + "," + open.get(i).getY() + "," + open.get(i).getZ() + ")");
        }
        listaOpen.setModel(modelo);
    }

    public void atualizaClosed() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < closed.size(); i++) {
//            modelo.addElement("(" + closed.get(i).getX() + "," + closed.get(i).getY() + ")");
            modelo.addElement("(" + closed.get(i).getX() + "," + closed.get(i).getY() + "," + closed.get(i).getZ() + ")");
        }
        listaClosed.setModel(modelo);
    }

    public boolean openCloseContem(No n) {
        for (int i = 0; i < this.open.size(); i++) {
//            if ((n.getX() == this.open.get(i).getX()) && (n.getY() == this.open.get(i).getY())) {
            if ( (n.getX() == this.open.get(i).getX()) && (n.getY() == this.open.get(i).getY()) && (n.getZ() == this.open.get(i).getZ()) ) {
                return true;
            }
        }
        for (int j = 0; j < this.closed.size(); j++) {
//            if ((n.getX() == this.closed.get(j).getX()) && (n.getY() == this.closed.get(j).getY())) {
            if ((n.getX() == this.closed.get(j).getX()) && (n.getY() == this.closed.get(j).getY()) && (n.getZ() == this.closed.get(j).getZ()) ) {
                return true;
            }
        }
        return false;
    }

    public void finaliza() {
//        JOptionPane.showMessageDialog(null, "Solução encontrada! Nó: (" + solucao.getX() + "," + solucao.getY() + ")");
        JOptionPane.showMessageDialog(null, "Solução encontrada! Nó: (" + solucao.getX() + "," + solucao.getY() + "," + solucao.getZ() + ")");
        botaoProx.setText("Limpar");
    }

    public boolean checaFinal(No n) {
        for (int i = 0; i < this.estadosFinais.size(); i++) {
            //if ((n.getX() == this.estadosFinais.get(i).getX()) && (n.getY() == this.estadosFinais.get(i).getY())) {
            if ((n.getX() == this.estadosFinais.get(i).getX()) && (n.getY() == this.estadosFinais.get(i).getY()) && (n.getZ() == this.estadosFinais.get(i).getZ())) {
                return true;
            }
        }
        return false;
    }

    public void adicionaOpen(No n) {
        if (opcaoLargura.isSelected()) {
            open.add(n);
        } else {
            open.add(0,n);
        }
    }
    
    public void busca(Arvore arvore, ArrayList<No> estadosFinais) {
        if ((!open.isEmpty()) && (!terminou)) {
            atualizaOpen();
            atualizaClosed();
            No avaliado = open.get(0);
            //System.out.println("Nó usado: (" + avaliado.getX() + "," + avaliado.getY() + ")");
            System.out.println("Nó usado: (" + avaliado.getX() + "," + avaliado.getY() + "," + avaliado.getZ() + ")");
//            labelAtual.setText("Atual: (" + avaliado.getX() + "," + avaliado.getY() + ")");
            labelAtual.setText("Atual: (" + avaliado.getX() + "," + avaliado.getY() + "," + avaliado.getZ() + ")");
            open.remove(0);
            closed.add(avaliado);

            int r = 1;
            
            //Aplicação das regras
            //Regra1
            if (avaliado.getX() == 123 && avaliado.getY() == 0 && avaliado.getZ() == 0) {
                No nr1 = new No("(r1)", 23, 0, 1);
                if (checaFinal(nr1)) {
                    //System.out.println("FIM! Nó gerado pela regra 1: (" + nr1.getX() + "," + nr1.getY() + "," + nr1.getZ() + "," + nr1.getW() + "," + nr1.getK() + ")");
                    escreveNo(r, nr1);
                    avaliado.filhos.add(nr1);
                    solucao = nr1;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr1)) {
                        adicionaOpen(nr1);
                        avaliado.filhos.add(nr1);
                        escreveNo(r, nr1);
                    }
                }
            }
            
            r++;

            //Regra2
            if (avaliado.getX() == 23 && avaliado.getY() == 0 && avaliado.getZ() == 1) {
                No nr2 = new No("(r2)", 3, 2, 1);
                if (checaFinal(nr2)) {
                    //System.out.println("FIM! Nó gerado pela regra 2: (" + nr2.getX() + "," + nr2.getY() + "," + nr2.getZ() + "," + nr2.getW() + "," + nr2.getK() + ")");
                    escreveNo(r, nr2);
                    avaliado.filhos.add(nr2);
                    solucao = nr2;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr2)) {
                        adicionaOpen(nr2);
                        avaliado.filhos.add(nr2);
                        //System.out.print("Nó gerado pela regra 2: (" + nr2.getX() + "," + nr2.getY() + "," + nr2.getZ() + "," + nr2.getW() + "," + nr2.getK() + ")\n");
                        escreveNo(r, nr2);
                    }
                }
            }
            
            r++;

            //Regra3
            if (avaliado.getX() == 3 && avaliado.getY() == 2 && avaliado.getZ() == 1) {
                No nr3 = new No("(r3)", 3, 12, 0);
                if (checaFinal(nr3)) {
                    //System.out.println("FIM! Nó gerado pela regra 3: (" + nr3.getX() + "," + nr3.getY() + "," + nr3.getZ() + "," + nr3.getW() + "," + nr3.getK() + ")");
                    escreveNo(r, nr3);
                    avaliado.filhos.add(nr3);
                    solucao = nr3;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr3)) {
                        adicionaOpen(nr3);
                        avaliado.filhos.add(nr3);
                        //System.out.print("Nó gerado pela regra 3: (" + nr3.getX() + "," + nr3.getY() + "," + nr3.getZ() + "," + nr3.getW() + "," + nr3.getK() + ")\n");
                        escreveNo(r, nr3);
                    }
                }
            }
            
            r++;

            //Regra4
            if (avaliado.getX() == 3 && avaliado.getY() == 12 && avaliado.getZ() == 0) {
                No nr4 = new No("(r4)", 0, 12, 3);
                if (checaFinal(nr4)) {
                    //System.out.println("FIM! Nó gerado pela regra 4: (" + nr4.getX() + "," + nr4.getY() + ")");
                    escreveNo(r, nr4);
                    avaliado.filhos.add(nr4);
                    solucao = nr4;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr4)) {
                        adicionaOpen(nr4);
                        avaliado.filhos.add(nr4);
                        //System.out.println("Nó gerado pela regra 4: (" + nr4.getX() + "," + nr4.getY() + ")\n");
                        escreveNo(r, nr4);
                    }
                }
            }
            
            r++;

            //Regra5
            if (avaliado.getX() == 0 && avaliado.getY() == 12 && avaliado.getZ() == 3) {
                No nr5 = new No("(r5)", 1, 2, 3);
                if (checaFinal(nr5)) {
                    //System.out.println("FIM! Nó gerado pela regra 5: (" + nr5.getX() + "," + nr5.getY() + ")");
                    escreveNo(r, nr5);
                    avaliado.filhos.add(nr5);
                    solucao = nr5;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr5)) {
                        adicionaOpen(nr5);
                        avaliado.filhos.add(nr5);
                        //System.out.println("Nó gerado pela regra 5: (" + nr5.getX() + "," + nr5.getY() + ")\n");
                        escreveNo(r, nr5);
                    }
                }

            }
            
            r++;

            //Regra6
            if (avaliado.getX() == 1 && avaliado.getY() == 2 && avaliado.getZ() == 3) {
                No nr6 = new No("(r6)", 1, 0, 23);
                if (checaFinal(nr6)) {
                    //System.out.println("FIM! Nó gerado pela regra 6: (" + nr6.getX() + "," + nr6.getY() + ")");
                    escreveNo(r, nr6);
                    avaliado.filhos.add(nr6);
                    solucao = nr6;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr6)) {
                        adicionaOpen(nr6);
                        avaliado.filhos.add(nr6);
                        //System.out.println("Nó gerado pela regra 6: (" + nr6.getX() + "," + nr6.getY() + ")\n");
                        escreveNo(r, nr6);
                    }
                }
            }
            
            r++;

            //Regra7
            if (avaliado.getX() == 1 && avaliado.getY() == 0 && avaliado.getZ() == 23) {
                No nr7 = new No("(r7)", 0, 0, 123);
                if (checaFinal(nr7)) {
                    //System.out.println("FIM! Nó gerado pela regra 7: (" + nr7.getX() + "," + nr7.getY() + ")");
                    escreveNo(r, nr7);
                    avaliado.filhos.add(nr7);
                    solucao = nr7;
                    this.terminou = true;
                } else {
                    if (!openCloseContem(nr7)) {
                        adicionaOpen(nr7);
                        avaliado.filhos.add(nr7);
                        //System.out.println("Nó gerado pela regra 7: (" + nr7.getX() + "," + nr7.getY() + ")\n");
                        escreveNo(r, nr7);
                    }
                }
            }
            
            r++;

//            //Regra8
//            if (avaliado.getX() == 0 && avaliado.getY() == 12) {
//                No nr8 = new No("(r8)", 0, 123, 123, 0, 0);
//                if (checaFinal(nr8)) {
//                    //System.out.println("FIM! Nó gerado pela regra 8: (" + nr8.getX() + "," + nr8.getY() + ")");
//                    escreveNo(r, nr8);
//                    avaliado.filhos.add(nr8);
//                    solucao = nr8;
//                    this.terminou = true;
//                } else {
//                    if (!openCloseContem(nr8)) {
//                        adicionaOpen(nr8);
//                        avaliado.filhos.add(nr8);
//                        //System.out.println("Nó gerado pela regra 8: (" + nr8.getX() + "," + nr8.getY() + ")\n");
//                        escreveNo(r, nr8);
//                    }
//                }
//            }
//            
//            r++;
//            
//            //Regra9
//            if (avaliado.getX() == 0 && avaliado.getY() == 123) {
//                No nr9 = new No("(r9)", 0, 2, 123, 13, 1);
//                if (checaFinal(nr9)) {
//                    //System.out.println("FIM! Nó gerado pela regra 9: (" + nr8.getX() + "," + nr8.getY() + ")");
//                    escreveNo(r, nr9);
//                    avaliado.filhos.add(nr9);
//                    solucao = nr9;
//                    this.terminou = true;
//                } else {
//                    if (!openCloseContem(nr9)) {
//                        adicionaOpen(nr9);
//                        avaliado.filhos.add(nr9);
//                        //System.out.println("Nó gerado pela regra 9: (" + nr9.getX() + "," + nr9.getY() + ")\n");
//                        escreveNo(r, nr9);
//                    }
//                }
//            }
//            
//            r++;
//            
//            //Regra10
//            if (avaliado.getX() == 0 && avaliado.getY() == 2) {
//                No nr10 = new No("(r10)", 2, 2, 13, 13, 0);
//                if (checaFinal(nr10)) {
//                    //System.out.println("FIM! Nó gerado pela regra 10: (" + nr10.getX() + "," + nr10.getY() + ")");
//                    escreveNo(r, nr10);
//                    avaliado.filhos.add(nr10);
//                    solucao = nr10;
//                    this.terminou = true;
//                } else {
//                    if (!openCloseContem(nr10)) {
//                        adicionaOpen(nr10);
//                        avaliado.filhos.add(nr10);
//                        //System.out.println("Nó gerado pela regra 10: (" + nr10.getX() + "," + nr10.getY() + ")\n");
//                        escreveNo(r, nr10);
//                    }
//                }
//            }
//            
//            r++;
//            
//            //Regra11
//            if (avaliado.getX() == 2 && avaliado.getY() == 2) {
//                No nr11 = new No("(r11)", 0, 0, 123, 123, 1);
//                if (checaFinal(nr11)) {
//                    //System.out.println("FIM! Nó gerado pela regra 11: (" + nr8.getX() + "," + nr8.getY() + ")");
//                    escreveNo(r, nr11);
//                    avaliado.filhos.add(nr11);
//                    solucao = nr11;
//                    this.terminou = true;
//                } else {
//                    if (!openCloseContem(nr11)) {
//                        adicionaOpen(nr11);
//                        avaliado.filhos.add(nr11);
//                        //System.out.println("Nó gerado pela regra 11: (" + nr8.getX() + "," + nr8.getY() + ")\n");
//                        escreveNo(r, nr11);
//                    }
//                }
//            }

            if(open.size() > 0)
                labelProx.setText("Próximo: (" + open.get(0).getX() + "," + open.get(0).getY() + "," + open.get(0).getZ() + ")");
        } else {
            //JOptionPane.showMessageDialog(null, "Não há solução!");
            //finaliza();
        }
        atualizaArvore();
        if (terminou) {
            atualizaOpen();
            atualizaClosed();
            finaliza();
        }
    }
    
    public void escreveNo(int r, No no) {
        System.out.println("Nó gerado pela regra " + r + ": (" + no.getX() + "," + no.getY() + "," + no.getZ() + ")\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton botaoProx;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAtual;
    private javax.swing.JLabel labelProx;
    private javax.swing.JList listaClosed;
    private javax.swing.JList listaOpen;
    protected javax.swing.JRadioButton opcaoLargura;
    protected javax.swing.JRadioButton opcaoProfundidade;
    protected javax.swing.JTree painelArvore;
    // End of variables declaration//GEN-END:variables
}

package br.com.rene.view;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

/**
 *
 * @author Rene_sever
 */
public class VendaBalcaoView extends javax.swing.JFrame {

    private static VendaBalcaoView vendaBalcaoView;
    
    //Botões da barra de tarrefa
    private JButton jBNovo;
    private JButton jBFormaPGTO;
    private JButton jBSalvar;
    private JButton jBCancelar;
    private JButton jBExcluir;
    private JButton jBFormasPGTO;
    private JSeparator jSeparador1;
    private JSeparator jSeparador2;
    private JSeparator jSeparador3;
    private JSeparator jSeparador4;

    
     public static VendaBalcaoView getIntancia() {
        if (vendaBalcaoView == null) {
            vendaBalcaoView = new VendaBalcaoView();
            vendaBalcaoView.setVisible(true);
        }
          vendaBalcaoView.setVisible(true);
        return vendaBalcaoView;
    }
      

    public VendaBalcaoView() {
        initComponents();
       this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFCodBarras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFItem = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFDesconto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTBFerramentas = new javax.swing.JToolBar();
        jLabel9 = new javax.swing.JLabel();
        jTFItem1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFItem2 = new javax.swing.JTextField();
        jTFDesconto1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFDesconto2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(239, 247, 183));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cod. Barras:");

        jTFCodBarras.setBackground(new java.awt.Color(178, 229, 193));
        jTFCodBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Item:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jTFItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Valor Total:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("00,00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Desconto %:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Valor Geral:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("00,00");

        //Inicializando botões do TollBar
        jBNovo = new JButton();
        jBNovo.setVisible(false);
        jBFormaPGTO = new JButton();
        jBFormaPGTO.setVisible(false);
        jBSalvar = new JButton();
        jBSalvar.setVisible(false);
        jBCancelar = new JButton();
        jBCancelar.setVisible(false);
        jBExcluir = new JButton();
        jBExcluir.setVisible(false);

        jSeparador2 = new JSeparator();
        jSeparador2.setVisible(false);
        jSeparador3 = new JSeparator();
        jSeparador3.setVisible(false);
        jSeparador4 = new JSeparator();
        jSeparador4.setVisible(false);

        jSeparador2.setPreferredSize(new java.awt.Dimension(10, 0));
        jSeparador3.setPreferredSize(new java.awt.Dimension(10, 0));
        jSeparador4.setPreferredSize(new java.awt.Dimension(10, 0));

        ImageIcon img1 = new javax.swing.ImageIcon(getClass().getResource("/br/com/rene/view/imagem/Novo.png"));
        img1.setImage(img1.getImage().getScaledInstance(40, 40, 100));
        jBNovo.setIcon(img1);
        jBNovo.setVisible(false);
        jBNovo.setToolTipText("Novo");
        jBNovo.addActionListener((ActionEvent evt) -> {
            novo();
            HabilitaDesabilitaBatao(false);
        });
        ImageIcon img2 = new javax.swing.ImageIcon(getClass().getResource("/br/com/rene/view/imagem/Cancelar.png"));
        img2.setImage(img2.getImage().getScaledInstance(40, 40, 100));
        jBCancelar.setIcon(img2);
        jBCancelar.setVisible(false);
        jBCancelar.setToolTipText("Cancelar");
        jBCancelar.addActionListener((ActionEvent evt) -> {
            cancelar();
            HabilitaDesabilitaBatao(true);
        });
        ImageIcon img3 = new javax.swing.ImageIcon(getClass().getResource("/br/com/rene/view/imagem/Excluir.png"));
        img3.setImage(img3.getImage().getScaledInstance(40, 40, 100));
        jBExcluir.setIcon(img3);
        jBExcluir.setVisible(false);
        jBExcluir.setToolTipText("Excluir");
        jBExcluir.addActionListener((ActionEvent evt) -> {
            excluir();
            HabilitaDesabilitaBatao(true);
        });
        ImageIcon img4 = new javax.swing.ImageIcon(getClass().getResource("/br/com/rene/view/imagem/Localizar.png"));
        img4.setImage(img4.getImage().getScaledInstance(40, 40, 100));
        jBFormaPGTO.setIcon(img4);
        jBFormaPGTO.setVisible(false);
        jBFormaPGTO.setText("Formas PGTO");
        jBFormaPGTO.setToolTipText("Formas de Pagamentos");
        jBFormaPGTO.addActionListener((ActionEvent evt) -> {
            FormaPGTO();
        });
        ImageIcon img5 = new javax.swing.ImageIcon(getClass().getResource("/br/com/rene/view/imagem/Salvar.png"));
        img5.setImage(img5.getImage().getScaledInstance(40, 40, 100));
        jBSalvar.setIcon(img5);
        jBSalvar.setVisible(false);
        jBSalvar.setToolTipText("Salvar");
        jBSalvar.addActionListener((ActionEvent evt) -> {
            salvar();
            HabilitaDesabilitaBatao(true);
        });
        montaTBFerramentas();
        HabilitaDesabilitaBatao(true);
        jTBFerramentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTBFerramentas.setRollover(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Quantidade:");

        jTFItem1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Valor Und:");

        jTFItem2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFDesconto1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Dinheiro:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Troco:");

        jTFDesconto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFItem, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                    .addComponent(jTFNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(340, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTBFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFDesconto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jTFDesconto1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTFDesconto2, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTFItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTFItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTFItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTFDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDesconto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTFDesconto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 252, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jTBFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VendaBalcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaBalcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaBalcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaBalcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaBalcaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jTBFerramentas;
    private javax.swing.JTextField jTFCodBarras;
    private javax.swing.JTextField jTFDesconto;
    private javax.swing.JTextField jTFDesconto1;
    private javax.swing.JTextField jTFDesconto2;
    private javax.swing.JTextField jTFItem;
    private javax.swing.JTextField jTFItem1;
    private javax.swing.JTextField jTFItem2;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

 public void salvar() {
     
    }

    public void cancelar() {
       
    }

    public void novo() {
         // itemControl.novo();
    }

    public void excluir() {
         if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
         //   try {
               // itemControl.excluir();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
         //   } catch (RemoteException e) {
           //     JOptionPane.showMessageDialog(null, e.getMessage(), "Falha de red", JOptionPane.ERROR_MESSAGE);
          // }
        }
    }

    public void FormaPGTO() {
        PesquisaView pesquisa;
     //   pesquisa = new PesquisaView(cadItemView, true, item);
      //  pesquisa.setVisible(true);
    }
    
       private void montaTBFerramentas() {
        jTBFerramentas.add(jBNovo);
        jTBFerramentas.add(jSeparador2);
        jTBFerramentas.add(jBExcluir);
        jTBFerramentas.add(jSeparador3);
        jTBFerramentas.add(jBFormaPGTO);
        jTBFerramentas.add(jBSalvar);
        jTBFerramentas.add(jSeparador4);
        jTBFerramentas.add(jBCancelar);
    }

    private void HabilitaDesabilitaBatao(boolean habilitar) {
        jBNovo.setVisible(habilitar);
        jBSalvar.setVisible(!habilitar);
        jBCancelar.setVisible(!habilitar);
        jBExcluir.setVisible(habilitar);
        jBFormaPGTO.setVisible(habilitar);
        jSeparador2.setVisible(habilitar);
        jSeparador3.setVisible(habilitar);
        jSeparador4.setVisible(!habilitar);
        jTBFerramentas.repaint();
    }

    public void DesabilitaTodosBatao() {
        jBNovo.setVisible(false);
        jBCancelar.setVisible(false);
        jBExcluir.setVisible(false);
        jBFormaPGTO.setVisible(false);
        jBSalvar.setVisible(false);
        jSeparador2.setVisible(false);
        jSeparador3.setVisible(false);
        jSeparador4.setVisible(false);
        jTBFerramentas.repaint();
        jTBFerramentas.revalidate();
        
       
    }

}

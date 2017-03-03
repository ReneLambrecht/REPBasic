package br.com.rene.view;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rene
 */
public class PrincipalView extends javax.swing.JFrame {

    private javax.swing.JDesktopPane jDesktopPane;

    public javax.swing.JToolBar jTBAlternaJanelas;
    private javax.swing.JPanel jPEstatus;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenuItem jMICadClienteFornecedor;
    private javax.swing.JMenuItem jMICadItem;
    private javax.swing.JMenuItem jMIGerenciadorCompra;
     private javax.swing.JMenuItem jMIPedidoCompra;
    private javax.swing.JMenuItem jMINotaFiscalEntrada;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMCompras;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMConfiguracoes;
    private javax.swing.JMenu jMFinanceiro;
    private javax.swing.JMenu jMVendas;
    private javax.swing.JMenuItem jMIVendaBalcao;
    private javax.swing.JMenu jMEstoque;
    private javax.swing.JMenu jMRelatorios;
    private javax.swing.JMenuBar jMBPrincipal;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMIContasPagar;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;

    //botão do alternador de janela
    private JButton jBAlternaJanela;

    private static PrincipalView principalView;

    public static PrincipalView getIntancia() {
        if (principalView == null) {
            principalView = new PrincipalView();
        }
        return principalView;
    }

    private PrincipalView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTBAlternaJanelas = new javax.swing.JToolBar();
        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/rene/view/imagem/images.jpg"));
        Image image = icon.getImage();
        jDesktopPane = new javax.swing.JDesktopPane() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jPEstatus = new javax.swing.JPanel();

        jMBPrincipal = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMICadClienteFornecedor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMICadItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMCompras = new javax.swing.JMenu();
        jMINotaFiscalEntrada = new javax.swing.JMenuItem();
        jMIGerenciadorCompra = new javax.swing.JMenuItem();
        jMVendas = new javax.swing.JMenu();
        jMIVendaBalcao = new javax.swing.JMenuItem();
        jMEstoque = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMFinanceiro = new javax.swing.JMenu();
        jMIContasPagar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMRelatorios = new javax.swing.JMenu();
        jMConfiguracoes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMIPedidoCompra = new javax.swing.JMenuItem();

        setTitle("Rene - ERP Basic");
        setLocationByPlatform(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);

        jDesktopPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jPEstatus.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.light"));
        jPEstatus.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        javax.swing.GroupLayout jPEstatusLayout = new javax.swing.GroupLayout(jPEstatus);
        jPEstatus.setLayout(jPEstatusLayout);
        jPEstatusLayout.setHorizontalGroup(
                jPEstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEstatusLayout.createSequentialGroup()
                        .addGap(100, 1151, Short.MAX_VALUE))
        );
        jPEstatusLayout.setVerticalGroup(
                jPEstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        );

        jTBAlternaJanelas.setBackground(new java.awt.Color(236, 238, 241));
        jTBAlternaJanelas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTBAlternaJanelas.setFloatable(false);
        jTBAlternaJanelas.setRollover(true);

        jMBPrincipal.setBackground(new java.awt.Color(207, 220, 232));

        jMCadastro.setText("Cadastros");

        jMenu3.setText("Clientes e Foernecedores");

        jMICadClienteFornecedor.setText("Cadastro de Cliente e Fonecedor");
        jMICadClienteFornecedor.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMICadClienteFornecedorActionPerformed(evt);
        });
        jMenu3.add(jMICadClienteFornecedor);

        jMCadastro.add(jMenu3);
        jMCadastro.add(jSeparator1);

        jMenu1.setText("Itens");

        jMICadItem.setText("Cadastro de Item");
        jMICadItem.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMICadItemActionPerformed(evt);
        });
        jMenu1.add(jMICadItem);

        jMenuItem1.setText("Unidade");
        jMenuItem1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMenuItem1ActionPerformed(evt);
        });
        jMenu1.add(jMenuItem1);

        jMCadastro.add(jMenu1);

        jMBPrincipal.add(jMCadastro);

        jMCompras.setText("Compras");

        jMINotaFiscalEntrada.setText("Nota Fiscal de Entrada");
        jMINotaFiscalEntrada.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMINotaFiscalEntradaActionPerformed(evt);
        });
        jMCompras.add(jMINotaFiscalEntrada);

        jMIGerenciadorCompra.setText("Gerenciador de Compras");
        jMIGerenciadorCompra.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMIGerenciadorCompraActionPerformed(evt);
        });
        
        jMIPedidoCompra.setText("Pedido de Compras");
        jMIPedidoCompra.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMIPedidoCompraActionPerformed(evt);
        });
        jMCompras.add(jMIGerenciadorCompra);
        jMCompras.add(jMIPedidoCompra);

        jMBPrincipal.add(jMCompras);jMIGerenciadorCompra = new javax.swing.JMenuItem();
        
        jMVendas.setText("Vendas");
        jMBPrincipal.add(jMVendas);
        
        jMIVendaBalcao.setText("Venda de Balcão");
        jMIVendaBalcao.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMIVendaBalcaoActionPerformed(evt);
        });
        jMVendas.add(jMIVendaBalcao);

        jMEstoque.setText("Estoque");

        jMenuItem5.setText("de Compra");
        jMEstoque.add(jMenuItem5);

        jMBPrincipal.add(jMEstoque);

        jMFinanceiro.setText("Financeiro");

        jMIContasPagar.setText("Contas a Pagar");
        jMFinanceiro.add(jMIContasPagar);
         jMIContasPagar.addActionListener((java.awt.event.ActionEvent evt) -> {
             jMIContaPagarActionPerformed(evt);
        });

        jMenuItem4.setText("Contas a Receber");
        jMFinanceiro.add(jMenuItem4);

        jMBPrincipal.add(jMFinanceiro);

        jMRelatorios.setText("Relatórios");
        jMBPrincipal.add(jMRelatorios);

        jMConfiguracoes.setText("Configurações");

        /*
        jMenuItem1.addActionListener((ActionEvent evt) -> {
            acoesBotoes = new Janela();
            abrirJanela(Janela.getIntancia());

        });*/
        jMenuItem2.setText("Gerênciar Usuários");
        jMenuItem2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jMenuItem2ActionPerformed(evt);
        });
        jMConfiguracoes.add(jMenuItem2);

        jMBPrincipal.add(jMConfiguracoes);

        setJMenuBar(jMBPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jDesktopPane)
                        .addGap(1, 1, 1))
                .addComponent(jTBAlternaJanelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBAlternaJanelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1492, 614));
        setLocationRelativeTo(null);

        pack();
    }// </editor-fold>                        

    private void jMICadItemActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(CadItemView.getIntancia());
    }
    
    private void jMIPedidoCompraActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(PedidoCompraView.getIntancia());
    }
    
      private void jMIContaPagarActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(ContaPagarView.getIntancia());
    }

    private void jMICadClienteFornecedorActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(CadCliForView.getIntancia());
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(CadUnidadeView.getIntancia());
    }

    private void jMINotaFiscalEntradaActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(LancNotaFiscalEntradaView.getIntancia());
    }

    private void jMIGerenciadorCompraActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(GerenciadorCompraView.getIntancia());
    }
    
      private void jMIVendaBalcaoActionPerformed(java.awt.event.ActionEvent evt) {
        VendaBalcaoView.getIntancia();
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        abrirJanela(CadUsuarioView.getIntancia());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalView().setVisible(true);
        });
    }

    @Override
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            fecharSistema();
        }
        if (e.getID() == WindowEvent.WINDOW_OPENED) {
            //  criaBotaoSair();
        }
    }

    public void abrirJanela(JInternalFrame jIF) {
        if (jIF.isVisible()) {
            try {
                jIF.toFront();
                jIF.setSelected(true);
                jIF.requestFocus(true);
            } catch (PropertyVetoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERRO ao mover a janela para frente", JOptionPane.ERROR_MESSAGE);
            }
        }
        jDesktopPane.add(jIF);
        jIF.setVisible(true);
        botaoAlternarJanela(jIF);
    }

    public void fecharJanela(JInternalFrame jIF) {
        jIF.dispose();
        jDesktopPane.remove(jIF);
        //DesabilitaTodosBatao();
        if (existeJanelaAberta() == false) {

        } else {
            System.out.println("existe janela aberta");
        }
    }

    private JInternalFrame[] getFrameDesktopPane() {
        JInternalFrame[] quadros;
        quadros = jDesktopPane.getAllFrames();
        return quadros;
    }

    private boolean existeJanelaAberta() {
        return getFrameDesktopPane().length != 0;
    }

    public void fecharSistema() {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair do sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void botaoAlternarJanela(JInternalFrame jIF) {
        jBAlternaJanela = new JButton();
        jBAlternaJanela.setText(jIF.getTitle());
        jBAlternaJanela.setPreferredSize(new java.awt.Dimension(150, 80));
        jBAlternaJanela.setBackground(new java.awt.Color(23, 100, 241));
        jBAlternaJanela.setToolTipText("Mostrar janela " + jIF.getTitle());
        jBAlternaJanela.addActionListener((ActionEvent e) -> {
            abrirJanela(jIF);
            jBAlternaJanela.setSelected(true);
            jBAlternaJanela.requestFocus(true);
        });
        jTBAlternaJanelas.add(jBAlternaJanela);
        jBAlternaJanela.setVisible(true);
    }
}
//varer um componente em busca de istancias
/*
    for (Component child : getComponents){
    if (child instanceof JButton) {
        ((JButton)child).setVisible(false);
    }
    //Adicionar um MouseMotionListenerpara o seu JFrameou JDialog.
    //Dessa forma, a barra de ferramenta só será mostrada se o mouse está no top 10 pixels verticais da janela.
    addMouseMotionListener(new MouseAdapter() {
    public void mouseMoved(MouseEvent e) {
         toolbar.setVisible(e.getY() < 10);
     }
});
}*/

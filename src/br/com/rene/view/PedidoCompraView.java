package br.com.rene.view;

import br.com.rene.control.PedidoCompraControl;
import br.com.rene.model.pojo.ItempedidoComrpa;
import br.com.rene.model.pojo.ModelTable;
import br.com.rene.util.ValidacaoException;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Rene
 */
public class PedidoCompraView extends javax.swing.JInternalFrame {

    private static PedidoCompraView pedidoCompraView;
    private PedidoCompraControl pedidoCompraControl;
    private ItempedidoComrpa itempedidoComrpa = null;

    //Botões da barra de tarrefa
    private JButton jBNovo;
    private JButton jBLocalizar;
    private JButton jBSalvar;
    private JButton jBCancelar;
    private JButton jBExcluir;
    private JSeparator jSeparador2;
    private JSeparator jSeparador3;
    private JSeparator jSeparador4;

    public static PedidoCompraView getIntancia() {
        if (pedidoCompraView == null) {
            pedidoCompraView = new PedidoCompraView();
        }
        return pedidoCompraView;
    }

    public PedidoCompraView() {
        try {
            pedidoCompraControl = new PedidoCompraControl();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLNomeFornecedor = new javax.swing.JLabel();
        jCBStatus = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jBProcuraFornecedor = new javax.swing.JButton();
        jBCadFornecedor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jSPItensPedidoCompra = new javax.swing.JScrollPane();
        jTitensPedidoCompra = new javax.swing.JTable();
        jTBFerramentas = new javax.swing.JToolBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pedido de Compra");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Pedido"));

        jLabel1.setText("N°. Documento:");

        jLabel2.setText("Data do Lamçamento:");

        jLabel3.setText("Fornecedor");

        jLNomeFornecedor.setText("Fornecedor");

        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Aprovado", "Enviado", "Finalizado" }));

        jLabel5.setText("Status");

        jBProcuraFornecedor.setText("...");

        jBCadFornecedor.setText("+");

        jLabel4.setText("Data de Entrega");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBProcuraFornecedor)
                        .addGap(34, 34, 34)
                        .addComponent(jLNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(866, 866, 866))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNomeFornecedor)
                        .addComponent(jBProcuraFornecedor)
                        .addComponent(jBCadFornecedor))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTitensPedidoCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jSPItensPedidoCompra.setViewportView(jTitensPedidoCompra);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPItensPedidoCompra))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPItensPedidoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
        );

        //Inicializando botões do TollBar
        jBNovo = new JButton();
        jBNovo.setVisible(false);
        jBLocalizar = new JButton();
        jBLocalizar.setVisible(false);
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
        jBLocalizar.setIcon(img4);
        jBLocalizar.setVisible(false);
        jBLocalizar.setToolTipText("Localizar");
        jBLocalizar.addActionListener((ActionEvent evt) -> {
            localizar();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTBFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1318, 622);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadFornecedor;
    private javax.swing.JButton jBProcuraFornecedor;
    private javax.swing.JComboBox<String> jCBStatus;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLNomeFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSPItensPedidoCompra;
    private javax.swing.JToolBar jTBFerramentas;
    private javax.swing.JTextField jTFFornecedor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jTitensPedidoCompra;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() { // Ao chamar esse metodo passar uma parametro de pesquisa, poderia passar uma lista
        ArrayList<ItempedidoComrpa> dados2;

        Object[][] dados = {
            {"Kathy", "Smith",
                "Snowboarding", 5, (false)},
            {"John", "Doe",
                "Remo", (3), (true)},
            {"Sue", "Black",
                "Knitting", (2), (false)},
            {"Jane", "White",
                "Speed ​​reading", (20), (true)},};

        String[] colunas = 
            {"Item",
            "Descrição",
            "Und",
            "Quantidade",
            "V.Und",
            "%ICMS",
            "%IPI"};

        jTitensPedidoCompra.setFillsViewportHeight(true);
        ModelTable model = new ModelTable(dados, colunas);
        jTitensPedidoCompra.setModel(model);
        //jTitensPedidoCompra.setFillsViewportHeight(true);
        jTitensPedidoCompra.getModel().addTableModelListener(jTitensPedidoCompra);//Adicona eventos

        jTitensPedidoCompra.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTitensPedidoCompra.getColumnModel().getColumn(0).setResizable(true);
        jTitensPedidoCompra.getColumnModel().getColumn(1).setPreferredWidth(600);
        jTitensPedidoCompra.getColumnModel().getColumn(1).setResizable(true);
        jTitensPedidoCompra.getColumnModel().getColumn(2).setPreferredWidth(5);
        jTitensPedidoCompra.getColumnModel().getColumn(2).setResizable(true);
        jTitensPedidoCompra.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTitensPedidoCompra.getColumnModel().getColumn(3).setResizable(true);
        jTitensPedidoCompra.getColumnModel().getColumn(4).setPreferredWidth(40);
        jTitensPedidoCompra.getColumnModel().getColumn(4).setResizable(true);

        jTitensPedidoCompra.getTableHeader().setReorderingAllowed(resizable);
        jTitensPedidoCompra.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        // jTitensPedidoCompra.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTitensPedidoCompra.setCellSelectionEnabled(true);

    }

    public void salvar() {
        try {
            pedidoCompraControl.salvarAtualizar();
        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha de validação", JOptionPane.WARNING_MESSAGE);
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de rede", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void cancelar() {

    }

    public void novo() {
        //  pedidoCompraControl.novo();
    }

    public void excluir() {
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                pedidoCompraControl.excluir();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            } catch (RemoteException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Falha de red", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void localizar() {
        PesquisaView pesquisa;
        pesquisa = new PesquisaView(pedidoCompraView, true);
        pesquisa.setVisible(true);
    }

    private void montaTBFerramentas() {
        jTBFerramentas.add(jBNovo);
        jTBFerramentas.add(jSeparador2);
        jTBFerramentas.add(jBExcluir);
        jTBFerramentas.add(jSeparador3);
        jTBFerramentas.add(jBLocalizar);
        jTBFerramentas.add(jBSalvar);
        jTBFerramentas.add(jSeparador4);
        jTBFerramentas.add(jBCancelar);
    }

    private void HabilitaDesabilitaBatao(boolean habilitar) {
        jBNovo.setVisible(habilitar);
        jBSalvar.setVisible(!habilitar);
        jBCancelar.setVisible(!habilitar);
        jBExcluir.setVisible(habilitar);
        jBLocalizar.setVisible(habilitar);
        jSeparador2.setVisible(habilitar);
        jSeparador3.setVisible(habilitar);
        jSeparador4.setVisible(!habilitar);
        jTBFerramentas.repaint();
    }

    public void DesabilitaTodosBatao() {
        jBNovo.setVisible(false);
        jBCancelar.setVisible(false);
        jBExcluir.setVisible(false);
        jBLocalizar.setVisible(false);
        jBSalvar.setVisible(false);
        jSeparador2.setVisible(false);
        jSeparador3.setVisible(false);
        jSeparador4.setVisible(false);
        jTBFerramentas.repaint();
        jTBFerramentas.revalidate();

    }
}

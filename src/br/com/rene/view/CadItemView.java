package br.com.rene.view;

import br.com.rene.control.ItemControl;
import br.com.rene.util.ValidacaoException;
import java.awt.event.KeyEvent;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import br.com.rene.model.pojo.Item;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;

/**
 *
 * @author Rene
 */
public class CadItemView extends JInternalFrame {

    private ItemControl itemControl;
    private static CadItemView cadItemView;
    private Item item;
    
    //Botões da barra de tarrefa
    private JButton jBNovo;
    private JButton jBLocalizar;
    private JButton jBSalvar;
    private JButton jBCancelar;
    private JButton jBExcluir;
    private JSeparator jSeparador2;
    private JSeparator jSeparador3;
    private JSeparator jSeparador4;

    PrincipalView principalView;

    public static CadItemView getIntancia() {
        if (cadItemView == null) {
            cadItemView = new CadItemView();
        }
        return cadItemView;
    }

    private CadItemView() {
        principalView = PrincipalView.getIntancia();
        try {
            itemControl = new ItemControl();
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
    }

    public ItemControl getItemControl() {
        return itemControl;
        //  this.InternalFrameListener;
    }
    
        
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        bGrupoVendido = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFUnidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBPesquisaUnidade = new javax.swing.JButton();
        jBCadUnidade = new javax.swing.JButton();
        jTFCodigo = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLImagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jCBAtivo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRBVendidoSim = new javax.swing.JRadioButton();
        jRBVendidoNao = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jTBFerramentas = new javax.swing.JToolBar();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Iten");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("List.dropLineColor"));

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleBackground"));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Cadastro do Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jTFUnidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${itemControl.itemDigitado.undUnidade.cod}"), jTFUnidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${itemControl.itemDigitado.nome}"), jTFNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Unidade");

        jBPesquisaUnidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBPesquisaUnidade.setText("...");
        jBPesquisaUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisaUnidadeActionPerformed(evt);
            }
        });

        jBCadUnidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBCadUnidade.setText("+");
        jBCadUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadUnidadeActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${itemControl.itemDigitado.codigo}"), jTFCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisaUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadUnidade))
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jBPesquisaUnidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBCadUnidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(194, 194, 238));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Cadastro Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(194, 194, 238));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Imagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLImagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLImagem.setText("jLabel6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagem)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImagem)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Excluir");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Inserir");

        jPanel7.setBackground(new java.awt.Color(194, 194, 238));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCBAtivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${itemControl.itemDigitado.ativo}"), jCBAtivo, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Ativo?");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Item Vendido?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        bGrupoVendido.add(jRBVendidoSim);
        jRBVendidoSim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRBVendidoSim.setText("Sim");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${itemControl.itemDigitado.vendido}"), jRBVendidoSim, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        bGrupoVendido.add(jRBVendidoNao);
        jRBVendidoNao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRBVendidoNao.setSelected(true);
        jRBVendidoNao.setText("Não");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBVendidoNao)
                .addGap(27, 27, 27)
                .addComponent(jRBVendidoSim)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRBVendidoNao)
                .addComponent(jRBVendidoSim))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo");

        jCBTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Definido", "Matéria-Prima", "Componente", "Produto Acabado", "Materia Uso e Consumo", "Mercadoria de Revenda", "Imobilizado" }));
        jCBTipo.setToolTipText("");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${itemControl.itemDigitado.tipo}"), jCBTipo, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAtivo)
                        .addGap(60, 60, 60))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAtivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(194, 194, 238));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(194, 194, 238));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Dados do Produto Vendido");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Dados da Matéria-Prima");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel4);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Complemento", jPanel10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jTBFerramentas.setBackground(javax.swing.UIManager.getDefaults().getColor("ToolBar.shadow"));
        jTBFerramentas.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTBFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        bindingGroup.bind();

        setBounds(0, 0, 968, 616);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadUnidadeActionPerformed
       principalView.abrirJanela(CadUnidadeView.getIntancia());
    }//GEN-LAST:event_jBCadUnidadeActionPerformed

    private void jTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                itemControl.pesquisaExistencia();
            } catch (RemoteException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Falha de rede", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTFCodigoKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        principalView.fecharJanela(this);
    }//GEN-LAST:event_formInternalFrameClosing

    private void jBPesquisaUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisaUnidadeActionPerformed
       PesquisaView pesquisa;
        pesquisa = new PesquisaView(cadItemView, true);
        pesquisa.setVisible(true);
    }//GEN-LAST:event_jBPesquisaUnidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGrupoVendido;
    private javax.swing.JButton jBCadUnidade;
    private javax.swing.JButton jBPesquisaUnidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCBAtivo;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRBVendidoNao;
    private javax.swing.JRadioButton jRBVendidoSim;
    private javax.swing.JToolBar jTBFerramentas;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFUnidade;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
    public void salvar() {
         try {
            itemControl.salvarAtualizar();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        } catch (ValidacaoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Falha de validação", JOptionPane.WARNING_MESSAGE);
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de rede", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void cancelar() {
       
    }

    public void novo() {
          itemControl.novo();
    }

    public void excluir() {
         if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                itemControl.excluir();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            } catch (RemoteException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Falha de red", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void localizar() {
        PesquisaView pesquisa;
        pesquisa = new PesquisaView(cadItemView, true);
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

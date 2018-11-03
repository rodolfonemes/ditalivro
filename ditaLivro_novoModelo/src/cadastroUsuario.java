



import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnsilva
 */
public class cadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form cadastroUsuario
     */
    public cadastroUsuario() {
        initComponents();
    }
    
        
    private void carregarFormulario(Usuario pro) {
        
        tbUsuarioCadastro.setText(pro.getUsuario());
        tbSenhaCadastro.setText(pro.getSenha());
        tbNomeCadastro.setText(pro.getNome());
        checkSenha.setSelected(pro.isTrocaSenha());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkSenha = new javax.swing.JCheckBox();
        btConsultarCadastro = new javax.swing.JButton();
        btCadastroSalvar = new javax.swing.JButton();
        btAtualizarCadastro = new javax.swing.JButton();
        btCadastroSair = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btCadatroNovo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tbNomeCadastro = new javax.swing.JTextField();
        tbUsuarioCadastro = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tbSenhaCadastro = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        checkSenha.setText("Usuario deve alterar a senha no proximo login");

        btConsultarCadastro.setText("Consultar");
        btConsultarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarCadastroActionPerformed(evt);
            }
        });

        btCadastroSalvar.setText("Salvar");
        btCadastroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroSalvarActionPerformed(evt);
            }
        });

        btAtualizarCadastro.setText("Atualizar");
        btAtualizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarCadastroActionPerformed(evt);
            }
        });

        btCadastroSair.setText("Sair");
        btCadastroSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroSairActionPerformed(evt);
            }
        });

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Cpf"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaUsuario);

        btCadatroNovo.setText("Novo");
        btCadatroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadatroNovoActionPerformed(evt);
            }
        });

        jLabel25.setText("Nome");

        tbNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNomeCadastroActionPerformed(evt);
            }
        });

        jLabel23.setText("Cpf");

        tbSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSenhaCadastroActionPerformed(evt);
            }
        });

        jLabel24.setText("Senha");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(tbNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tbNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadatroNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastroSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastroSair))
                            .addComponent(checkSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btConsultarCadastro)
                        .addGap(50, 50, 50)
                        .addComponent(btAtualizarCadastro)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadatroNovo)
                    .addComponent(btCadastroSalvar)
                    .addComponent(btCadastroSair))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultarCadastro)
                    .addComponent(btAtualizarCadastro))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCadastroActionPerformed
        Usuario pr;

        BDusuario bd;
        List<Usuario> listaUsuario;
        Usuario pr1;
        bd = new BDusuario();
        listaUsuario = bd.consultarUsuario(tbUsuarioCadastro.getText());
        DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
        model.setNumRows(0);
        for (Usuario lisUsuario : listaUsuario) {
            pr1 = lisUsuario;

            model.addRow(new Object[]{
                pr1.getNome(),
                pr1.getUsuario()
            }
        );
        }
        btCadatroNovo.setEnabled(true);
        btCadastroSalvar.setEnabled(false);
        tbUsuarioCadastro.setEnabled(false);
        tbNomeCadastro.setEnabled(false);
        tbSenhaCadastro.setEnabled(false);

    }//GEN-LAST:event_btConsultarCadastroActionPerformed

    private void btCadastroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroSalvarActionPerformed

        Usuario pr;
        pr = new Usuario();

        BDusuario bdpr = new BDusuario();

        if (!"".equals(tbUsuarioCadastro.getText()) & !"".equals(tbSenhaCadastro.getText())) {

            pr.setUsuario(tbUsuarioCadastro.getText());
            pr.setSenha(tbSenhaCadastro.getText());
            pr.setNome(tbNomeCadastro.getText());
            pr.setTrocaSenha(checkSenha.isSelected());
            //BDusuario bdpr = new BDusuario();
            try {
                bdpr.adicionarUsuario(pr);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar");
            }
            tbUsuarioCadastro.setText("");
            tbSenhaCadastro.setText("");
            tbNomeCadastro.setText("");
            tbUsuarioCadastro.setEnabled(false);
            tbSenhaCadastro.setEnabled(false);
            tbNomeCadastro.setEnabled(false);
            btCadastroSalvar.setEnabled(false);
            btCadatroNovo.setEnabled(true);

        } else {
            JOptionPane.showMessageDialog(null, "Cpf e Senha são obrigatorios para cadastro");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastroSalvarActionPerformed

    private void btAtualizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarCadastroActionPerformed

        Usuario pr;
        pr = new Usuario();
        pr.setUsuario(tbUsuarioCadastro.getText());
        pr.setSenha(tbSenhaCadastro.getText());
        pr.setNome(tbNomeCadastro.getText());
        pr.setTrocaSenha(checkSenha.isSelected());

        BDusuario bdpr = new BDusuario();
        try {
            bdpr.atualizarUsuario(pr);
            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro");

        }
        tbUsuarioCadastro.setText("");
        tbSenhaCadastro.setText("");
        tbNomeCadastro.setText("");
        tbSenhaCadastro.setEnabled(false);
        ((DefaultTableModel) tabelaUsuario.getModel()).setNumRows(0);
        tabelaUsuario.updateUI();
        btAtualizarCadastro.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarCadastroActionPerformed

    private void btCadastroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroSairActionPerformed
        
        tbUsuarioCadastro.setText("");
        tbSenhaCadastro.setText("");
        tbNomeCadastro.setText("");
        ((DefaultTableModel) tabelaUsuario.getModel()).setNumRows(0);
        tabelaUsuario.updateUI();
        tbUsuarioCadastro.setEnabled(false);
        tbSenhaCadastro.setEnabled(false);
        tbNomeCadastro.setEnabled(false);
        btCadastroSalvar.setEnabled(false);
        btCadatroNovo.setEnabled(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastroSairActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        BDusuario bd;
        Usuario pro;
        String iCodigo;
        iCodigo = (String) tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 1);
        bd = new BDusuario();
        pro = new Usuario();
        try {
            pro = bd.procurarUsuario(iCodigo);

            carregarFormulario(pro);

        } catch (SQLException ex) {

        }
        tbSenhaCadastro.setEnabled(true);
        btAtualizarCadastro.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private void btCadatroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadatroNovoActionPerformed
        tbUsuarioCadastro.setText("");
        tbSenhaCadastro.setText("");
        tbNomeCadastro.setText("");
        ((DefaultTableModel) tabelaUsuario.getModel()).setNumRows(0);
        tabelaUsuario.updateUI();
        tbUsuarioCadastro.setEnabled(true);
        tbSenhaCadastro.setEnabled(true);
        tbNomeCadastro.setEnabled(true);
        btCadastroSalvar.setEnabled(true);
        btCadatroNovo.setEnabled(false);
        btAtualizarCadastro.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadatroNovoActionPerformed

    private void tbNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNomeCadastroActionPerformed

    private void tbSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSenhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSenhaCadastroActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
tbUsuarioCadastro.setText("");
        tbSenhaCadastro.setText("");
        tbNomeCadastro.setText("");
        ((DefaultTableModel) tabelaUsuario.getModel()).setNumRows(0);
        tabelaUsuario.updateUI();
        tbUsuarioCadastro.setEnabled(false);
        tbSenhaCadastro.setEnabled(false);
        tbNomeCadastro.setEnabled(false);
        btCadastroSalvar.setEnabled(false);
        btCadatroNovo.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarCadastro;
    private javax.swing.JButton btCadastroSair;
    private javax.swing.JButton btCadastroSalvar;
    private javax.swing.JButton btCadatroNovo;
    private javax.swing.JButton btConsultarCadastro;
    private javax.swing.JCheckBox checkSenha;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField tbNomeCadastro;
    private javax.swing.JPasswordField tbSenhaCadastro;
    private javax.swing.JTextField tbUsuarioCadastro;
    // End of variables declaration//GEN-END:variables
}

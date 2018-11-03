
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rnsilva
 */
public class vendasTela extends javax.swing.JInternalFrame {

    int contador = 1;
    int a = 0;
    String texto = null;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public class DocumentoLimitado extends PlainDocument {

        private int tamanhoMax = 10;

        public DocumentoLimitado(int tamanhoMax) {
            this.tamanhoMax = tamanhoMax;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

            if (str == null) {
                return;
            }

            String stringAntiga = getText(0, getLength());
            int tamanhoNovo = stringAntiga.length() + str.length();

            if (tamanhoNovo <= tamanhoMax) {
                super.insertString(offset, str, attr);
            } else {
                super.insertString(offset, "", attr);
            }
        }
    }

    public vendasTela() {
        initComponents();

        calendario.setDate(new Date());

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abaVendas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        painelVendas = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lbContadorVendas = new javax.swing.JLabel();
        painelDados = new javax.swing.JPanel();
        tbConsultaVenda = new javax.swing.JTextField();
        btPesquisaVenda = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        tbQuantVenda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tbEditoraVenda = new javax.swing.JTextField();
        tbAutorVenda = new javax.swing.JTextField();
        tbTituloVenda = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tbClienteNomeVenda = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tbClienteCpfVenda = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        calendario = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btAddVenda = new javax.swing.JButton();
        btRemoverVenda = new javax.swing.JButton();
        btFinalizarVenda = new javax.swing.JButton();
        btNovaVenda = new javax.swing.JButton();
        btCancelarVenda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vendas");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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
                formInternalFrameOpened(evt);
            }
        });

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "ISBN", "TITULO", "AUTOR", "EDITORA", "QUANTIDADE", "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVenda.setToolTipText("");
        jScrollPane2.setViewportView(tabelaVenda);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Venda nº");

        lbContadorVendas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbContadorVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbContadorVendas.setText("000");

        javax.swing.GroupLayout painelVendasLayout = new javax.swing.GroupLayout(painelVendas);
        painelVendas.setLayout(painelVendasLayout);
        painelVendasLayout.setHorizontalGroup(
            painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbContadorVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelVendasLayout.setVerticalGroup(
            painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbContadorVendas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbConsultaVendaActionPerformed(evt);
            }
        });

        btPesquisaVenda.setText("Pesquisar");
        btPesquisaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaVendaActionPerformed(evt);
            }
        });

        lb2.setText("Autor");

        lb3.setText("Editora");

        lb1.setText("Titulo");

        jLabel17.setText("Quant.");

        tbEditoraVenda.setEditable(false);
        tbEditoraVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditoraVendaActionPerformed(evt);
            }
        });

        tbAutorVenda.setEditable(false);

        tbTituloVenda.setEditable(false);

        jLabel18.setText("Isbn");

        jLabel19.setText("Nome");

        jLabel20.setText("CPF");

        try {
            tbClienteCpfVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setText("Data");

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb1)
                            .addComponent(jLabel18)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbClienteNomeVenda)
                            .addComponent(tbTituloVenda)
                            .addComponent(tbAutorVenda)
                            .addComponent(tbEditoraVenda)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(tbConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPesquisaVenda))
                            .addComponent(tbClienteCpfVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(tbQuantVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tbClienteNomeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tbClienteCpfVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisaVenda))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbTituloVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(tbAutorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbEditoraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(tbQuantVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btAddVenda.setText("Adicionar a lista");
        btAddVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddVendaActionPerformed(evt);
            }
        });

        btRemoverVenda.setText("Remover da Lista");
        btRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverVendaActionPerformed(evt);
            }
        });

        btFinalizarVenda.setText("Finalizar Venda");
        btFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarVendaActionPerformed(evt);
            }
        });

        btNovaVenda.setText("Nova Venda");
        btNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaVendaActionPerformed(evt);
            }
        });

        btCancelarVenda.setText("Cancelar");
        btCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAddVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btRemoverVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovaVenda)
                    .addComponent(btCancelarVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRemoverVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btFinalizarVenda))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(painelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(painelDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        abaVendas.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        abaVendas.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(abaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        abaVendas.getAccessibleContext().setAccessibleName("Cadastro");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbConsultaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbConsultaVendaActionPerformed

    private void btPesquisaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaVendaActionPerformed

        Produto pr;
        if (!(tbConsultaVenda.getText().equals(""))) {
            try {
                BDprodutos bd = new BDprodutos();
                pr = bd.procurarProdutos(tbConsultaVenda.getText());
                if (pr != null) {
                    //tbIsbn.setText(String.valueOf(pr.getIsbn()));
                    tbTituloVenda.setText(pr.getTitulo());
                    tbAutorVenda.setText(pr.getAutor());
                    tbEditoraVenda.setText(pr.getEditora());
                    tbQuantVenda.requestFocusInWindow();

                } else {
                    JOptionPane.showMessageDialog(null, "Cliente nao cadastrado");

                }
            } catch (SQLException ex) {
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisaVendaActionPerformed

    private void tbEditoraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditoraVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEditoraVendaActionPerformed

    private void btAddVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddVendaActionPerformed

        if (!"".equals(tbTituloVenda.getText())) {

            if (!"".equals(tbQuantVenda.getText())) {
                texto = formato.format(calendario.getDate());

                BDprodutos bd;
                List<Produto> listaProduto;
                bd = new BDprodutos();
                listaProduto = bd.consultarProduto(tbConsultaVenda.getText());
                DefaultTableModel model = (DefaultTableModel) tabelaVenda.getModel();

                Object[] dados = {contador, tbConsultaVenda.getText(), tbTituloVenda.getText(),
                    tbAutorVenda.getText(), tbEditoraVenda.getText(), tbQuantVenda.getText(), texto};
                model.addRow(dados);

                contador++;
                tbConsultaVenda.setText(null);
                tbTituloVenda.setText(null);
                tbAutorVenda.setText(null);
                tbEditoraVenda.setText(null);
                tbQuantVenda.setText(null);
                tbConsultaVenda.requestFocusInWindow();

            } else {
                JOptionPane.showMessageDialog(null, "Campo Quantidade é obriatorio");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Livro não localizado," + "\n" + "Favor digitar o ISBN e clicar me Pesquisar");
        }

    }//GEN-LAST:event_btAddVendaActionPerformed

    private void btRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverVendaActionPerformed
        if (tabelaVenda.getSelectedRow() != -1) {

            DefaultTableModel model = (DefaultTableModel) tabelaVenda.getModel();
            model.removeRow(tabelaVenda.getSelectedRow());

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir");
        }

        // TODO add your handling code here:
        
//        a--;
//      contador--;
    }//GEN-LAST:event_btRemoverVendaActionPerformed

    private void btFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarVendaActionPerformed
        vendas ve = null;
        pedido pe = null;

        BDvendas bd = new BDvendas();
        BDpedido bd2 = new BDpedido();

        if (ve != null) {
            JOptionPane.showMessageDialog(null, "codigo ja cadastrado");
        } else {

            ve = new vendas();
            //if(pr.getIsbn()!= null){
            ve.setCod_vendas(Integer.valueOf(lbContadorVendas.getText()));
            ve.setNome_vendas(tbClienteNomeVenda.getText());
            ve.setCpf_vendas(tbClienteCpfVenda.getText());

            BDvendas bdpr = new BDvendas();
            //BDpedido bdpr2 = new BDpedido();
            try {
                bdpr.adicionarVendas(ve);

                //JOptionPane.showMessageDialog(null, "Registro gravado com sucesso2");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar");
            }

            pe = new pedido();
            //int a = 0;
            for (int i = 0; i <= tabelaVenda.getRowCount()-1; i++) {
                a++;

                pe.setCod_pedido(a);
                //int isbn = Integer.valueOf(String.valueOf(tabelaVenda.getValueAt(i, 1)));
                String isbn = (String) tabelaVenda.getValueAt(i, 1);
                pe.setCod_livros_isbn_pedido(Integer.valueOf(isbn));
//                int conta = Integer.valueOf(lbContadorVendas.getText());
//                conta--;
                pe.setCod_venda_pedido(Integer.valueOf(lbContadorVendas.getText()));
                pe.setData_pedido((String) tabelaVenda.getValueAt(i, 6));
                pe.setQuant_pedido((String) tabelaVenda.getValueAt(i, 5));

//                JOptionPane.showMessageDialog(null, 
//                        pe.getCod_pedido() + ", " 
//                       + pe.getCod_venda_pedido() + ", " 
//                       + pe.getCod_livros_isbn_pedido() + ", "
//                       + pe.getData_pedido() + ", "
//                       + pe.getQuant_pedido() + ", ");

                BDpedido bdpr2 = new BDpedido();
                try {
                    bdpr2.adicionarPedido(pe);

                    //JOptionPane.showMessageDialog(null, "pedido com sucesso3");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao gravar");
                }
            }

        }
        JOptionPane.showMessageDialog(null, "pedido gravado com sucesso");
        tbClienteNomeVenda.setEnabled(false);
        tbClienteCpfVenda.setEnabled(false);
        tbQuantVenda.setEnabled(false);
        tbConsultaVenda.setEnabled(false);
        btPesquisaVenda.setEnabled(false);
        tbClienteCpfVenda.setText("");
        tbQuantVenda.setText("");
        tbConsultaVenda.setText("");
        btPesquisaVenda.setEnabled(true);
        tbClienteNomeVenda.setText("");
        tbTituloVenda.setText("");
        tbAutorVenda.setText("");
        tbEditoraVenda.setText("");
        ((DefaultTableModel) tabelaVenda.getModel()).setNumRows(0);
        tabelaVenda.updateUI();
        btPesquisaVenda.setEnabled(false);
        btRemoverVenda.setEnabled(false);
        btFinalizarVenda.setEnabled(false);
        btAddVenda.setEnabled(false);
        btCancelarVenda.setEnabled(false);
        btNovaVenda.setEnabled(true);
        

    }//GEN-LAST:event_btFinalizarVendaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        tbClienteNomeVenda.setEnabled(false);
        tbClienteCpfVenda.setEnabled(false);
        tbQuantVenda.setEnabled(false);
        tbConsultaVenda.setEnabled(false);
        btPesquisaVenda.setEnabled(false);
        btRemoverVenda.setEnabled(false);
        btFinalizarVenda.setEnabled(false);
        btAddVenda.setEnabled(false);
        btCancelarVenda.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void btNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaVendaActionPerformed

        tbClienteNomeVenda.setEnabled(true);
        tbClienteCpfVenda.setEnabled(true);
        tbQuantVenda.setEnabled(true);
        tbConsultaVenda.setEnabled(true);
        btPesquisaVenda.setEnabled(true);
        btRemoverVenda.setEnabled(true);
        btFinalizarVenda.setEnabled(true);
        btAddVenda.setEnabled(true);
        btNovaVenda.setEnabled(false);
        btCancelarVenda.setEnabled(true);

        BDvendas bd;
        vendas pro;
        //String iCodigo;
        //iCodigo = ("0");
        bd = new BDvendas();
        pro = new vendas();
        //JOptionPane.showMessageDialog(null,"teste");
        try {
            pro = bd.procurarUltimoRegistro();
            int num = pro.getCod_vendas();
            num++;
            lbContadorVendas.setText(String.valueOf(num));
            //JOptionPane.showMessageDialog(null, pro.getCod_vendas());

        } catch (SQLException ex) {

        }

      a = 0;
      contador = 1;
    }//GEN-LAST:event_btNovaVendaActionPerformed

    private void btCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarVendaActionPerformed
        tbClienteNomeVenda.setEnabled(false);
        tbClienteCpfVenda.setEnabled(false);
        tbQuantVenda.setEnabled(false);
        tbConsultaVenda.setEnabled(false);
        btPesquisaVenda.setEnabled(false);
        tbClienteCpfVenda.setText("");
        tbQuantVenda.setText("");
        tbConsultaVenda.setText("");
        btPesquisaVenda.setEnabled(true);
        tbClienteNomeVenda.setText("");
        tbTituloVenda.setText("");
        tbAutorVenda.setText("");
        tbEditoraVenda.setText("");
        ((DefaultTableModel) tabelaVenda.getModel()).setNumRows(0);
        tabelaVenda.updateUI();
        btPesquisaVenda.setEnabled(false);
        btRemoverVenda.setEnabled(false);
        btFinalizarVenda.setEnabled(false);
        btAddVenda.setEnabled(false);
        btNovaVenda.setEnabled(true);
        btCancelarVenda.setEnabled(false);
        a = 0;
      contador = 1;

// TODO add your handling code here:
    }//GEN-LAST:event_btCancelarVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaVendas;
    private javax.swing.JButton btAddVenda;
    private javax.swing.JButton btCancelarVenda;
    private javax.swing.JButton btFinalizarVenda;
    private javax.swing.JButton btNovaVenda;
    private javax.swing.JButton btPesquisaVenda;
    private javax.swing.JButton btRemoverVenda;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbContadorVendas;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelVendas;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField tbAutorVenda;
    private javax.swing.JFormattedTextField tbClienteCpfVenda;
    private javax.swing.JTextField tbClienteNomeVenda;
    private javax.swing.JTextField tbConsultaVenda;
    private javax.swing.JTextField tbEditoraVenda;
    private javax.swing.JTextField tbQuantVenda;
    private javax.swing.JTextField tbTituloVenda;
    // End of variables declaration//GEN-END:variables
}

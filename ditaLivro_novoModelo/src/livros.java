



import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
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
public class livros extends javax.swing.JInternalFrame {
    
    int contador = 100;
    String texto = null;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public class DocumentoLimitado extends PlainDocument {
        
        private int tamanhoMax = 10;
        
        public DocumentoLimitado(int tamanhoMax) {
            this.tamanhoMax = tamanhoMax;
        }
        
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

    public livros() {
        initComponents();
        camposBloqueados();
        habilitarBotoes(true, false, false, false, false, true);
        tbDescricao.setDocument(new livros.DocumentoLimitado(400));
       
        
        
    }

   void habilitarBotoes(boolean novo, boolean salvar, boolean editar, boolean atualizar, boolean excluir, boolean sair) {
        
        btNovo.setEnabled(novo);
        btSalvar.setEnabled(salvar);
        btEditar.setEnabled(editar);
        btAtualizar.setEnabled(atualizar);
        btExcluir.setEnabled(excluir);
        btCancelar.setEnabled(sair);
        
    }
    
    void camposBloqueados() {
        tbIsbn.setEnabled(false);
        tbTitulo.setEnabled(false);
        tbAutor.setEnabled(false);
        tbEditora.setEnabled(false);
        tbAno.setEnabled(false);
        tbTipo.setEnabled(false);
        tbEstante.setEnabled(false);
        tbDescricao.setEnabled(false);
        tbQuantidade.setEnabled(false);
        tbValor.setEnabled(false);
        
        habilitarBotoes(true, false, false, false, false, true);
    }
    
    void camposDesbloqueados() {
        tbIsbn.setEnabled(true);
        tbTitulo.setEnabled(true);
        tbAutor.setEnabled(true);
        tbEditora.setEnabled(true);
        tbAno.setEnabled(true);
        tbTipo.setEnabled(true);
        tbEstante.setEnabled(true);
        tbDescricao.setEnabled(true);
        tbQuantidade.setEnabled(true);
        tbValor.setEnabled(true);
    }
    
    void camposDefalut() {
        
        tbAno.setText("0");
        tbQuantidade.setText("0");
        tbValor.setText("0");
        
        habilitarBotoes(true, false, false, false, false, true);
    }
    
    void contadorCaracteres() {
        String texto = tbDescricao.getText();
        int tamanhoDoTexto = 400 - texto.length();
        lbContador.setText(String.valueOf(tamanhoDoTexto));
    }
    
    void limparCampos() {
        tbIsbn.setText(null);
        tbTitulo.setText(null);
        tbAutor.setText(null);
        tbEditora.setText(null);
        tbAno.setText(null);
        tbTipo.setText(null);
        tbEstante.setText(null);
        tbDescricao.setText(null);
        tbQuantidade.setText(null);
        tbValor.setText(null);

        
        ((DefaultTableModel) Tabela2.getModel()).setNumRows(0);
        Tabela2.updateUI();
        habilitarBotoes(true, false, false, false, false, true);
    }
    
    private void carregarFormulario(Produto pro) {
        tbIsbn.setText(pro.getIsbn());
        tbTitulo.setText(pro.getTitulo());
        tbAutor.setText(pro.getAutor());
        tbEditora.setText(pro.getEditora());
        tbAno.setText(String.valueOf(pro.getAno()));
        tbTipo.setText(pro.getTipo());
        tbEstante.setText(pro.getEstante());
        tbValor.setText(String.valueOf(pro.getValor()));
        tbQuantidade.setText(String.valueOf(pro.getQuant()));
        tbDescricao.setText(pro.getDescricao());
    }
    
       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abaConsulta = new javax.swing.JTabbedPane();
        consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        Consultar2 = new javax.swing.JButton();
        tfConsulta2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        cadastro = new javax.swing.JPanel();
        tbValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDescricao = new javax.swing.JTextArea();
        lbContador = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbTitulo = new javax.swing.JTextField();
        tbEditora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbTipo = new javax.swing.JTextField();
        tbIsbn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tbAno = new javax.swing.JTextField();
        tbEstante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro / Consulta de livros");

        Tabela2.setAutoCreateRowSorter(true);
        Tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "TITULO", "AUTOR", "EDITORA", "ANO DA EDIÇÃO", "TIPO", "ESTANTE", "QUANTIDADE", "VALOR", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela2);

        Consultar2.setText("Procurar");
        Consultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar2ActionPerformed(evt);
            }
        });

        tfConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConsulta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta);
        consulta.setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Consultar2))
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abaConsulta.addTab("Consulta", consulta);

        jLabel3.setText("VALOR DO PRODUTO *");

        jLabel4.setText("R$");

        jLabel5.setText("QUANT. DO PRODUTO *");

        jLabel11.setText("DESCRIÇÃO *");

        tbDescricao.setColumns(20);
        tbDescricao.setLineWrap(true);
        tbDescricao.setRows(5);
        tbDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDescricaoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbDescricao);

        lbContador.setText("400");

        jLabel12.setText("CARACTERES RESTANTES");

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("ISBN *");

        jLabel2.setText("TITULO *");

        tbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTituloActionPerformed(evt);
            }
        });

        jLabel7.setText("EDITORA");

        jLabel9.setText("TIPO");

        tbIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIsbnActionPerformed(evt);
            }
        });

        jLabel8.setText("ANO *");

        tbEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEstanteActionPerformed(evt);
            }
        });

        jLabel10.setText("ESTANTE");

        tbAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAutorActionPerformed(evt);
            }
        });

        jLabel6.setText("AUTOR *");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel16.setText("CAMPOS COM * SÃO OBRIGATORIOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(14, 14, 14)
                                .addComponent(tbEstante))
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(tbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cadastroLayout = new javax.swing.GroupLayout(cadastro);
        cadastro.setLayout(cadastroLayout);
        cadastroLayout.setHorizontalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbContador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroLayout.createSequentialGroup()
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        cadastroLayout.setVerticalGroup(
            cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btSalvar)
                    .addComponent(btEditar)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir)
                    .addComponent(btCancelar))
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(tbValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbContador))
                .addGap(23, 23, 23))
        );

        jScrollPane4.setViewportView(cadastro);

        abaConsulta.addTab("Cadastro", jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(abaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(abaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked
        BDprodutos bd;
        Produto pro;
        String iCodigo;
        iCodigo = (String) Tabela2.getModel().getValueAt(Tabela2.getSelectedRow(), 0);
        bd = new BDprodutos();
        pro = new Produto();
        try {
            pro = bd.procurarProdutos(iCodigo);

            carregarFormulario(pro);
            camposBloqueados();
            contadorCaracteres();
            habilitarBotoes(false, false, true, false, false, true);
        } catch (SQLException ex) {

        }
        //jTabbedPane1.setSelectedIndex(1);
        abaConsulta.setSelectedIndex(1);
    }//GEN-LAST:event_Tabela2MouseClicked

    private void Consultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar2ActionPerformed
        BDprodutos bd;
        List<Produto> listaProduto;
        Produto pr1;
        bd = new BDprodutos();
        listaProduto = bd.consultarProduto(tfConsulta2.getText());
        DefaultTableModel model = (DefaultTableModel) Tabela2.getModel();
        model.setNumRows(0);
        for (Produto listaProduto1 : listaProduto) {
            pr1 = listaProduto1;

            model.addRow(new Object[]{
                pr1.getIsbn(),
                pr1.getTitulo(),
                pr1.getAutor(),
                pr1.getEditora(),
                pr1.getAno(),
                pr1.getTipo(),
                pr1.getEstante(),
                pr1.getQuant(),
                pr1.getValor(),
                pr1.getDescricao()
            }
        );
        }
    }//GEN-LAST:event_Consultar2ActionPerformed

    private void tfConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConsulta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConsulta2ActionPerformed

    private void tbDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDescricaoKeyReleased
        contadorCaracteres();        // TODO add your handling code here:
    }//GEN-LAST:event_tbDescricaoKeyReleased

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        camposDesbloqueados();
        limparCampos();
        abaConsulta.setSelectedIndex(1);
        tbIsbn.requestFocusInWindow();
        contadorCaracteres();
        habilitarBotoes(false, true, false, false, false, true);
// TODO add your handling code here:
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Produto pr;
        if (!(tbIsbn.getText().equals("")) & !(tbAno.getText().equals(""))
                & !(tbValor.getText().equals("")) & !(tbQuantidade.getText().equals(""))) {
            try {
                BDprodutos bd = new BDprodutos();
                pr = bd.procurarProdutos(tbIsbn.getText());
                if (pr != null) {
                    JOptionPane.showMessageDialog(null, "codigo ja cadastrado");
                } else {
                    
                    pr = new Produto();
                    //if(pr.getIsbn()!= null){
                    pr.setIsbn(tbIsbn.getText());
                    pr.setTitulo(tbTitulo.getText());
                    pr.setAutor(tbAutor.getText());
                    pr.setEditora(tbEditora.getText());
                    pr.setAno(Integer.parseInt(tbAno.getText()));
                    pr.setTipo(tbTipo.getText());
                    pr.setEstante(tbEstante.getText());
                    pr.setDescricao(tbDescricao.getText());
                    pr.setValor(Double.parseDouble(tbValor.getText()));
                    pr.setQuant(Integer.parseInt(tbQuantidade.getText()));
                    
                    BDprodutos bdpr = new BDprodutos();
                    try {
                        bdpr.adicionarProduto(pr);
                        limparCampos();
                        camposBloqueados();
                        JOptionPane.showMessageDialog(null, "Registro gravado com sucesso");
                        habilitarBotoes(true, false, false, false, false, true);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao gravar");
                    }
                    
                }
            } catch (SQLException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "OS CAMPOS COM * SÃO OBRIGATORIOS ");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        camposDesbloqueados();
        String texto = tbDescricao.getText();
        int tamanhoDoTexto = 400 - texto.length();
        lbContador.setText(String.valueOf(tamanhoDoTexto));
        contadorCaracteres();
        habilitarBotoes(false, false, false, true, true, true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Produto pr;
        pr = new Produto();
        pr.setIsbn(tbIsbn.getText());
        pr.setTitulo(tbTitulo.getText());
        pr.setAutor(tbAutor.getText());
        pr.setEditora(tbEditora.getText());
        pr.setAno(Integer.parseInt(tbAno.getText()));
        pr.setTipo(tbTipo.getText());
        pr.setEstante(tbEstante.getText());
        pr.setDescricao(tbDescricao.getText());
        pr.setValor(Double.parseDouble(tbValor.getText()));
        pr.setQuant(Integer.parseInt(tbQuantidade.getText()));

        BDprodutos bdpr = new BDprodutos();
        try {
            bdpr.atualizarProduto(pr);
            limparCampos();
            camposBloqueados();
            JOptionPane.showMessageDialog(null, "Registro gravado com sucesso");
            habilitarBotoes(true, false, false, false, false, true);
            tbIsbn.requestFocus(); // passa o foco para o campo codigo
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        BDprodutos bdpr = new BDprodutos();
        bdpr.excluirProduto(Integer.valueOf(tbIsbn.getText())); // TODO add your handling code here:
        limparCampos();
        camposBloqueados();

        tbIsbn.requestFocus(); // passa o foco para o campo codigo
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        if (tbIsbn.getText().equals("")) {
            habilitarBotoes(true, false, false, false, false, true);
            camposBloqueados();
            contadorCaracteres();
        } else {
            camposBloqueados();
            contadorCaracteres();
            habilitarBotoes(true, false, true, false, false, true);
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTituloActionPerformed

    private void tbIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIsbnActionPerformed

    private void tbEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstanteActionPerformed

    private void tbAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar2;
    private javax.swing.JTable Tabela2;
    private javax.swing.JTabbedPane abaConsulta;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel cadastro;
    private javax.swing.JPanel consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbContador;
    private javax.swing.JTextField tbAno;
    private javax.swing.JTextField tbAutor;
    private javax.swing.JTextArea tbDescricao;
    private javax.swing.JTextField tbEditora;
    private javax.swing.JTextField tbEstante;
    private javax.swing.JTextField tbIsbn;
    private javax.swing.JTextField tbQuantidade;
    private javax.swing.JTextField tbTipo;
    private javax.swing.JTextField tbTitulo;
    private javax.swing.JTextField tbValor;
    private javax.swing.JTextField tfConsulta2;
    // End of variables declaration//GEN-END:variables
}

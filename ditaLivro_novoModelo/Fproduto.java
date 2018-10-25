
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

  
public class Fproduto extends javax.swing.JFrame {
    
    
     
    
    public class DocumentoLimitado extends PlainDocument{
    private int tamanhoMax = 10;
         
    public DocumentoLimitado(int tamanhoMax){
        this.tamanhoMax = tamanhoMax;
    }
    
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
 
            if (str == null) return;  
                    
             String stringAntiga = getText (0, getLength() );  
             int tamanhoNovo = stringAntiga.length() + str.length(); 
                        
             if (tamanhoNovo <= tamanhoMax) {  
                 super.insertString(offset, str , attr);  
             } else {    
                 super.insertString(offset, "", attr); 
             }  
    }
}
    
    
 
    public Fproduto() {
        initComponents();
        camposBloqueados();
        habilitarBotoes(true, false, false, false, false, true);
        btprocurar.setVisible(false);
        tbDescricao.setDocument( new DocumentoLimitado(400) );
        //String texto = tbDescricao.getText();
        //int tamanhoDoTexto = texto.length();
        //lbContador.setText(String.valueOf(tamanhoDoTexto));
     }
        
    

    void habilitarBotoes(boolean novo, boolean salvar, boolean editar, boolean atualizar, boolean excluir, boolean sair) {

        btNovo.setEnabled(novo);
        btSalvar.setEnabled(salvar);
        btEditar.setEnabled(editar);
        btAtualizar.setEnabled(atualizar);
        btExcluir.setEnabled(excluir);
        btSair.setEnabled(sair);

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
    void contadorCaracteres(){
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

        // Para limpar o conteúdo do jTable:
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btExcluir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        Consultar2 = new javax.swing.JButton();
        tfConsulta2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tbTitulo = new javax.swing.JTextField();
        tbValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbIsbn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btprocurar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbAutor = new javax.swing.JTextField();
        tbAno = new javax.swing.JTextField();
        tbEditora = new javax.swing.JTextField();
        tbEstante = new javax.swing.JTextField();
        tbTipo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDescricao = new javax.swing.JTextArea();
        lbContador = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jMenu7.setText("jMenu7");

        jMenuItem4.setText("jMenuItem4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jMenu8.setText("File");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar2.add(jMenu9);

        jMenuItem6.setText("jMenuItem6");

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        jMenu12.setText("jMenu12");

        jMenu13.setText("File");
        jMenuBar3.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar3.add(jMenu14);

        jMenu15.setText("File");
        jMenuBar4.add(jMenu15);

        jMenu16.setText("Edit");
        jMenuBar4.add(jMenu16);

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btNovo.setText("novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setText("salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setText("editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btAtualizar.setText("atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btSair.setText("cancelar");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExcluir.setText("excluir");

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

        Consultar2.setText("procurar");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Consultar2)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("consulta", jPanel2);

        tbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTituloActionPerformed(evt);
            }
        });

        jLabel3.setText("VALOR DO PRODUTO");

        jLabel4.setText("R$");

        tbIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIsbnActionPerformed(evt);
            }
        });

        jLabel1.setText("ISBN");

        btprocurar.setText("procurar");
        btprocurar.setEnabled(false);
        btprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprocurarActionPerformed(evt);
            }
        });

        jLabel2.setText("TITULO");

        jLabel5.setText("QUANT. DO PRODUTO");

        jLabel6.setText("AUTOR");

        jLabel7.setText("EDITORA");

        jLabel8.setText("ANO");

        jLabel9.setText("TIPO");

        jLabel10.setText("ESTANTE");

        jLabel11.setText("DESCRIÇÃO");

        tbAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAutorActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btprocurar)
                                            .addGap(22, 22, 22))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26)
                                    .addComponent(tbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(20, 20, 20)
                                .addComponent(lbContador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btprocurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(tbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContador)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        jTabbedPane1.addTab("cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(0, 5, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btExcluir)
                    .addComponent(btSair)
                    .addComponent(btEditar)
                    .addComponent(btSalvar)
                    .addComponent(btNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {
        camposDesbloqueados();
        limparCampos();
        camposDefalut();
        jTabbedPane1.setSelectedIndex(1);
        tbIsbn.requestFocusInWindow();
        contadorCaracteres();
        habilitarBotoes(false, true, false, false, false, true);

    }

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        Produto pr;
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
    //}
           //else{
         //JOptionPane.showMessageDialog(null, "difite im id");
        //}
    }
    private void tfConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConsulta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConsulta2ActionPerformed

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

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked
        BDprodutos bd;
        Produto pro;
        String iCodigo;
        iCodigo = (String) Tabela2.getModel().getValueAt(Tabela2.getSelectedRow(), 0);
        //JOptionPane.showMessageDialog(null, iCodigo);
        bd = new BDprodutos();
        pro = new Produto();
        try {
            pro = bd.procurarProdutos(iCodigo);
            //JOptionPane.showMessageDialog(null, "passou: " + pro.getNome());
            carregarFormulario(pro);
            camposBloqueados();
            contadorCaracteres();
            habilitarBotoes(false, false, true, false, true, true);
        } catch (SQLException ex) {
// Logger.getLogger(Fcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_Tabela2MouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        camposDesbloqueados();
        String texto = tbDescricao.getText();
        int tamanhoDoTexto = 400 - texto.length();
        lbContador.setText(String.valueOf(tamanhoDoTexto));
        contadorCaracteres();
        habilitarBotoes(false, false, false, true, false, true);
    }

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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
camposBloqueados();
limparCampos();
camposDefalut();
contadorCaracteres();
    }//GEN-LAST:event_btSairActionPerformed

    private void tbAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbAutorActionPerformed

    private void btprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprocurarActionPerformed
        Produto pr;
        if (!(tbIsbn.getText().equals(""))) {
            try {
                BDprodutos bd = new BDprodutos();
                pr = bd.procurarProdutos(tbIsbn.getText());
                if (pr != null) {
                    tbIsbn.setText(String.valueOf(pr.getIsbn()));
                    tbTitulo.setText(pr.getTitulo());
                    tbAutor.setText(pr.getAutor());
                    tbEditora.setText(pr.getEditora());
                    tbAno.setText(String.valueOf(pr.getAno()));
                    tbTipo.setText(pr.getTipo());
                    tbEstante.setText(pr.getEstante());
                    tbDescricao.setText(pr.getDescricao());
                    tbQuantidade.setText(String.valueOf(pr.getQuant()));
                    tbValor.setText(String.valueOf(pr.getValor()));

                    //JOptionPane.showMessageDialog(null, " codigo " + " " + pr.getCodigo() + "\n " + " nome" + " " + pr.getNome().toUpperCase()
                        //   + "\n " + " quantidade " + " " + pr.getQuant() + "\n " + " valor " + " " + pr.getValor());
                    habilitarBotoes(false, false, true, false, true, true);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente nao cadastrado");
                    habilitarBotoes(false, true, false, false, false, true);
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_btprocurarActionPerformed

    private void tbIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIsbnActionPerformed

    private void tbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTituloActionPerformed

    private void tbDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDescricaoKeyReleased
contadorCaracteres();        // TODO add your handling code here:
    }//GEN-LAST:event_tbDescricaoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
            login lo = new login();
            lo.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Fproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fproduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fproduto().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar2;
    private javax.swing.JTable Tabela2;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btprocurar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
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

    private void parseint(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

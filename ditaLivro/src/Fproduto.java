
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Fproduto extends javax.swing.JFrame {
    
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
    
    public Fproduto() {
        initComponents();
        camposBloqueados();
        habilitarBotoes(true, false, false, false, false, true);
        btprocurar.setVisible(false);
        tbDescricao.setDocument(new DocumentoLimitado(400));
        calendario.setDate(new Date());
        btCadastroSalvar.setEnabled(false);
        tbUsuarioCadastro.setEnabled(false);
        tbSenhaCadastro.setEnabled(false);
        btAtualizarCadastro.setEnabled(false);
        tbNomeCadastro.setEnabled(false);
               
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
    
    private void carregarFormulario(Usuario pro) {
        
        tbUsuarioCadastro.setText(pro.getUsuario());
        tbSenhaCadastro.setText(pro.getSenha());
        tbNomeCadastro.setText(pro.getNome());
        checkSenha.setSelected(pro.isTrocaSenha());
        
        
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
        jMenu17 = new javax.swing.JMenu();
        login = new javax.swing.JLayeredPane();
        btLogar = new javax.swing.JButton();
        tbUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbSenha = new javax.swing.JPasswordField();
        tela = new javax.swing.JLayeredPane();
        btLogoff = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaConsulta = new javax.swing.JTabbedPane();
        consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        Consultar2 = new javax.swing.JButton();
        tfConsulta2 = new javax.swing.JTextField();
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
        btprocurar = new javax.swing.JButton();
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
        tbAddVenda = new javax.swing.JButton();
        btRemoverVenda = new javax.swing.JButton();
        tbFinalizarVenda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btCadastro = new javax.swing.JButton();
        usuario = new javax.swing.JLayeredPane();
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
        jButton1 = new javax.swing.JButton();
        trocaSenha = new javax.swing.JLayeredPane();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbUsuarioAlterar = new javax.swing.JLabel();
        tbSenhaAlterar = new javax.swing.JPasswordField();
        btAlterarSenha = new javax.swing.JButton();

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

        jMenu17.setText("jMenu17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btLogar.setText("LOGAR");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        jLabel13.setText("CPF: ");

        jLabel14.setText("SENHA: ");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gato livros LOGO.png"))); // NOI18N

        login.setLayer(btLogar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(tbUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        login.setLayer(tbSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(tbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(251, 251, 251))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addComponent(btLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(tbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btLogar)
                .addGap(104, 104, 104))
        );

        btLogoff.setText("Logoff");
        btLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoffActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
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

        btprocurar.setText("procurar");
        btprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprocurarActionPerformed(evt);
            }
        });

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
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btprocurar))
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
                    .addComponent(btprocurar)
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
                        .addGap(12, 12, 12)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(tbValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tbQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbContador))
                .addContainerGap())
        );

        abaConsulta.addTab("Cadastro", cadastro);

        jTabbedPane1.addTab("Livros", abaConsulta);

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "ISBN", "TITULO", "AUTOR", "EDITORA", "QUANTIDADE", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

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
                                .addComponent(tbQuantVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        tbAddVenda.setText("Adicionar a lista");
        tbAddVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAddVendaActionPerformed(evt);
            }
        });

        btRemoverVenda.setText("Remover da Lista");
        btRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverVendaActionPerformed(evt);
            }
        });

        tbFinalizarVenda.setText("Finalizar Venda");
        tbFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbFinalizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbAddVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btRemoverVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(tbAddVenda)
                .addGap(17, 17, 17)
                .addComponent(btRemoverVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(tbFinalizarVenda))
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
                .addGap(0, 81, Short.MAX_VALUE))
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

        abaVendas.addTab("Registro", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        abaVendas.addTab("Consulta", jPanel2);

        jTabbedPane1.addTab("Vendas", abaVendas);

        btCadastro.setText("Cadastro de usuario");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        tela.setLayer(btLogoff, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tela.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tela.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tela.setLayer(btCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastro)
                .addGap(18, 18, 18)
                .addComponent(btLogoff)
                .addGap(25, 25, 25))
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogoff)
                    .addComponent(btCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

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
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
        }

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

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usuario.setLayer(checkSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(btConsultarCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(btCadastroSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(btAtualizarCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(btCadastroSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(btCadatroNovo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        usuario.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout usuarioLayout = new javax.swing.GroupLayout(usuario);
        usuario.setLayout(usuarioLayout);
        usuarioLayout.setHorizontalGroup(
            usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioLayout.createSequentialGroup()
                .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarioLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(usuarioLayout.createSequentialGroup()
                                .addComponent(btCadatroNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadastroSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastroSair))
                            .addComponent(checkSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(usuarioLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(usuarioLayout.createSequentialGroup()
                                .addComponent(btConsultarCadastro)
                                .addGap(50, 50, 50)
                                .addComponent(btAtualizarCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(76, 76, 76))
        );
        usuarioLayout.setVerticalGroup(
            usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadatroNovo)
                    .addComponent(btCadastroSalvar)
                    .addComponent(btCadastroSair))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultarCadastro)
                    .addComponent(btAtualizarCadastro)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel26.setText("CPF");

        jLabel27.setText("Nova Senha");

        lbUsuarioAlterar.setText(".");

        btAlterarSenha.setText("Alterar senha");
        btAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarSenhaActionPerformed(evt);
            }
        });

        trocaSenha.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        trocaSenha.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        trocaSenha.setLayer(lbUsuarioAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        trocaSenha.setLayer(tbSenhaAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        trocaSenha.setLayer(btAlterarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout trocaSenhaLayout = new javax.swing.GroupLayout(trocaSenha);
        trocaSenha.setLayout(trocaSenhaLayout);
        trocaSenhaLayout.setHorizontalGroup(
            trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trocaSenhaLayout.createSequentialGroup()
                .addGroup(trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trocaSenhaLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbSenhaAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lbUsuarioAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(trocaSenhaLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btAlterarSenha)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        trocaSenhaLayout.setVerticalGroup(
            trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trocaSenhaLayout.createSequentialGroup()
                .addGroup(trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trocaSenhaLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lbUsuarioAlterar)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trocaSenhaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)))
                .addGroup(trocaSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tbSenhaAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAlterarSenha)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(trocaSenha))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(trocaSenha))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {
        camposDesbloqueados();
        limparCampos();
        abaConsulta.setSelectedIndex(1);
        tbIsbn.requestFocusInWindow();
        contadorCaracteres();
        habilitarBotoes(false, true, false, false, false, true);
        
    }
    
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {
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
    
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        camposDesbloqueados();
        String texto = tbDescricao.getText();
        int tamanhoDoTexto = 400 - texto.length();
        lbContador.setText(String.valueOf(tamanhoDoTexto));
        contadorCaracteres();
        habilitarBotoes(false, false, false, true, true, true);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tela.setVisible(true);
        login.setVisible(false);
        usuario.setVisible(false);
        trocaSenha.setVisible(false);
        btCadastro.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        Usuario pr;
        String usuario;
        String senha;
        
        if (!(tbUsuario.getText().equals(""))) {
            
            try {
                BDusuario bd = new BDusuario();
                pr = bd.procurarUsuario(tbUsuario.getText());
                if (pr != null) {
                    
                    usuario = tbUsuario.getText();
                    senha = tbSenha.getText();
                    
                    
                        
                    if (senha.equals(pr.getSenha()) & usuario.equals(pr.getUsuario())) {
                                               
                        if ("326".equals(pr.getUsuario())) {
                            JOptionPane.showMessageDialog(null, "326");
                        btCadastro.setVisible(true);
                    }
                        
                        if(pr.isTrocaSenha()== true){
                         
                        tela.setVisible(false);
                        login.setVisible(false);
                        trocaSenha.setVisible(true);
                        lbUsuarioAlterar.setText(tbUsuario.getText());
                        JOptionPane.showMessageDialog(null, "Favor trocar sua senha");
                        }
                        
                        else{
                        
                        tela.setVisible(true);
                        login.setVisible(false);
                        tbUsuario.setText(null);
                        tbSenha.setText(null);
                        
                        }
                        
                    
                    
                    
                    }else {
                        JOptionPane.showMessageDialog(null, "login ou senha invalidos ");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "login ou senha invalidos");
                    
                }
            } catch (SQLException ex) {
            }
            
        }

//        tela.setVisible(true);
//        login.setVisible(false);

    }//GEN-LAST:event_btLogarActionPerformed

    private void btLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoffActionPerformed
        tela.setVisible(false);
        login.setVisible(true);
        usuario.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btLogoffActionPerformed

    private void tbDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDescricaoKeyReleased
        contadorCaracteres();        // TODO add your handling code here:
    }//GEN-LAST:event_tbDescricaoKeyReleased

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

    private void tbAddVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbAddVendaActionPerformed
        
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
        

    }//GEN-LAST:event_tbAddVendaActionPerformed

    private void btRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverVendaActionPerformed
        if (tabelaVenda.getSelectedRow() != -1) {
            
            DefaultTableModel model = (DefaultTableModel) tabelaVenda.getModel();
            model.removeRow(tabelaVenda.getSelectedRow());
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btRemoverVendaActionPerformed

    private void tbFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbFinalizarVendaActionPerformed
//DefaultTableModel model = (DefaultTableModel) tabelaVenda.getModel();
//        
//        for(int i=0; i<=tabelaVenda.getRowCount(); i++){
//JOptionPane.showMessageDialog(null, 
//        "nome do livro: " + model.getValueAt(i, 2) + " " + "\n" + 
//        "autor do livro: " + model.getValueAt(i, 3) +  " " + "\n" +
//        "editora do livro: " + model.getValueAt(i, 4)
//        );

//}
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Aqui ele seta a data de hoje no formato dd/mm/aaaa
        //String texto = formato.format(calendario.getDate());
        //String texto2 = calendario.getDate();
        //System.out.print(texto2);
        //System.out.print(calendario.getDate());
        JOptionPane.showMessageDialog(null, calendario.getDate());

    }//GEN-LAST:event_tbFinalizarVendaActionPerformed

    private void tbEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEstanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEstanteActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        BDprodutos bdpr = new BDprodutos();
        bdpr.excluirProduto(Integer.valueOf(tbIsbn.getText())); // TODO add your handling code here:
        limparCampos();
        camposBloqueados();
        
        tbIsbn.requestFocus(); // passa o foco para o campo codigo
    }//GEN-LAST:event_btExcluirActionPerformed

    private void calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseClicked

// TODO add your handling code here:
    }//GEN-LAST:event_calendarioMouseClicked

    private void tbEditoraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditoraVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEditoraVendaActionPerformed

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
                    habilitarBotoes(false, true, false, false, false, true);
                }
            } catch (SQLException ex) {
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisaVendaActionPerformed

    private void tbConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbConsultaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbConsultaVendaActionPerformed

    private void tbSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSenhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSenhaCadastroActionPerformed

    private void btConsultarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarCadastroActionPerformed
        Usuario pr;
        
        BDusuario bd;
        List<Usuario> listaUsuario;
        Usuario pr1;
        bd = new BDusuario();
        listaUsuario = bd.consultarUsuario(tbUsuario.getText());
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

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        tela.setVisible(false);
        login.setVisible(false);
        usuario.setVisible(true);
    }//GEN-LAST:event_btCadastroActionPerformed

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

    private void btCadastroSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroSairActionPerformed
        tela.setVisible(true);
        login.setVisible(false);
        usuario.setVisible(false);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastroSairActionPerformed

    private void tbNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNomeCadastroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      if(checkSenha.isSelected()){
          lbUsuarioAlterar.setText(tbUsuarioCadastro.getText());
          tela.setVisible(false);
          login.setVisible(false);
          usuario.setVisible(false);
          trocaSenha.setVisible(true);
          
                  
JOptionPane.showMessageDialog(null, "caixa marcada");
checkSenha.setSelected(false);
}else{
JOptionPane.showMessageDialog(null, "caixa desmarcada");
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarSenhaActionPerformed

Usuario pr;
        pr = new Usuario();
        pr.setUsuario(lbUsuarioAlterar.getText());
        pr.setSenha(tbSenhaAlterar.getText());
        
          
        BDusuario bdpr = new BDusuario();
        try {
            bdpr.atualizarUsuario(pr);
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro");
            
        }
        lbUsuarioAlterar.setText(".");
        tbSenhaAlterar.setText("");
        trocaSenha.setVisible(false);
        tela.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("null")
    public static void main(String args[]) {

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
    private javax.swing.JTabbedPane abaConsulta;
    private javax.swing.JTabbedPane abaVendas;
    private javax.swing.JButton btAlterarSenha;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btAtualizarCadastro;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btCadastroSair;
    private javax.swing.JButton btCadastroSalvar;
    private javax.swing.JButton btCadatroNovo;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConsultarCadastro;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLogar;
    private javax.swing.JButton btLogoff;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisaVenda;
    private javax.swing.JButton btRemoverVenda;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btprocurar;
    private javax.swing.JPanel cadastro;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JCheckBox checkSenha;
    private javax.swing.JPanel consulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JMenu jMenu17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbContador;
    private javax.swing.JLabel lbContadorVendas;
    private javax.swing.JLabel lbUsuarioAlterar;
    private javax.swing.JLayeredPane login;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelVendas;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JButton tbAddVenda;
    private javax.swing.JTextField tbAno;
    private javax.swing.JTextField tbAutor;
    private javax.swing.JTextField tbAutorVenda;
    private javax.swing.JFormattedTextField tbClienteCpfVenda;
    private javax.swing.JTextField tbClienteNomeVenda;
    private javax.swing.JTextField tbConsultaVenda;
    private javax.swing.JTextArea tbDescricao;
    private javax.swing.JTextField tbEditora;
    private javax.swing.JTextField tbEditoraVenda;
    private javax.swing.JTextField tbEstante;
    private javax.swing.JButton tbFinalizarVenda;
    private javax.swing.JTextField tbIsbn;
    private javax.swing.JTextField tbNomeCadastro;
    private javax.swing.JTextField tbQuantVenda;
    private javax.swing.JTextField tbQuantidade;
    private javax.swing.JPasswordField tbSenha;
    private javax.swing.JPasswordField tbSenhaAlterar;
    private javax.swing.JPasswordField tbSenhaCadastro;
    private javax.swing.JTextField tbTipo;
    private javax.swing.JTextField tbTitulo;
    private javax.swing.JTextField tbTituloVenda;
    private javax.swing.JTextField tbUsuario;
    private javax.swing.JTextField tbUsuarioCadastro;
    private javax.swing.JTextField tbValor;
    private javax.swing.JLayeredPane tela;
    private javax.swing.JTextField tfConsulta2;
    private javax.swing.JLayeredPane trocaSenha;
    private javax.swing.JLayeredPane usuario;
    // End of variables declaration//GEN-END:variables

    private void parseint(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

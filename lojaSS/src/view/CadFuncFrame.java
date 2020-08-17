/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author Pichau
 */


import javax.swing.JOptionPane;
import dao.conexao;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import model.tableModel;
import java.sql.Date;
import model.Funcionario;
import model.PanelFormUI;


public class CadFuncFrame extends javax.swing.JInternalFrame {
     
     conexao con_bd;
    
     
     private Funcionario func;
     
     String logradouro;
     String uf;
     String cidade;
     String bairro;
    /** Creates new form CadFuncFrame */
    public CadFuncFrame() {
        initComponents();
        
        con_bd = new conexao();
        con_bd.conecta();
        con_bd.executaSQL("select * from tab_funcionarios");
        
        
        TxtCpf.requestFocus();
  
        
        
        limpar();
                
        
        
        
        
        preencherTabela("select * from tab_funcionarios order by nome_func");
        
    }
    
    public void limpar(){
        TxtCpf.setText("");
        TxtNome.setText("");
        TxtEnde.setText("");
        TxtNume.setText("");
        TxtCargo.setText("");
        TxtCep.setText("");
        TxtEmail.setText("");
        TxtDataNasc.setText("");
        TxtCida.setText("");
        TxtCpf.requestFocus();
        
        BtnAlterar.setEnabled(false);
        BtnExcluir.setEnabled(false);
        
        TxtNome.setEnabled(false);
        TxtEnde.setEnabled(false);
        TxtNume.setEnabled(false);
        TxtCargo.setEnabled(false);
        TxtCep.setEnabled(false);
        TxtEmail.setEnabled(false);
        TxtDataNasc.setEnabled(false);
        TxtCida.setEnabled(false);
        
        
        
    }
    
    public void habilitar(){
        TxtNome.setEnabled(true);
        TxtEnde.setEnabled(true);
        TxtNume.setEnabled(true);
        TxtCargo.setEnabled(true);
        TxtCep.setEnabled(true);
        TxtEmail.setEnabled(true);
        TxtDataNasc.setEnabled(true);
        TxtCida.setEnabled(true);
        
        
        
    }
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblClie = new javax.swing.JTable();
        TxtCep = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");
            TxtCep = new javax.swing.JFormattedTextField(format_textField3);
        }catch (Exception e){}
        TxtCida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        BtnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnCadastrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnAlterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TxtCargo = new javax.swing.JTextField();
        TxtDataNasc = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("####-##-##");
            TxtDataNasc = new javax.swing.JFormattedTextField(format_textField3);
        }catch (Exception e){}
        TxtEnde = new javax.swing.JTextField();
        TxtNume = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter format_textField3 = new javax.swing.text.MaskFormatter("#####-###");
            TxtCep = new javax.swing.JFormattedTextField(format_textField3);
        }catch (Exception e){}
        TxtCpf = new javax.swing.JFormattedTextField();

        jRadioButton1.setText("jRadioButton1");

        setBackground(java.awt.SystemColor.activeCaption);
        setClosable(true);
        setTitle("Funcionários");

        TblClie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TblClie.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TblClie.getTableHeader().setResizingAllowed(false);
        TblClie.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TblClie);

        TxtCep.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtCepFocusLost(evt);
            }
        });

        TxtCida.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtCida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel1.setText("CPF:");

        TxtEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        BtnExcluir.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exlcuir.png"))); // NOI18N
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel11.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel8.setText("Cargo:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel5.setText("Numero:");

        BtnCadastrar.setBackground(new java.awt.Color(153, 255, 153));
        BtnCadastrar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        BtnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cadastro.png"))); // NOI18N
        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Funcionários já cadastrados:");

        TxtNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnLimpar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        BtnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/limpar.png"))); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel7.setText("CEP:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel4.setText("Endereço:");

        BtnAlterar.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        BtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/alterar.png"))); // NOI18N
        BtnAlterar.setText("Alterar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel10.setText("Data de Nascimento:");

        TxtCargo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtDataNasc.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtDataNasc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtDataNasc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtEnde.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtEnde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TxtNume.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtNume.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtNume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNumeFocusLost(evt);
            }
        });

        TxtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            TxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtCpf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TxtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCpfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCpfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel12)))
                        .addGap(6, 6, 6)
                        .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(BtnAlterar)
                        .addGap(13, 13, 13)
                        .addComponent(BtnLimpar)
                        .addGap(36, 36, 36)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(4, 4, 4)
                            .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtEnde))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(TxtNume, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel7)
                                    .addGap(4, 4, 4)
                                    .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(10, 10, 10)
                                    .addComponent(TxtCida, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtDataNasc))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEnde, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNume, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel12))
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(TxtCpf.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "O campo 'CPF' nãp pode estar vazio!", "Exlcuir", JOptionPane.INFORMATION_MESSAGE);
        }else {
            int fechar;
            fechar = 0;
            fechar = JOptionPane.showConfirmDialog(null, "Deseja realmente exlcuir este funcionário?", "Exlcuir", JOptionPane.YES_NO_OPTION, 2);
              if (fechar == 0){ //se for sim
                func.setCpf(TxtCpf.getText());

                String insert_sql = "delete from tab_funcionarios where cpf_func = '" + func.getCpf() + "'";
                try {
                    con_bd.statement.executeUpdate(insert_sql);
                    JOptionPane.showMessageDialog(null, "Funcionário Deletado com sucesso !!!");
                    preencherTabela("select * from tab_funcionarios");
                    limpar();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog (null, "Ocorreu algum erro!!! \n " + ex,"Inclusão", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
             }
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
         try {
            this.func = new Funcionario(TxtNome.getText().trim(), TxtEnde.getText().trim(), TxtNume.getText().trim(), TxtCida.getText().trim(), TxtCpf.getText().trim(), TxtCep.getText().trim(), TxtEmail.getText().trim(), TxtDataNasc.getText().trim(), TxtCargo.getText().trim(), TxtCargo.getText().trim());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro, " + ex);
        }

        String insert_sql = "update tab_funcionarios set nome_func = '" + func.getNome() + "', ende_func = '" + func.getEnde() + "', nume_ende_func = '" + func.getNume() + "', cida_func = '" + func.getCida() + "', cargo_func = '" + func.getCargo() + "', data_nasc_func = '" + func.getData_nasc() + "', cep_func = '" + func.getCep() + "', emai_func = '" + func.getEmai() + "' where cpf_func = '" + func.getCpf() + "'";
        try {
            con_bd.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Funcionário Alterado com sucesso !!!");
            preencherTabela("select * from tab_funcionarios");
            limpar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Ocorreu algum erro!!! \n " + ex,"Inclusão", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        try {   
            this.func = new Funcionario(TxtNome.getText().trim(), TxtEnde.getText().trim(), TxtNume.getText().trim(), TxtCida.getText().trim(), TxtCpf.getText().trim(), TxtCep.getText().trim(), TxtEmail.getText().trim(), TxtDataNasc.getText().trim(), TxtCargo.getText().trim(), TxtCargo.getText().trim());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro, " + ex);
        }

        String insert_sql = "insert into tab_funcionarios (nome_func, ende_func, nume_ende_func, cida_func, cpf_func, data_nasc_func, cep_func, emai_func, cargo_func) values ('" + func.getNome() + "', '" + func.getEnde() + "', '" + func.getNume() +"', '" + func.getCida() +"', '"+ func.getCpf() + "', '" + func.getData_nasc() + "', '" + func.getCep() + "', '" + func.getEmai() + "', '" + func.getCargo() + "')";
        try {
            con_bd.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Funcionário gravado com sucesso !!!");
            preencherTabela("select * from tab_funcionarios");
            limpar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, "Ocorreu algum erro!!! \n " + ex,"Inclusão", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
         func.setCpf(TxtCpf.getText());
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void TxtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCepFocusLost

        try{
            buscarCep(TxtCep.getText());
            TxtCida.setText(cidade);
            TxtCargo.requestFocus();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Digite um CEP válido!", "Validação", 2);
            TxtCep.setText("");
            TxtCep.requestFocus();
        }

    }//GEN-LAST:event_TxtCepFocusLost

    private void TxtNumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNumeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeFocusLost

    private void TxtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCpfKeyTyped
       
    }//GEN-LAST:event_TxtCpfKeyTyped

    private void TxtCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCpfKeyPressed
        //JOptionPane.showMessageDialog(null, TxtCpf.getText().trim().length());
        if (TxtCpf.getText().trim().length() >= 14){
            try
            {
                this.func = new Funcionario();
                func.setCpf(TxtCpf.getText());
                String pesquisa = "select * from tab_funcionarios where cpf_func = '" + func.getCpf() + "'";
                con_bd.executaSQL(pesquisa);
                if (con_bd.resultset.first())
                {
                    JOptionPane.showMessageDialog(null, "Funcionário já cadastrado");
                    TxtNome.setText(con_bd.resultset.getString("nome_func"));
                    TxtEnde.setText(con_bd.resultset.getString("ende_func"));
                    TxtNume.setText(con_bd.resultset.getString("nume_ende_func"));
                    TxtCida.setText(con_bd.resultset.getString("cida_func"));
                    TxtCargo.setText(con_bd.resultset.getString("cargo_func"));
                    TxtDataNasc.setText(con_bd.resultset.getString("data_nasc_func"));
                    TxtCep.setText(con_bd.resultset.getString("cep_func"));
                    TxtEmail.setText(con_bd.resultset.getString("emai_func"));
                    
                    
                    BtnCadastrar.setEnabled(false);
                    BtnAlterar.setEnabled(true);
                    BtnExcluir.setEnabled(true);
                    
                   
                    
                }
                else
                {
                    BtnCadastrar.setEnabled(true);
                    BtnAlterar.setEnabled(false);
                }
            }
            catch (SQLException erro)
            {
                JOptionPane.showMessageDialog(null, "Erro de Acesso na Tabela de Funcionario" + "\n" + erro + "\n" + "Contate o Suporte Técnico");
            }
            habilitar();
        }
        
        
    }//GEN-LAST:event_TxtCpfKeyPressed

    
    
    
    public void buscarCep(String cep) 
    {
        String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            // JOptionPane.showMessageDialog(null, json);
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            // JOptionPane.showMessageDialog(null, array);
                             
            logradouro = array[7];            
            bairro = array[15];
            cidade = array[19]; 
            uf = array[23];
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }  
    
    
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        
        String[] colunas = new String[]{
            "CPF",
            "Nome",
            "CEP",
            "Telefone",
            "E-mail"
        };
        
        
        con_bd.executaSQL(sql);
        
         try {
             con_bd.resultset.first();
             do{
                 dados.add(new Object[]{con_bd.resultset.getString("cpf_func"), con_bd.resultset.getString("nome_func"), con_bd.resultset.getString("cep_func"), con_bd.resultset.getString("cargo_func"), con_bd.resultset.getString("emai_func")});
             }while(con_bd.resultset.next());
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog (null, "Erro ao montar tabela \n" + ex,"Preencher Tabela", 2);
         }
         
         tableModel modelo = new tableModel(dados, colunas);
         
         TblClie.setModel(modelo);
         
         //Conluna CPF
         TblClie.getColumnModel().getColumn(0).setPreferredWidth(110);
         TblClie.getColumnModel().getColumn(0).setResizable(true);
         //Conluna Nome
         TblClie.getColumnModel().getColumn(1).setPreferredWidth(245);
         TblClie.getColumnModel().getColumn(1).setResizable(true);
         //Conluna CEP
         TblClie.getColumnModel().getColumn(2).setPreferredWidth(80);
         TblClie.getColumnModel().getColumn(2).setResizable(true);
         //Conluna Teelfone
          TblClie.getColumnModel().getColumn(3).setPreferredWidth(100);
         TblClie.getColumnModel().getColumn(3).setResizable(true);
         //Conluna Email
          TblClie.getColumnModel().getColumn(4).setPreferredWidth(249);
         TblClie.getColumnModel().getColumn(4).setResizable(true);
         
         TblClie.getTableHeader().setReorderingAllowed(false);
         TblClie.setAutoResizeMode(TblClie.AUTO_RESIZE_OFF);
         TblClie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JTable TblClie;
    private javax.swing.JTextField TxtCargo;
    private javax.swing.JTextField TxtCep;
    private javax.swing.JTextField TxtCida;
    private javax.swing.JFormattedTextField TxtCpf;
    private javax.swing.JTextField TxtDataNasc;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEnde;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
   
}
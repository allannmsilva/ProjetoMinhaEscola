/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Cadastros;

import controller.GUIController;
import domain.Aluno;
import domain.Turma;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogCadastroAluno extends javax.swing.JDialog {

    private GUIController guiController;

    public DialogCadastroAluno(java.awt.Frame parent, boolean modal, GUIController guiController) {
        super(parent, modal);
        this.guiController = guiController;
        initComponents();
        try {
            List<Turma> turmas = this.guiController.getDbManager().listarTurmas();
            ((DefaultComboBoxModel) cbbTurmaAluno.getModel()).addAll(turmas);

            if (!turmas.isEmpty()) {
                cbbTurmaAluno.setSelectedIndex(0);
            }
        } catch (Exception he) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar turmas!\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipalAluno = new javax.swing.JPanel();
        pnlDadosAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoAluno = new javax.swing.JTextField();
        cbbTurmaAluno = new javax.swing.JComboBox<>();
        txtRGAluno = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        ftxDataNascimentoAluno = new javax.swing.JFormattedTextField();
        btnAdicionarAluno = new javax.swing.JButton();
        btnLimparAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipalAluno.setBackground(new java.awt.Color(255, 204, 204));

        pnlDadosAluno.setBackground(new java.awt.Color(255, 204, 204));
        pnlDadosAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Aluno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("RG");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Turma");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Data de Nascimento");

        txtCodigoAluno.setEditable(false);
        txtCodigoAluno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCodigoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlunoActionPerformed(evt);
            }
        });

        cbbTurmaAluno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbbTurmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTurmaAlunoActionPerformed(evt);
            }
        });

        try {
            txtRGAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRGAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGAlunoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome");

        try {
            ftxDataNascimentoAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxDataNascimentoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxDataNascimentoAlunoActionPerformed(evt);
            }
        });

        btnAdicionarAluno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnAdicionarAluno.setForeground(new java.awt.Color(0, 102, 0));
        btnAdicionarAluno.setText("Adicionar");
        btnAdicionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAlunoActionPerformed(evt);
            }
        });

        btnLimparAluno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnLimparAluno.setForeground(new java.awt.Color(153, 0, 0));
        btnLimparAluno.setText("Limpar");
        btnLimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosAlunoLayout = new javax.swing.GroupLayout(pnlDadosAluno);
        pnlDadosAluno.setLayout(pnlDadosAlunoLayout);
        pnlDadosAlunoLayout.setHorizontalGroup(
            pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeAluno))
                    .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                        .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(btnAdicionarAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparAluno))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxDataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlDadosAlunoLayout.setVerticalGroup(
            pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxDataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarAluno)
                    .addComponent(btnLimparAluno))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlPrincipalAlunoLayout = new javax.swing.GroupLayout(pnlPrincipalAluno);
        pnlPrincipalAluno.setLayout(pnlPrincipalAlunoLayout);
        pnlPrincipalAlunoLayout.setHorizontalGroup(
            pnlPrincipalAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalAlunoLayout.createSequentialGroup()
                .addComponent(pnlDadosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlPrincipalAlunoLayout.setVerticalGroup(
            pnlPrincipalAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalAlunoLayout.createSequentialGroup()
                .addComponent(pnlDadosAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAlunoActionPerformed

    private void btnAdicionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAlunoActionPerformed

        String nome = txtNomeAluno.getText();
        String rg = txtRGAluno.getText();
        Turma turma = (Turma) cbbTurmaAluno.getSelectedItem();
        Date dataNascimento = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        try {
            dataNascimento = formatador.parse(ftxDataNascimentoAluno.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(ftxDataNascimentoAluno, "Data de Nascimento inválida!");
        }

        Aluno novoAluno = new Aluno(rg, nome, dataNascimento, turma);
        try {
            guiController.getDbManager().inserirAluno(novoAluno);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(btnAdicionarAluno, "Erro ao inserir aluno! Verifique os campos.");
        }
    }//GEN-LAST:event_btnAdicionarAlunoActionPerformed

    private void btnLimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAlunoActionPerformed
        txtNomeAluno.setText("");
        txtRGAluno.setText("");
        cbbTurmaAluno.setSelectedIndex(-1);
        ftxDataNascimentoAluno.setText("");
    }//GEN-LAST:event_btnLimparAlunoActionPerformed

    private void txtRGAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGAlunoActionPerformed

    private void ftxDataNascimentoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxDataNascimentoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxDataNascimentoAlunoActionPerformed

    private void cbbTurmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTurmaAlunoActionPerformed

    }//GEN-LAST:event_cbbTurmaAlunoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAluno;
    private javax.swing.JButton btnLimparAluno;
    private javax.swing.JComboBox<String> cbbTurmaAluno;
    private javax.swing.JFormattedTextField ftxDataNascimentoAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlDadosAluno;
    private javax.swing.JPanel pnlPrincipalAluno;
    private javax.swing.JTextField txtCodigoAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JFormattedTextField txtRGAluno;
    // End of variables declaration//GEN-END:variables

}

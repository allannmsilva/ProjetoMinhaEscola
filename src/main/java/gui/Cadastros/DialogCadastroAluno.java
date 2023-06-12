/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Cadastros;

import controller.GUIManager;
import controller.MetodosUteis;
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

    private GUIManager guiManager;

    public DialogCadastroAluno(java.awt.Frame parent, boolean modal, GUIManager guiManager) {
        super(parent, modal);
        this.guiManager = guiManager;
        initComponents();
        try {
            List<Turma> turmas = this.guiManager.getDbManager().listarTurmas();
            ((DefaultComboBoxModel) cbbTurmaAluno.getModel()).addAll(turmas);

            if (!turmas.isEmpty()) {
                cbbTurmaAluno.setSelectedIndex(0);
            }
        } catch (Exception he) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar turmas!\n");
        }

        if (guiManager.getAlunSelec() != null && !guiManager.cadastrando()) {
            setAlunSelec(guiManager.getAlunSelec());
            btnAdicionarAluno.setText("Editar");
            btnLimparAluno.setText("Excluir");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoAluno = new javax.swing.JTextField();
        cbbTurmaAluno = new javax.swing.JComboBox<>();
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
        cbbTurmaAluno.setToolTipText("");
        cbbTurmaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTurmaAlunoActionPerformed(evt);
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
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbTurmaAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ftxDataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosAlunoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAdicionarAluno)
                        .addGap(50, 50, 50)
                        .addComponent(btnLimparAluno)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlDadosAlunoLayout.setVerticalGroup(
            pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosAlunoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTurmaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxDataNascimentoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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

        if (campoInvalido(nome)) {
            return;
        }

        Turma turma = (Turma) cbbTurmaAluno.getSelectedItem();

        try {
            List<Aluno> alunos = guiManager.getDbManager().listarAlunos();
            Date dataNascimento = MetodosUteis.toDate(ftxDataNascimentoAluno.getText());

            if (btnAdicionarAluno.getText().equals("Editar")) {
                Aluno a = guiManager.getAlunSelec();
                if (nome.equals(a.getNome())
                        && turma.toString().equals(a.getTurma().toString())
                        && MetodosUteis.toString(dataNascimento).equals(MetodosUteis.toString(a.getDataNascimento()))) {
                    JOptionPane.showMessageDialog(this, "Altere algum campo para editar!");
                    return;
                }

                a.setNome(nome);
                a.setTurma(turma);
                a.setDataNascimento(dataNascimento);

                for (Aluno aluno : alunos) {
                    if (aluno.equals(a)) {
                        JOptionPane.showMessageDialog(this, "Aluno já existe!");
                        return;
                    }
                }

                guiManager.getDbManager().alterarAluno(a);
                JOptionPane.showMessageDialog(this, "Aluno editado com sucesso!");
                setVisible(false);
                return;
            }

            Aluno novoAluno = new Aluno(nome, dataNascimento, turma);
            for (Aluno aluno : alunos) {
                if (aluno.equals(novoAluno)) {
                    JOptionPane.showMessageDialog(this, "Aluno já existe!");
                    return;
                }
            }
            guiManager.getDbManager().inserirAluno(novoAluno);
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
            limparCampos();
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, "Data inválida!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(btnAdicionarAluno, "Erro ao cadastrar/editar aluno! Verifique os campos.");
        }
    }//GEN-LAST:event_btnAdicionarAlunoActionPerformed

    private void btnLimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAlunoActionPerformed
        if (btnLimparAluno.getText().equals("Excluir")) {
            try {
                guiManager.getDbManager().excluirAluno(guiManager.getAlunSelec());
                JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
                setVisible(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir aluno!");
            }

            return;
        }

        limparCampos();
    }//GEN-LAST:event_btnLimparAlunoActionPerformed

    private void ftxDataNascimentoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxDataNascimentoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxDataNascimentoAlunoActionPerformed

    private void cbbTurmaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTurmaAlunoActionPerformed

    }//GEN-LAST:event_cbbTurmaAlunoActionPerformed

    private void limparCampos() {
        txtNomeAluno.setText("");
        cbbTurmaAluno.setSelectedIndex(0);
        ftxDataNascimentoAluno.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAluno;
    private javax.swing.JButton btnLimparAluno;
    private javax.swing.JComboBox<String> cbbTurmaAluno;
    private javax.swing.JFormattedTextField ftxDataNascimentoAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pnlDadosAluno;
    private javax.swing.JPanel pnlPrincipalAluno;
    private javax.swing.JTextField txtCodigoAluno;
    private javax.swing.JTextField txtNomeAluno;
    // End of variables declaration//GEN-END:variables

    private void setAlunSelec(Aluno alunSelec) {
        txtCodigoAluno.setText(Long.toString(alunSelec.getCodigoAluno()));
        txtNomeAluno.setText(alunSelec.getNome());
        cbbTurmaAluno.setSelectedItem(alunSelec.getTurma());
        ftxDataNascimentoAluno.setText(new SimpleDateFormat("dd/MM/yyyy").format(alunSelec.getDataNascimento()));
    }

    private boolean campoInvalido(String nome) {

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o nome!");
            return true;
        }

        return false;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Cadastros;

import controller.GUIController;
import domain.Ano;
import domain.Disciplina;
import domain.Grade;
import domain.GradePK;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogCadastroGrade extends javax.swing.JDialog {

    private GUIController guiController;

    public DialogCadastroGrade(java.awt.Frame parent, boolean modal, GUIController guiController) {
        super(parent, modal);
        this.guiController = guiController;
        initComponents();
        try {
            List<Disciplina> disciplinas = this.guiController.getDbManager().listarDisciplinas();
            ((DefaultComboBoxModel) cbbDisciplinaGrade.getModel()).addAll(disciplinas);

            List<Ano> anos = this.guiController.getDbManager().listarAnos();
            ((DefaultComboBoxModel) cbbAnoGrade.getModel()).addAll(anos);

            if (!disciplinas.isEmpty()) {
                cbbDisciplinaGrade.setSelectedIndex(0);
            }

            if (!anos.isEmpty()) {
                cbbAnoGrade.setSelectedIndex(0);
            }
        } catch (Exception he) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar disciplinas/anos!\n");
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

        jSeparator1 = new javax.swing.JSeparator();
        pnlPrincipalGrade = new javax.swing.JPanel();
        pnlDadosGrade = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoGrade = new javax.swing.JTextField();
        txtPlanoEstudosGrade = new javax.swing.JTextField();
        cbbAnoGrade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbbDisciplinaGrade = new javax.swing.JComboBox<>();
        btnLimparGrade = new javax.swing.JButton();
        btnAdicionarGrade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipalGrade.setBackground(new java.awt.Color(255, 204, 204));

        pnlDadosGrade.setBackground(new java.awt.Color(255, 204, 204));
        pnlDadosGrade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Grade", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Plano de Estudos");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ano");

        txtCodigoGrade.setEditable(false);
        txtCodigoGrade.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCodigoGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoGradeActionPerformed(evt);
            }
        });

        txtPlanoEstudosGrade.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtPlanoEstudosGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanoEstudosGradeActionPerformed(evt);
            }
        });

        cbbAnoGrade.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbbAnoGrade.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Disciplina");

        btnLimparGrade.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnLimparGrade.setForeground(new java.awt.Color(153, 0, 0));
        btnLimparGrade.setText("Limpar");
        btnLimparGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparGradeActionPerformed(evt);
            }
        });

        btnAdicionarGrade.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnAdicionarGrade.setForeground(new java.awt.Color(0, 102, 0));
        btnAdicionarGrade.setText("Adicionar");
        btnAdicionarGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosGradeLayout = new javax.swing.GroupLayout(pnlDadosGrade);
        pnlDadosGrade.setLayout(pnlDadosGradeLayout);
        pnlDadosGradeLayout.setHorizontalGroup(
            pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosGradeLayout.createSequentialGroup()
                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosGradeLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnAdicionarGrade)
                        .addGap(65, 65, 65)
                        .addComponent(btnLimparGrade))
                    .addGroup(pnlDadosGradeLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosGradeLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlanoEstudosGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosGradeLayout.createSequentialGroup()
                                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbAnoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosGradeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbDisciplinaGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        pnlDadosGradeLayout.setVerticalGroup(
            pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosGradeLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbAnoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDisciplinaGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlanoEstudosGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlDadosGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarGrade)
                    .addComponent(btnLimparGrade))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlPrincipalGradeLayout = new javax.swing.GroupLayout(pnlPrincipalGrade);
        pnlPrincipalGrade.setLayout(pnlPrincipalGradeLayout);
        pnlPrincipalGradeLayout.setHorizontalGroup(
            pnlPrincipalGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalGradeLayout.createSequentialGroup()
                .addComponent(pnlDadosGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalGradeLayout.setVerticalGroup(
            pnlPrincipalGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoGradeActionPerformed

    private void txtPlanoEstudosGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanoEstudosGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanoEstudosGradeActionPerformed

    private void btnAdicionarGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarGradeActionPerformed
        Ano ano = (Ano) cbbAnoGrade.getSelectedItem();
        Disciplina disciplina = (Disciplina) cbbDisciplinaGrade.getSelectedItem();
        String planoEstudos = txtPlanoEstudosGrade.getText();

        GradePK codigoGrade = new GradePK(ano, disciplina);
        Grade grade = new Grade(codigoGrade, planoEstudos);

        try {
            guiController.getDbManager().inserirGrade(grade);
            JOptionPane.showMessageDialog(this, "Grade cadastrada com sucesso!");
            limparCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao inserir grade! Verifique os campos.");
        }
    }//GEN-LAST:event_btnAdicionarGradeActionPerformed

    private void btnLimparGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparGradeActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparGradeActionPerformed

    private void limparCampos() {
        cbbAnoGrade.setSelectedIndex(-1);
        cbbDisciplinaGrade.setSelectedIndex(-1);
        txtPlanoEstudosGrade.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarGrade;
    private javax.swing.JButton btnLimparGrade;
    private javax.swing.JComboBox<String> cbbAnoGrade;
    private javax.swing.JComboBox<String> cbbDisciplinaGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlDadosGrade;
    private javax.swing.JPanel pnlPrincipalGrade;
    private javax.swing.JTextField txtCodigoGrade;
    private javax.swing.JTextField txtPlanoEstudosGrade;
    // End of variables declaration//GEN-END:variables
}

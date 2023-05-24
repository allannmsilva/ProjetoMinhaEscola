/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Cadastros;

import controller.GUIController;
import domain.Ano;
import domain.Turma;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogCadastroTurma extends javax.swing.JDialog {

    private GUIController guiController;

    public DialogCadastroTurma(java.awt.Frame parent, boolean modal, GUIController guiController) {
        super(parent, modal);
        this.guiController = guiController;
        initComponents();
        try {
            List<Ano> anos = this.guiController.getDbManager().listarAnos();
            ((DefaultComboBoxModel) cbbSerieAnoTurma.getModel()).addAll(anos);

            if (!anos.isEmpty()) {
                cbbSerieAnoTurma.setSelectedIndex(0);
            }
        } catch (Exception he) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar anos!\n");
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

        grpTurno = new javax.swing.ButtonGroup();
        pnlPrincipalTurma = new javax.swing.JPanel();
        pnlDadosTurma = new javax.swing.JPanel();
        pnlTurnoTurma = new javax.swing.JPanel();
        rbtMatutinoTurma = new javax.swing.JRadioButton();
        rbtVespertinoTurma = new javax.swing.JRadioButton();
        rbtNoturnoTurma = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoTurma = new javax.swing.JTextField();
        txtDescricaoTurma = new javax.swing.JTextField();
        cbbSerieAnoTurma = new javax.swing.JComboBox<>();
        btnAdicionarTurma = new javax.swing.JButton();
        btnLimparTurma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipalTurma.setBackground(new java.awt.Color(255, 204, 204));

        pnlDadosTurma.setBackground(new java.awt.Color(255, 204, 204));
        pnlDadosTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Turma", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N

        pnlTurnoTurma.setBackground(new java.awt.Color(255, 204, 204));
        pnlTurnoTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Turno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 0, 12))); // NOI18N
        pnlTurnoTurma.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        grpTurno.add(rbtMatutinoTurma);
        rbtMatutinoTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        rbtMatutinoTurma.setMnemonic('M');
        rbtMatutinoTurma.setText("Matutino");
        rbtMatutinoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMatutinoTurmaActionPerformed(evt);
            }
        });

        grpTurno.add(rbtVespertinoTurma);
        rbtVespertinoTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        rbtVespertinoTurma.setMnemonic('V');
        rbtVespertinoTurma.setText("Vespertino");
        rbtVespertinoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVespertinoTurmaActionPerformed(evt);
            }
        });

        grpTurno.add(rbtNoturnoTurma);
        rbtNoturnoTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        rbtNoturnoTurma.setMnemonic('N');
        rbtNoturnoTurma.setText("Noturno");
        rbtNoturnoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNoturnoTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTurnoTurmaLayout = new javax.swing.GroupLayout(pnlTurnoTurma);
        pnlTurnoTurma.setLayout(pnlTurnoTurmaLayout);
        pnlTurnoTurmaLayout.setHorizontalGroup(
            pnlTurnoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTurnoTurmaLayout.createSequentialGroup()
                .addComponent(rbtMatutinoTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtVespertinoTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtNoturnoTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTurnoTurmaLayout.setVerticalGroup(
            pnlTurnoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTurnoTurmaLayout.createSequentialGroup()
                .addGroup(pnlTurnoTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMatutinoTurma)
                    .addComponent(rbtVespertinoTurma)
                    .addComponent(rbtNoturnoTurma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ano");

        txtCodigoTurma.setEditable(false);
        txtCodigoTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCodigoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoTurmaActionPerformed(evt);
            }
        });

        txtDescricaoTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtDescricaoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoTurmaActionPerformed(evt);
            }
        });

        cbbSerieAnoTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbbSerieAnoTurma.setToolTipText("");

        btnAdicionarTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnAdicionarTurma.setForeground(new java.awt.Color(0, 102, 0));
        btnAdicionarTurma.setText("Adicionar");
        btnAdicionarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTurmaActionPerformed(evt);
            }
        });

        btnLimparTurma.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnLimparTurma.setForeground(new java.awt.Color(153, 0, 0));
        btnLimparTurma.setText("Limpar");
        btnLimparTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosTurmaLayout = new javax.swing.GroupLayout(pnlDadosTurma);
        pnlDadosTurma.setLayout(pnlDadosTurmaLayout);
        pnlDadosTurmaLayout.setHorizontalGroup(
            pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricaoTurma, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                                .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbSerieAnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                        .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(pnlTurnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnAdicionarTurma)
                                .addGap(41, 41, 41)
                                .addComponent(btnLimparTurma)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDadosTurmaLayout.setVerticalGroup(
            pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosTurmaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbSerieAnoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(pnlTurnoTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(pnlDadosTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarTurma)
                    .addComponent(btnLimparTurma))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlPrincipalTurmaLayout = new javax.swing.GroupLayout(pnlPrincipalTurma);
        pnlPrincipalTurma.setLayout(pnlPrincipalTurmaLayout);
        pnlPrincipalTurmaLayout.setHorizontalGroup(
            pnlPrincipalTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlPrincipalTurmaLayout.setVerticalGroup(
            pnlPrincipalTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTurmaActionPerformed
        txtDescricaoTurma.setText("");
        cbbSerieAnoTurma.setSelectedIndex(0);
        grpTurno.clearSelection();
    }//GEN-LAST:event_btnLimparTurmaActionPerformed

    private void btnAdicionarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTurmaActionPerformed

        String descricao = txtDescricaoTurma.getText();
        Ano ano = (Ano) cbbSerieAnoTurma.getSelectedItem();
        int turno = -1;

        switch (grpTurno.getSelection().getMnemonic()) {
            case 'M':
                turno = 0;
                break;
            case 'V':
                turno = 1;
                break;
            case 'N':
                turno = 2;
                break;
        }

        if (turno > -1) {
            Turma turma = new Turma(descricao, ano, turno);
            try {
                guiController.getDbManager().inserirTurma(turma);
                JOptionPane.showMessageDialog(this, "Turma cadastrada com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar turma! Verifique os campos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um turno!");
        }
    }//GEN-LAST:event_btnAdicionarTurmaActionPerformed

    private void txtDescricaoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoTurmaActionPerformed

    private void txtCodigoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoTurmaActionPerformed

    private void rbtNoturnoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNoturnoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNoturnoTurmaActionPerformed

    private void rbtVespertinoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVespertinoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtVespertinoTurmaActionPerformed

    private void rbtMatutinoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMatutinoTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtMatutinoTurmaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarTurma;
    private javax.swing.JButton btnLimparTurma;
    private javax.swing.JComboBox<String> cbbSerieAnoTurma;
    private javax.swing.ButtonGroup grpTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlDadosTurma;
    private javax.swing.JPanel pnlPrincipalTurma;
    private javax.swing.JPanel pnlTurnoTurma;
    private javax.swing.JRadioButton rbtMatutinoTurma;
    private javax.swing.JRadioButton rbtNoturnoTurma;
    private javax.swing.JRadioButton rbtVespertinoTurma;
    private javax.swing.JTextField txtCodigoTurma;
    private javax.swing.JTextField txtDescricaoTurma;
    // End of variables declaration//GEN-END:variables
}

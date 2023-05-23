/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Cadastros;

import controller.GUIController;
import domain.Ano;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogCadastroAno extends javax.swing.JDialog {

    private GUIController guiController;

    public DialogCadastroAno(java.awt.Frame parent, boolean modal, GUIController guiController) {
        super(parent, modal);
        this.guiController = guiController;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipalAno = new javax.swing.JPanel();
        pnlDadosAno = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbGrauAno = new javax.swing.JComboBox<>();
        spnOrdinalAno = new javax.swing.JSpinner();
        btnAdicionarAno = new javax.swing.JButton();
        btnLimparAno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipalAno.setBackground(new java.awt.Color(255, 204, 204));

        pnlDadosAno.setBackground(new java.awt.Color(255, 204, 204));
        pnlDadosAno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Ano", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Código");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Ordinal");

        txtCodigoAno.setEditable(false);
        txtCodigoAno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCodigoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAnoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Grau");

        cbbGrauAno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        cbbGrauAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FUNDAMENTAL I", "FUNDAMENTAL II", "MÉDIO" }));
        cbbGrauAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGrauAnoActionPerformed(evt);
            }
        });

        spnOrdinalAno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        spnOrdinalAno.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        btnAdicionarAno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnAdicionarAno.setForeground(new java.awt.Color(0, 102, 0));
        btnAdicionarAno.setText("Adicionar");
        btnAdicionarAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAnoActionPerformed(evt);
            }
        });

        btnLimparAno.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnLimparAno.setForeground(new java.awt.Color(153, 0, 0));
        btnLimparAno.setText("Limpar");
        btnLimparAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosAnoLayout = new javax.swing.GroupLayout(pnlDadosAno);
        pnlDadosAno.setLayout(pnlDadosAnoLayout);
        pnlDadosAnoLayout.setHorizontalGroup(
            pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosAnoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbGrauAno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnOrdinalAno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(pnlDadosAnoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAdicionarAno)
                .addGap(18, 18, 18)
                .addComponent(btnLimparAno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosAnoLayout.setVerticalGroup(
            pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosAnoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnOrdinalAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbGrauAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlDadosAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarAno)
                    .addComponent(btnLimparAno))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout pnlPrincipalAnoLayout = new javax.swing.GroupLayout(pnlPrincipalAno);
        pnlPrincipalAno.setLayout(pnlPrincipalAnoLayout);
        pnlPrincipalAnoLayout.setHorizontalGroup(
            pnlPrincipalAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalAnoLayout.createSequentialGroup()
                .addComponent(pnlDadosAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlPrincipalAnoLayout.setVerticalGroup(
            pnlPrincipalAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalAnoLayout.createSequentialGroup()
                .addComponent(pnlDadosAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipalAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAnoActionPerformed

    private void btnAdicionarAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAnoActionPerformed
        int ordinal = (int) spnOrdinalAno.getValue();
        int grau = cbbGrauAno.getSelectedIndex();

        Ano novoAno = new Ano(ordinal, grau);
        try {
            guiController.getDbManager().inserirAno(novoAno);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(btnAdicionarAno, "Erro ao inserir ano! Verifique os campos.");
        }
    }//GEN-LAST:event_btnAdicionarAnoActionPerformed

    private void btnLimparAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparAnoActionPerformed
        spnOrdinalAno.setValue(((SpinnerNumberModel) spnOrdinalAno.getModel()).getMinimum());
        cbbGrauAno.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparAnoActionPerformed

    private void cbbGrauAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGrauAnoActionPerformed
        if (cbbGrauAno.getSelectedIndex() == 2) {
            ((SpinnerNumberModel) spnOrdinalAno.getModel()).setMaximum(4);
            spnOrdinalAno.setValue(((SpinnerNumberModel) spnOrdinalAno.getModel()).getMinimum());
        } else {
            ((SpinnerNumberModel) spnOrdinalAno.getModel()).setMaximum(9);
        }
    }//GEN-LAST:event_cbbGrauAnoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAno;
    private javax.swing.JButton btnLimparAno;
    private javax.swing.JComboBox<String> cbbGrauAno;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlDadosAno;
    private javax.swing.JPanel pnlPrincipalAno;
    private javax.swing.JSpinner spnOrdinalAno;
    private javax.swing.JTextField txtCodigoAno;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Cadastros;

import controller.GUIManager;
import dao.DAOMethods;
import domain.Disciplina;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogCadastroDisciplina extends javax.swing.JDialog {

    private GUIManager guiManager;

    public DialogCadastroDisciplina(java.awt.Frame parent, boolean modal, GUIManager guiManager) {
        super(parent, modal);
        this.guiManager = guiManager;
        initComponents();
        if (guiManager.getDiscSelec() != null && !guiManager.cadastrando()) {
            setDiscSelec(guiManager.getDiscSelec());
            btnAdicionarDisciplina.setText("Editar");
            btnLimparDisciplina.setText("Excluir");
        }
    }

    private void setDiscSelec(Disciplina discSelec) {
        txtCodigoDisciplina.setText(String.valueOf(discSelec.getCodigoDisciplina()));
        txtDescricaoDisciplina.setText(discSelec.getDescricaoDisciplina());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipalDisciplina = new javax.swing.JPanel();
        pnlDadosDisciplina = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoDisciplina = new javax.swing.JTextField();
        txtDescricaoDisciplina = new javax.swing.JTextField();
        btnAdicionarDisciplina = new javax.swing.JButton();
        btnLimparDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPrincipalDisciplina.setBackground(new java.awt.Color(255, 204, 204));

        pnlDadosDisciplina.setBackground(new java.awt.Color(255, 204, 204));
        pnlDadosDisciplina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Disciplina", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descrição");

        txtCodigoDisciplina.setEditable(false);
        txtCodigoDisciplina.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtCodigoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDisciplinaActionPerformed(evt);
            }
        });

        txtDescricaoDisciplina.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        txtDescricaoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosDisciplinaLayout = new javax.swing.GroupLayout(pnlDadosDisciplina);
        pnlDadosDisciplina.setLayout(pnlDadosDisciplinaLayout);
        pnlDadosDisciplinaLayout.setHorizontalGroup(
            pnlDadosDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosDisciplinaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlDadosDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlDadosDisciplinaLayout.setVerticalGroup(
            pnlDadosDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosDisciplinaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pnlDadosDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnAdicionarDisciplina.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnAdicionarDisciplina.setForeground(new java.awt.Color(0, 102, 0));
        btnAdicionarDisciplina.setText("Adicionar");
        btnAdicionarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDisciplinaActionPerformed(evt);
            }
        });

        btnLimparDisciplina.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        btnLimparDisciplina.setForeground(new java.awt.Color(153, 0, 0));
        btnLimparDisciplina.setText("Limpar");
        btnLimparDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalDisciplinaLayout = new javax.swing.GroupLayout(pnlPrincipalDisciplina);
        pnlPrincipalDisciplina.setLayout(pnlPrincipalDisciplinaLayout);
        pnlPrincipalDisciplinaLayout.setHorizontalGroup(
            pnlPrincipalDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalDisciplinaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAdicionarDisciplina)
                .addGap(18, 18, 18)
                .addComponent(btnLimparDisciplina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlDadosDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPrincipalDisciplinaLayout.setVerticalGroup(
            pnlPrincipalDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalDisciplinaLayout.createSequentialGroup()
                .addComponent(pnlDadosDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(pnlPrincipalDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparDisciplina)
                    .addComponent(btnAdicionarDisciplina))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDisciplinaActionPerformed

    private void txtDescricaoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoDisciplinaActionPerformed

    private void btnAdicionarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDisciplinaActionPerformed
        try {
            if (btnAdicionarDisciplina.getText().equals("Editar")) {
                Disciplina d = guiManager.getDiscSelec();
                d.setDescricaoDisciplina(txtDescricaoDisciplina.getText());
                DAOMethods.update(d);
                JOptionPane.showMessageDialog(this, "Disciplina editada com sucesso!");
                setVisible(false);
                return;
            }
            Disciplina d = new Disciplina(txtDescricaoDisciplina.getText());
            d.setDescricaoDisciplina(d.getDescricaoDisciplina().substring(0, 1).toUpperCase() + d.getDescricaoDisciplina().substring(1, d.getDescricaoDisciplina().length()));
            guiManager.getDbManager().inserirDisciplina(d);
            JOptionPane.showMessageDialog(this, "Disciplina cadastrada com sucesso!");
            limparCampos();
        } catch (Exception ex) {
            if (txtDescricaoDisciplina.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Descrição deve ser preenchida!\n");
            } else {
                JOptionPane.showMessageDialog(this, "Disciplina já existe!\n");
            }
        }
    }//GEN-LAST:event_btnAdicionarDisciplinaActionPerformed

    private void btnLimparDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDisciplinaActionPerformed
        if (btnLimparDisciplina.getText().equals("Excluir")) {
            try {
                Disciplina d = guiManager.getDiscSelec();
                DAOMethods.delete(d);
                JOptionPane.showMessageDialog(this, "Disciplina excluída com sucesso!");
                setVisible(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir disciplina!\n");
            }
            return;
        }
        limparCampos();
    }//GEN-LAST:event_btnLimparDisciplinaActionPerformed

    private void limparCampos() {
        txtDescricaoDisciplina.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDisciplina;
    private javax.swing.JButton btnLimparDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlDadosDisciplina;
    private javax.swing.JPanel pnlPrincipalDisciplina;
    private javax.swing.JTextField txtCodigoDisciplina;
    private javax.swing.JTextField txtDescricaoDisciplina;
    // End of variables declaration//GEN-END:variables
}

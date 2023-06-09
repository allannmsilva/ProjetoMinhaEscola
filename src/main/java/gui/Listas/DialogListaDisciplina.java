/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Listas;

import controller.GUIManager;
import domain.Disciplina;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogListaDisciplina extends javax.swing.JDialog {
    
    private GUIManager guiManager;
    private Disciplina discSelec;
    
    public DialogListaDisciplina(java.awt.Frame parent, boolean modal, GUIManager guiManager) throws Exception {
        super(parent, modal);
        this.guiManager = guiManager;
        this.discSelec = null;
        initComponents();
        List<Disciplina> disciplinas = guiManager.getDbManager().listarDisciplinas();
        for (Disciplina disciplina : disciplinas) {
            ((DefaultTableModel) tblDisciplinas.getModel()).addRow(disciplina.toArray());
        }
        
        tblDisciplinas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // to detect doble click events
                JTable target = (JTable) me.getSource();
                int row = target.getSelectedRow(); // select a row
                if (me.getClickCount() == 2 && target.getSelectedRow() != -1) {
                    try {
                        discSelec = guiManager.getDbManager().findByIdDisciplina((long) target.getValueAt(row, 0));
                        setVisible(false);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(target, "Erro ao selecionar disciplina!\n");
                        ex.printStackTrace();
                    }
                }
            }
        });
    }
    
    public Disciplina getDiscSelec() {
        return discSelec;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListaDisciplinas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisciplinas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPesqDisciplinaDescricao = new javax.swing.JTextField();
        btnDisciplinaPesq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlListaDisciplinas.setBackground(new java.awt.Color(255, 204, 204));
        pnlListaDisciplinas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N
        pnlListaDisciplinas.setLayout(new java.awt.GridLayout(1, 0));

        tblDisciplinas.setBackground(new java.awt.Color(255, 204, 204));
        tblDisciplinas.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        tblDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisciplinas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblDisciplinas);

        pnlListaDisciplinas.add(jScrollPane1);

        jLabel1.setText("Descrição");

        btnDisciplinaPesq.setText("Pesquisar");
        btnDisciplinaPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisciplinaPesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesqDisciplinaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDisciplinaPesq)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlListaDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesqDisciplinaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisciplinaPesq))
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(pnlListaDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisciplinaPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisciplinaPesqActionPerformed
        ((DefaultTableModel) tblDisciplinas.getModel()).setNumRows(0);
        
        String descricao = txtPesqDisciplinaDescricao.getText();
        
        try {
            if (descricao.isEmpty()) {
                List<Disciplina> disciplinas = guiManager.getDbManager().listarDisciplinas();
                for (Disciplina disciplina : disciplinas) {
                    ((DefaultTableModel) tblDisciplinas.getModel()).addRow(disciplina.toArray());
                }
                return;
            }
            
            List<Disciplina> disciplinas = guiManager.getDbManager().pesquisarDisciplinaPorDescricao(descricao);
            for (Disciplina disciplina : disciplinas) {
                ((DefaultTableModel) tblDisciplinas.getModel()).addRow(disciplina.toArray());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar disciplinas!\n");
        }
    }//GEN-LAST:event_btnDisciplinaPesqActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisciplinaPesq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlListaDisciplinas;
    private javax.swing.JTable tblDisciplinas;
    private javax.swing.JTextField txtPesqDisciplinaDescricao;
    // End of variables declaration//GEN-END:variables
}

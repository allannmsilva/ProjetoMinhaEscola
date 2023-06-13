/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Listas;

import controller.GUIManager;
import domain.Turma;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class DialogListaTurma extends javax.swing.JDialog {

    private GUIManager guiManager;
    private Turma turmSelec = null;

    public DialogListaTurma(java.awt.Frame parent, boolean modal, GUIManager guiManager) throws Exception {
        super(parent, modal);
        this.guiManager = guiManager;
        initComponents();
        List<Turma> turmas = guiManager.getDbManager().listarTurmas();
        for (Turma turma : turmas) {
            ((DefaultTableModel) tblTurmas.getModel()).addRow(turma.toArray());
        }

        tblTurmas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // to detect doble click events
                JTable target = (JTable) me.getSource();
                int row = target.getSelectedRow(); // select a row
                if (me.getClickCount() == 2 && target.getSelectedRow() != -1) {
                    try {
                        turmSelec = guiManager.getDbManager().findByIdTurma((long) target.getValueAt(row, 0));
                        setVisible(false);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(target, "Erro ao selecionar turma!\n");
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListaTurmas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTurmas = new javax.swing.JTable();
        txtPesqTurmaDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbbPesqTurmaTurno = new javax.swing.JComboBox<>();
        btnPesquisarTurmas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlListaTurmas.setBackground(new java.awt.Color(255, 204, 204));
        pnlListaTurmas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Turmas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N
        pnlListaTurmas.setLayout(new java.awt.GridLayout(1, 0));

        tblTurmas.setBackground(new java.awt.Color(255, 204, 204));
        tblTurmas.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        tblTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Série/Ano", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTurmas);

        pnlListaTurmas.add(jScrollPane1);

        jLabel2.setText("Descrição");

        jLabel1.setText("Turno");

        cbbPesqTurmaTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATUTINO", "VESPERTINO", "NOTURNO", "<<TODOS>>" }));
        cbbPesqTurmaTurno.setSelectedIndex(3);

        btnPesquisarTurmas.setText("Pesquisar");
        btnPesquisarTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTurmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbPesqTurmaTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesqTurmaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnPesquisarTurmas)
                .addGap(184, 184, 184))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlListaTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesqTurmaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbPesqTurmaTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnPesquisarTurmas)))
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(pnlListaTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTurmasActionPerformed
        ((DefaultTableModel) tblTurmas.getModel()).setNumRows(0);

        String descricao = txtPesqTurmaDescricao.getText();
        boolean descricaoVazia = txtPesqTurmaDescricao.getText().isEmpty();
        String turno = (String) Integer.toString(cbbPesqTurmaTurno.getSelectedIndex());
        boolean turnoVazio = cbbPesqTurmaTurno.getSelectedIndex() > 2;

        try {
            if (descricaoVazia && turnoVazio) {
                List<Turma> alunos = guiManager.getDbManager().listarTurmas();
                for (Turma aluno : alunos) {
                    ((DefaultTableModel) tblTurmas.getModel()).addRow(aluno.toArray());
                }
                return;
            }

            if (!descricaoVazia && !turnoVazio) {
                List<Turma> alunos = guiManager.getDbManager().pesquisarTurmaPorDescricaoETurno(descricao.trim(), turno);
                for (Turma aluno : alunos) {
                    ((DefaultTableModel) tblTurmas.getModel()).addRow(aluno.toArray());
                }
                return;
            }

            if (!turnoVazio) {
                List<Turma> alunos = guiManager.getDbManager().pesquisarTurmaPorTurno(turno);
                for (Turma aluno : alunos) {
                    ((DefaultTableModel) tblTurmas.getModel()).addRow(aluno.toArray());
                }
                return;
            }

            if (!descricaoVazia) {
                List<Turma> alunos = guiManager.getDbManager().pesquisarTurmaPorDescricao(descricao.trim());
                for (Turma aluno : alunos) {
                    ((DefaultTableModel) tblTurmas.getModel()).addRow(aluno.toArray());
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao listar alunos!\n");
        }
    }//GEN-LAST:event_btnPesquisarTurmasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisarTurmas;
    private javax.swing.JComboBox<String> cbbPesqTurmaTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlListaTurmas;
    private javax.swing.JTable tblTurmas;
    private javax.swing.JTextField txtPesqTurmaDescricao;
    // End of variables declaration//GEN-END:variables

    public Turma getTurmSelec() {
        return turmSelec;
    }
}

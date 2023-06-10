/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Listas;

import controller.GUIManager;
import domain.Aluno;
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
public class DialogListaAluno extends javax.swing.JDialog {

    private GUIManager guiController;
    private Aluno alunSelec = null;

    public DialogListaAluno(java.awt.Frame parent, boolean modal, GUIManager guiController) throws Exception {
        super(parent, modal);
        this.guiController = guiController;
        initComponents();
        List<Aluno> alunos = guiController.getDbManager().listarAlunos();
        for (Aluno aluno : alunos) {
            ((DefaultTableModel) tblAlunos.getModel()).addRow(aluno.toArray());
        }

        tblAlunos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // to detect doble click events
                JTable target = (JTable) me.getSource();
                int row = target.getSelectedRow(); // select a row
                if (me.getClickCount() == 2 && target.getSelectedRow() != -1) {
                    try {
                        alunSelec = guiController.getDbManager().findByIdAluno((long) target.getValueAt(row, 0));
                        setVisible(false);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(target, "Erro ao selecionar aluno!\n");
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

        pnlListaAlunos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlListaAlunos.setBackground(new java.awt.Color(255, 204, 204));
        pnlListaAlunos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Malgun Gothic", 1, 12))); // NOI18N
        pnlListaAlunos.setLayout(new java.awt.GridLayout(1, 0));

        tblAlunos.setBackground(new java.awt.Color(255, 204, 204));
        tblAlunos.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "RG", "Nome", "Turma", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        pnlListaAlunos.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlListaAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlListaAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlListaAlunos;
    private javax.swing.JTable tblAlunos;
    // End of variables declaration//GEN-END:variables

    public Aluno getAlunSelec() {
        return alunSelec;
    }
}

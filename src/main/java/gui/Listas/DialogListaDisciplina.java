/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui.Listas;

import controller.GUIController;
import domain.Disciplina;
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
public class DialogListaDisciplina extends javax.swing.JDialog {

    private GUIController guiController;
    private Disciplina discSelec;

    public DialogListaDisciplina(java.awt.Frame parent, boolean modal, GUIController guiController) throws Exception {
        super(parent, modal);
        this.guiController = guiController;
        this.discSelec = null;
        initComponents();
        List<Disciplina> disciplinas = guiController.getDbManager().listarDisciplinas();
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
                        discSelec = guiController.getDbManager().findByIdDisciplina((long) target.getValueAt(row, 0));
                        setVisible(false);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(target, "Erro ao selecionar disciplina!\n");
                        ex.printStackTrace();
                    }
                    setVisible(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlListaDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlListaDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlListaDisciplinas;
    private javax.swing.JTable tblDisciplinas;
    // End of variables declaration//GEN-END:variables
}

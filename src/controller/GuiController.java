package controller;

import domain.Disciplina;
import gui.Cadastros.DialogCadastroAluno;
import gui.Cadastros.DialogCadastroAno;
import gui.Cadastros.DialogCadastroDisciplina;
import gui.Cadastros.DialogCadastroGrade;
import gui.Cadastros.DialogCadastroTurma;
import gui.Listas.DialogListaAluno;
import gui.Listas.DialogListaDisciplina;
import gui.Listas.DialogListaGrade;
import gui.Listas.DialogListaTurma;
import gui.FrameMenu;
import javax.swing.JDialog;
import java.awt.Frame;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class GuiController {

    private static GuiController guiController;

    private FrameMenu frameMenu = null;
    private DialogCadastroTurma dialogCadastroTurma = null;
    private DialogListaTurma dialogListaTurma = null;
    private DialogCadastroDisciplina dialogCadastroDisciplina = null;
    private DialogListaDisciplina dialogListaDisciplina = null;
    private DialogCadastroAluno dialogCadastroAluno = null;
    private DialogListaAluno dialogListaAluno = null;
    private DialogCadastroAno dialogCadastroAno = null;
    private DialogCadastroGrade dialogCadastroGrade = null;
    private DialogListaGrade dialogListaGrade = null;

    DAOManager dbManager;

    private GuiController() {
        try {
            dbManager = DAOManager.getInstance();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frameMenu, ex);
            System.exit(-1);
        }
    }

    public static GuiController getInstance() {
        if (guiController == null) {
            guiController = new GuiController();
            return guiController;
        }

        return guiController;
    }

    public DAOManager getDbManager() {
        return dbManager;
    }

    public void abrirMenu() {

        frameMenu = frameMenu == null ? new FrameMenu(this) : frameMenu;
        frameMenu.setVisible(true);
    }

    private JDialog abrirDialog(Frame parent, JDialog dialog, Class classe) {

        if (dialog == null) {
            try {
                dialog = (JDialog) classe.getConstructor(Frame.class, boolean.class, GuiController.class).newInstance(parent, true, this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frameMenu, "Erro ao abrir a janela " + classe.getName());
            }
        }

        dialog.setVisible(true);
        return dialog;
    }

    public void abrirCadastroTurma() {

        abrirDialog(frameMenu, dialogCadastroTurma, DialogCadastroTurma.class);
    }

    public void abrirListaTurma() {

        abrirDialog(frameMenu, dialogListaTurma, DialogListaTurma.class);
    }

    public void inserirTurmaLista(String descricao, String serieAno, int qtdAlunos, String turno, String data) {

        abrirListaTurma();
        dialogListaTurma.inserirLinhaTabelaTurma(descricao, serieAno, qtdAlunos, turno, data);
    }

    public void abrirCadastroDisciplina() {

        abrirDialog(frameMenu, dialogCadastroDisciplina, DialogCadastroDisciplina.class);
    }

    public void abrirListaDisciplina() {

        abrirDialog(frameMenu, dialogListaDisciplina, DialogListaDisciplina.class);
    }

    public void abrirCadastroAluno() {

        abrirDialog(frameMenu, dialogCadastroAluno, DialogCadastroAluno.class);
    }

    public void abrirListaAluno() {

        abrirDialog(frameMenu, dialogListaAluno, DialogListaAluno.class);
    }

    public void abrirCadastroAno() {

        abrirDialog(frameMenu, dialogCadastroAno, DialogCadastroAno.class);
    }

    public void abrirCadastroGrade() {

        abrirDialog(frameMenu, dialogCadastroGrade, DialogCadastroGrade.class);
    }

    public void abrirListaGrade() {

        abrirDialog(frameMenu, dialogListaGrade, DialogListaGrade.class);
    }

    public void showDisciplinasComboBox(JComboBox cbbDisciplina) {
        try {
            List<Disciplina> list = dbManager.listarDisciplinas();
            cbbDisciplina.setModel(new DefaultComboBoxModel(list.toArray()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frameMenu, "Erro ao carregar disciplinas!");
        }
    }

}

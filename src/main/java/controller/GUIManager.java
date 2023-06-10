package controller;

import domain.Aluno;
import domain.Disciplina;
import domain.Grade;
import domain.Turma;
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
import javax.swing.JOptionPane;

public class GUIManager {

    private static GUIManager guiController;

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
    Aluno alunSelec = null;
    Disciplina discSelec = null;
    Grade gradSelec = null;
    Turma turmSelec = null;
    boolean cadastro = true;

    private GUIManager() {
        try {
            dbManager = DAOManager.getInstance();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frameMenu, ex);
            System.exit(-1);
        }
    }

    public static GUIManager getInstance() {
        if (guiController == null) {
            guiController = new GUIManager();
            return guiController;
        }

        return guiController;
    }

    public DAOManager getDbManager() {
        return dbManager;
    }

    public boolean cadastrando() {
        return cadastro;
    }

    public Aluno getAlunSelec() {
        return alunSelec;
    }

    public Disciplina getDiscSelec() {
        return discSelec;
    }

    public Grade getGradSelec() {
        return gradSelec;
    }

    public Turma getTurmSelec() {
        return turmSelec;
    }

    public void abrirMenu() {

        frameMenu = frameMenu == null ? new FrameMenu(this) : frameMenu;
        frameMenu.setVisible(true);
    }

    private JDialog abrirDialog(Frame parent, JDialog dialog, Class classe) {

        if (dialog == null) {
            try {
                dialog = (JDialog) classe.getConstructor(Frame.class, boolean.class, GUIManager.class).newInstance(parent, true, this);
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

        DialogListaTurma dlt;
        dlt = (DialogListaTurma) abrirDialog(frameMenu, dialogListaTurma, DialogListaTurma.class);
        turmSelec = dlt.getTurmSelec();
        if (turmSelec != null) {
            cadastro = false;
            abrirCadastroTurma();
        }

        cadastro = true;
    }

    public void abrirCadastroDisciplina() {

        abrirDialog(frameMenu, dialogCadastroDisciplina, DialogCadastroDisciplina.class);
    }

    public void abrirListaDisciplina() {

        DialogListaDisciplina dld;
        dld = (DialogListaDisciplina) abrirDialog(frameMenu, dialogListaDisciplina, DialogListaDisciplina.class);
        discSelec = dld.getDiscSelec();
        if (discSelec != null) {
            cadastro = false;
            abrirCadastroDisciplina();
        }

        cadastro = true;
    }

    public void abrirCadastroAluno() {

        abrirDialog(frameMenu, dialogCadastroAluno, DialogCadastroAluno.class);
    }

    public void abrirListaAluno() {

        DialogListaAluno dla;
        dla = (DialogListaAluno) abrirDialog(frameMenu, dialogListaAluno, DialogListaAluno.class);
        alunSelec = dla.getAlunSelec();
        if (alunSelec != null) {
            cadastro = false;
            abrirCadastroAluno();
        }

        cadastro = true;
    }

    public void abrirCadastroAno() {

        abrirDialog(frameMenu, dialogCadastroAno, DialogCadastroAno.class);
    }

    public void abrirCadastroGrade() {

        abrirDialog(frameMenu, dialogCadastroGrade, DialogCadastroGrade.class);
    }//

    public void abrirListaGrade() {

        DialogListaGrade dlg;
        dlg = (DialogListaGrade) abrirDialog(frameMenu, dialogListaGrade, DialogListaGrade.class);
        gradSelec = dlg.getGradSelec();
        if (gradSelec != null) {
            cadastro = false;
            abrirCadastroGrade();
        }

        cadastro = true;
    }
}

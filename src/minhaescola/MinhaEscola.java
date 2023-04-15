/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minhaescola;

import domain.Professor;
import factoryMethod.AlunoFactory;
import factoryMethod.Pessoa;
import factoryMethod.PessoaFactory;
import factoryMethod.ProfessorFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class MinhaEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        PessoaFactory criaProfessor = new ProfessorFactory();
        Pessoa professor = criaProfessor.createPessoa();
        professor.setNome("Gustavo Ludovico");
        professor.setRg(5698423);
        professor.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("06/07/1989"));
        professor.exibirInformacoesPessoais();
        
        PessoaFactory criaAluno = new AlunoFactory();
        Pessoa aluno = criaAluno.createPessoa();
        aluno.setNome("Aluno Genérico");
        aluno.setRg(4587623);
        aluno.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2001"));
        aluno.exibirInformacoesPessoais();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordeatividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.SQLException;

/**
 * Classe que mantém a entidade Atividade no banco de dados
 *
 * @author ivanr
 */
public class AtividadeRepository {

    public void inserir(Atividade atividade) {
        
        try {
            Connection cx = ConnectionFactory.createConnection();
            PreparedStatement ps = cx.prepareStatement("insert into atividade (Descricao) values ('" + atividade.getDescricao() + "')");
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao executar insert no banco de dados");
        }
    }

    public List listar() {
        //TODO: implentar alistagem de atividade do banco de dados
        return null;
    }
}
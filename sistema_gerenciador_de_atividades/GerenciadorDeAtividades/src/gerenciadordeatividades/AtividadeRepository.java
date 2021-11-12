/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordeatividades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que mantém a entidade Atividade no banco de dados
 *
 * @author ivanr
 */
public class AtividadeRepository {

    public void inserir(Atividade a) {

        try {
            Connection cx = ConnectionFactory.createConnection();
            PreparedStatement ps = cx.prepareStatement("insert into atividade (Descricao) values (?)");
            ps.setString(1, a.getDescricao());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao executar insert no banco de dados");
        }
    }

    public List<Atividade> listar() {
        List<Atividade> atividadesLidasDoBanco = new ArrayList<Atividade>();

        try {
            Connection cx = ConnectionFactory.createConnection();
            PreparedStatement stmt = cx.prepareStatement("select * from atividade");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // criando o objeto Atividade
                Atividade a = new Atividade();
                a.setId((int) rs.getLong("Id"));
                a.setDescricao(rs.getString("Descricao"));
                atividadesLidasDoBanco.add(a);
            }
            rs.close();
            stmt.close();
            return atividadesLidasDoBanco;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

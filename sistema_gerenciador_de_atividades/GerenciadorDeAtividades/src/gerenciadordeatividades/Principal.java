package gerenciadordeatividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Jana
 */
public class Principal {

    
    public static void main(String[] args) {
        
        // Criar uma atividade qualquer
        Atividade a = new Atividade();        
        a.setDescricao("Lavar o carro");
        
        Atividade a2 = new Atividade();        
        a2.setDescricao("Fazer compras");        
        
        // Inserir atividade no banco de daodos
        AtividadeRepository ar = new AtividadeRepository();
        ar.inserir(a);
        ar.inserir(a2);
        
        List<Atividade> atividades = ar.listar();
        Atividade primeiraAtividade = atividades.get(0);
        System.out.println("Atividade descricao: " + primeiraAtividade.getDescricao());
             
        
      
    }
    
}

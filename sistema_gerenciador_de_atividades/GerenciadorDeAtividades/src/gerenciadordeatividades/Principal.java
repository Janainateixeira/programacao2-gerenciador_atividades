package gerenciadordeatividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
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
        
        //ar.inserir(a);
        //ar.inserir(a2);

        //listar atividades
        List<Atividade> lista = ar.listar();

        System.out.println("LISTA METODO JANA:");
        for (int i = 0; i < lista.size(); ++i) {
            Atividade at = null;
            at = lista.get(i);            
            System.out.println(at.getId() + " , " + at.getDescricao());
        }
        
        System.out.println("LISTA METODO IVAN:");
        for(Atividade at1:lista){
            String lds = at1.getId() + ", " + at1.getDescricao();
            System.out.println(lds);
        }
        
        List<String> listaDeStrings = new ArrayList<String>();
        
        listaDeStrings.add("JANA");
        listaDeStrings.add("IVAN");
        listaDeStrings.add("LEANDRO");
        
        for(String lds:listaDeStrings){
            System.out.println(lds);
        }
        
        

    }
}

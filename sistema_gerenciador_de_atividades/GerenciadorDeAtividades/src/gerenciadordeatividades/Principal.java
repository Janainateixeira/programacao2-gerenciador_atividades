/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeatividades;

/**
 *
 * @author Jana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criar uma atividade qualquer
        Atividade a = new Atividade();
        a.setId(1);
        a.setDescricao("Lavar o carro");
        
        
        // Inserir atividade no banco de daodos
        AtividadeRepositoty ar = new AtividadeRepositoty();
        ar.inserir(a);
    }
    
}

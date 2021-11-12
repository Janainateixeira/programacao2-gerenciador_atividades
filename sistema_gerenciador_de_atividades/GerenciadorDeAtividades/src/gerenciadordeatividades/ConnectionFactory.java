package gerenciadordeatividades;
/*trabalho:
interface que tenha um formulario principal,com dois botões. Um chama a listagem de tarefas.
o outro chama um formulário de cadastro de tarefas. 
A tabela tarefa pode ter um atributo só.Pode ter uma chave e um segundo atributo que é
a propria tarefa em si. No campo texto, simples, só para poder listar as tarefas e inserir
tarefas a partir da minha interface. Crie isso em classes, de forma organizada, como objeto. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jana
 */
public class ConnectionFactory {

    public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/atividades ";
        String user = "root";
        String password = "";     
       

        return DriverManager.getConnection(url, user, password);
    }
}
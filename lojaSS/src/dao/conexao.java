package dao;



import java.sql.*;
import javax.swing.JOptionPane;



public class conexao {
    public String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/bd_lojass";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
   
    // Passo 3: SOLICITAR A CONEXÃO COM
    //      O MYSQL (VERDADEIRO/FALSO)
    public boolean conecta()
    {
     boolean result = true;
     try
     {
     Class.forName(driver);
     conexao = DriverManager.getConnection(url,usuario,senha);
      }
      catch (ClassNotFoundException Driver)
      {
       JOptionPane.showMessageDialog(null,"Problema na Conexão com o MySql !!" + "\n" + Driver + "\n" + "Procurar o Suporte Técnico");
       result = false;
       System.exit(1);  // ENCERRAR
      }
      catch (SQLException Fonte)
      {
      JOptionPane.showMessageDialog(null,"Fonte de Dados do MySql não Localizada !!" + "\n" + Fonte + "\n" + "Contate o Suporte Técnico");
      result = false;
      System.exit(1);   // ENCERRAR
      }
      return result;        
    }
    
    
    // Passo 4: REALIZAR A CONEXÃO E
    //       COM O MYSQL
    public void executaSQL(String sql)
    {
    try 
       {statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        resultset = statement.executeQuery(sql);
       }
    catch (SQLException excecao)
     {
      JOptionPane.showMessageDialog(null,"Erro na Execução do Comando SQL" + "\n" + excecao + "\n" + "Contate o Suporte Técnico");
      System.exit(1);   // ENCERRAR
     }
  }
    
 // Passo 5: FECHAR A CONEXÃO COM MYSQL
  public void desconecta()
  {
  try 
  {
   conexao.close();
   JOptionPane.showMessageDialog(null,"Conexão Encerrada com o MySql");
   }
  catch (SQLException fecha)
  {
   JOptionPane.showMessageDialog(null,"Erro no Fechamento da Conexão com o MySql" + "\n" + fecha + "\n" + "Contate o Suporte Técnico");
   System.exit(1);   // ENCERRAR
  }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
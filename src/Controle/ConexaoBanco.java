
package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


    

public class ConexaoBanco {

    /*
    Trabalhar para evoluir as informações de cadastro em banco para cadastro de aplicativo, nao deixar fixo.
    */
    
        public Statement stm; // Pesquisa no banco de dados
        public ResultSet rst; // armazena o resultado da pesquisa
        public Connection conexao; //realiza a conexão com o banco de dados
       private String driver = "org.postgresql.Driver"; //identifica o serviço do banco de dados
       private String caminho = "jdbc:postgresql://localhost:5432/agile"; //Endereço onde esta alocado o do banco de dados
       private String usuario = "postgres";   
       private String senha =   "postgres";  
       String StatusConexao;

    public String getStatusConexao() {
        return StatusConexao;
    }

    public void setStatusConexao(String StatusConexao) {
        this.StatusConexao = StatusConexao;
    }
       
       
       public  void ConexaoBancoPostgreSQL(){
           //  Primeiro Passo: Incluir Biblioteca do Postgresql ao Projeto
           //Inicialmente acessa primeiro o "Try"
          try{
              System.setProperty("jdbc.Drivers",getDriver());
              /*
              Sem Encapsular
              conexao= DriverManager.getConnection(getCaminho(),getUsuario(),getSenha());
              */
              conexao= DriverManager.getConnection(getCaminho(),getUsuario(),getSenha());
              //setConexao(DriverManager.getConnection(getCaminho(),getUsuario(),getSenha()));
              //JOptionPane.showMessageDialog(null, "Conexão Realizada com Sucesso!");
              setStatusConexao("Conetado com Sucesso!");
              
           //Deu algo erro no "TRY", executamos o metodo Catch   
          }catch(SQLException erro){
              JOptionPane.showMessageDialog(null, "Erro ao Conectar-se ao Banco de Dados: \n"+erro);
              setStatusConexao("Problemas ao \nconectar!");
          }
    }
       
       public  void DesconectarBancoPostgreSQL(){
            try {
              conexao.close();
              //JOptionPane.showMessageDialog(null, "Conexão Encerrada com Sucesso!");
                
            } catch (SQLException errodesc) {
              JOptionPane.showMessageDialog(null, "Erro ao Conectar-se ao Banco de Dados: \n"+errodesc);
            }
       }
    
    public static void ConexaoBancoOracle(){
        
    }

    
    /*
    Abaixo o encapsulamento das variaveis criadas neste método
    */
    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public ResultSet getRst() {
        return rst;
    }

    public void setRst(ResultSet rst) {
        this.rst = rst;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

  }


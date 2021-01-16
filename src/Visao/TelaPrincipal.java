package Visao;
import Controle.ConexaoBanco;



public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoBanco con = new ConexaoBanco();

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreadeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadastroProduto = new javax.swing.JMenuItem();
        jmRelatorio = new javax.swing.JMenu();
        jmComunicacao = new javax.swing.JMenu();
        jmiEnvioEmail = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGILE - Facilitando de Forma Agil");

        javax.swing.GroupLayout jdpAreadeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreadeTrabalho);
        jdpAreadeTrabalho.setLayout(jdpAreadeTrabalhoLayout);
        jdpAreadeTrabalhoLayout.setHorizontalGroup(
            jdpAreadeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jdpAreadeTrabalhoLayout.setVerticalGroup(
            jdpAreadeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");
        jmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroActionPerformed(evt);
            }
        });
        jmCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmCadastroKeyPressed(evt);
            }
        });

        jmiCadastroProduto.setText("Produto");
        jmiCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroProdutoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadastroProduto);

        jMenuBar1.add(jmCadastro);

        jmRelatorio.setText("Relatórios");
        jMenuBar1.add(jmRelatorio);

        jmComunicacao.setText("Comunicação");
        jmComunicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmComunicacaoActionPerformed(evt);
            }
        });

        jmiEnvioEmail.setText("Email");
        jmiEnvioEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEnvioEmailActionPerformed(evt);
            }
        });
        jmComunicacao.add(jmiEnvioEmail);

        jMenuBar1.add(jmComunicacao);

        jMenu1.setText("Sair");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreadeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreadeTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroProdutoActionPerformed
        //Cria Objeto da tala de Cadastro de Produto
        CadastroProduto telaCadastro = new CadastroProduto();
        
        //Adicionar o objeto anterior a Area de Trabalho criada no aplicativo
        jdpAreadeTrabalho.add(telaCadastro);
        
        //Setando a Tela para criar abrir ao clicar no menu
        // Conteudo aprimorado do link:  http://thiagocury.eti.br/disciplinas/javaavancado/menuprincipal-com-jframe-jinternalframe.php
        
        telaCadastro.setVisible(true);
        
    }//GEN-LAST:event_jmiCadastroProdutoActionPerformed

    private void jmiEnvioEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEnvioEmailActionPerformed
        new Visao.Email().setVisible(true);
    }//GEN-LAST:event_jmiEnvioEmailActionPerformed

    private void jmComunicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmComunicacaoActionPerformed
        
        
    }//GEN-LAST:event_jmComunicacaoActionPerformed

    private void jmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmCadastroActionPerformed

    private void jmCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmCadastroKeyPressed
        
    }//GEN-LAST:event_jmCadastroKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpAreadeTrabalho;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmComunicacao;
    private javax.swing.JMenu jmRelatorio;
    private javax.swing.JMenuItem jmiCadastroProduto;
    private javax.swing.JMenuItem jmiEnvioEmail;
    // End of variables declaration//GEN-END:variables
}

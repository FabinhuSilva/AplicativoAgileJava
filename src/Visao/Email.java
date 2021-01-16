
package Visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabiano
 */
public class Email extends javax.swing.JFrame {

  
    public Email() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jpnEscopo = new javax.swing.JPanel();
        jlbEmitente = new javax.swing.JLabel();
        jtfEmitente = new javax.swing.JTextField();
        jlbSenhaEmail = new javax.swing.JLabel();
        jlDestinatario = new javax.swing.JLabel();
        jtfDestinatario = new javax.swing.JTextField();
        jlAssunto = new javax.swing.JLabel();
        jtfAssunto = new javax.swing.JTextField();
        jtfSenhaemail = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConteudo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbServicoEmail = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Envio de Email");

        jpnEscopo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbEmitente.setText("Emitente");

        jtfEmitente.setPreferredSize(new java.awt.Dimension(10, 19));

        jlbSenhaEmail.setText("Senha Email");

        jlDestinatario.setText("Destinatario");

        jtfDestinatario.setPreferredSize(new java.awt.Dimension(10, 19));

        jlAssunto.setText("Assunto");

        jtfAssunto.setPreferredSize(new java.awt.Dimension(10, 19));

        javax.swing.GroupLayout jpnEscopoLayout = new javax.swing.GroupLayout(jpnEscopo);
        jpnEscopo.setLayout(jpnEscopoLayout);
        jpnEscopoLayout.setHorizontalGroup(
            jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEscopoLayout.createSequentialGroup()
                .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEscopoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAssunto)
                            .addComponent(jlDestinatario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDestinatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAssunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEscopoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jlbEmitente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEmitente, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbSenhaEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSenhaemail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpnEscopoLayout.setVerticalGroup(
            jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEscopoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSenhaemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbEmitente)
                        .addComponent(jtfEmitente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbSenhaEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDestinatario)
                    .addComponent(jtfDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnEscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAssunto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAssunto))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtConteudo.setColumns(20);
        jtConteudo.setRows(5);
        jScrollPane1.setViewportView(jtConteudo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\JAVA\\Imagens Aplicativos\\envioemail.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Email Utilizado");

        jcbServicoEmail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GMAIL", "OUTLOOK", "BOL", " " }));
        jcbServicoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbServicoEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbServicoEmail, 0, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbServicoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpnEscopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(234, 234, 234))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnEscopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /*String a = String.valueOf(ComboBox.getSelectedItem());
          Caso nao funcione a captura na variavel 
        
        GMAIL - ok
        OUTLOOK - ok
        BOL
        */
        
        String opcao = (String) jcbServicoEmail.getSelectedItem();
        
        //Criar objeto para aplicar as configurações no email
        Controle.EnvioEmail email = new Controle.EnvioEmail();
       
        switch (opcao){
            case "GMAIL":
        email.setEmailEmitente(jtfEmitente.getText());
        email.setSenhaEmailEmitente(jtfSenhaemail.getText());
        email.setEmailDestinatario(jtfDestinatario.getText());
        email.setMensagemGmail(jtConteudo.getText());
        email.setAssunto(jtfAssunto.getText());
        JOptionPane.showMessageDialog(null, "Email Enviado com Sucesso");
        email.envioEmailGMAIL();
        limpacampos();
                break;
                
            case "OUTLOOK":
        email.setEmailEmitente(jtfEmitente.getText());
        email.setSenhaEmailEmitente(jtfSenhaemail.getText());
        email.setEmailDestinatario(jtfDestinatario.getText());
        email.setMensagemGmail(jtConteudo.getText());
        email.setAssunto(jtfAssunto.getText());
        //email.envioEmailOUTLOOK();
        JOptionPane.showMessageDialog(null, "Email Enviado com Sucesso");
                break;
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbServicoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbServicoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbServicoEmailActionPerformed

    public void  limpacampos()
        {
            /*
            lblDataHoraLogin.setText(datacompleta);
            Limpar Campos
            */
              
       jtfEmitente.setText(" ");
       jtfDestinatario.setText(" ");
       jtConteudo.setText(" ");
       jtfAssunto.setText(" ");
        
        /*
        envioEmail.jtfEmitente.setEnabled(!true);
        envioEmail.jtfDestinatario.setEnabled(!true);
        envioEmail.jtConteudo.setEnabled(!true);
        envioEmail.jtfAssunto.setEnabled(!true);
        */
        }
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcbServicoEmail;
    private javax.swing.JLabel jlAssunto;
    private javax.swing.JLabel jlDestinatario;
    private javax.swing.JLabel jlbEmitente;
    private javax.swing.JLabel jlbSenhaEmail;
    private javax.swing.JPanel jpnEscopo;
    public javax.swing.JTextArea jtConteudo;
    public javax.swing.JTextField jtfAssunto;
    public javax.swing.JTextField jtfDestinatario;
    public javax.swing.JTextField jtfEmitente;
    private javax.swing.JPasswordField jtfSenhaemail;
    // End of variables declaration//GEN-END:variables
}

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class adicionarMovimento extends javax.swing.JFrame {

    LinkedList<FinancasBanco> list = new LinkedList<>();
    CRUD crud = new CRUD();

    public adicionarMovimento() {
        initComponents();
        crud.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAdicionarMovimento = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelMovimento = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jTextFieldMovimento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAdicionarMovimento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelAdicionarMovimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdicionarMovimento.setText("Adicionar Movimento");

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoFocusLost(evt);
            }
        });

        jLabelMovimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMovimento.setText("Movimento:");

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descrição:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabelValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValor.setText("Valor:");

        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextFieldMovimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldMovimento.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldMovimento)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAdicionarMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMovimento)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelCodigo)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValor)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAdicionarMovimento)
                .addGap(36, 36, 36)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabelMovimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if (camposForamPreenchidos()) {
            String codigo = jTextFieldCodigo.getText();
            int codigoInt = Integer.parseInt(codigo);
            String movimento = jTextFieldMovimento.getText();
            String descricao = jTextAreaDescricao.getText();
            float valor = Float.parseFloat(jTextFieldValor.getText());
            int[] adicionarFinanca = crud.addFinanca(codigo, movimento, descricao, valor);
            if (adicionarFinanca[0] == 1) {
                jTextFieldCodigo.setText("");
                jTextFieldMovimento.setText("");
                jTextAreaDescricao.setText("");
                jTextFieldValor.setText("");
                JOptionPane.showMessageDialog(null, "Item " + codigo + " adicionado!");
                if (codigoInt >= 1 && codigoInt <= 99) {
                    list.add(new FinancasBanco(Integer.parseInt(codigo), movimento, descricao, valor, (valor - valor)));
                } else if (codigoInt >= 100) {
                    list.add(new FinancasBanco(Integer.parseInt(codigo), movimento, descricao, (valor - valor), valor));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item não adicionado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos!");
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoFocusLost
        int codigo = Integer.parseInt(jTextFieldCodigo.getText());
        if(jTextFieldCodigo.getText() == ""){
        } else if (codigo == 2){
            jTextFieldMovimento.setText("VENDA DE PRODUTO");
        } else if (codigo == 3){
            jTextFieldMovimento.setText("VENDAS DIVERSAS");
        } else if (codigo == 103){
            jTextFieldMovimento.setText("COMPRA DE ACESSÓRIOS");
        } else if (codigo == 104){
            jTextFieldMovimento.setText("COMPRA DE MATÉRIA PRIMA");
        } else if (codigo == 109){
            jTextFieldMovimento.setText("COMPRA DE TINTA");
        } else if (codigo == 156){
            jTextFieldMovimento.setText("INVESTIMENTO - VEÍCULOS");
        }
    }//GEN-LAST:event_jTextFieldCodigoFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adicionarMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adicionarMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adicionarMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adicionarMovimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adicionarMovimento().setVisible(true);
            }
        });
    }

    private boolean camposForamPreenchidos() {
        return !("".equals(jTextFieldCodigo.getText())
                && "".equals(jTextAreaDescricao.getText())
                && "".equals(jTextFieldValor.getText()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelAdicionarMovimento;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelMovimento;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldMovimento;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}

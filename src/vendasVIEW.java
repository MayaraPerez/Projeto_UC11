/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author mayara.perez
 */
public class vendasVIEW extends javax.swing.JFrame {
    
    private DefaultTableModel tabelaVendido;
	

	/**
	 * Creates new form vendasVIEW
	 */
	public vendasVIEW() {
		initComponents();
		setLocationRelativeTo(null);
		this.addTable("Vendido");
	}
        conectaDAO conexao = new conectaDAO();
	ProdutosDAO produtosDAO = new ProdutosDAO(conexao);
        
      private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblVendido = new javax.swing.JTable();
      bntVoltar = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("VENDA - Produtos Vendidos");
      setBackground(new java.awt.Color(153, 153, 153));

      jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      jPanel1.setMinimumSize(new java.awt.Dimension(90, 90));

      jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabelas de Vendas"));

      tblVendido.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null}
         },
         new String [] {
            "Id", "Nome", "Valor", "Status"
         }
      ));
      jScrollPane1.setViewportView(tblVendido);
      if (tblVendido.getColumnModel().getColumnCount() > 0) {
         tblVendido.getColumnModel().getColumn(0).setMinWidth(50);
         tblVendido.getColumnModel().getColumn(0).setPreferredWidth(50);
         tblVendido.getColumnModel().getColumn(0).setMaxWidth(50);
         tblVendido.getColumnModel().getColumn(1).setMinWidth(200);
         tblVendido.getColumnModel().getColumn(1).setPreferredWidth(200);
         tblVendido.getColumnModel().getColumn(1).setMaxWidth(200);
      }

      bntVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      bntVoltar.setText("Voltar");
      bntVoltar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntVoltarActionPerformed(evt);
         }
      });
            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bntVoltar)
            .addGap(22, 22, 22))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
            .addComponent(bntVoltar)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(27, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
      }
      
    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
		dispose();
   } 
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
                java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new vendasVIEW().setVisible(true);
			}
		});
	}
    
       // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntVoltar;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable tblVendido;
   // End of variables declaration//GEN-END:variables
    
   public void addTable(String statusVenda) {

        boolean status = conexao.connectDB();

        if (status == false) {

                JOptionPane.showMessageDialog(null,
                                  "Erro ao conectar com Banco de Dados",
                                  "Banco de Dados", JOptionPane.ERROR_MESSAGE);

        } else {

                List<ProdutosDTO> listProduto = produtosDAO.listaTableVendas(statusVenda);

                tabelaVendido = (DefaultTableModel) tblVendido.getModel();

                tblVendido.setRowSorter(new TableRowSorter(tabelaVendido));
                tabelaVendido.setNumRows(0);

                for (ProdutosDTO produto : listProduto){

                        Object[] obj = new Object[]{produto.getId(), produto.getNome(), produto.getValor(),
                                produto.getStatus()};

                        tabelaVendido.addRow(obj);

                }

                conexao.desconectarDB();
        }

}

}

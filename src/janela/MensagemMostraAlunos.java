package janela;

import controle.GerenciaAluno;
import entidade.Aluno;
import java.util.ArrayList;

/**
 *
 * @author Matheus Silva
 */
public class MensagemMostraAlunos extends javax.swing.JDialog {

	GerenciaAluno ga;
	
	public MensagemMostraAlunos(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}
	
	public MensagemMostraAlunos(java.awt.Frame parent, boolean modal, GerenciaAluno ga) {
		super(parent, modal);
		this.ga = ga;
		initComponents();
		mostraInformacoes();
	}
	
	MensagemMostraAlunos() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
	private void mostraInformacoes(){
		ArrayList<Aluno> alunos = ga.retornarTodos();
		
		// Limpando a tabela:
		for(int i = 0; i < alunos.size(); i++){
			tblAlunos.setValueAt("", i, 0);
			tblAlunos.setValueAt("", i, 1);
			tblAlunos.setValueAt("", i, 2);
		}
		
		for(int i = 0; i < alunos.size(); i++){
			tblAlunos.setValueAt(alunos.get(i).getNome(), i, 0);
			tblAlunos.setValueAt(alunos.get(i).getCpf(), i, 1);
			tblAlunos.setValueAt(alunos.get(i).getRa(), i, 2);
			
		}
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btnSair = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblAlunos = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                btnSair.setText("Sair");
                btnSair.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSairActionPerformed(evt);
                        }
                });

                tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null}
                        },
                        new String [] {
                                "Nome", "CPF", "RA"
                        }
                ));
                jScrollPane1.setViewportView(tblAlunos);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair)
                                .addGap(16, 16, 16))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
                this.dispose();
        }//GEN-LAST:event_btnSairActionPerformed

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
			java.util.logging.Logger.getLogger(MensagemMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MensagemMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MensagemMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MensagemMostraAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				MensagemMostraAlunos dialog = new MensagemMostraAlunos(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnSair;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblAlunos;
        // End of variables declaration//GEN-END:variables
}

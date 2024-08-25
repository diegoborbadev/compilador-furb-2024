
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.AbstractBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author steph
 */
public class interfac extends javax.swing.JFrame {

    private JFileChooser jFileChooser1;

    /**
     * Creates new form interfac
     */
    public interfac() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaStatus1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPaneMensagem = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaStatus = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNovo = new javax.swing.JMenu();
        jMenuabrir = new javax.swing.JMenu();
        jMenuSalvar = new javax.swing.JMenu();
        jMenuCopiar = new javax.swing.JMenu();
        jMenuColar = new javax.swing.JMenu();
        jMenuRecortar = new javax.swing.JMenu();
        jMenuCompilar = new javax.swing.JMenu();
        jMenuEquipe = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaStatus1.setColumns(20);
        jTextAreaStatus1.setRows(5);
        jTextAreaStatus1.setEnabled(false);
        jScrollPane5.setViewportView(jTextAreaStatus1);

        jButton1.setText("jButton1");

        jScrollPaneMensagem.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneMensagem.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextAreaStatus.setEditable(false);
        jTextAreaStatus.setColumns(20);
        jTextAreaStatus.setRows(5);
        jTextAreaStatus.setAutoscrolls(false);
        jTextAreaStatus.setEnabled(false);
        jScrollPane4.setViewportView(jTextAreaStatus);

        jScrollPaneMensagem.setViewportView(jScrollPane4);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new NumberedBorder());
        jScrollPane1.setViewportView(jTextArea1);

        jMenuBar1.setBorder(null);

        jMenuNovo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "novo [ctrl-n]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/novo.png"))); // NOI18N
        jMenuNovo.setText("novo [ctrl-n]");
        jMenuNovo.setToolTipText("novo");
        jMenuNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuNovo.setIconTextGap(5);
        jMenuNovo.setName("novo"); // NOI18N
        jMenuNovo.setPreferredSize(new java.awt.Dimension(100, 70));
        jMenuNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuNovo);

        jMenuabrir.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "abrir [ctrl-o]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abrir.png"))); // NOI18N
        jMenuabrir.setText("abrir [ctrl-o]");
        jMenuabrir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuabrir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuabrir.setMinimumSize(new java.awt.Dimension(80, 70));
        jMenuabrir.setName("novo"); // NOI18N
        jMenuabrir.setOpaque(true);
        jMenuabrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuabrirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuabrir);
        jMenuabrir.getAccessibleContext().setAccessibleName("                      novo");
        jMenuabrir.getAccessibleContext().setAccessibleDescription("novo");

        jMenuSalvar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "salvar [ctrl-s]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        jMenuSalvar.setText("salvar [ctrl-s]");
        jMenuSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuSalvar.setIconTextGap(5);
        jMenuSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalvar);

        jMenuCopiar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "copiar [ctrl-c]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/copiar.png"))); // NOI18N
        jMenuCopiar.setText("copiar [ctrl-c]");
        jMenuCopiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuCopiar.setIconTextGap(5);
        jMenuCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCopiarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCopiar);

        jMenuColar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "colar [ctrl-v]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colar.png"))); // NOI18N
        jMenuColar.setText("colar [ctrl-v]");
        jMenuColar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuColar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuColar.setIconTextGap(5);
        jMenuColar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuColarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuColar);

        jMenuRecortar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "recortar [ctrl-x]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recortar.png"))); // NOI18N
        jMenuRecortar.setText("recortar [ctrl-x]");
        jMenuRecortar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuRecortar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuRecortar.setIconTextGap(5);
        jMenuRecortar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRecortarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuRecortar);

        jMenuCompilar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "compilar [F7]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilar.png"))); // NOI18N
        jMenuCompilar.setText("compilar [F7]");
        jMenuCompilar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuCompilar.setIconTextGap(5);
        jMenuCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCompilarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCompilar);

        jMenuEquipe.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "equipe [F1]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipe.png"))); // NOI18N
        jMenuEquipe.setText("equipe [F1]");
        jMenuEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuEquipe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuEquipe.setIconTextGap(5);
        jMenuEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEquipeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuEquipe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(967, 967, 967)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneMensagem))
                        .addGap(18, 18, 18)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEquipeMouseClicked
        // TODO add your handling code here:
        jTextAreaStatus.setText("Equipe: Stephanie Possamai, Rian Gustavo Atanagildo e Diego Borba");

    }//GEN-LAST:event_jMenuEquipeMouseClicked

    private void jMenuCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCompilarMouseClicked
        // TODO add your handling code here:
        jTextAreaStatus.setText("compilação de programas ainda não foi implementada");
    }//GEN-LAST:event_jMenuCompilarMouseClicked

    private void jMenuNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNovoMouseClicked
        // TODO add your handling code here:
        jTextAreaStatus.setText("");
        jTextArea1.setText("");
        jTextAreaStatus1.setText("");
    }//GEN-LAST:event_jMenuNovoMouseClicked

    private void jMenuCopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCopiarMouseClicked
        // TODO add your handling code here:

        jTextArea1.copy();
    }//GEN-LAST:event_jMenuCopiarMouseClicked

    private void jMenuColarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuColarMouseClicked
        // TODO add your handling code here:
        jTextArea1.paste();
    }//GEN-LAST:event_jMenuColarMouseClicked

    private void jMenuRecortarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRecortarMouseClicked
        // TODO add your handling code here:
        jTextArea1.cut();
    }//GEN-LAST:event_jMenuRecortarMouseClicked

    private void jMenuabrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuabrirMouseClicked
        // TODO add your handling code here:
        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser1.setVisible(rootPaneCheckingEnabled);

        jFileChooser1.setCurrentDirectory(new File("."));

        //FileNameExtensionFilter filter = new FileNameExtensionFilter("txt");
        //jFileChooser1.setFileFilter(filter);
        int file = jFileChooser1.showOpenDialog(jTextArea1);

        if (jFileChooser1.isFileSelectionEnabled()) {
            jTextArea1.setText("" + jFileChooser1.getFileView());
            jTextAreaStatus.setText("");
            jTextAreaStatus1.setText("" + jFileChooser1.getSelectedFile());
        } else {

        }

        {

            

            ArrayList<String> dadosArray = new ArrayList<String>();
            try {
                FileReader arq = new FileReader(jFileChooser1.getSelectedFile());
                BufferedReader lerArq = new BufferedReader(arq);

                String linha = "";
                //while(!lerArq.readLine().isEmpty()){
                    linha = lerArq.readLine();
                    dadosArray.add(linha);
                //}
                // criar um loop para ler varias linhas
                
                
                // aqui ele printa ao contrario, arrumar essa parte
                while (linha != null) {
                    linha = lerArq.readLine();
                    if (linha != null) {
                        dadosArray.add(linha);
                    }
                }
                arq.close();
            } catch (IOException e) {
                System.err.println("Erro na leitura do arquivo" + e.getMessage());
            }
            

            jTextArea1.setText(dadosArray.toString());
        }


    }//GEN-LAST:event_jMenuabrirMouseClicked

    private void jMenuSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseClicked
        
        //File arquivo = new File("C:/Users/arquivo.txt");
        File arquivo = new File("C://Users//steph//OneDrive//Área de Trabalho//computação");
        
        
        try {
		arquivo.createNewFile();
                PrintWriter gravarArq = new PrintWriter(arquivo);

                gravarArq.printf(jTextArea1.getText());
                
                
                jTextAreaStatus.setText("Arquivo criado com sucesso!");
		
			
	} catch (IOException e) {
		e.printStackTrace();	
	}
    }//GEN-LAST:event_jMenuSalvarMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(interfac.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfac.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfac.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfac.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuColar;
    private javax.swing.JMenu jMenuCompilar;
    private javax.swing.JMenu jMenuCopiar;
    private javax.swing.JMenu jMenuEquipe;
    private javax.swing.JMenu jMenuNovo;
    private javax.swing.JMenu jMenuRecortar;
    private javax.swing.JMenu jMenuSalvar;
    private javax.swing.JMenu jMenuabrir;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneMensagem;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaStatus;
    private javax.swing.JTextArea jTextAreaStatus1;
    // End of variables declaration//GEN-END:variables
}

package main.java;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class interfac extends javax.swing.JFrame {

    private File currentFile;

    /**
     * Creates new form interfac
     */
    public interfac() {
        this.setTitle("Compilador");
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
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaStatus = new javax.swing.JTextArea();
        jScrollPaneMensagem = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        lbStatus = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(910, 600));
        setPreferredSize(new java.awt.Dimension(910, 600));

        jButton1.setText("jButton1");

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(37, 37));

        jTextAreaStatus.setEditable(false);
        jTextAreaStatus.setColumns(20);
        jTextAreaStatus.setRows(5);
        jTextAreaStatus.setAutoscrolls(false);
        jTextAreaStatus.setEnabled(false);
        jScrollPane4.setViewportView(jTextAreaStatus);

        jSplitPane1.setRightComponent(jScrollPane4);

        jScrollPaneMensagem.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneMensagem.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setMinimumSize(new java.awt.Dimension(850, 150));
        jScrollPaneMensagem.setViewportView(jTextArea2);

        jSplitPane1.setBottomComponent(jScrollPaneMensagem);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jSplitPane1.setLeftComponent(jScrollPane3);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(16);
        jTextArea3.setMinimumSize(new java.awt.Dimension(850, 250));
        jTextArea3.setBorder(new NumberedBorder());
        jScrollPane5.setViewportView(jTextArea3);

        jSplitPane1.setLeftComponent(jScrollPane5);

        lbStatus.setMinimumSize(new java.awt.Dimension(900, 25));

        jMenuBar1.setBorder(null);
        jMenuBar1.setMinimumSize(new java.awt.Dimension(900, 70));

        jMenuNovo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "novo [ctrl-n]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/novo.png"))); // NOI18N
        jMenuNovo.setText("novo [ctrl-n]");
        jMenuNovo.setToolTipText("novo");
        jMenuNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuNovo.setIconTextGap(5);
        jMenuNovo.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuNovo.setMinimumSize(new java.awt.Dimension(115, 46));
        jMenuNovo.setName("novo"); // NOI18N
        jMenuNovo.setPreferredSize(new java.awt.Dimension(100, 70));
        jMenuNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuNovo);

        jMenuabrir.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "abrir [ctrl-o]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/abrir.png"))); // NOI18N
        jMenuabrir.setText("abrir [ctrl-o]");
        jMenuabrir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuabrir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuabrir.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuabrir.setMinimumSize(new java.awt.Dimension(115, 46));
        jMenuabrir.setName("novo"); // NOI18N
        jMenuabrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuabrirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuabrir);
        jMenuabrir.getAccessibleContext().setAccessibleName("                      novo");
        jMenuabrir.getAccessibleContext().setAccessibleDescription("novo");

        jMenuSalvar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "salvar [ctrl-s]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/salvar.png"))); // NOI18N
        jMenuSalvar.setText("salvar [ctrl-s]");
        jMenuSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuSalvar.setIconTextGap(5);
        jMenuSalvar.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuSalvar.setMinimumSize(new java.awt.Dimension(115, 46));
        jMenuSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalvar);

        jMenuCopiar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "copiar [ctrl-c]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/copiar.png"))); // NOI18N
        jMenuCopiar.setText("copiar [ctrl-c]");
        jMenuCopiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuCopiar.setIconTextGap(5);
        jMenuCopiar.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuCopiar.setMinimumSize(new java.awt.Dimension(115, 46));
        jMenuCopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCopiarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCopiar);

        jMenuColar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "colar [ctrl-v]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/colar.png"))); // NOI18N
        jMenuColar.setText("colar [ctrl-v]");
        jMenuColar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuColar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuColar.setIconTextGap(5);
        jMenuColar.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuColar.setMinimumSize(new java.awt.Dimension(115, 46));
        jMenuColar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuColarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuColar);

        jMenuRecortar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "recortar [ctrl-x]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/recortar.png"))); // NOI18N
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
        jMenuCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/compilar.png"))); // NOI18N
        jMenuCompilar.setText("compilar [F7]");
        jMenuCompilar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuCompilar.setIconTextGap(5);
        jMenuCompilar.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuCompilar.setMinimumSize(new java.awt.Dimension(115, 46));
        jMenuCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCompilarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCompilar);

        jMenuEquipe.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "equipe [F1]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM));
        jMenuEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/equipe.png"))); // NOI18N
        jMenuEquipe.setText("equipe [F1]");
        jMenuEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuEquipe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenuEquipe.setIconTextGap(5);
        jMenuEquipe.setMaximumSize(new java.awt.Dimension(115, 32767));
        jMenuEquipe.setMinimumSize(new java.awt.Dimension(115, 46));
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
                    .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filler3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(535, 535, 535))))
        );
        setCurrentFile(null);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setCurrentFile(File file) {
        currentFile = file;
        lbStatus.setText(currentFile != null ? currentFile.getAbsolutePath() : "Novo Arquivo");
    }

    private void jMenuEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEquipeMouseClicked
        jTextArea2.setText("Equipe: Stephanie Possamai, Rian Gustavo Atanagildo e Diego Daniel Borba.");

    }//GEN-LAST:event_jMenuEquipeMouseClicked

    private void jMenuCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCompilarMouseClicked
        jTextArea2.setText("Compilação de programas ainda não foi implementada!");
    }//GEN-LAST:event_jMenuCompilarMouseClicked

    private void jMenuNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuNovoMouseClicked
        jTextAreaStatus.setText("");
        jTextArea3.setText("");
        setCurrentFile(null);
    }//GEN-LAST:event_jMenuNovoMouseClicked

    private void jMenuCopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCopiarMouseClicked
        jTextArea3.copy();
    }//GEN-LAST:event_jMenuCopiarMouseClicked

    private void jMenuColarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuColarMouseClicked
        jTextArea3.paste();
    }//GEN-LAST:event_jMenuColarMouseClicked

    private void jMenuRecortarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRecortarMouseClicked
        jTextArea3.cut();
    }//GEN-LAST:event_jMenuRecortarMouseClicked

    private JFileChooser instanceTextFileChooser(String dialogTitle) {
        JFileChooser jFileChooser = new javax.swing.JFileChooser();
        jFileChooser.setDialogTitle(dialogTitle);
        jFileChooser.setVisible(rootPaneCheckingEnabled);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        jFileChooser.setFileFilter(filter);

        return jFileChooser;
    }

    private void jMenuabrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuabrirMouseClicked
        JFileChooser jFileChooser1 = instanceTextFileChooser("Abrir");
        jFileChooser1.showOpenDialog(jTextArea3);

        if (jFileChooser1.isFileSelectionEnabled()) {
            jTextAreaStatus.setText("");
            setCurrentFile(jFileChooser1.getSelectedFile());
        }

        if (currentFile != null) {
            StringBuilder textoEditor = new StringBuilder();
            try {
                FileReader arq = new FileReader(currentFile);
                BufferedReader lerArq = new BufferedReader(arq);

                String linha;
                while ((linha = lerArq.readLine()) != null) {
                    if (!textoEditor.isEmpty()) textoEditor.append(System.lineSeparator());
                    textoEditor.append(linha);
                }

                lerArq.close();
                arq.close();
            } catch (IOException e) {
                System.err.println("Erro na leitura do arquivo" + e.getMessage());
            }

            jTextArea3.setText(textoEditor.toString());
        }
    }//GEN-LAST:event_jMenuabrirMouseClicked

    private void saveFile() {
        try (FileWriter fileWriter = new FileWriter(currentFile)) {
            fileWriter.write(jTextArea3.getText());
            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jMenuSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseClicked
        if (currentFile == null) {
            JFileChooser fileChooser = instanceTextFileChooser("Salvar como");
            int userSelection = fileChooser.showSaveDialog(this);
            if (!(userSelection == JFileChooser.APPROVE_OPTION)) return;
            setCurrentFile(fileChooser.getSelectedFile());
        }
        saveFile();
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
        java.awt.EventQueue.invokeLater(() -> new interfac().setVisible(true));
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneMensagem;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextAreaStatus;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
package ec.edu.espe.accountingagenda.view;

import ec.edu.espe.accountingagenda.controller.Conection;
import ec.edu.espe.accountingagenda.controller.Print;
import ec.edu.espe.accountingagenda.model.Note;
import ec.edu.espe.accountingagenda.utils.MongoDBConnection;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import org.bson.Document;

/**
 *
 * @author Edison Ludeña, BugBuster, DCCO-ESPE
 */
public class FrmNote extends javax.swing.JFrame {

    private ArrayList<Note> savedNotes;
    private MongoDBConnection mongoDBConnection;

    private MongoDBConnection singletonMongoDBConnection;
    private Conection singletonConection;

    /**
     * Creates new form FrmNota
     */
    public FrmNote() {
        initComponents();
        setupFontComboBox();
        setupFontSizeChangeListener();
        mongoDBConnection = new MongoDBConnection();
        mongoDBConnection.connection("Notes");
    }

    public FrmNote(ArrayList<Note> savedNotes) {
        initComponents();
        this.savedNotes = savedNotes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnNegrita = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        btnItalic = new javax.swing.JButton();
        btnUnderline = new javax.swing.JButton();
        btnFontSize = new javax.swing.JSpinner();
        BtnFontComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaContent = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniPrint = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("NOTA");

        jLabel2.setText("Titulo:");

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        jLabel3.setText("Contenido:");

        btnCancel.setText("Regresar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnNegrita.setText("Negrita");
        btnNegrita.setFocusable(false);
        btnNegrita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNegrita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegritaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNegrita);

        btnColor.setText("Color");
        btnColor.setFocusable(false);
        btnColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        jToolBar1.add(btnColor);

        btnItalic.setText("Italica");
        btnItalic.setFocusable(false);
        btnItalic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnItalic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalicActionPerformed(evt);
            }
        });
        jToolBar1.add(btnItalic);

        btnUnderline.setText("Subrayar");
        btnUnderline.setFocusable(false);
        btnUnderline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUnderline.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUnderline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnderlineActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUnderline);
        jToolBar1.add(btnFontSize);

        BtnFontComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BtnFontComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFontComboBoxActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnFontComboBox);

        jScrollPane1.setViewportView(txaContent);

        jMenu1.setText("Imprimir nota");

        mniPrint.setText("Imprimir");
        mniPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPrintActionPerformed(evt);
            }
        });
        jMenu1.add(mniPrint);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        FrmNoteMenu frmNoteMenu = new FrmNoteMenu();
        frmNoteMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        displaySavedData();
        FrmNoteMenu frmNoteMenu = new FrmNoteMenu(savedNotes);
        frmNoteMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private boolean isBold = false;

    private void btnNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegritaActionPerformed
        bold();
    }//GEN-LAST:event_btnNegritaActionPerformed

    private boolean isUnderline = false;

    private void btnUnderlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnderlineActionPerformed
        underline();
    }//GEN-LAST:event_btnUnderlineActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        color();
    }//GEN-LAST:event_btnColorActionPerformed

    private boolean isItalic = false;

    private void btnItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalicActionPerformed
        italic();
    }//GEN-LAST:event_btnItalicActionPerformed

    private void BtnFontComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFontComboBoxActionPerformed
        JComboBox<String> comboBox = (JComboBox<String>) evt.getSource();
        String selectedFont = (String) comboBox.getSelectedItem();
        Font currentFont = txaContent.getFont();
        Font newFont = new Font(selectedFont, currentFont.getStyle(), currentFont.getSize());
        txaContent.setFont(newFont);
    }//GEN-LAST:event_BtnFontComboBoxActionPerformed

    private void mniPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPrintActionPerformed
        Print print = new Print();
        String title = txtTitle.getText();
        String content = txaContent.getText();
        print.printNote(title, content, this);
    }//GEN-LAST:event_mniPrintActionPerformed

    private void displaySavedData() {
        initComponents();
        setupFontComboBox();
        setupFontSizeChangeListener();
        mongoDBConnection = new MongoDBConnection();
        mongoDBConnection.connection("Notes");
    }

    private void bold() {
        StyledDocument doc = txaContent.getStyledDocument();
        int start = txaContent.getSelectionStart();
        int end = txaContent.getSelectionEnd();

        if (start != end) {
            if (!isBold) {
                StyleContext styleContext = StyleContext.getDefaultStyleContext();
                AttributeSet attrs = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Bold, true);
                doc.setCharacterAttributes(start, end - start, attrs, false);
                isBold = true;
            } else {
                StyleContext styleContext = StyleContext.getDefaultStyleContext();
                AttributeSet attrs = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Bold, false);
                doc.setCharacterAttributes(start, end - start, attrs, true);
                isBold = false;
            }
        }
    }

    private void underline() {
        StyledDocument doc = txaContent.getStyledDocument();
        int start = txaContent.getSelectionStart();
        int end = txaContent.getSelectionEnd();

        if (start != end) {
            if (!isUnderline) {
                StyleContext sc = StyleContext.getDefaultStyleContext();
                AttributeSet attrs = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Underline, true);
                doc.setCharacterAttributes(start, end - start, attrs, false);
                isUnderline = true;
            } else {
                StyleContext sc = StyleContext.getDefaultStyleContext();
                AttributeSet attrs = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Underline, false);
                doc.setCharacterAttributes(start, end - start, attrs, true);
                isUnderline = false;
            }
        }
    }

    private void color() {
        Color selectedColor = JColorChooser.showDialog(this, "Seleccionar color de fuente", Color.BLACK);
        if (selectedColor != null) {
            StyledDocument doc = txaContent.getStyledDocument();
            StyleContext sc = StyleContext.getDefaultStyleContext();
            AttributeSet attrs = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, selectedColor);
            int start = txaContent.getSelectionStart();
            int end = txaContent.getSelectionEnd();
            doc.setCharacterAttributes(start, end - start, attrs, false);
        }
    }

    private void italic() {
        StyledDocument doc = txaContent.getStyledDocument();
        int start = txaContent.getSelectionStart();
        int end = txaContent.getSelectionEnd();

        if (start != end) {
            if (!isItalic) {
                StyleContext sc = StyleContext.getDefaultStyleContext();
                AttributeSet attrs = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Italic, true);
                doc.setCharacterAttributes(start, end - start, attrs, false);
                isItalic = true;
            } else {
                StyleContext sc = StyleContext.getDefaultStyleContext();
                AttributeSet attrs = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Italic, false);
                doc.setCharacterAttributes(start, end - start, attrs, true);
                isItalic = false;
            }
        }
    }

    private void setupFontSizeChangeListener() {
        SpinnerNumberModel fontSizeModel = new SpinnerNumberModel(12, 6, 72, 1);
        btnFontSize.setModel(fontSizeModel);
        btnFontSize.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                int fontSize = (int) btnFontSize.getValue();
                StyledDocument doc = txaContent.getStyledDocument();
                int start = txaContent.getSelectionStart();
                int end = txaContent.getSelectionEnd();

                if (start != end) {
                    StyleContext styleContext = StyleContext.getDefaultStyleContext();
                    AttributeSet attrs = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.FontSize, fontSize);
                    doc.setCharacterAttributes(start, end - start, attrs, false);
                }
            }
        });
    }

    private void setupFontComboBox() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        BtnFontComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(fontNames));
    }

    public void setNoteForEditing(Note note) {
        txtTitle.setText(note.getTitle());
        txaContent.setText(note.getContent());
        setVisible(true);
    }

    public void setSavedNotes(ArrayList<Note> savedNotes) {
        this.savedNotes = savedNotes;
    }

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
            java.util.logging.Logger.getLogger(FrmNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BtnFontComboBox;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnColor;
    private javax.swing.JSpinner btnFontSize;
    private javax.swing.JButton btnItalic;
    private javax.swing.JButton btnNegrita;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUnderline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mniPrint;
    private javax.swing.JTextPane txaContent;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}

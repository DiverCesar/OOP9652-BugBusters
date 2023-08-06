package ec.edu.espe.accountingagenda.view;

import ec.edu.espe.accountingagenda.controller.Print;
import ec.edu.espe.accountingagenda.model.Note;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class FrmNoteMenuGuest extends javax.swing.JFrame {
 
    private ArrayList<Note> savedNotes;
    public FrmNoteMenuGuest(ArrayList<Note> savedNotes) {
        initComponents();
        this.savedNotes = savedNotes;
    }
    public ArrayList<Note> getSavedNotes() {
    return savedNotes;
}

    public FrmNoteMenuGuest() {
        initComponents();
        savedNotes = new ArrayList<>();
        JButton btnPrint = new javax.swing.JButton();
        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPrintActionPerformed(evt);
        }

    });
    }
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {
    Print print = new Print();
    ArrayList<Note> savedNotes = getSavedNotes();

    for (Note note : savedNotes) {
        print.printNote(note.getTitle(), note.getContent(), FrmNoteMenuGuest.this);
    }
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
        btnCreateNote = new javax.swing.JButton();
        btnShowNote = new javax.swing.JButton();
        btnEditNote = new javax.swing.JButton();
        btnDeleteNote = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("== MENÚ DE NOTAS ==");

        jLabel2.setText("SELECCIONE LA ACCIÓN QUE DESEA REALIZAR");

        btnCreateNote.setText("Crear Nota");
        btnCreateNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNoteActionPerformed(evt);
            }
        });

        btnShowNote.setText("Ver Nota");
        btnShowNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNoteActionPerformed(evt);
            }
        });

        btnEditNote.setText("Editar Nota");
        btnEditNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNoteActionPerformed(evt);
            }
        });

        btnDeleteNote.setText("Borrar Nota");
        btnDeleteNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNoteActionPerformed(evt);
            }
        });

        btnBack.setText("Cerrar Sesión");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteNote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditNote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowNote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteNote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNoteActionPerformed
        FrmNote frmNote = new FrmNote(savedNotes);
        frmNote.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateNoteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrmLogInGuest frmLogIn = new FrmLogInGuest();
        frmLogIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNoteActionPerformed
        if (editNote()) return;
    }//GEN-LAST:event_btnEditNoteActionPerformed

    private void btnDeleteNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNoteActionPerformed
        if (deleteNote()) return;
    }//GEN-LAST:event_btnDeleteNoteActionPerformed

    private void btnShowNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNoteActionPerformed
        if (showNote()) return;
    }//GEN-LAST:event_btnShowNoteActionPerformed

    public boolean showNote() throws HeadlessException {
        if (savedNotes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay notas guardadas", "Ver Nota",
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        String[] columnNames = {"Título", "Contenido"};
        Object[][] rowData = new Object[savedNotes.size()][2];
        for (int i = 0; i < savedNotes.size(); i++) {
            rowData[i][0] = savedNotes.get(i).getTitle();
            rowData[i][1] = savedNotes.get(i).getContent();
        }
        JTable table = new JTable(rowData, columnNames);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(400);
        JButton printButton = new JButton("Imprimir");
        printButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PrinterJob printerJob = PrinterJob.getPrinterJob();
                printerJob.setPrintable(table.getPrintable(JTable.PrintMode.FIT_WIDTH, null, null));
                
                if (printerJob.printDialog()) {
                    try {
                        printerJob.print();
                    } catch (PrinterException ex) {
                        JOptionPane.showMessageDialog(FrmNoteMenuGuest.this, "Error al imprimir", "Imprimir", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(printButton);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        JOptionPane.showMessageDialog(this, panel, "Lista de Notas", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }

    public boolean editNote() throws HeadlessException {
        if (savedNotes == null || savedNotes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay notas guardadas", "Editar Nota",
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        String[] noteTitles = new String[savedNotes.size()];
        for (int i = 0; i < savedNotes.size(); i++) {
            noteTitles[i] = savedNotes.get(i).getTitle();
        }   String selectedNoteTitle = (String) JOptionPane.showInputDialog(this, "Selecciona la nota a editar:",
                "Editar Nota", JOptionPane.QUESTION_MESSAGE, null, noteTitles, noteTitles[0]);
        if (selectedNoteTitle != null) {
            Note selectedNote = null;
            for (Note note : savedNotes) {
                if (note.getTitle().equals(selectedNoteTitle)) {
                    selectedNote = note;
                    break;
                }
            }
            
            FrmNote frmNote = new FrmNote(savedNotes);
            frmNote.setNoteForEditing(selectedNote);
            frmNote.setVisible(true);
            dispose();
        }   return false;
    }
    
    public boolean deleteNote() throws HeadlessException {
        if (savedNotes == null || savedNotes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay notas guardadas", "Borrar Nota",
                    JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        String[] noteTitles = new String[savedNotes.size()];
        for (int i = 0; i < savedNotes.size(); i++) {
            noteTitles[i] = savedNotes.get(i).getTitle();
        }
        String selectedNoteTitle = (String) JOptionPane.showInputDialog(this, "Selecciona la nota a borrar:",
                "Borrar Nota", JOptionPane.QUESTION_MESSAGE, null, noteTitles, noteTitles[0]);
        if (selectedNoteTitle != null) {
            int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres borrar la nota seleccionada?",
                    "Confirmar Borrado", JOptionPane.YES_NO_OPTION);
            
            if (option == JOptionPane.YES_OPTION) {
                Note selectedNote = null;
                for (Note note : savedNotes) {
                    if (note.getTitle().equals(selectedNoteTitle)) {
                        selectedNote = note;
                        break;
                    }
                }
                
                savedNotes.remove(selectedNote);
                JOptionPane.showMessageDialog(this, "Nota borrada exitosamente", "Borrar Nota",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(FrmNoteMenuGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNoteMenuGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNoteMenuGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNoteMenuGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNoteMenuGuest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNote;
    private javax.swing.JButton btnDeleteNote;
    private javax.swing.JButton btnEditNote;
    private javax.swing.JButton btnShowNote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

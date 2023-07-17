package ec.edu.espe.accountingagenda.controller;

import java.awt.Component;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Print {
    
    public void printTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();

        if (rowCount == 0) {
            int confirm = JOptionPane.showConfirmDialog(null, "La tabla está vacía. ¿Desea imprimir de todos modos?", "Tabla vacía", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }
        }

        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            if (job.printDialog()) {
                Printable printable = table.getPrintable(JTable.PrintMode.FIT_WIDTH, null, null);
                job.setPrintable(printable);
                job.print();
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error al imprimir la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void printNote(String title, String content, Component parentComponent) {
        if (title.isEmpty() && content.isEmpty()) {
            JOptionPane.showMessageDialog(parentComponent, "No se puede imprimir una nota vacía.", "Error de impresión", JOptionPane.ERROR_MESSAGE);
            return;
        }
        StringBuilder message = new StringBuilder();
        message.append("Título: ").append(title).append("\n");
        message.append("Contenido: ").append(content).append("\n");

        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable((graphics, pageFormat, pageIndex) -> {
            if (pageIndex > 0) {
                return Printable.NO_SUCH_PAGE;
            }

            graphics.drawString(content, 50, 50);

            return Printable.PAGE_EXISTS;
        });

        if (printerJob.printDialog()) {
            try {
                printerJob.print();
                JOptionPane.showMessageDialog(parentComponent, "La nota se ha impreso correctamente.", "Impresión exitosa", JOptionPane.INFORMATION_MESSAGE);
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(parentComponent, "Error al imprimir la nota.", "Error de impresión", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }


}

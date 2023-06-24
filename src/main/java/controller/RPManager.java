/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class RPManager {

    public RPManager() {
    }

    public void getListRel(List list, String name) {
        // Path
        InputStream rel = getClass().getResourceAsStream("../reports/" + name);

        // Params
        Map params = new HashMap();

        // Load Report
        JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(list);
        try {
            JasperPrint print;
            print = JasperFillManager.fillReport(rel, params, data);

            if (print.getPages().size() > 0) {
                JasperViewer jrViewer = new JasperViewer(print, true);
                jrViewer.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Relatório de aniversariantes vazio!");
            }
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim!");
        }
    }
}

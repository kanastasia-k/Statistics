/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import javax.swing.*;

public class AppView extends JFrame{
    private final JButton importButton, calculationButton, exportButton, exitButton;
    private final JTextArea outputArea;

    public AppView() {        
        setTitle("Программа расчета статичстических данных");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        importButton = new JButton("Импорт данных");
        calculationButton = new JButton("Обработка данных");
        exportButton = new JButton("Экспорт данных");
        exitButton = new JButton("Выход");
        outputArea = new JTextArea();

        JPanel panel = new JPanel();
        panel.add(importButton);
        panel.add(calculationButton);
        panel.add(exportButton);
        panel.add(exitButton);
        panel.add(new JLabel("Введите надежность для расчета доверительного интервала:"));
//        panel.add(confidenceLevelField);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        setVisible(true);
    }
    public JButton getImportButton() {return importButton;}
    public JButton getCalculationButton() {return calculationButton;}
    public JButton getExportButton() {return exportButton;}
    public JButton getExitButton() {return exitButton;}
    public JTextArea getOutputArea() {return outputArea;}
//    public JTextField getConfidenceLevelField() {return confidenceLevelField;}
    
    
}

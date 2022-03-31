package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import static java.lang.Thread.sleep;

public class main extends javax.swing.JFrame {

    MotorAnimacion ma;
    PanelJuego pj = new PanelJuego();
    JPanel background = new JPanel();

    public main() {
        initComponents();
        setLocationRelativeTo(null);


        pj.setOpaque(false);
        pj.setBounds(10, 10, 800, 600);
        add(pj);

        background.setBackground(Color.GRAY);
        background.setSize(800, 600);
        background.setBounds(10, 10, 800, 600);
        add(background);

        ma = new MotorAnimacion(pj);
        ma.iniciar();

        pack();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 660));
        setResizable(true);
        setSize(new java.awt.Dimension(840, 640));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {

                formKeyPressed(evt);


            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 840, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void formKeyPressed(java.awt.event.KeyEvent evt) {

//        if(evt.getKeyCode() == KeyEvent.VK_SPACE){
//            pj.actualizaPosDino(0,0);
//            pj.repaint();
//        }

        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
             //SALTAR
        }
    }

        public static void main (String args[]){
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
                java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new main().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify
        // End of variables declaration
    }

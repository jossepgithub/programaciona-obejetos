/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.localdeadopcion.lda;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author pc
 */
public class LDAMain extends JFrame {

    JTabbedPane jtpane;
    JScrollPane scrollPane;
    ConfigurableApplicationContext io;

    public LDAMain() {
        this.setTitle("SystemMain@DMP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new Dimension(screenSize.width, (screenSize.height)
                - 36));
        MainPersona mc = new MainPersona();
        //mc.setContexto(ctx);
        mc.setPreferredSize(new Dimension(1024, 600));
        jtpane = new JTabbedPane();
        jtpane.setName("Cliente");
        jtpane.add(mc);
        scrollPane = new JScrollPane(mc);
        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jtpane.add(scrollPane, "Cliente");
        this.add(BorderLayout.CENTER, jtpane);
        this.validate();
        this.repaint();
    }

    public void setContexto(ConfigurableApplicationContext ctx) {
        this.io = io;
    }

    public static void main(String[] args) {
        new LDAMain().setVisible(true);
    }
}

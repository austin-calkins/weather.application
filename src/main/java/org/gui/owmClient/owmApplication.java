package org.gui.owmClient;


import org.bitpipeline.lib.owm.OwmClient;

import javax.swing.*;

public class owmApplication extends JFrame{

    private JFrame mainWindow;
    private JFrame settingsWindow;

    public owmApplication(){
        initUI();
    }

    public void initUI(){
        //sets up the main window and embedds the mainWindow Frame inside
        setTitle("Weather Application");
        setSize(600,600);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar topMenu = new JMenuBar();
        JMenu Pages = new JMenu("Pages");
        Pages.add(new JMenuItem("Main Page"));
        Pages.add(new JMenuItem("Settings Page"));
        topMenu.add(Pages);
        //add(topMenu);
        this.setJMenuBar(topMenu);

        //remove once you know what is going on
    }

    public static void main(String[] args)throws Exception{
        //System.out.println("hello world");
        owmApplication app = new owmApplication();
       // app.setLayout(null);
        app.setVisible(true);

    }
}

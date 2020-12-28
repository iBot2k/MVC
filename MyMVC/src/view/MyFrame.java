package view;


import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel myPanel;
    public MyFrame(MyPanel panel){
        this.myPanel=panel;
        add(panel);
        setSize(800,600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

package Controller;

import view.MyFrame;
import view.MyPanel;

public class Main {
    public static void main(String[] args) {
        MyPanel myPanel=new MyPanel();
        MyFrame myFrame=new MyFrame(myPanel);
    }
}

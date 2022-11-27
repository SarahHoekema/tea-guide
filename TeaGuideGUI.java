//Sarah Hoekema
//CS 145
//Interactive Tea Guide

import javax.swing.*;
import java.awt.*;
import java.util.*;

//TeaGuideGUI.java creates a Graphic User Interface using the information from the TeaEntry
//ArrayList, various images, and selected colors.
public class TeaGuideGUI {
    //fields
    private ArrayList<TeaEntry> teaInformation;
    private JPanel panel;

    //constructor
    public TeaGuideGUI(ArrayList<TeaEntry> teaInformation) {
        this.teaInformation = teaInformation;

        //construct frame and panel
        JFrame frame = new JFrame();
        panel = new JPanel();

        //set frame size
        frame.setSize(900, 400);
        frame.setMaximumSize(new Dimension(900, 400));
        frame.setMinimumSize(new Dimension(900, 400));

        //set panel border, background, and layout
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setBackground(new Color(217, 196, 166));
        panel.setLayout(null);

        //add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        //set close operation to exiting on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set title of frame
        frame.setTitle("Tea Guide");
        frame.pack();

        //place components on the panel
        placeComponents();

        //make the frame visible
        frame.setVisible(true);
    }

    //place the components, consisting of a title, description text pane, and 7 buttons,
    //on the panel
    private void placeComponents(){
        //construct a label for the title, set its bounds, center it, and add to panel
        JLabel encyclopediaTitle = new JLabel("A Simple Guide to Tea");
        encyclopediaTitle.setBounds(350, 10, 200, 20);
        encyclopediaTitle.setHorizontalAlignment(AbstractButton.CENTER);
        panel.add(encyclopediaTitle);

        //construct the tea description text pane, set its bounds, set background color,
        //set base text to empty String, and add to panel
        JTextPane description = new JTextPane();
        description.setBounds(210, 45, 650, 295);
        description.setBackground(new Color(189, 138, 107));
        description.setText("");
        panel.add(description);

        //construct first entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry1 = new JButton(setButtonIcon(new ImageIcon("BlackTea.png")));
        entry1.setToolTipText(teaInformation.get(0).getTeaName());
        entry1.setBounds(10, 45, 180, 30);
        entry1.addActionListener(e -> description.setText(
                teaInformation.get(0).getTeaDescription()));
        panel.add(entry1);

        //construct second entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry2 = new JButton(setButtonIcon(new ImageIcon("GreenTea.png")));
        entry2.setToolTipText(teaInformation.get(1).getTeaName());
        entry2.setBounds(10, 85, 180, 30);
        entry2.addActionListener(e -> description.setText(
                teaInformation.get(1).getTeaDescription()));
        panel.add(entry2);

        //construct third entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry3 = new JButton(setButtonIcon(new ImageIcon("OolongTea.png")));
        entry3.setToolTipText(teaInformation.get(2).getTeaName());
        entry3.setBounds(10, 125, 180, 30);
        entry3.addActionListener(e -> description.setText(
                teaInformation.get(2).getTeaDescription()));
        panel.add(entry3);

        //construct fourth entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry4 = new JButton(setButtonIcon(new ImageIcon("WhiteTea.png")));
        entry4.setToolTipText(teaInformation.get(3).getTeaName());
        entry4.setBounds(10, 165, 180, 30);
        entry4.addActionListener(e -> description.setText(
                teaInformation.get(3).getTeaDescription()));
        panel.add(entry4);

        //construct fifth entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry5 = new JButton(setButtonIcon(new ImageIcon("Pu-erh.png")));
        entry5.setToolTipText(teaInformation.get(4).getTeaName());
        entry5.setBounds(10, 205, 180, 30);
        entry5.addActionListener(e -> description.setText(
                teaInformation.get(4).getTeaDescription()));
        panel.add(entry5);

        //construct sixth entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry6 = new JButton(setButtonIcon(new ImageIcon("PurpleTea.png")));
        entry6.setToolTipText(teaInformation.get(5).getTeaName());
        entry6.setBounds(10, 245, 180, 30);
        entry6.addActionListener(e -> description.setText(
                teaInformation.get(5).getTeaDescription()));
        panel.add(entry6);

        //construct seventh entry button, set its bounds, set the action on click, and
        //add to panel
        JButton entry7 = new JButton(setButtonIcon(new ImageIcon("HerbalTea.png")));
        entry7.setToolTipText(teaInformation.get(6).getTeaName());
        entry7.setBounds(10, 285, 180, 30);
        entry7.addActionListener(e -> description.setText(
                teaInformation.get(6).getTeaDescription()));
        panel.add(entry7);
    }

    //accepts an ImageIcon to scale and returns a new ImageIcon
    //scales the ImageIcon using an Image so that the button ImageIcon is the correct size
    public ImageIcon setButtonIcon(ImageIcon icon){
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(190, 30, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }
}

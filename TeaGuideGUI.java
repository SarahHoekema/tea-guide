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
    private JFrame frame;
    private JPanel panel;
    private JTextPane description;

    //constructor
    public TeaGuideGUI(ArrayList<TeaEntry> teaInformation) {
        this.teaInformation = teaInformation;

        //create frame
        createFrame();

        //place components on the panel
        placeComponents();

        //make the frame visible
        frame.setVisible(true);
    }

    //create the frame for the tea guide
    public void createFrame(){
        //construct frame
        frame = new JFrame();

        //set frame size
        frame.setSize(900, 400);
        frame.setMaximumSize(new Dimension(900, 400));
        frame.setMinimumSize(new Dimension(900, 400));

        //set close operation to exiting on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sizes the frame to preferred size
        frame.pack();

        //create panel
        createPanel();
    }

    //create the panel for the tea guide
    public void createPanel(){
        //construct panel
        panel = new JPanel();

        //set panel border, background, and layout
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setBackground(new Color(217, 196, 166));
        panel.setLayout(null);

        //add panel to frame
        frame.add(panel, BorderLayout.CENTER);
    }

    //place the components, consisting of a title, description text pane, and 7 buttons,
    //on the panel
    private void placeComponents(){
        placeTitle();
        placeDescription();
        placeEntry1();
        placeEntry2();
        placeEntry3();
        placeEntry4();
        placeEntry5();
        placeEntry6();
        placeEntry7();
    }

    //construct and place a title on the panel
    public void placeTitle(){
        //construct a label for the title, set its bounds, center it
        JLabel encyclopediaTitle = new JLabel("A Simple Guide to Tea");
        encyclopediaTitle.setBounds(350, 10, 200, 20);
        encyclopediaTitle.setHorizontalAlignment(AbstractButton.CENTER);

        //add to panel
        panel.add(encyclopediaTitle);
    }

    //construct and place a description on the panel
    public void placeDescription(){
        //construct the tea description text pane, set its bounds, set background color,
        //and set base text to empty String
        description = new JTextPane();
        description.setBounds(210, 45, 650, 295);
        description.setBackground(new Color(189, 138, 107));
        description.setText("");

        //add description to panel
        panel.add(description);
    }
    //construct and place entry 1 on the panel
    public void placeEntry1(){
        //construct first entry button, set its bounds, and set the action on click
        JButton entry1 = new JButton(setButtonIcon(new ImageIcon("BlackTea.png")));
        entry1.setToolTipText(teaInformation.get(0).getTeaName());
        entry1.setBounds(10, 45, 180, 30);
        entry1.addActionListener(e -> description.setText(
                teaInformation.get(0).getTeaDescription()));

        //add entry 1 to panel
        panel.add(entry1);
    }

    //construct and place entry 2 on the panel
    public void placeEntry2(){
        //construct second entry button, set its bounds, and set the action on click
        JButton entry2 = new JButton(setButtonIcon(new ImageIcon("GreenTea.png")));
        entry2.setToolTipText(teaInformation.get(1).getTeaName());
        entry2.setBounds(10, 85, 180, 30);
        entry2.addActionListener(e -> description.setText(
                teaInformation.get(1).getTeaDescription()));

        //add entry 2 to panel
        panel.add(entry2);
    }

    //construct and place entry 3 on the panel
    public void placeEntry3(){
        //construct third entry button, set its bounds, and set the action on click
        JButton entry3 = new JButton(setButtonIcon(new ImageIcon("OolongTea.png")));
        entry3.setToolTipText(teaInformation.get(2).getTeaName());
        entry3.setBounds(10, 125, 180, 30);
        entry3.addActionListener(e -> description.setText(
                teaInformation.get(2).getTeaDescription()));

        //add to panel
        panel.add(entry3);
    }

    //construct and place entry 4 on the panel
    public void placeEntry4() {
        //construct fourth entry button, set its bounds, and set the action on click
        JButton entry4 = new JButton(setButtonIcon(new ImageIcon("WhiteTea.png")));
        entry4.setToolTipText(teaInformation.get(3).getTeaName());
        entry4.setBounds(10, 165, 180, 30);
        entry4.addActionListener(e -> description.setText(
                teaInformation.get(3).getTeaDescription()));

        //add entry 4 to panel
        panel.add(entry4);
    }

    //construct and place entry 5 on the panel
    public void placeEntry5(){
        //construct fifth entry button, set its bounds, and set the action on click
        JButton entry5 = new JButton(setButtonIcon(new ImageIcon("Pu-erh.png")));
        entry5.setToolTipText(teaInformation.get(4).getTeaName());
        entry5.setBounds(10, 205, 180, 30);
        entry5.addActionListener(e -> description.setText(
                teaInformation.get(4).getTeaDescription()));

        //add entry 5 to panel
        panel.add(entry5);
    }

    //construct and place entry 6 on the panel
    public void placeEntry6(){
        //construct sixth entry button, set its bounds, and set the action on click
        JButton entry6 = new JButton(setButtonIcon(new ImageIcon("PurpleTea.png")));
        entry6.setToolTipText(teaInformation.get(5).getTeaName());
        entry6.setBounds(10, 245, 180, 30);
        entry6.addActionListener(e -> description.setText(
                teaInformation.get(5).getTeaDescription()));

        //add entry 6 to panel
        panel.add(entry6);
    }

    //construct and place entry 7 on the panel
    public void placeEntry7(){
        //construct seventh entry button, set its bounds, and set the action on click
        JButton entry7 = new JButton(setButtonIcon(new ImageIcon("HerbalTea.png")));
        entry7.setToolTipText(teaInformation.get(6).getTeaName());
        entry7.setBounds(10, 285, 180, 30);
        entry7.addActionListener(e -> description.setText(
                teaInformation.get(6).getTeaDescription()));

        //add entry 7 to panel
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
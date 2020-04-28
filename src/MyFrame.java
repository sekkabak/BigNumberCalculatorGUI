import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyFrame extends JFrame  implements ActionListener {

    JButton bClose, bNegate, bDot, bAdd, bSub, bMul, bDiv, bEq, bDel, bC, bCE;
    JButton bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bZero;
    JTextField tText;
    String endNumber = "";
    String Number = " ";
    @Override
    public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == bClose){
                dispose();
            }
            else if (source == bOne){
                Number = Number + '1';
                tText.setText(Number);
            }
            else if (source == bTwo){
                Number = Number + '2';
                tText.setText(Number);
            }
            else if (source == bThree){
                Number = Number + '3';
                tText.setText(Number);
            }
            else if (source == bFour){
                Number = Number + '4';
                tText.setText(Number);
            }
            else if (source == bFive){
                Number = Number + '5';
                tText.setText(Number);
            }
            else if (source == bSix){
                Number = Number + '6';
                tText.setText(Number);
            }
            else if (source == bSeven){
                Number = Number + '7';
                tText.setText(Number);
            }
            else if (source == bEight){
                Number = Number + '8';
                tText.setText(Number);
            }
            else if (source == bNine){
                Number = Number + '9';
                tText.setText(Number);
            }
            else if (source == bZero){
                Number = Number + '0';
                tText.setText(Number);
            }
            else if (source == bDot){
                Number = Number + '.';
                tText.setText(Number);
            }
            else if (source == bNegate){
                if(Number.charAt(0) != '-') {
                    Number = "-" + Number;
                }
                else if(Number.equals(" ")){
                    Number = "-";
                }
                else {
                    Number = Number.substring(1);
                }
                tText.setText(Number);
            }
            else if (source == bAdd){
                endNumber = Number + " + ";
                Number = " ";
                tText.setText(Number);
            }
            else if (source == bSub){
                endNumber = Number + " - ";
                Number = " ";
                tText.setText(Number);
            }
            else if (source == bMul){
                endNumber = Number + " * ";
                Number = " ";
                tText.setText(Number);
            }
            else if (source == bDiv){
                endNumber = Number + " / ";
                Number = " ";
                tText.setText(Number);
            }
            else if (source == bEq){
                endNumber = endNumber + Number;
                Number = " ";
//                System.out.println(endNumber);
                tText.setText(Number);
            }
            else if (source == bDel){
                if(!Number.isEmpty())
                Number = Number.substring(0,Number.length()-1);
                tText.setText(Number);
            }
            else if (source == bC){
                Number = " ";
                tText.setText(Number);
            }
            else if (source == bCE){
                Number = "";
                endNumber = "";
                tText.setText(Number);
            }
    }

    public MyFrame() {
        super("Big Number Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(340, 410);
        this.setResizable(false);

        bClose = new JButton("X");
        bClose.setBounds(260, 10, 50, 50);
        bClose.addActionListener(this);
        add(bClose);

        bOne = new JButton("1");
        bOne.setBounds(20, 245, 50, 50);
        bOne.addActionListener(this);
        add(bOne);

        bTwo = new JButton("2");
        bTwo.setBounds(80, 245, 50, 50);
        bTwo.addActionListener(this);
        add(bTwo);

        bThree = new JButton("3");
        bThree.setBounds(140, 245, 50, 50);
        bThree.addActionListener(this);
        add(bThree);

        bFour = new JButton("4");
        bFour.setBounds(20, 185, 50, 50);
        bFour.addActionListener(this);
        add(bFour);

        bFive = new JButton("5");
        bFive.setBounds(80, 185, 50, 50);
        bFive.addActionListener(this);
        add(bFive);

        bSix = new JButton("6");
        bSix.setBounds(140, 185, 50, 50);
        bSix.addActionListener(this);
        add(bSix);

        bSeven = new JButton("7");
        bSeven.setBounds(20, 125, 50, 50);
        bSeven.addActionListener(this);
        add(bSeven);

        bEight = new JButton("8");
        bEight.setBounds(80, 125, 50, 50);
        bEight.addActionListener(this);
        add(bEight);

        bNine = new JButton("9");
        bNine.setBounds(140, 125, 50, 50);
        bNine.addActionListener(this);
        add(bNine);

        bZero = new JButton("0");
        bZero.setBounds(80, 305, 50, 50);
        bZero.addActionListener(this);
        add(bZero);

        bDot = new JButton(".");
        bDot.setBounds(140, 305, 50, 50);
        bDot.addActionListener(this);
        add(bDot);

        bNegate = new JButton("-/+");
        bNegate.setBounds(20, 305, 50, 50);
        bNegate.addActionListener(this);
        add(bNegate);

        bAdd = new JButton("+");
        bAdd.setBounds(200, 245, 50, 50);
        bAdd.addActionListener(this);
        add(bAdd);

        bSub = new JButton("-");
        bSub.setBounds(200, 185, 50, 50);
        bSub.addActionListener(this);
        add(bSub);

        bMul = new JButton("*");
        bMul.setBounds(200, 125, 50, 50);
        bMul.addActionListener(this);
        add(bMul);

        bDiv = new JButton("/");
        bDiv.setBounds(200, 65, 50, 50);
        bDiv.addActionListener(this);
        add(bDiv);

        bDiv = new JButton("=");
        bDiv.setBounds(200, 305, 50, 50);
        bDiv.addActionListener(this);
        add(bDiv);

        bDel = new JButton("Del");
        bDel.setBounds(140, 65, 50, 50);
        bDel.addActionListener(this);
        add(bDel);

        bC = new JButton("C");
        bC.setBounds(20, 65, 50, 50);
        bC.addActionListener(this);
        add(bC);

        bCE = new JButton("CE");
        bCE.setBounds(80, 65, 50, 50);
        bCE.addActionListener(this);
        add(bCE);

        tText = new JTextField("");
        tText.setBounds(10, 10, 240, 30);
        add(tText);



        setVisible(true);
    }
}
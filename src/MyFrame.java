import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

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
        /*
          Close button
         */
        bClose = new JButton("X");
        bClose.setBounds(260, 10, 50, 50);
        bClose.addActionListener(this);
        add(bClose);
        bClose.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bClose.setBackground(Color.LIGHT_GRAY);
        /*
          'One button'
         */
        bOne = new JButton("1");
        bOne.setBounds(20, 245, 50, 50);
        bOne.addActionListener(this);
        add(bOne);
        bOne.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bOne.setBackground(Color.LIGHT_GRAY);
        /*
          'Two' button
         */
        bTwo = new JButton("2");
        bTwo.setBounds(80, 245, 50, 50);
        bTwo.addActionListener(this);
        add(bTwo);
        bTwo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bTwo.setBackground(Color.LIGHT_GRAY);
        /*
          'Three' button
         */
        bThree = new JButton("3");
        bThree.setBounds(140, 245, 50, 50);
        bThree.addActionListener(this);
        add(bThree);
        bThree.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bThree.setBackground(Color.LIGHT_GRAY);
        /*
          'Four' button
         */
        bFour = new JButton("4");
        bFour.setBounds(20, 185, 50, 50);
        bFour.addActionListener(this);
        add(bFour);
        bFour.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bFour.setBackground(Color.LIGHT_GRAY);
        /*
          'Five' button
         */
        bFive = new JButton("5");
        bFive.setBounds(80, 185, 50, 50);
        bFive.addActionListener(this);
        add(bFive);
        bFive.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bFive.setBackground(Color.LIGHT_GRAY);
        /*
          'Six' button
         */
        bSix = new JButton("6");
        bSix.setBounds(140, 185, 50, 50);
        bSix.addActionListener(this);
        add(bSix);
        bSix.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bSix.setBackground(Color.LIGHT_GRAY);
        /*
          'Seven' button
         */
        bSeven = new JButton("7");
        bSeven.setBounds(20, 125, 50, 50);
        bSeven.addActionListener(this);
        add(bSeven);
        bSeven.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bSeven.setBackground(Color.LIGHT_GRAY);
        /*
          'Eight' button
         */
        bEight = new JButton("8");
        bEight.setBounds(80, 125, 50, 50);
        bEight.addActionListener(this);
        add(bEight);
        bEight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bEight.setBackground(Color.LIGHT_GRAY);
        /*
          'Nine' button
         */
        bNine = new JButton("9");
        bNine.setBounds(140, 125, 50, 50);
        bNine.addActionListener(this);
        add(bNine);
        bNine.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bNine.setBackground(Color.LIGHT_GRAY);
        /*
          'Zero' button
         */
        bZero = new JButton("0");
        bZero.setBounds(80, 305, 50, 50);
        bZero.addActionListener(this);
        add(bZero);
        bZero.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bZero.setBackground(Color.LIGHT_GRAY);
        /*
          'Dot' button
         */
        bDot = new JButton(".");
        bDot.setBounds(140, 305, 50, 50);
        bDot.addActionListener(this);
        add(bDot);
        bDot.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bDot.setBackground(Color.LIGHT_GRAY);
        /*
          'Negate' button
         */
        bNegate = new JButton("-/+");
        bNegate.setBounds(20, 305, 50, 50);
        bNegate.addActionListener(this);
        add(bNegate);
        bNegate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bNegate.setBackground(Color.LIGHT_GRAY);
        /*
          'Add' button
         */
        bAdd = new JButton("+");
        bAdd.setBounds(200, 245, 50, 50);
        bAdd.addActionListener(this);
        add(bAdd);
        bAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bAdd.setBackground(Color.LIGHT_GRAY);
        /*
          'Sub' button
         */
        bSub = new JButton("-");
        bSub.setBounds(200, 185, 50, 50);
        bSub.addActionListener(this);
        add(bSub);
        bSub.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bSub.setBackground(Color.LIGHT_GRAY);
        /*
          'Mul' button
         */
        bMul = new JButton("*");
        bMul.setBounds(200, 125, 50, 50);
        bMul.addActionListener(this);
        add(bMul);
        bMul.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bMul.setBackground(Color.LIGHT_GRAY);
        /*
          'Div' button
         */
        bDiv = new JButton("/");
        bDiv.setBounds(200, 65, 50, 50);
        bDiv.addActionListener(this);
        add(bDiv);
        bDiv.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bDiv.setBackground(Color.LIGHT_GRAY);
        /*
          'Equal' button
         */
        bEq = new JButton("=");
        bEq.setBounds(200, 305, 50, 50);
        bEq.addActionListener(this);
        add(bEq);
        bEq.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.DARK_GRAY));
        bEq.setBackground(Color.GRAY);
        /*
          'Del' button
         */
        bDel = new JButton("Del");
        bDel.setBounds(140, 65, 50, 50);
        bDel.addActionListener(this);
        add(bDel);
        bDel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bDel.setBackground(Color.LIGHT_GRAY);
        /*
          'C' button
         */
        bC = new JButton("C");
        bC.setBounds(20, 65, 50, 50);
        bC.addActionListener(this);
        add(bC);
        bC.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bC.setBackground(Color.LIGHT_GRAY);
        /*
          'CE' button
         */
        bCE = new JButton("CE");
        bCE.setBounds(80, 65, 50, 50);
        bCE.addActionListener(this);
        add(bCE);
        bCE.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bCE.setBackground(Color.LIGHT_GRAY);
        /*
          'Four' button
         */
        tText = new JTextField("");
        tText.setBounds(10, 10, 240, 30);
        add(tText);



        setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame  implements ActionListener {

    JButton bClose, bNegate, bDot, bAdd, bSub, bMul, bDiv, bEq, bDel, bC, bCE, bOBracket, bCBracket;
    JButton bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine, bZero;
    JTextField tText, tEndText;
    String endNumber = "";
    String Number = "";
    boolean flNumber = false;
    int counter = 0, numOfBr = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == bClose){
                int input = JOptionPane.showConfirmDialog(this,
                        "Do you want to close?", "Close", JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE);
                if (input == 0)
                    dispose();
            }
            else if (source == bOne){
                counter = 0;
                Number = Number + '1';
                tText.setText(Number);
            }
            else if (source == bTwo){
                counter = 0;
                Number = Number + '2';
                tText.setText(Number);
            }
            else if (source == bThree){
                counter = 0;
                Number = Number + '3';
                tText.setText(Number);
            }
            else if (source == bFour){
                counter = 0;
                Number = Number + '4';
                tText.setText(Number);
            }
            else if (source == bFive){
                counter = 0;
                Number = Number + '5';
                tText.setText(Number);
            }
            else if (source == bSix){
                counter = 0;
                Number = Number + '6';
                tText.setText(Number);
            }
            else if (source == bSeven){
                counter = 0;
                Number = Number + '7';
                tText.setText(Number);
            }
            else if (source == bEight){
                counter = 0;
                Number = Number + '8';
                tText.setText(Number);
            }
            else if (source == bNine){
                counter = 0;
                Number = Number + '9';
                tText.setText(Number);
            }
            else if (source == bZero){
                counter = 0;
                Number = Number + '0';
                tText.setText(Number);
            }
            else if (source == bDot){
                counter = 0;
                if(!flNumber) {
                    Number = Number + '.';
                    flNumber = true;
                }
                tText.setText(Number);
            }
            else if (source == bNegate){
                counter = 0;
                if(Number.equals("")){
                    Number = "-";
                }
                else if(Number.charAt(0) != '-') {
                    Number = "-" + Number;
                }
                else {
                    Number = Number.substring(1);
                }
                tText.setText(Number);
            }
            else if (source == bAdd){
                counter = 0;
                if(!Number.isEmpty()) {
                    endNumber += Number + "+";
                    Number = "";
                }
                tText.setText(Number);
                tEndText.setText(endNumber);
            }
            else if (source == bSub){
                counter = 0;
                if(!Number.isEmpty()) {
                    endNumber += Number + "-";
                    Number = "";
                }
                tText.setText(Number);
                tEndText.setText(endNumber);
            }
            else if (source == bMul){
                counter = 0;
                if(!Number.isEmpty()) {
                    endNumber += Number + "*";
                    Number = "";
                }
                tText.setText(Number);
                tEndText.setText(endNumber);
            }
            else if (source == bDiv){
                counter = 0;
                if(!Number.isEmpty()) {
                    endNumber += Number + "/";
                    Number = "";
                }
                tText.setText(Number);
                tEndText.setText(endNumber);
            }
            else if (source == bEq){ //do dokończenia z Kalkulatorem
                counter = 0;
                if(!Number.isEmpty()) {
                    endNumber += Number;
                    // wysłanie endNumber do Kalkulatora
                    // zapisanie wyniku do Number

                }
                tText.setText("");
                tEndText.setText(endNumber);
            }
            else if (source == bDel){
                counter = 0;
                if(!Number.isEmpty())
                Number = Number.substring(0,Number.length()-1);
                tText.setText(Number);
            }
            else if (source == bC){
                if(counter == 1){
                    endNumber = "";
                }
                counter += 1;
                Number = "";
                tText.setText(Number);
                tEndText.setText(endNumber);
            }
            else if (source == bCE){
                Number = "";
                endNumber = "";
                tText.setText(Number);
                tEndText.setText(endNumber);
            }
            else if( source == bOBracket){
                    numOfBr += 1;
                    endNumber += "(";
                tEndText.setText(endNumber);
            }
            else if( source == bCBracket){
                if(numOfBr > 0){
                    numOfBr -= 1;
                    endNumber += ")";
                }
                tEndText.setText(endNumber);
            }
    }

    public MyFrame() {
        super("Big Number Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(340, 435);
        this.setResizable(false);
        /*
          Close button
         */
        bClose = new JButton("X");
        bClose.setBounds(260, 50, 50, 95);
        bClose.addActionListener(this);
        add(bClose);
        bClose.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bClose.setBackground(Color.LIGHT_GRAY);
        /*
          'One button'
         */
        bOne = new JButton("1");
        bOne.setBounds(20, 275, 50, 50);
        bOne.addActionListener(this);
        add(bOne);
        bOne.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bOne.setBackground(Color.LIGHT_GRAY);
        /*
          'Two' button
         */
        bTwo = new JButton("2");
        bTwo.setBounds(80, 275, 50, 50);
        bTwo.addActionListener(this);
        add(bTwo);
        bTwo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bTwo.setBackground(Color.LIGHT_GRAY);
        /*
          'Three' button
         */
        bThree = new JButton("3");
        bThree.setBounds(140, 275, 50, 50);
        bThree.addActionListener(this);
        add(bThree);
        bThree.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bThree.setBackground(Color.LIGHT_GRAY);
        /*
          'Four' button
         */
        bFour = new JButton("4");
        bFour.setBounds(20, 215, 50, 50);
        bFour.addActionListener(this);
        add(bFour);
        bFour.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bFour.setBackground(Color.LIGHT_GRAY);
        /*
          'Five' button
         */
        bFive = new JButton("5");
        bFive.setBounds(80, 215, 50, 50);
        bFive.addActionListener(this);
        add(bFive);
        bFive.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bFive.setBackground(Color.LIGHT_GRAY);
        /*
          'Six' button
         */
        bSix = new JButton("6");
        bSix.setBounds(140, 215, 50, 50);
        bSix.addActionListener(this);
        add(bSix);
        bSix.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bSix.setBackground(Color.LIGHT_GRAY);
        /*
          'Seven' button
         */
        bSeven = new JButton("7");
        bSeven.setBounds(20, 155, 50, 50);
        bSeven.addActionListener(this);
        add(bSeven);
        bSeven.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bSeven.setBackground(Color.LIGHT_GRAY);
        /*
          'Eight' button
         */
        bEight = new JButton("8");
        bEight.setBounds(80, 155, 50, 50);
        bEight.addActionListener(this);
        add(bEight);
        bEight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bEight.setBackground(Color.LIGHT_GRAY);
        /*
          'Nine' button
         */
        bNine = new JButton("9");
        bNine.setBounds(140, 155, 50, 50);
        bNine.addActionListener(this);
        add(bNine);
        bNine.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bNine.setBackground(Color.LIGHT_GRAY);
        /*
          'Zero' button
         */
        bZero = new JButton("0");
        bZero.setBounds(80, 335, 50, 50);
        bZero.addActionListener(this);
        add(bZero);
        bZero.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bZero.setBackground(Color.LIGHT_GRAY);
        /*
          'Dot' button
         */
        bDot = new JButton(".");
        bDot.setBounds(140, 335, 50, 50);
        bDot.addActionListener(this);
        add(bDot);
        bDot.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bDot.setBackground(Color.LIGHT_GRAY);
        /*
          'Negate' button
         */
        bNegate = new JButton("-/+");
        bNegate.setBounds(20, 335, 50, 50);
        bNegate.addActionListener(this);
        add(bNegate);
        bNegate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bNegate.setBackground(Color.LIGHT_GRAY);
        /*
          'Add' button
         */
        bAdd = new JButton("+");
        bAdd.setBounds(200, 275, 50, 50);
        bAdd.addActionListener(this);
        add(bAdd);
        bAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bAdd.setBackground(Color.LIGHT_GRAY);
        /*
          'Sub' button
         */
        bSub = new JButton("-");
        bSub.setBounds(200, 215, 50, 50);
        bSub.addActionListener(this);
        add(bSub);
        bSub.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bSub.setBackground(Color.LIGHT_GRAY);
        /*
          'Mul' button
         */
        bMul = new JButton("*");
        bMul.setBounds(200, 155, 50, 50);
        bMul.addActionListener(this);
        add(bMul);
        bMul.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bMul.setBackground(Color.LIGHT_GRAY);
        /*
          'Div' button
         */
        bDiv = new JButton("/");
        bDiv.setBounds(200, 95, 50, 50);
        bDiv.addActionListener(this);
        add(bDiv);
        bDiv.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bDiv.setBackground(Color.LIGHT_GRAY);
        /*
          'Equal' button
         */
        bEq = new JButton("=");
        bEq.setBounds(200, 335, 50, 50);
        bEq.addActionListener(this);
        add(bEq);
        bEq.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.DARK_GRAY));
        bEq.setBackground(Color.GRAY);
        /*
          'Del' button
         */
        bDel = new JButton("Del");
        bDel.setBounds(140, 95, 50, 50);
        bDel.addActionListener(this);
        add(bDel);
        bDel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bDel.setBackground(Color.LIGHT_GRAY);
        /*
          'C' button
         */
        bC = new JButton("C");
        bC.setBounds(20, 95, 50, 50);
        bC.addActionListener(this);
        add(bC);
        bC.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bC.setBackground(Color.LIGHT_GRAY);
        /*
          'CE' button
         */
        bCE = new JButton("CE");
        bCE.setBounds(80, 95, 50, 50);
        bCE.addActionListener(this);
        add(bCE);
        bCE.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bCE.setBackground(Color.LIGHT_GRAY);

        /*
          '(' button
         */
        bOBracket = new JButton("(");
        bOBracket.setBounds(260, 155, 50, 50);
        bOBracket.addActionListener(this);
        add(bOBracket);
        bOBracket.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bOBracket.setBackground(Color.LIGHT_GRAY);

        /*
          ')' button
         */
        bCBracket = new JButton(")");
        bCBracket.setBounds(260, 215, 50, 50);
        bCBracket.addActionListener(this);
        add(bCBracket);
        bCBracket.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY));
        bCBracket.setBackground(Color.LIGHT_GRAY);
        /*
          'Four' button
         */
        tText = new JTextField("");
        tText.setBounds(10, 50, 240, 30);
        add(tText);

        tEndText = new JTextField("");
        tEndText.setBounds(10, 10, 300, 30);
        add(tEndText);



        setVisible(true);
    }
}
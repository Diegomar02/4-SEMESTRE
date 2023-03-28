package calculadora;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class codigo extends JFrame{
    JLabel display;
    JButton numero0,numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9,AC,porcentaje,entre,por,menos,mas,igual,punto;
    Integer n1=0,n2=0,r=0;
    
    public codigo(){
        initDisplay();
        initBotones();
        initAcciones();
        initHovers();
        initPantalla();
    }
    
    private void initPantalla(){
        setTitle("Ejemplo 3: Eventos");
        setSize(240,390);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void initDisplay(){
        display=new JLabel("");
        display.setBounds(15,15,195,60);
        display.setOpaque(true);
        display.setBackground(Color.BLACK);
        display.setBackground(Color.GREEN);
        display.setBorder(new LineBorder(Color.DARK_GRAY));
        display.setFont(new Font("MONOSPACED",PLAIN,24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFocusable(true);
        add(display);
        
        display.addKeyListener(new KeyListener(){
            @Override 
            public void keyTyped(KeyEvent e){ 
            }
            @Override
            public void keyPressed(KeyEvent e){
                String ch=String.valueOf(e.getKeyChar());
                if("1".equals(ch)||"2".equals(ch)||"3".equals(ch)){
                    display.setText(display.getText()+ch);
                }
                if("c".equals(ch)){
                    display.setText("");
                }
            }
            @Override
            public void keyReleased(KeyEvent e){
            }
        });
    }
    private void initBotones(){
        numero0=new JButton("0");
        numero1=new JButton("1");
        numero2=new JButton("2");
        numero3=new JButton("3");
        numero4=new JButton("4");
        numero5=new JButton("5");
        numero6=new JButton("6");
        numero7=new JButton("7");
        numero8=new JButton("8");
        numero9=new JButton("9");
        AC=new JButton("AC");
        porcentaje=new JButton("%");
        entre=new JButton("/");
        por=new JButton("*");
        menos=new JButton("-");
        mas=new JButton("+");
        igual=new JButton("=");
        punto=new JButton(".");
        
        
        numero0.setBounds(15,373,123,60);
        numero1.setBounds(15,310,60,60);
        numero2.setBounds(78,310,60,60);
        numero3.setBounds(141,310,60,60);
        numero4.setBounds(15,248,60,60);
        numero5.setBounds(78,248,60,60);
        numero6.setBounds(141,248,60,60);
        numero7.setBounds(15,185,60,60);
        numero8.setBounds(78,185,60,60);
        numero9.setBounds(141,185,60,60);
        AC.setBounds(15,120,123,60);
        porcentaje.setBounds(141,120,60,60);
        entre.setBounds(205,120,60,60);
        por.setBounds(205,185,60,60);
        menos.setBounds(205,248,60,60);
        mas.setBounds(205,310,60,60);
        igual.setBounds(205,373,60,60);
        punto.setBounds(141,373,60,60);
        
        numero0.setFont(new Font("MONOSPACED",PLAIN,16));
        numero1.setFont(new Font("MONOSPACED",PLAIN,16));
        numero2.setFont(new Font("MONOSPACED",PLAIN,16));
        numero3.setFont(new Font("MONOSPACED",PLAIN,16));
        numero4.setFont(new Font("MONOSPACED",PLAIN,16));
        numero5.setFont(new Font("MONOSPACED",PLAIN,16));
        numero6.setFont(new Font("MONOSPACED",PLAIN,16));
        numero7.setFont(new Font("MONOSPACED",PLAIN,16));
        numero8.setFont(new Font("MONOSPACED",PLAIN,16));
        numero9.setFont(new Font("MONOSPACED",PLAIN,16));
        AC.setFont(new Font("MONOSPACED",PLAIN,16));
        porcentaje.setFont(new Font("MONOSPACED",PLAIN,16));
        entre.setFont(new Font("MONOSPACED",PLAIN,16));
        por.setFont(new Font("MONOSPACED",PLAIN,16));
        menos.setFont(new Font("MONOSPACED",PLAIN,16));
        mas.setFont(new Font("MONOSPACED",PLAIN,16));
        igual.setFont(new Font("MONOSPACED",PLAIN,16));
        punto.setFont(new Font("MONOSPACED",PLAIN,16));
        
        numero0.setOpaque(true);
        numero1.setOpaque(true);
        numero2.setOpaque(true);
        numero3.setOpaque(true);
        numero4.setOpaque(true);
        numero5.setOpaque(true);
        numero6.setOpaque(true);
        numero7.setOpaque(true);
        numero8.setOpaque(true);
        numero9.setOpaque(true);
        AC.setOpaque(true);
        porcentaje.setOpaque(true);
        entre.setOpaque(true);
        por.setOpaque(true);
        menos.setOpaque(true);
        mas.setOpaque(true);
        punto.setOpaque(true);
            
            numero0.setFocusPainted(false);
            numero0.setBackground(Color.DARK_GRAY);
            numero0.setBorder(new LineBorder(Color.DARK_GRAY));
            numero0.setForeground(Color.WHITE);
            
            numero1.setFocusPainted(false);
            numero1.setBackground(Color.DARK_GRAY);
            numero1.setBorder(new LineBorder(Color.DARK_GRAY));
            numero1.setForeground(Color.WHITE);
            
            numero2.setFocusPainted(false);
            numero2.setBackground(Color.DARK_GRAY);
            numero2.setBorder(new LineBorder(Color.DARK_GRAY));
            numero2.setForeground(Color.WHITE);
            
            numero3.setFocusPainted(false);
            numero3.setBackground(Color.DARK_GRAY);
            numero3.setBorder(new LineBorder(Color.DARK_GRAY));
            numero3.setForeground(Color.WHITE);
            
            numero4.setFocusPainted(false);
            numero4.setBackground(Color.DARK_GRAY);
            numero4.setBorder(new LineBorder(Color.DARK_GRAY));
            numero4.setForeground(Color.WHITE);
            
            numero5.setFocusPainted(false);
            numero5.setBackground(Color.DARK_GRAY);
            numero5.setBorder(new LineBorder(Color.DARK_GRAY));
            numero5.setForeground(Color.WHITE);
            
            numero6.setFocusPainted(false);
            numero6.setBackground(Color.DARK_GRAY);
            numero6.setBorder(new LineBorder(Color.DARK_GRAY));
            numero6.setForeground(Color.WHITE);
            
            numero7.setFocusPainted(false);
            numero7.setBackground(Color.DARK_GRAY);
            numero7.setBorder(new LineBorder(Color.DARK_GRAY));
            numero7.setForeground(Color.WHITE);
            
            numero8.setFocusPainted(false);
            numero8.setBackground(Color.DARK_GRAY);
            numero8.setBorder(new LineBorder(Color.DARK_GRAY));
            numero8.setForeground(Color.WHITE);
            
            numero9.setFocusPainted(false);
            numero9.setBackground(Color.DARK_GRAY);
            numero9.setBorder(new LineBorder(Color.DARK_GRAY));
            numero9.setForeground(Color.WHITE);
            
            AC.setFocusPainted(false);
            AC.setBackground(Color.DARK_GRAY);
            AC.setBorder(new LineBorder(Color.DARK_GRAY));
            AC.setForeground(Color.WHITE);
            
            porcentaje.setFocusPainted(false);
            porcentaje.setBackground(Color.ORANGE);
            porcentaje.setBorder(new LineBorder(Color.ORANGE));
            porcentaje.setForeground(Color.WHITE);
            
            entre.setFocusPainted(false);
            entre.setBackground(Color.ORANGE);
            entre.setBorder(new LineBorder(Color.ORANGE));
            entre.setForeground(Color.WHITE);
            
            por.setFocusPainted(false);
            por.setBackground(Color.ORANGE);
            por.setBorder(new LineBorder(Color.ORANGE));
            por.setForeground(Color.WHITE);
            
            menos.setFocusPainted(false);
            menos.setBackground(Color.ORANGE);
            menos.setBorder(new LineBorder(Color.ORANGE));
            menos.setForeground(Color.WHITE);
            
            mas.setFocusPainted(false);
            mas.setBackground(Color.ORANGE);
            mas.setBorder(new LineBorder(Color.ORANGE));
            mas.setForeground(Color.WHITE);
            
            igual.setFocusPainted(false);
            igual.setBackground(Color.LIGHT_GRAY);
            igual.setBorder(new LineBorder(Color.LIGHT_GRAY));
            igual.setForeground(Color.WHITE);
            
            punto.setFocusPainted(false);
            punto.setBackground(Color.LIGHT_GRAY);
            punto.setBorder(new LineBorder(Color.LIGHT_GRAY));
            punto.setForeground(Color.WHITE);
            
            add(numero0);
            add(numero1);
            add(numero2);
            add(numero3);
            add(numero4);
            add(numero5);
            add(numero6);
            add(numero7);
            add(numero8);
            add(numero9);
            add(AC);
            add(porcentaje);
            add(entre);
            add(por);
            add(menos);
            add(mas);
            add(igual);
            add(punto);
      
        
        
    }
    private void initAcciones(){
        numero0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"0");
                display.requestFocus();
            }
        });
        numero1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"1");
                display.requestFocus();
            }
        });
        numero2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"2");
                display.requestFocus();
            }
        });
        numero3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"3");
                display.requestFocus();
            }
        });
        numero4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"4");
                display.requestFocus();
            }
        });
        numero5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"5");
                display.requestFocus();
            }
        });
        numero6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"6");
                display.requestFocus();
            }
        });
        numero7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"7");
                display.requestFocus();
            }
        });
        numero8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"8");
                display.requestFocus();
            }
        });
        numero9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"9");
                display.requestFocus();
            }
        });
        AC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"");
                display.requestFocus();
            }
        });
        porcentaje.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //display.setText(display.getText()+"");
                //display.requestFocus();
                if(n1==0){
                    n1=Integer.parseInt(display.getText());
                    System.out.println("n1 = "+n1);
                    display.setText("");
                }else{
                    n2=Integer.parseInt(display.getText());
                    System.out.println("n2 = "+n2);
                    r=n1%n2;
                    n1=r;
                    display.setText(""+r);
                }
            }
        });
        entre.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //display.setText(display.getText()+"");
                //display.requestFocus();
                if(n1==0){
                    n1=Integer.parseInt(display.getText());
                    System.out.println("n1 = "+n1);
                    display.setText("");
                }else{
                    n2=Integer.parseInt(display.getText());
                    System.out.println("n2 = "+n2);
                    r=n1/n2;
                    n1=r;
                    display.setText(""+r);
                }
            }
        });
        por.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //display.setText(display.getText()+"");
                //display.requestFocus();
                if(n1==0){
                    n1=Integer.parseInt(display.getText());
                    System.out.println("n1 = "+n1);
                    display.setText("");
                }else{
                    n2=Integer.parseInt(display.getText());
                    System.out.println("n2 = "+n2);
                    r=n1*n2;
                    n1=r;
                    display.setText(""+r);
                }
            }
        });
        menos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //display.setText(display.getText()+"");
                //display.requestFocus();
                if(n1==0){
                    n1=Integer.parseInt(display.getText());
                    System.out.println("n1 = "+n1);
                    display.setText("");
                }else{
                    n2=Integer.parseInt(display.getText());
                    System.out.println("n2 = "+n2);
                    r=n1-n2;
                    n1=r;
                    display.setText(""+r);
                }
            }
        });
        mas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //display.setText(display.getText()+"");
                //display.requestFocus();
                if(n1==0){
                    n1=Integer.parseInt(display.getText());
                    System.out.println("n1 = "+n1);
                    display.setText("");
                }else{
                    n2=Integer.parseInt(display.getText());
                    System.out.println("n2 = "+n2);
                    r=n1+n2;
                    n1=r;
                    display.setText(""+r);
                }
            }
        });
        igual.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"");
                display.requestFocus();
                
            }
        });
        punto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                display.setText(display.getText()+"");
                display.requestFocus();
            }
        });
    }
    
    private void initHovers(){
        numero0.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero0.setBackground(Color.GREEN);
                numero0.setBorder(new LineBorder(Color.GREEN));
                numero0.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero0.setBackground(Color.DARK_GRAY);
                numero0.setBorder(new LineBorder(Color.DARK_GRAY));
                numero0.setForeground(Color.WHITE);
            }
        });
        numero1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero1.setBackground(Color.GREEN);
                numero1.setBorder(new LineBorder(Color.GREEN));
                numero1.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero1.setBackground(Color.DARK_GRAY);
                numero1.setBorder(new LineBorder(Color.DARK_GRAY));
                numero1.setForeground(Color.WHITE);
            }
        });
        numero2.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero2.setBackground(Color.GREEN);
                numero2.setBorder(new LineBorder(Color.GREEN));
                numero2.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero2.setBackground(Color.DARK_GRAY);
                numero2.setBorder(new LineBorder(Color.DARK_GRAY));
                numero2.setForeground(Color.WHITE);
            }
        });
        numero3.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero3.setBackground(Color.GREEN);
                numero3.setBorder(new LineBorder(Color.GREEN));
                numero3.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero3.setBackground(Color.DARK_GRAY);
                numero3.setBorder(new LineBorder(Color.DARK_GRAY));
                numero3.setForeground(Color.WHITE);
            }
        });
        numero4.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero4.setBackground(Color.GREEN);
                numero4.setBorder(new LineBorder(Color.GREEN));
                numero4.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero4.setBackground(Color.DARK_GRAY);
                numero4.setBorder(new LineBorder(Color.DARK_GRAY));
                numero4.setForeground(Color.WHITE);
            }
        });
        numero5.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero5.setBackground(Color.GREEN);
                numero5.setBorder(new LineBorder(Color.GREEN));
                numero5.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero5.setBackground(Color.DARK_GRAY);
                numero5.setBorder(new LineBorder(Color.DARK_GRAY));
                numero5.setForeground(Color.WHITE);
            }
        });
        numero6.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero6.setBackground(Color.GREEN);
                numero6.setBorder(new LineBorder(Color.GREEN));
                numero6.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero6.setBackground(Color.DARK_GRAY);
                numero6.setBorder(new LineBorder(Color.DARK_GRAY));
                numero6.setForeground(Color.WHITE);
            }
        });
        numero7.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero7.setBackground(Color.GREEN);
                numero7.setBorder(new LineBorder(Color.GREEN));
                numero7.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero7.setBackground(Color.DARK_GRAY);
                numero7.setBorder(new LineBorder(Color.DARK_GRAY));
                numero7.setForeground(Color.WHITE);
            }
        });
        numero8.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero8.setBackground(Color.GREEN);
                numero8.setBorder(new LineBorder(Color.GREEN));
                numero8.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero8.setBackground(Color.DARK_GRAY);
                numero8.setBorder(new LineBorder(Color.DARK_GRAY));
                numero8.setForeground(Color.WHITE);
            }
        });
        numero9.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                numero9.setBackground(Color.GREEN);
                numero9.setBorder(new LineBorder(Color.GREEN));
                numero9.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                numero9.setBackground(Color.DARK_GRAY);
                numero9.setBorder(new LineBorder(Color.DARK_GRAY));
                numero9.setForeground(Color.WHITE);
            }
        });
        AC.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                AC.setBackground(Color.GREEN);
                AC.setBorder(new LineBorder(Color.GREEN));
                AC.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                AC.setBackground(Color.DARK_GRAY);
                AC.setBorder(new LineBorder(Color.DARK_GRAY));
                AC.setForeground(Color.WHITE);
            }
        });
        porcentaje.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                porcentaje.setBackground(Color.GREEN);
                porcentaje.setBorder(new LineBorder(Color.GREEN));
                porcentaje.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                porcentaje.setBackground(Color.DARK_GRAY);
                porcentaje.setBorder(new LineBorder(Color.DARK_GRAY));
                porcentaje.setForeground(Color.WHITE);
            }
        });
        entre.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                entre.setBackground(Color.GREEN);
                entre.setBorder(new LineBorder(Color.GREEN));
                entre.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                entre.setBackground(Color.DARK_GRAY);
                entre.setBorder(new LineBorder(Color.DARK_GRAY));
                entre.setForeground(Color.WHITE);
            }
        });
        por.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                por.setBackground(Color.GREEN);
                por.setBorder(new LineBorder(Color.GREEN));
                por.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                por.setBackground(Color.DARK_GRAY);
                por.setBorder(new LineBorder(Color.DARK_GRAY));
                por.setForeground(Color.WHITE);
            }
        });
        menos.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                menos.setBackground(Color.GREEN);
                menos.setBorder(new LineBorder(Color.GREEN));
                menos.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                menos.setBackground(Color.DARK_GRAY);
                menos.setBorder(new LineBorder(Color.DARK_GRAY));
                menos.setForeground(Color.WHITE);
            }
        });
         mas.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                mas.setBackground(Color.GREEN);
                mas.setBorder(new LineBorder(Color.GREEN));
                mas.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                mas.setBackground(Color.DARK_GRAY);
                mas.setBorder(new LineBorder(Color.DARK_GRAY));
                mas.setForeground(Color.WHITE);
            }
        });
         igual.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                igual.setBackground(Color.GREEN);
                igual.setBorder(new LineBorder(Color.GREEN));
                igual.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                igual.setBackground(Color.DARK_GRAY);
                igual.setBorder(new LineBorder(Color.DARK_GRAY));
                igual.setForeground(Color.WHITE);
            }
        });
         punto.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e){
            }
            @Override
            public void mousePressed(MouseEvent e){
            }
            @Override
            public void mouseReleased(MouseEvent e){
            }
            @Override
            public void mouseEntered(MouseEvent e){
                punto.setBackground(Color.GREEN);
                punto.setBorder(new LineBorder(Color.GREEN));
                punto.setForeground(Color.DARK_GRAY);
            }
            @Override
            public void mouseExited(MouseEvent e){
                punto.setBackground(Color.DARK_GRAY);
                punto.setBorder(new LineBorder(Color.DARK_GRAY));
                punto.setForeground(Color.WHITE);
            }
        });
    }
    

    
    
    
    
}

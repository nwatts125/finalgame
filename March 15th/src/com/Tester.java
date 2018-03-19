import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Random;
import java.awt.Color.*;
import java.awt.Cursor.*;
import javax.swing.border.*;
import java.awt.event.*;
public class Tester extends JPanel{
        JTextField myNumberArray[] = new JTextField[16];
        MouseHandling handler = new MouseHandling();

        JLabel statusbar = new JLabel("default");
        JLabel tempLabel = new JLabel();

        JPanel squareContainer = new JPanel();
        Boolean handlerOn = false;
        boolean colourChanged = false;

        ImageIcon redBubble;
        ImageIcon blueBubble;
        ImageIcon yellowBubble;
        ImageIcon orangeBubble;
        ImageIcon greenBubble;
        ImageIcon pinkBubble;
        ImageIcon purpleBubble;


        public void smallIcons(){
            redBubble = new ImageIcon("images/redSmall.jpg");
            blueBubble = new ImageIcon("images/blueSmall.jpg");
            yellowBubble = new ImageIcon("images/yellowSmall.jpg");
            orangeBubble = new ImageIcon("images/orangeSmall.jpg");
            greenBubble = new ImageIcon("images/greenSmall.jpg");
            pinkBubble = new ImageIcon("images/pinkSmall.jpg");
            purpleBubble = new ImageIcon("images/purpleSmall.jpg");
        }

        public void mediumIcons(){
            redBubble = new ImageIcon("images/redMedium.jpg");
            blueBubble = new ImageIcon("images/blueMedium.jpg");
            yellowBubble = new ImageIcon("images/yellowMedium.jpg");
            orangeBubble = new ImageIcon("images/orangeMedium.jpg");
            greenBubble = new ImageIcon("images/greenMedium.jpg");
            pinkBubble = new ImageIcon("images/pinkMedium.jpg");
        }

        public void largeIcons(){
            redBubble = new ImageIcon("images/redLarge.jpg");
            blueBubble = new ImageIcon("images/blueLarge.jpg");
            yellowBubble = new ImageIcon("images/yellowLarge.jpg");
            orangeBubble = new ImageIcon("images/orangeLarge.jpg");
            greenBubble = new ImageIcon("images/greenLarge.jpg");
            pinkBubble = new ImageIcon("images/pinkLarge.jpg");
        }

        public void GridForGame(){
            setLayout(new BorderLayout());
            setBackground(Color.gray);
            setBorder(new EtchedBorder(4, Color.blue, Color.blue));
            setPreferredSize(new Dimension(600,600));
        }

        public void small(){

            smallIcons();
            /*
             * Below empties the main game view so that
             * more can be 'painted' on it.
             */
            squareContainer.removeAll();
            revalidate();

            // Set the grid for 8 x 8
            squareContainer.setLayout(new GridLayout(8,8));
            squareContainer.setPreferredSize(new Dimension(500,500));
            squareContainer.setMaximumSize(new Dimension(500,500));

            /*
             * Checks if a Mouse handler has already been
             * assigned to game view, if not, Add one!
             */
            if(!handlerOn){
                squareContainer.addMouseListener(handler);
                handlerOn = true;
            }

            statusbar.setText("default");
            add(statusbar, BorderLayout.NORTH);

            for(int i=0; i<8; i++){

                for(int j=0; j<8; j++){
                    JLabel number = new JLabel();

                    number.setEnabled(true);
                    number.setOpaque(true);
                    number.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

                    for(int k=0; k<8; k++){
                        int n = new Random().nextInt(7);
                        switch(n){
                            case 0: number.setBackground(Color.red);
                                number.setIcon(redBubble); break;
                            case 1: number.setBackground(Color.cyan);
                                number.setIcon(orangeBubble); break;
                            case 2: number.setBackground(Color.blue);
                                number.setIcon(blueBubble); break;
                            case 3: number.setBackground(Color.green);
                                number.setIcon(greenBubble); break;
                            case 4: number.setBackground(Color.yellow);
                                number.setIcon(yellowBubble); break;
                            case 5: number.setBackground(Color.magenta);
                                number.setIcon(pinkBubble); break;
                            default:
                        }
                    }

                    squareContainer.add(number);
                }

                //squareContainer.add(squares);
            }
            add(squareContainer);
            revalidate();
        }

        public void medium(){

            mediumIcons();

            /*
             * Below empties the main game view so that
             * more can be 'painted' on it.
             */
            squareContainer.removeAll();
            revalidate();

            // Set the grid for 12 x 12
            squareContainer.setLayout(new GridLayout(12,12));
            squareContainer.setPreferredSize(new Dimension(500,500));
            squareContainer.setMaximumSize(new Dimension(500,500));

            /*
             * Checks if a Mouse handler has already been
             * assigned to game view, if not, Add one!
             */
            if(!handlerOn){
                squareContainer.addMouseListener(handler);
                handlerOn = true;
            }

            statusbar.setText("default");
            add(statusbar, BorderLayout.NORTH);

            for(int i=0; i<12; i++){
                JPanel squares = new JPanel();
                squares.setLayout(new GridLayout(1,1));
                for(int j=0; j<12; j++){
                    JLabel number = new JLabel();
                    number.setEnabled(true);
                    number.setOpaque(true);
                    number.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

                    squares.add(number);
                    for(int k=0; k<12; k++){
                        int n = new Random().nextInt(7);
                        switch(n){
                            case 0: number.setBackground(Color.red);
                                number.setIcon(redBubble); break;
                            case 1: number.setBackground(Color.cyan);
                                number.setIcon(orangeBubble); break;
                            case 2: number.setBackground(Color.blue);
                                number.setIcon(blueBubble); break;
                            case 3: number.setBackground(Color.green);
                                number.setIcon(greenBubble); break;
                            case 4: number.setBackground(Color.yellow);
                                number.setIcon(yellowBubble); break;
                            case 5: number.setBackground(Color.magenta);
                                number.setIcon(pinkBubble); break;
                            default:
                        }
                    }
                }

                squareContainer.add(squares);
            }
            add(squareContainer);
            revalidate();
        }

        public void large(){

            largeIcons();

            /*
             * Below empties the main game view so that
             * more can be 'painted' on it.
             */
            squareContainer.removeAll();
            revalidate();

            // Set the grid for 16 x 16
            squareContainer.setLayout(new GridLayout(16,16));
            squareContainer.setPreferredSize(new Dimension(500,500));
            squareContainer.setMaximumSize(new Dimension(500,500));

            /*
             * Checks if a Mouse handler has already been
             * assigned to game view, if not, Add one!
             */
            if(!handlerOn){
                squareContainer.addMouseListener(handler);
                handlerOn = true;
            }

            statusbar.setText("default");
            add(statusbar, BorderLayout.NORTH);

            for(int i=0; i<16; i++){
                JPanel squares = new JPanel();
                squares.setLayout(new GridLayout(1,1));
                for(int j=0; j<16; j++){
                    JLabel number = new JLabel();
                    number.setEnabled(true);
                    number.setOpaque(true);
                    number.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

                    squares.add(number);
                    for(int k=0; k<16; k++){
                        int n = new Random().nextInt(7);
                        switch(n){
                            case 0: number.setBackground(Color.red);
                                number.setIcon(redBubble); break;
                            case 1: number.setBackground(Color.cyan);
                                number.setIcon(orangeBubble); break;
                            case 2: number.setBackground(Color.blue);
                                number.setIcon(blueBubble); break;
                            case 3: number.setBackground(Color.green);
                                number.setIcon(greenBubble); break;
                            case 4: number.setBackground(Color.yellow);
                                number.setIcon(yellowBubble); break;
                            case 5: number.setBackground(Color.magenta);
                                number.setIcon(pinkBubble); break;
                            default:
                        }
                    }
                }

                squareContainer.add(squares);
            }
            add(squareContainer);
            revalidate();
        }

        private class MouseHandling implements MouseListener{
            public void mouseClicked(MouseEvent event){
                statusbar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
                System.out.println(String.format("Component clicked was " + findComponentAt(event.getX(), event.getY()).getBackground()));

        /*JLabel temp = new JLabel();

        temp = findComponentAt(event.getX(), event.getY());*/

                if(colourChanged == true){
                    findComponentAt(event.getX(), event.getY()).setBackground(Color.white);
                    System.out.println("selected label now set to white");
                }

                if(colourChanged == false){
                    findComponentAt(event.getX(), event.getY()).setBackground(Color.black);
                    System.out.println("selected label now set to black");
                    colourChanged = true;
                }
            }

            public void mousePressed(MouseEvent event){
                statusbar.setText("anything");
            }

            public void mouseReleased(MouseEvent event){
                statusbar.setText(String.format("Released at %d,%d", event.getX(), event.getY()));
            }

            public void mouseEntered(MouseEvent event){
                statusbar.setText("Entered");
            }

            public void mouseExited(MouseEvent event){
                statusbar.setText("Exited");
            }
        }

    }

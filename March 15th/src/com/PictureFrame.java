//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class PictureFrame extends JFrame implements ActionListener{
//    private JButton imgButton;
//    private Landscape land;
//    private Mammal mammal;
//    private Bird bird;
//    private Reptile gator;
//    private ClickPic foci;
//    public PictureFrame(){
//        super();
//        this.setLayout(null);
//        Landscape land = new Landscape("fall", this);
//        Mammal mammal = new Mammal("Mammal", this);
//        Bird bird = new Bird("Bird", this);
//        Reptile gator = new Reptile("Reptile", this);
//
//        JButton imgButton = new JButton();
//        imgButton.setBounds(1000,0,200,200);
//
//        foci = land;
//        this.setBounds(0,0,1200,1200);
//
//        this.add(imgButton);
//        this.add(land);
//        land.add(mammal);
//        land.add(bird);
//        land.add(gator);
//
//
//        this.setVisible(true);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//    }
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        foci.changeImage();
//        this.repaint();
//    }
//}

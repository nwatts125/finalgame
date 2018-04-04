import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

class Post extends JComponent{
  private JLabel[] cols;
  public Post(int x, int y, String str1, String str2, String str3){
    setBounds(x, y, 150, 50);
    this.setBackground(Color.blue);
    cols = new JLabel[]{
      new JLabel(str1),
      new JLabel(str2),
      new JLabel(str3),
    };
    for (int i = 0; i < cols.length; i++) {
      cols[i].setBounds(i * 50, 0, 50, 50);
      add(cols[i]);
    }
  }
  public void setPost(String str1, String str2, String str3){
    cols[0].setText(str1);
    cols[1].setText(str2);
    cols[2].setText(str3);
  }

  public String[] getPost(){
    String[] returnArray = new String[3];
    for (int i = 0; i < returnArray.length; i++) {
      returnArray[i] = cols[i].getText();
    }
    return returnArray;
  }
  public static void main(String[] args) {
    JFrame main = new JFrame();
    main.setLayout(null);
    main.setVisible(true);
    main.setBounds(0,0,500,500);
    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    for(int i = 0; i < 100; i++){
      main.add(new Post(0,i * 50,"Memes","Total","Reee"));
    }
  }
}

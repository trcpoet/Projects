import javax.swing.JFrame;
public class ConverterApp
{


    public static void main(String[] args)
    {
        ConvertFrame ConvertFrame = new ConvertFrame();
        ConvertFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ConvertFrame.setSize(500, 400); // set frame size
        ConvertFrame.setVisible(true); // display frame
    }
}

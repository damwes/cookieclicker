import java.awt.Color;
import javax.swing.JFrame;

class GameWindow {

    private int WINDOW_SIZE = 500;

    private JFrame frame = new JFrame();

    public GameWindow() {
        this.frame.setSize(WINDOW_SIZE, WINDOW_SIZE);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setBackground(Color.black);
        this.frame.setAlwaysOnTop(true);
        this.frame.setLayout(null);

        this.setWindowToScreenCenter(frame);
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public void setFrameVisible() {
        this.frame.setVisible(true);
    }

    public int getWindowSize() {
        return this.WINDOW_SIZE;
    }

    private void setWindowToScreenCenter(JFrame frame) {
        // window.setLocationRelativeTo(null);
        // temporário para desenvolvimento:
        frame.setLocation(922, 51);
    }
}

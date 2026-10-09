import java.awt.Color;
import javax.swing.JFrame;

class GameWindow extends JFrame {

    private int WINDOW_SIZE = 500;

    public GameWindow() {
        this.setSize(WINDOW_SIZE, WINDOW_SIZE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setAlwaysOnTop(true);
        this.setLayout(null);

        this.setWindowToScreenCenter(this);
    }

    public JFrame getFrame() {
        return this;
    }

    public void setFrameVisible() {
        this.setVisible(true);
    }

    public int getWindowSize() {
        return this.WINDOW_SIZE;
    }

    private void setWindowToScreenCenter(JFrame frame) {
        this.setLocationRelativeTo(null);
    }
}

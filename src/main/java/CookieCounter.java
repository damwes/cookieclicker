import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

class CookieCounter extends JLabel {

    int counter = 0;

    public CookieCounter(int windowSize) {
        int labelWidth = windowSize;
        int labelHeight = 50;
        int labelLocationX = 20;
        int labelLocationY = 20;

        this.setBounds(labelLocationX, labelLocationY, labelWidth, labelHeight);

        this.setFont(new Font(null, Font.BOLD, 28));
        this.setForeground(Color.RED);
        this.setText(String.format("%d Cookies", counter));
    }

    public JLabel getDisplayComponent() {
        return this;
    }

    public void setCounter() {
        this.counter++;
        this.setText(String.format("%d Cookies", counter));
    }

    public void resetCounter() {
        this.counter = 0;
        this.setText(String.format("%d Cookies", counter));
    }
}

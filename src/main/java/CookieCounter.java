import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

class CookieCounter {

    JLabel display = new JLabel();
    int counter = 0;

    public CookieCounter(int windowSize) {
        int labelWidth = windowSize;
        int labelHeight = 50;
        int labelLocationX = 10;
        int labelLocationY = 10;

        this.display.setBounds(
            labelLocationX,
            labelLocationY,
            labelWidth,
            labelHeight
        );

        this.display.setFont(new Font(null, Font.PLAIN, 28));
        this.display.setForeground(Color.WHITE);
        this.display.setText(String.format("%d cookies", counter));
    }

    public JLabel getDisplayComponent() {
        return this.display;
    }

    public void setCounter() {
        this.counter++;
        this.display.setText(String.format("%d cookies", counter));
    }

    public void resetCounter() {
        this.counter = 0;
        this.display.setText(String.format("%d cookies", counter));
    }
}

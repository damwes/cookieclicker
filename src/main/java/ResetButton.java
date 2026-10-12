import javax.swing.ImageIcon;
import javax.swing.JButton;

class ResetButton extends JButton {

    public ResetButton(CookieCounter counter) {
        super("Reset Game");

        this.setButtonBounds();
        this.setIcon(new ImageIcon("./src/main/resources/reset-game.png"));
        this.setBorder(null);

        this.addActionListener(e -> {
            counter.resetCounter();
        });
    }

    public JButton getButtonComponent() {
        return this;
    }

    private void setButtonBounds() {
        this.setBounds(350, 30, 124, 51);
    }
}

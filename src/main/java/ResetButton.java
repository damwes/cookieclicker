import javax.swing.JButton;

class ResetButton extends JButton {

    public ResetButton(CookieCounter counter) {
        super("Reset Game");

        this.setButtonBounds();

        this.addActionListener(e -> {
            counter.resetCounter();
        });
    }

    public JButton getButtonComponent() {
        return this;
    }

    private void setButtonBounds() {
        this.setBounds(0, 64, 160, 24);
    }
}

import javax.swing.JButton;

class ResetButton {

    private JButton button = new JButton("Reset Game");

    public ResetButton(CookieCounter counter) {
        this.setButtonBounds();

        this.button.addActionListener(e -> {
            counter.resetCounter();
        });
    }

    public JButton getButtonComponent() {
        return this.button;
    }

    private void setButtonBounds() {
        this.button.setBounds(0, 64, 160, 24);
    }
}

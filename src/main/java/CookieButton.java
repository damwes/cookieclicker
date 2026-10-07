import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.concurrent.*;
import javax.imageio.ImageIO;
import javax.swing.*;

class CookieButton {

    private JButton button = new JButton();

    private int buttonSize = 250;
    private int iconSize = 200;

    public CookieButton(CookieCounter counter, int windowSize) {
        this.setButtonBounds(windowSize);
        this.setIcon();

        this.button.addActionListener(e -> {
            counter.setCounter();
            dispatchClickAnimation();
        });
    }

    public JButton getButtonComponent() {
        return this.button;
    }

    private int getButtonPosition(int windowSize) {
        return windowSize / 2 - this.buttonSize / 2;
    }

    private Image getImage() {
        BufferedImage image = null;

        try {
            image = ImageIO.read(new File("./src/main/resources/cookie.png"));
        } catch (IOException e) {}

        return new ImageIcon(image).getImage();
    }

    private void setIcon() {
        Image icon = this.getImage().getScaledInstance(
            this.iconSize,
            this.iconSize,
            Image.SCALE_SMOOTH
        );

        this.button.setIcon(new ImageIcon(icon));
        this.button.setBorder(null);
    }

    private void setButtonBounds(int windowSize) {
        this.button.setBounds(
            this.getButtonPosition(windowSize),
            this.getButtonPosition(windowSize),
            this.buttonSize,
            this.buttonSize
        );
    }

    private void dispatchClickAnimation() {
        this.iconSize += 20;
        this.setIcon();

        ScheduledExecutorService executorService =
            Executors.newSingleThreadScheduledExecutor();

        Runnable command = () -> {
            iconSize -= 20;
            setIcon();
        };

        executorService.schedule(command, 100, TimeUnit.MILLISECONDS);
    }
}

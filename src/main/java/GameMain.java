class GameMain {

    public static void main(String[] args) {
        new GameMain();
    }

    public GameMain() {
        GameWindow window = new GameWindow();

        CookieCounter scoreDisplay = new CookieCounter(window.getWindowSize());
        CookieButton cookieButton = new CookieButton(
            scoreDisplay,
            window.getWindowSize()
        );
        ResetButton resetButton = new ResetButton(scoreDisplay);

        window.getFrame().add(scoreDisplay.getDisplayComponent());
        window.getFrame().add(cookieButton.getButtonComponent());
        window.getFrame().add(resetButton.getButtonComponent());

        window.setFrameVisible();
    }
}

    private void startGame(boolean vsAI) {
        this.vsComputer = vsAI;
        playerXTurn = true;
        for (JButton button : buttons) {
            button.setText("");
            button.setEnabled(true);
            button.setBackground(null);
        }
        restartButton.setVisible(false);
    }

    private void resetGame() {
        for (JButton button : buttons) {
            button.setText("");
            button.setEnabled(true);
            button.setBackground(null);
        }
        restartButton.setVisible(false);
        playerXTurn = true;
    }

    // Part 5: Helper Methods and Main
    private boolean checkWin() {
        String[][] winPatterns = {
            { "0", "1", "2" }, { "3", "4", "5" }, { "6", "7", "8" },
            { "0", "3", "6" }, { "1", "4", "7" }, { "2", "5", "8" },
            { "0", "4", "8" }, { "2", "4", "6" }
        };

        for (String[] pattern : winPatterns) {
            int a = Integer.parseInt(pattern[0]);
            int b = Integer.parseInt(pattern[1]);
            int c = Integer.parseInt(pattern[2]);
            String val = buttons[a].getText();
            if (!val.equals("") && val.equals(buttons[b].getText()) && val.equals(buttons[c].getText())) {
                highlightWin(a, b, c);
                return true;
            }
        }
        return false;
    }

    private boolean isDraw() {
        for (JButton btn : buttons) {
            if (btn.getText().equals("")) return false;
        }
        return true;
    }

    private void disableButtons() {
        for (JButton btn : buttons) {
            btn.setEnabled(false);
        }
    }

    private void highlightWin(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToeGUI game = new TicTacToeGUI();
            game.setVisible(true);
        });
    }
}

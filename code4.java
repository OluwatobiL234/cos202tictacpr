    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnClicked = (JButton) e.getSource();
        if (!btnClicked.getText().equals("")) return;

        btnClicked.setText(playerXTurn ? "X" : "O");
        btnClicked.setForeground(playerXTurn ? Color.BLUE : Color.RED);

        if (checkWin()) {
            disableButtons();
            JOptionPane.showMessageDialog(this,
                " Player " + (playerXTurn ? "X" : "O") + " wins!",
                "Game Over", JOptionPane.INFORMATION_MESSAGE);
            restartButton.setVisible(true);
        } else if (isDraw()) {
            JOptionPane.showMessageDialog(this,
                " It's a draw!",
                "Game Over", JOptionPane.INFORMATION_MESSAGE);
            restartButton.setVisible(true);
        } else {
            playerXTurn = !playerXTurn;

            if (vsComputer && !playerXTurn) {
                computerMove();
            }
        }
    }

    private void computerMove() {
        Timer timer = new Timer(500, e -> {
            int move;
            do {
                move = random.nextInt(9);
            } while (!buttons[move].getText().equals(""));
            buttons[move].doClick();
        });
        timer.setRepeats(false);
        timer.start();
    }

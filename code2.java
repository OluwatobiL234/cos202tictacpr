    public TicTacToeGUI() {
        setTitle("Tic Tac Toe Game");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Tic Tac Toe", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        JPanel boardPanel = new JPanel(new GridLayout(3, 3));
        Font btnFont = new Font("Arial", Font.BOLD, 48);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(btnFont);
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            boardPanel.add(buttons[i]);
        }

        add(boardPanel, BorderLayout.CENTER);

        modePanel = new JPanel();
        JButton friendButton = new JButton(" Play with Friend");
        JButton computerButton = new JButton(" Play with Computer");
        restartButton = new JButton(" Restart Game");

        friendButton.addActionListener(e -> startGame(false));
        computerButton.addActionListener(e -> startGame(true));
        restartButton.addActionListener(e -> resetGame());

        modePanel.add(friendButton);
        modePanel.add(computerButton);
        modePanel.add(restartButton);

        restartButton.setVisible(false); 

        add(modePanel, BorderLayout.SOUTH);
    }


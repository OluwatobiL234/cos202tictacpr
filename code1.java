import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToeGUI extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private boolean playerXTurn = true;
    private boolean vsComputer = false;
    private Random random = new Random();
    private JButton restartButton;
    private JPanel modePanel;

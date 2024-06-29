import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class BKeyB implements ActionListener {

    JFrame board;
    JTextField textfield;
    JButton[] alphabetButtons = new JButton[30];
    JButton[] functionButtons = new JButton[3];
    JButton A, B, C, Č, Ć, D, Đ; 
    JButton Dž, E, F, G, H, I, J;
    JButton K, L, M, N, NJ, O, P;
    JButton R, S, Š, T, U, V, Z, Ž;
    JButton clr, ply, spc;

    Font myFont = new Font("Times New Roman",Font.BOLD,60);

    BKeyB() {
        board = new JFrame("Bosnian Alphabet");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(1325, 500);
        board.setLayout(null);
        board.setResizable(true);

        textfield = new JTextField();
        textfield.setBounds(10, 340, 500, 100);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        A = new JButton("A");
        B = new JButton("B");
        C = new JButton("C");
        Č = new JButton("Č");
        Ć = new JButton("Ć");
        D = new JButton("D");
        Đ = new JButton("Đ");
        Dž = new JButton("Dž");
        E = new JButton("E");
        F = new JButton("F");
        G = new JButton("G");
        H = new JButton("H");
        I = new JButton("I");
        J = new JButton("J");
        K = new JButton("K");
        L = new JButton("L");
        M = new JButton("M");
        N = new JButton("N");
        NJ = new JButton("NJ");
        O = new JButton("O");
        P = new JButton("P");
        R = new JButton("R");
        S = new JButton("S");
        Š = new JButton("Š");
        T = new JButton("T");
        U = new JButton("U");
        V = new JButton("V");
        Z = new JButton("Z");
        Ž = new JButton("Ž");
        clr = new JButton("clear");
        ply = new JButton("play");
        spc = new JButton("_");

        alphabetButtons[0] = A;
        alphabetButtons[1] = B;
        alphabetButtons[2] = C;
        alphabetButtons[3] = Č;
        alphabetButtons[4] = Ć;
        alphabetButtons[5] = D;
        alphabetButtons[6] = Đ;
        alphabetButtons[7] = Dž;
        alphabetButtons[8] = E;
        alphabetButtons[9] = F;
        alphabetButtons[10] = G;
        alphabetButtons[11] = H;
        alphabetButtons[12] = I;
        alphabetButtons[13] = J;
        alphabetButtons[14] = K;
        alphabetButtons[15] = L;
        alphabetButtons[16] = M;
        alphabetButtons[17] = N;
        alphabetButtons[18] = NJ;
        alphabetButtons[19] = O;
        alphabetButtons[20] = P;
        alphabetButtons[21] = R;
        alphabetButtons[22] = S;
        alphabetButtons[23] = Š;
        alphabetButtons[24] = T;
        alphabetButtons[25] = U;
        alphabetButtons[26] = V;
        alphabetButtons[27] = Z;
        alphabetButtons[28] = Ž;
        functionButtons[0] = clr;
        functionButtons[1] = ply;
        functionButtons[2] = spc;

        for (int i = 0; i < 29; i++) {
            alphabetButtons[i].addActionListener(this);
            alphabetButtons[i].setFont(myFont);
            alphabetButtons[i].setFocusable(false);
            alphabetButtons[i].setBounds(10 + (i % 10) * (120 + 10), 10 + (i / 10) * (100 + 10), 120, 100);
            board.add(alphabetButtons[i]);
        }

        for (int i = 0; i < 2; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        clr.setFont(myFont);
        clr.setFocusable(false);
        clr.setBounds(520, 340, 170, 100);
        clr.addActionListener(this);
        board.add(clr);

        ply.setFont(myFont);
        ply.setFocusable(false);
        ply.setBounds(700, 340, 170, 100);
        ply.addActionListener(this);
        board.add(ply);

        spc.setFont(myFont);
        spc.setFocusable(false);
        spc.setBounds(1180, 230, 120, 100);
        spc.addActionListener(this);
        board.add(spc);

        board.add(textfield);
        board.setVisible(true);
    }

    public static void main(String[] args) {
        new BKeyB();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == A) {
            System.out.println("A Pressed");
            textfield.setText(textfield.getText() + A.getText());
            playSound("A_sound.wav");
    }
    if (e.getSource() == B) {
        System.out.println("B Pressed");
        textfield.setText(textfield.getText() + B.getText());
        playSound("B_sound.wav");
}
if (e.getSource() == C) {
    System.out.println("C Pressed");
    textfield.setText(textfield.getText() + C.getText());
    playSound("C_sound.wav");
}
if (e.getSource() == Č) {
    System.out.println("C v Pressed");
    textfield.setText(textfield.getText() + Č.getText());
    playSound("Č_sound.wav");
}
if (e.getSource() == Ć) {
    System.out.println("C' Pressed");
    textfield.setText(textfield.getText() + Ć.getText());
    playSound("Ć_sound.wav");
}
if (e.getSource() == D) {
    System.out.println("D Pressed");
    textfield.setText(textfield.getText() + D.getText());
    playSound("D_sound.wav");
}
if (e.getSource() == Đ) {
    System.out.println("D- Pressed");
    textfield.setText(textfield.getText() + Đ.getText());
    playSound("Ð_sound.wav");
}
if (e.getSource() == Dž) {
    System.out.println("Dz Pressed");
    textfield.setText(textfield.getText() + Dž.getText());
    playSound("Dž_sound.wav");
}
if (e.getSource() == E) {
    System.out.println("E Pressed");
    textfield.setText(textfield.getText() + E.getText());
    playSound("E_sound.wav");
}
if (e.getSource() == F) {
    System.out.println("F Pressed");
    textfield.setText(textfield.getText() + F.getText());
    playSound("F_sound.wav");
}
if (e.getSource() == G) {
    System.out.println("G Pressed");
    textfield.setText(textfield.getText() + G.getText());
    playSound("G_sound.wav");
}
if (e.getSource() == H) {
    System.out.println("H Pressed");
    textfield.setText(textfield.getText() + H.getText());
    playSound("H_sound.wav");
}
if (e.getSource() == I) {
    System.out.println("I Pressed");
    textfield.setText(textfield.getText() + I.getText());
    playSound("I_sound.wav");
}
if (e.getSource() == J) {
    System.out.println("J Pressed");
    textfield.setText(textfield.getText() + J.getText());
    playSound("J_sound.wav");
}
if (e.getSource() == K) {
    System.out.println("K Pressed");
}
if (e.getSource() == L) {
    System.out.println("L Pressed");
}
if (e.getSource() == M) {
    System.out.println("M Pressed");
}
if (e.getSource() == N) {
    System.out.println("N Pressed");
}
if (e.getSource() == NJ) {
    System.out.println("NJ Pressed");
}
if (e.getSource() == O) {
    System.out.println("O Pressed");
}
if (e.getSource() == P) {
    System.out.println("P Pressed");
}
if (e.getSource() == R) {
    System.out.println("R Pressed");
}
if (e.getSource() == S) {
    System.out.println("S Pressed");
}
if (e.getSource() == Š) {
    System.out.println("S v Pressed");
}
if (e.getSource() == T) {
    System.out.println("T Pressed");
}
if (e.getSource() == U) {
    System.out.println("U Pressed");
}
if (e.getSource() == V) {
    System.out.println("V Pressed");
}
if (e.getSource() == Z) {
    System.out.println("Z Pressed");
    playSound("Z_sound.wav");
}
if (e.getSource() == Ž) {
    System.out.println("Z v Pressed");
}
if (e.getSource() == spc) {
    textfield.setText(textfield.getText() + " ");
}
if (e.getSource() == clr) {
    textfield.setText("");
    System.out.println("Textfield Cleared");
}
if (e.getSource() == ply) {
    System.out.println("Textfield Played");
    playTextSounds();
}

    }
    private void playTextSounds() {
        String text = textfield.getText();
        for (char ch : text.toCharArray()) {
            playSound(ch + "_sound.wav");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public void playSound(String soundFile) {
        try {
            File soundPath = new File(soundFile);
            if (soundPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("Can't find file");
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}
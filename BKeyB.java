import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BKeyB {

    JFrame board;
    JPanel keyboard;
    JButton[] alphabetButtons = new JButton[28];
    JButton A, B, C, Č, Ć, D, Đ; 
    JButton Dž, E, F, G, H, I, J;
    JButton K, L, M, N, NJ, O, P;
    JButton R, S, Š, T, U, V, Z, Ž;

    Font myFont = new Font("Times New Roman",Font.BOLD,60);

    BKeyB() {

        board = new JFrame("Bosnian Alphbet");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(1500, 750);
        board.setLayout(null);
        board.setResizable(true);
        board.setVisible(true);

        keyboard = new JPanel();
        keyboard.setBounds(20,20,700, 650);
        keyboard.setLayout(new GridLayout(4,7,10,10));
        //keyboard.setBackground(Color.green);

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
        K = new JButton("L");
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

        keyboard.add(A);
        keyboard.add(B);
        keyboard.add(C);
        keyboard.add(Č);
        keyboard.add(Ć);
        keyboard.add(D);
        keyboard.add(Đ);
        keyboard.add(Dž);
        keyboard.add(E);
        keyboard.add(F);
        keyboard.add(G);
        keyboard.add(H);
        keyboard.add(I);
        keyboard.add(J);
        keyboard.add(K);
        keyboard.add(L);
        keyboard.add(M);
        keyboard.add(N);
        keyboard.add(NJ);
        keyboard.add(O);
        keyboard.add(P);
        keyboard.add(R);
        keyboard.add(S);
        keyboard.add(Š);
        keyboard.add(T);
        keyboard.add(U);
        keyboard.add(V);
        keyboard.add(Z);
        keyboard.add(Ž);



        board.add(keyboard);
}
public static void main(String[] args) {

    new BKeyB();
}
}

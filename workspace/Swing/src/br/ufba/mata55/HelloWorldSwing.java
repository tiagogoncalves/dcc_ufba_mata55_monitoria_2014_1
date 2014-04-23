package br.ufba.mata55;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class HelloWorldSwing extends JFrame {

	public HelloWorldSwing() {
        initUI();
    }

    private void initUI() {

       JPanel panel = new JPanel();
       getContentPane().add(panel);

       panel.setLayout(null);

       setTitle("Hello World!");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HelloWorldSwing ex = new HelloWorldSwing();
                ex.setVisible(true);
            }
        });
    }
}
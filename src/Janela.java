import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Janela implements ActionListener {

    private static Random aleatorio;
    private static JLabel titulo;
    private static JLabel labelDigito1;
    private static JLabel labelDigito2;
    private static JLabel labelDigito3;
    private static JLabel labelDigito4;
    private static JLabel labelDigito5;
    private static JButton botao;
    
    public static void principal() {
    
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        
        titulo = new JLabel("LOTERIA");
        titulo.setBounds(115, 20, 80, 25);
        panel.add(titulo);

        labelDigito1 = new JLabel("0");
        labelDigito1.setBounds(74, 60, 80, 25);
        panel.add(labelDigito1);

        labelDigito2 = new JLabel("0");
        labelDigito2.setBounds(106, 60, 80, 25);
        panel.add(labelDigito2);

        labelDigito3 = new JLabel("0");
        labelDigito3.setBounds(138, 60, 80, 25);
        panel.add(labelDigito3);

        labelDigito4 = new JLabel("0");
        labelDigito4.setBounds(170, 60, 80, 25);
        panel.add(labelDigito4);

        labelDigito5 = new JLabel("0");
        labelDigito5.setBounds(202, 60, 80, 25);
        panel.add(labelDigito5);

        botao = new JButton("Sortear");
        botao.setBounds(100, 100, 80, 25);
        botao.addActionListener(new Janela());
        panel.add(botao);

        frame.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        aleatorio = new Random();
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(aleatorio.nextInt(100));
        numeros.add(aleatorio.nextInt(100));
        numeros.add(aleatorio.nextInt(100));
        numeros.add(aleatorio.nextInt(100));
        numeros.add(aleatorio.nextInt(100));

        labelDigito1.setText(Integer.toString(numeros.get(0))); 
        labelDigito2.setText(Integer.toString(numeros.get(1)));
        labelDigito3.setText(Integer.toString(numeros.get(2)));
        labelDigito4.setText(Integer.toString(numeros.get(3)));
        labelDigito5.setText(Integer.toString(numeros.get(4)));
        
    }

}
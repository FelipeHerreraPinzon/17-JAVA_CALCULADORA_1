import  javax.swing.*;
import  java.awt.event.*;
import java.util.*;

public class Calculadora extends JFrame implements ActionListener{

private JTextField textfield1, textfield2;
private JLabel label1, label2, label3;
private JButton boton1, boton2, boton3, boton4, boton5;

public Calculadora(){
     setLayout(null);
    label1 = new JLabel("Número 1:");
    label1.setBounds(50, 5, 100, 30);
    add(label1);

    label2 = new JLabel("Número 2:");
    label2.setBounds(50, 35, 100, 30);
    add(label2);

    label3 = new JLabel("RESULTADO: " );
    label3.setBounds(120, 120, 400, 30);
    add(label3);

    textfield1 = new JTextField();
    textfield1.setBounds(120, 10, 150, 20);
    add(textfield1);

    textfield2 = new JTextField();
    textfield2.setBounds(120, 40, 150, 20);
    add(textfield2);

    boton1 = new JButton("Sumar");
    boton1.setBounds(10, 80, 100, 30);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("Restar");
    boton2.setBounds(120, 80, 100, 30);
    add(boton2);
    boton2.addActionListener(this);

    boton3 = new JButton("Multiplicar");
    boton3.setBounds(230, 80, 100, 30);
    add(boton3);
    boton3.addActionListener(this);

    boton4 = new JButton("Dividir");
    boton4.setBounds(340, 80, 100, 30);
    add(boton4);
    boton4.addActionListener(this);

    boton5 = new JButton("Raiz Cuadrada de suma");
    boton5.setBounds(450, 80, 200, 30);
    add(boton5);
    boton5.addActionListener(this);



}

public void actionPerformed(ActionEvent e){

    if(e.getSource() == boton1){
        int valor1 = 0, valor2 = 0;
        double resultado = 0;

        valor1 = Integer.parseInt(textfield1.getText());
        valor2 = Integer.parseInt(textfield2.getText());

        resultado = valor1 + valor2;

        label3.setText("Resultado SUMA: " + resultado);
    } else if(e.getSource() == boton2){
        int valor1 = 0, valor2 = 0;
        double resultado = 0;

        valor1 = Integer.parseInt(textfield1.getText());
        valor2 = Integer.parseInt(textfield2.getText());

        resultado = valor1 - valor2;

        label3.setText("Resultado RESTA: " + resultado);
    } else if(e.getSource() == boton3){
        int valor1 = 0, valor2 = 0;
        double resultado = 0;

        valor1 = Integer.parseInt(textfield1.getText());
        valor2 = Integer.parseInt(textfield2.getText());

        resultado = valor1 * valor2;

        label3.setText("Resultado MULTIPLICACION: " + resultado);
    } else if(e.getSource() == boton4){
        int valor1 = 0, valor2 = 0;
        double resultado = 0, residuo = 0;

        valor1 = Integer.parseInt(textfield1.getText());
        valor2 = Integer.parseInt(textfield2.getText());

        resultado = valor1 / valor2;
        residuo = valor1 % valor2;
        resultado = resultado + residuo;


        label3.setText("Resultado DIVISION: " + resultado);
    } else if(e.getSource() == boton5){
        int valor1 = 0, valor2 = 0;
        double resultado = 0;

        valor1 = Integer.parseInt(textfield1.getText());
        valor2 = Integer.parseInt(textfield2.getText());

        resultado = valor1 + valor2;
        double resultadoRaiz = Math.sqrt(resultado);


        label3.setText("Resultado SUMA RAIZ CUADRADA  : " + resultadoRaiz);
    }


}

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setBounds(0,0,675,350);
        calculadora.setVisible(true);
        calculadora.setResizable(false);
        calculadora.setLocationRelativeTo(null);
    }

}

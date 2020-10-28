package main;

import javax.swing.*;

public class App {
    public static void main(final String[] args) throws Exception {
        final Calculadora cal = new Calculadora();

        String s = JOptionPane.showInputDialog("Operando 1");
        cal.setOp1(Double.parseDouble(s));

        s = JOptionPane.showInputDialog("Operando 2");
        cal.setOp2(Double.parseDouble(s));
        
        try {
            JOptionPane.showMessageDialog(null,"Resultado: " + cal.raizQuadrada());
        } catch (MyArithmeticException e) {
            e.printStackTrace();
        }
    }
}


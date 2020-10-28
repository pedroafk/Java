package main;

public interface IOperationsImpl {
    public double add();
    public double subt();
    public double times();
    public double divide() throws MyArithmeticException;
    public void reset();

    public double potencia();
    public double quadrado();
    public double raizQuadrada() throws MyArithmeticException;
}
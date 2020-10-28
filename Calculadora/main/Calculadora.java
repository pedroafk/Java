package main;

public class Calculadora implements IOperationsImpl{
    private double op1;
    private double op2;
    private double resul;

    public Calculadora(){
        this.op1 = this.op2 = this.resul = Double.MIN_VALUE;
    }

    @Override
    public double add() {
        this.resul = this.op1 + this.op2;
        return this.resul;
    }

    @Override
    public double subt() {
        this.resul = this.op1 - this.op2;
        return this.resul;
    }

    @Override
    public double times() {
        this.resul = this.op1 * this.op2;
        return this.resul;
    }

    @Override
    public double divide() throws MyArithmeticException {
        if(this.op2 == 0.0) {
            this.resul = 0;
            throw new MyArithmeticException("Divisão por zero");
        } else {
            this.resul = this.op1 / this.op2;
        }
        return this.resul;
    }

    //Getters and Setters da classe private;
    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    //Metodos acrescentados depois;
    @Override
    public void reset() {
        this.resul = 0;
    }

    @Override
    public double potencia() {
        this.resul = Math.pow(this.op1, this.op2);
        return this.resul;
    }

    @Override
    public double quadrado() {
        this.resul = (this.op1)*(this.op1);
        return this.resul;
    }

    @Override
    public double raizQuadrada() throws MyArithmeticException {
        if(this.op1 < 0) {
            this.resul = 0;
            throw new MyArithmeticException("Raiz de número negativo");
        } else {
            this.resul = Math.sqrt(this.op1);
        }
        return this.resul;
    }

    
}

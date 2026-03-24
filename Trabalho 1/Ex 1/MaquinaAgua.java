
public class MaquinaAgua {

    private int copos200;
    private int agua;
    private int copos300;

    public int agua() {
        return this.agua;
    }

    public int copos200() {
        return this.copos200;
    }

    public void servirCopo200() {
        if (this.agua >= 200 && this.copos200 > 0) {
            this.agua -= 200;
            this.copos200--;            
        }
    }

    public void abastecerAgua() {
        this.agua = 20000;
    }

    public void abastecerCopo200() {
        this.copos200 = 100;
    }

    public void servirCopo300() {
        if (this.agua >= 300 && this.copos300 > 0) {
            this.agua -= 300;
            this.copos300--;            
        }
    }    

    public void abastecerCopo300() {
        this.copos300 = 100;
    }

    public int copos300() {
        return this.copos300;
    }

}

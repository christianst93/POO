
public class Forno {

    public final int volume;
    public final int tensao;
    public final int potencia;
    public final int largura;
    public final int altura;
    public final int profundidade;
    private int temperatura;
    private boolean ligado = false;
    private int tempoRestante;

    public Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade) {
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public boolean ligado() {
        return this.ligado;
    }

    public void aumentarTemperatura() {
        this.ligado = true;
        if (this.temperatura >= 300) {
            this.temperatura = 300;
        } else if (this.temperatura == 200) {
            this.temperatura = 220;
        } else if (this.temperatura == 220) {
            this.temperatura = 250;
        } else {
            this.temperatura += 50;
        }
    }

    public int temperatura() {
        return this.temperatura;
    }

    public void diminuirTemperatura() {
        if (this.ligado == true) {
            if (this.temperatura == 300) {
                this.temperatura = 250;
            } else if (this.temperatura == 250) {
                this.temperatura = 220;
            } else if (this.temperatura == 220) {
                this.temperatura = 200;
            } else {
                this.temperatura -= 50;
            }
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            this.temperatura = 0;
            this.ligado = false;
        }
    }

    public void setTimer(int tempo) {
       if (tempo > 0 && tempo <= 120) {
         this.tempoRestante = tempo;
       }
    }

    public int tempoRestante() {
        return this.tempoRestante;
    }

    public void tick() {
        if (this.ligado == true && this.tempoRestante > 0) {
            this.tempoRestante--;
        }
        if (this.ligado == true && this.tempoRestante == 0) {
            this.temperatura = 0;
            this.ligado = false;
        }
    }

}

class Titik {
    private double absis;
    private double ordinat;
    static int counterTitik;
    static int jarakPusat;

    public Titik(){
        this(0,0);
    }
    public Titik (double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    void setAbsis (double x){
        this.absis = x;

    }
    void setOrdinat (double y){
        this.ordinat = y;
    }
    double getAbsis(){
        return this.absis;
    }
    double getOrdinat(){
        return this.ordinat;
    }
    double getCounterTitik(){
        return counterTitik;
    }
}
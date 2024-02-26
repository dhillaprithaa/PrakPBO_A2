public class OperasiTitik {

    private void refleksiSumbuX (Titik titik){
        double y = titik.getOrdinat ();
        
        y*= -1;
        titik.setOrdinat (y);
    }
    public double getJarakPusat (Titik titik){
        double x = titik.getAbsis ();
        double y = titik.getOrdinat();

        double jarakPusat = Math.sqrt (Math.pow (x,2)+Math.pow(y,2));

        return jarakPusat;
    }
    private void refleksiSumbuY (Titik titik){
        double x = titik.getAbsis();
        x *= -1 ;
        titik.setAbsis(x);
    }
    public Titik refleksiX (Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }
    public Titik refleksiY (Titik titik){
        refleksiSumbuY(titik);
        return titik;

    }
}

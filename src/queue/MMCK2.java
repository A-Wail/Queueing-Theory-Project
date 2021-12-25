package queue;

public class MMCK2 {

    private final double λ;
    private final double u;
    private final int c;
    private int n;

    public MMCK2(double λ, double u, int c) {
        this.λ = λ;
        this.u = u;
        this.c = c;
    }

    public double Ci() {
        double ci = c - r();
        return ci;
    }

    public double Pci() {
        return Ci() / c;
    }

    public double Lq() {
        double Lq;
        Lq = (((Math.pow(r(), c + 1) / c) / (factorial(c) * Math.pow(1 - (r() / c), 2))) * (1 / p0()));
        return Lq;
    }

    public double Wq() {
        double Wq = Lq() / λ;
        return Wq;
    }

    public double W() {
        double W = (Lq() / λ) + (1 / u);
        return W;
    }

    public double L() {
        double L = Lq() + r();
        return L;
    }
// N احتمالية وجود عدد  

    public double Pn(int N) {
        this.n = N;
        double pn = 0;
        if (n >= 0 && c > n) {
            pn = ((Math.pow(λ, n)) / (factorial(n) * Math.pow(u, n))) * (1 / p0());
            return pn;
        } else if (n >= c) {
            pn = (Math.pow(λ, n) / (Math.pow(c, n - c) * factorial(c) * Math.pow(u, n))) * (1 / p0());
            return pn;
        }
        return pn;
    }

    public double r() {
        double r = λ / u;
        return r;
    }

    public double ρ() {
        double ρ = r() / c;
        return ρ;
    }

    //مقلوب ال   p0
    public double p0() {
        double p0;
        if (ρ() < 1) {
            double sum1 = 0;
            for (int n = 0; n <= c - 1; n++) {
                double sum = ((Math.pow(r(), n)) / factorial(n));
                sum1 = sum1 + sum;
            }
            p0 = sum1 + ((c * Math.pow(r(), c)) / (factorial(c) * (c - r())));
            return p0;
        } else {
            double sum3, sum4 = 0;
            for (int n = 0; n <= c - 1; n++) {
                sum3 = ((1 / factorial(n)) * (Math.pow(r(), n)));
                sum4 += sum3;
            }
            p0 = sum4 + ((1 / factorial(c)) * (Math.pow(r(), c)) * ((c * u) / ((c * u) - λ)));
        }
        return p0;
    }

    public int factorial(int a) {
        int i, fact = 1;
        int num = a;
        for (i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}

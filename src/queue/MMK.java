package queue;
public class MMK {
     private int k,n;
     private double λ,u;

    public MMK(int k, double λ, double u) {
        this.k = k;
        this.λ = λ;
        this.u = u;
    }

    
    // Expected number of the customers in the system
    public double L(){
        double L;
       double ρ =λ/u;
       if(ρ!=1){
       L=((ρ)*((1-((k+1)* Math.pow(ρ, k))+(k* Math.pow(ρ, k+1)))/((1-ρ)*(1-Math.pow(ρ, k+1)))));
       }else{
           L=k/2;
       }
        return L;
    }
    // Expected number of the customers in the queue
    public double Lq(){
        double Lq;
        double ρ =λ/u;
        double L= L();
        double PK= PK();
        Lq=L-(ρ*(1-PK));
        
        return Lq;
    }
    //Expected waiting time in the system
    public  double W(){
        double PK= PK();
        double L= L();
        double w= ((L)/(λ*(1-PK)));
        return w;
    }
    //Expected waiting time in the queue
    public  double Wq(){
        double W=W() ;
        double Wq=W-(1/u);
    return Wq;
    }
    
    public double Pn(int n){
        this.n=n;
        double Pn;
        double ρ =λ/u;
        if(ρ!=1){
            Pn= (Math.pow(ρ, n))*((1-ρ)/(1-Math.pow(ρ, k+1)));
        }else{
            Pn=1/(k+1);
        }
        return Pn;
    }
   public double PK(){
        double PK;
        double ρ =λ/u;
        if(ρ!=1){
          PK= (Math.pow(ρ, k))*((1-ρ)/(1-Math.pow(ρ, k+1)));
        } else{
        PK=1*(k+1);}
        return PK;
    } 

        public void λ_HourToMin() {
        this.λ = this.λ / 60;
    }

    public void u_HourToMin() {
        this.u = this.u / 60;
    }

    public void λu_HourToMin() {
        this.λ = this.λ / 60;
        this.u = this.u / 60;
    }

    public void λ_SecToMin() {
        this.λ = this.λ * 60;
    }

    public void u_SecToMin() {
        this.u = this.u * 60;
    }

    public void λu_SecToMin() {
        this.λ = this.λ * 60;
        this.u = this.u * 60;
    }
    
    /* Convert 1/λ => λ
    With assumption than we initialized λ with 1/λ
    */
    public void time_to_λ(){
        this.λ = 1/this.λ;
    }
    
    /* Convert 1/λ => λ
    With assumption than we initialized λ with 1/λ
    */
    public void time_to_u(){
        this.u = 1/this.u;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setΛ(double λ) {
        this.λ = λ;
    }

    public void setU(double u) {
        this.u = u;
    }

    public int getK() {
        return k;
    }

    public int getN() {
        return n;
    }

    public double getΛ() {
        return λ;
    }

    public double getU() {
        return u;
    }
   
}

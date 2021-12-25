/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Mansour
 */
public class MM1 {
    // We suppose λ, u in Minutes so we create a function to convert them to Minutes if not created in main

    private double λ, u, n, ρ;

    private double P0; // = 1 - ρ

    // Expected number of the customers in the system
    private double L; // = λ / (u-λ) = λ * W
    // Expected number of the customers in the queue
    private double Lq; // = (λ * λ) / u * (u-λ) = λ * Wq
    // Expected waiting time in the system
    double W; // 1 / (u-λ)
    // Expected waiting time in the queue
    double Wq; //  λ / u * (u-λ);

    public MM1(double λ, double u) {
        this.λ = λ;
        this.u = u;
    }


    public void has_λ_u() {

        this.L = this.λ / (this.u - this.λ);
        if(this.L < 0)
            this.L = 0;
        this.Lq = Math.pow(this.λ, 2) / (this.u * (this.u - this.λ));
        if(this.Lq < 0)
            this.Lq = 0;
        this.W = 1 / (this.u - this.λ);
        if(this.W < 0)
            this.W = 0;
        this.Wq = this.λ / (this.u * (this.u - this.λ));
        if(this.Wq < 0)
            this.Wq = 0;
        this.ρ = λ / u;

    }
    /* Like EX 3 lec 4
    State => less than n customers or equal or more than n customers
    */
    public float getU_has_customers_with_probability(double n, double P, String state){ // n => customers, Probability
        // assuming we have probability lass than 5 customers
        // Suppose n = 5 and probability less than 5 is 99%
        // we will use the probability of 5 or more customers because it has obvious law
        P = P / 100;
        // if (state.equals(">=")) don't do any thing
        switch(state){
            case ">":
                n = n + 1;
                break;
            case "<":
                P = 1 - P;
                break;
            case "<=":
                P = 1 - P;
                n = n + 1;
            default:
                break;
        }

        this.u = Math.pow(Math.pow(this.λ, n) / P , 1/n);
        
        return (float) this.u;
        
    }
    /* Used in Example 4 (b) lec4 
    State refers to is wait more then or equal or less than the number written in double w
    */
    
    public float getλ_has_u_W(double w){ //String state
        // w = λ / u(u-λ)
         this.λ = w * Math.pow(this.u, 2) / (1 + w * this.u );
         //if(state.equals("="))
         //    return "λ = " + this.λ;
         // else if (state.equals(">="))
         //    return "λ >= " + this.λ;
         //else if (state.equals("<="))
             return (float)this.λ;
        //return null;
         
    }

    public String getL() {
        float temp = (float) L;
        return String.valueOf(temp);
    }

    public String getLq() {

        float temp = (float) Lq;
        return String.valueOf(temp);
    }
    
    public String getλ(){
        float temp = (float) λ;
        return String.valueOf(temp);
    }
    
    // Probability that there's a customers in the system
    public double probabilityCustomerOccupied() {
        // = 1-P0 = 1-(1-ρ) = ρ
        return this.ρ;
    }

    public String getP0() { // Get probability of no customers in the System
        float temp = (float) (1 - this.ρ);
        if( temp < 0 )
            temp = 0;
        return String.valueOf(temp);
    }

    public String getW() {
        
        float temp = (float) W;
        return String.valueOf(temp);
    }

    public String getWq() {
        
        float temp = (float) Wq;
        return String.valueOf(temp);
    }


    public void setλ(double λ) {
        this.λ = λ;
    }

    public void setU(double u) {
        this.u = u;
    }

    public void setλU(double λ, double u) {
        this.λ = λ;
        this.u = u;
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
    
    public void w_HourToMin(){
        this.W *=60;
    }
    
    public void W_SecToMin(){
        this.W /=60;
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
    

}

public class EmiCalculator {
    public float calculateEmi(int principle,float roi,int tenure){
        float calculatedEmi = principle * roi / tenure * 12;
        return calculatedEmi;
    }
    public float calculateEmi(EmiDetails e){//30303030
        float calculatedEmi = e.amount*e.rateOfInterest / e.loanTenure * 12;
        return calculatedEmi;
    }
}

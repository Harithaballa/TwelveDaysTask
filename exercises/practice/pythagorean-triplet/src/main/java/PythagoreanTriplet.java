import java.util.*;
class PythagoreanTriplet{
    private int sum;
    private int sumLimit;
    private int i;
    private int j;
    private int k;
    
    public PythagoreanTriplet(){}
    public PythagoreanTriplet(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }
    public static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }
    public PythagoreanTriplet withFactorsLessThanOrEqualTo(int sumLimit) {
        this.sumLimit = sumLimit;
        return this;
    }
    public PythagoreanTriplet thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }
    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> res = new ArrayList<PythagoreanTriplet>();
        for(int a=1;a<sumLimit-1;a++){
            int sumTo=sum-a;
            int b=a+1;
            int c=sumLimit;
            while(b<c){
                if(sumTo==b+c){
                    if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                       res.add(new PythagoreanTriplet(a,b,c));
                    }
                    b++;
                    c--;
                }
                else if(sumTo<b+c){
                    c--;
                }
                else
                    b++;
            }
        }
        
        return res;
     
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet other = (PythagoreanTriplet) o;
        return i == other.i &&
                j== other.j&&
               k == other.k;
    }
    @Override
    public int hashCode() {
        return Objects.hash(i, j, k);
    }
}

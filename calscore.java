public class calscore {
    public void calculate(){
        double score = Math.random()*100;
        System.out.println("Score is " +score);
        if(score >= 80){
            System.out.println("Grade is A");
        }else if(score >= 70){
            System.out.println("Grade is B");
        }else{
            System.out.println("Grade is C");
        }
    }
}

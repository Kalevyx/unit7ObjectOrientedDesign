public class NumericQuestion extends Question{
    private double answer;
    
    //example of method overloading
    //overloads setAnswer method of Question class
    public void setAnswer(double correctResponse){
        answer = correctResponse;}
    
    //example of method overriding
    //overrides checkAnswer method of Question class
    public boolean checkAnswer(String response){
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble-answer)<=0.01;}}
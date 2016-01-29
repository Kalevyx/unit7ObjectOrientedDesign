import java.util.Scanner;

/* Class supports a fill-in-the-blank question where answer is specifiied in question's text
 * delimited by '-'. Class extracts amswer from questions's text and stores text and answer
 * accordingly
 */

public class FillInQuestion extends Question{
    /*Extracts answer from speicified question text. For example,
     * "The inventor of Java was _James Gosling_."
     * 
     * text: "The inventor of Java was ________."
     * answer: "James Gosling"
     */
    public void set(String questionText){
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "________"+parser.next();
        
        super.setText(question);
        this.setAnswer(answer);}}
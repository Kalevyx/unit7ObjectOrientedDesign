public class Billfold extends CardHierarchy{
    CardHierarchy card1 = new CardHierarchy();
    CardHierarchy card2 = new CardHierarchy();
    public Billfold(CardHierarchy c1, CardHierarchy c2){
        card1 = c1;
        card2 = c2;}
    public void addCard(CardHierarchy card){
        if(card1==null){
            card1=card;}
        else if(card2==null){
            card2=card;}}
    public String formatCards(){
        String str = "";
        if(card1!=null){
            str+=card1.format();}
        else if(card2!=null){
            str+=card2.format();}
        return str;}
    public static void main(String[]args){
        Billfold billfold = new Billfold();
        billfold.addCard(new CardHierarchy(J));}}
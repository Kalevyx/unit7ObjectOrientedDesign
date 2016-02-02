public class Billfold extends CardHierarchy{
    CardHierarchy card1 = new CardHierarchy();
    CardHierarchy card2 = new CardHierarchy();
    public Billfold(CardHierarchy c1, CardHierarchy c2){
        card1 = c1;
        card2 = c2;}
    public void addCard(CardHierarchy card){
        if(card1==null){
            card1=new CardHierarchy();}
        else if(card2==null){
            card2=new CardHierarchy();}}
    public String formatCards(){
        return super.format();}}
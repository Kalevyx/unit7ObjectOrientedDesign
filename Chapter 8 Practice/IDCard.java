public class IDCard extends CardHierarchy{
    String idNumber;
    public IDCard(String n, String id){
        super(n);
        idNumber = id;}
    public boolean equals(Object other){
        //check if this object and other object are of same class
        if(this.getClass()==other.getClass()){
            //if so, case other object to IDCard
            IDCard otherIDCard = (IDCard) other;
            //check if superclass (CardHierarchy) determines this object and other object
            //are equal
            boolean isEqual = super.equals(otherIDCard);
            //check if instance variables of this object and other object are equal
            return isEqual&&this.idNumber.equals(otherIDCard.idNumber);}
        return false;}}
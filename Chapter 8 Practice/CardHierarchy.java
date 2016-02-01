public class CardHierarchy{
    private String name;
    public CardHierarchy(){name = "";}
        
    public CardHierarchy(String n){name = n;}
        
    public String getName(){return name;}
        
    public boolean isExppired(){return false;}
        
    public String format(){return "Card holder: "+name;}}
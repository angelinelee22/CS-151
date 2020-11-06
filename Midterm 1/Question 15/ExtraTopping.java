public class ExtraTopping implements PokeBowl{
    public ExtraTopping(PokeBowl bowl, String topping) {
        this.bowl = bowl;
        this.topping = topping;
    }

   public double getPrice() 
   {
      return bowl.getPrice() + 2.50; 
   }

   public String getDescription() 
   {
      return bowl.getDescription() + " + extra " + topping; 
   }

   private PokeBowl bowl;
   private String topping;
}

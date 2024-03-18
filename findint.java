
public class findint{
	   public static void main(String[] args) {
	      String str = "Hello readers";
	      int Index = str.indexOf("s");
	      
	      if(Index == -1) {
	         System.out.println("Not found");
	      } else {
	         System.out.println("Found at index- " + Index);
	      }
	   }
	}
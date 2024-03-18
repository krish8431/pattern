public class ReverseString 
{
    public static void main(String args[]) {
        String str="PWSkillsJAVA";
        int length = str.length();
        String rstr="";
        for(int i=length-1 ; i>=0 ; i--){
            rstr=rstr + str.charAt(i);
        }
        System.out.print("The Reverse of" + str  +  "is : " + rstr);
    }
    
}
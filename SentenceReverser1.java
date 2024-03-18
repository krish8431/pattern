public class SentenceReverser1 {
public static void main(String[] args) {
String str1="Think Twice";
String str2="";
String sen[]=str1.split(" ");
for(String ele: sen)
{
for(int i=ele.length()-1;i>=0;i--)
{
str2=str2+ele.charAt(i);
}
str2=str2 +" ";
}
System.out.println(str2);
}
}
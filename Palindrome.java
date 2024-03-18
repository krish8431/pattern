class Palindrome{
    public static void main(String[] args) {
        String str = "madam";
        int length =str.length();
        String rstr= "";
        for(int i=length-1 ; i>=0 ; i--){
            rstr=rstr + str.charAt(i);
        }
        System.out.print(rstr);
        System.out.println();
        if(str.equals(rstr))
        {
        System.out.print(str + ": is Palindrome String ");
        }
        else{
            System.out.print(str+": is not a Palindrome String");
        }


}
}
class CheckE {
    public static void main(String[] args) {
        String word = "Hello";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'l') {
                System.out.println("The letter 'e' is present in the word '" + word + "'.");
                return;
            }
        }
        System.out.println("The letter 'e' is not present in the word '" + word +"'.");
    }
}
public class PalindromeString{
    
    String text ;

    PalindromeString(String text){
        this.text = text.trim();
    }

    //Method for checking whether it is palindrome or not
    public boolean checkString(String text){
        int n = text.length();
        for(int i=0 ; i<n ; i++){
            if(text.charAt(i)!=text.charAt(n-1-i)){
          return false;
            }
        }
        return true ;
    }

    //method to display result
    public void display(){
        if(checkString(text)){
            System.out.println("The given string is a Palindrome "+text);
        }
        else{
            System.out.println("The given string is not a palindrome "+text);
        }
    }

    public static void main(String[] args) {
        PalindromeString str = new PalindromeString("racecar");
        str.display();
        PalindromeString str1 = new PalindromeString("Madam");
        str1.display();
        PalindromeString str2 = new PalindromeString(" Was It A Car Or A Cat I Saw");
        str2.display();
    }
}
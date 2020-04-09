class Main {
  public static void main(String[] args) {
    //Review classes
    // Strings
    Circle round = new Circle(4.5); // object Circle
    double area = round.area();// to use a method of a class, you need the object before it; dont't forget the parenthesis
    // Ex:
    // round.area - we're trying to accss the instance variable called area
    //round.area() - access the method area
    System.out.println(area);

    double circumference = round.circumference();
    System.out.println(circumference);

    // String
    // To create a String variable:
    String pc = "lenovo"; //this is still an object
    String phone = new String("samsung"); //same with this
    // Making the variable, either way is fine; they are the same thing
    // char 
    // Using the example pc, we have;
    // l e n o v o <- elements
    // 0 1 2 3 4 5 <- these are indexes
    // Going out of the index gives IndexOutOfBoundsException error

    // substring 
    // allows you to take apart Strings
    // For homework we did substring(i, i + 1)
    // But there also exists a substring(i) - starts on the i index and goes all the way to the end of the String
    System.out.println(pc.substring(2, 5)); // starts on 2 and ends before 5 (it doesn't include 5)
    // useful when tryiing to look for a word in a phrase

    // equals 
    // checks to see if the two strings are the same
    // cannot use == because String is not a primitive data type
    boolean answer = pc.equals(phone);
    System.out.println(answer);
    String laptop = "Lenovo";
    answer = pc.equalsIgnoreCase(laptop);
    System.out.println(answer);
    // equals is case-sensitive
    // use equalsIgnoreCase if you don't care about the capitalization

    // compareTo
    // returns an intger (either positive, negative, or zero) based on if the first String is before or after the second String lexicographically (dictionary order)
    String string1 = "Ashley";
    String string2 = "Jeffrey";
    System.out.println(string1.compareTo(string2)); // returns a negative number
    System.out.println(string2.compareTo(string1)); // returns a postive number
    System.out.println(string1.compareTo(string1)); // returns 0

    // length
    // returns the length of the String
    System.out.println(string1.length()); //returns 6
    System.out.println(string2.length()); //returns 7

    // indexOf
    // finds the index of a specific character in a String
    String sport = "soccer";
    System.out.println(sport.indexOf("e"));
    System.out.println(sport.indexOf("c")); //returns the first one
    System.out.println(sport.indexOf("ce")); // can use longer Strings as well
    System.out.println(sport.indexOf("sr")); //returns -1 if it doesn't find the character in the String

    // useful when trying to filter out information from Strings
    //"Error Message: unable to connect to the internet"
    //"Error Message: firewall is down"
    //"Error Message: insufficient storage"
  }
}
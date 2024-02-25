package School;
public class LittleLamb {
    public static void main(String[] args) {
        String verse = new String("Mary had a little lamb, little lamb, little lamb."); //create string verse object
        System.out.println("The length of the verse is: " + verse.length()); //print verse length
        String word = new String("lamb"); //create string word object
        int index = verse.indexOf(word); //index of word
        System.out.println("The first occurence of " + word + " is at index " + index); //print first occurrence of word in verse

        int numOccurrences = 0; //this part finds the number of occurrences of word in the verse
        while (index >= 0) { //while loop, keeps running until can't find the word in the "substring" anymore
            numOccurrences++; //keeps track of how many times word occurs
            index = verse.indexOf(word, index + 1); 
        }
        System.out.println("The word " + word + " occurs " + numOccurrences + " times"); //print the number of occurrences

        int randNum = (int) (verse.length() * Math.random()); //generate a random number 0-48 inclusive
        System.out.println("The random number is: " + randNum); //print the random number
        System.out.println("The new substring is: " + verse.substring(randNum)); //print new substring

        //this part finds the first word in the substring
        int findWord = verse.lastIndexOf(" ", randNum); //finds index of the space before randNum
        int endIndex = verse.indexOf(" ", randNum); //finds index of the space after randNum
        String firstWord = ""; //initate firstWord, which will store the first word in the substring
        if(findWord == endIndex){ // for the exception if the first character of the substring is a space
            endIndex = verse.indexOf(" ", randNum+1); //finds index of the space after the first one
        }
        if(verse.substring(randNum, randNum+1).equals(",")){ //for the exception if the first character is a comma
            findWord = endIndex; //sets the both indexes to the space after its orginal space
            endIndex = verse.indexOf(" ", endIndex+1);
        }
        if (endIndex == -1) { //if there's no space after randNum, which would be the last word in the substring
            firstWord = verse.substring(findWord + 1, verse.length() - 1); //automatically prints the last word in the substring
        } 
        else if (verse.substring(endIndex - 1, endIndex).equals(",")) { //if there's a comma at the end
            firstWord = verse.substring(findWord + 1, endIndex - 1); //gets rid of the comma at the end when storing the word
        } 
        else { //all other cases, when there's normal spaces before and after the word 
            firstWord = verse.substring(findWord + 1, endIndex); 
        }
        System.out.println("The first word in the substring is: " + firstWord); //prints the first word in the substring

    }

}
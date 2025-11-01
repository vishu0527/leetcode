//744. Find Smallest Letter Greater Than Target
class GreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }
public class GreatestLetterTest{
    public static void main(String[] args) {
        GreatestLetter obj = new GreatestLetter();

        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println("Output 1: " + obj.nextGreatestLetter(letters1, target1)); 

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println("Output 2: " + obj.nextGreatestLetter(letters2, target2)); 

        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println("Output 3: " + obj.nextGreatestLetter(letters3, target3));
    }
}
}

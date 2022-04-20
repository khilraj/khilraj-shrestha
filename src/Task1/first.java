// Write a python program to check whether a person can cast a vote or not.
// Condition is you must be above 18 years to vote.
package Task1;

public class first {
    public static void main(String[] args) {
        int age = 18;
        String result;
        result= (age>=18)? "can vote": "can't vote";
        System.out.println(result);

    }
}

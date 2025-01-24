public class Test {
    private String s;
    private int i;
    public Test(String s, int i){
        this.s = s;
        this.i = i;
    }
    public void update(Test t){
        t = new Test("bye", 10);
    }
    public void print(){
        System.out.println(s + " " + i);
    }
    public static void main(String[] args) {
        Test t = new Test("hi", 5);
        t.update(t);
        t.print();


    }
    
}

//notes
/*
 * Strings pass by value, if they are a parameter of a method, cannot chnage
 * ints pass by value [...]
 * doubles pass by value [...]
 * boolenas pass by value [...]
 * objects pass by reference by value - you can change instance vairables and stuff of object, but not the reference itself (where it points to in memory)
 * arrays are passed by reference by value - you’re passing a copy of the reference to the array - 
 * You can modify the contents of the array (i.e., change the elements), 
 * but you cannot change the reference itself (i.e., you cannot make the array variable point to a new array object).
 * arrays can have length zero ex int[] a = new int[0];
 * an int array defaults to 0, a boolean array defaults to false, a double array defaults to 0.0, a string array defaults to null (not an empty string)
 * length of array is a field, not a method so theree are no parentheses
 * zero based indexing
 */

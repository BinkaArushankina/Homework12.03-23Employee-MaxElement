package Homework;

public class MaxElementInArray {
    private int[] ints ;

    public MaxElementInArray(int[] ints ){
        this.ints=ints;
    }
    public int maxElement(){
        int max=ints[0];
        for(int i=1; i<ints.length; i++ ){
            if(ints[i]>max){
                max=ints[i];
            }
        }
        return max;
    }
}

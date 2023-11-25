public class ClassName <T> {

    public int randomNumFromZero (int max){
        return (int) ((Math.random()*max)+1);
    }
    public int randomNumFromMinToMax (int min, int max){
        return (int) (min+(Math.random()*(max-min))+1);
    }
    public char randomChar(){
        return (char) Math.round(Math.random()*255);
    }
    public void printArray (T[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

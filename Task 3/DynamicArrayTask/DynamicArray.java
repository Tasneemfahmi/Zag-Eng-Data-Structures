public class DynamicArray {
    int[] array;
    int size=0;
    int count = 0;
    DynamicArray(){
        size = 100;
        array = new int[size];
    }
    DynamicArray(int n){
        size = n;
        array = new int[size];
    }
    public void printArray(){
        for (int i = 0; i<count;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void insert(int n){
        if (count>=array.length){
            int [] arrayNew = new int [array.length+1];
            for(int i = 0 ; i < array.length;i++){
                arrayNew[i] = array[i];
            }
            array = arrayNew;
            arrayNew[count] = n;
        } else {
            array[count] = n;
        }
        count++;
    }
    public void removeAt(int index){
        if (index<0 || index>count){
            throw new IllegalStateException("This index is not valid");
        }
        int[] arrayNew = new int[array.length-1];
        for (int i=0; i<arrayNew.length;i++){
            if(index<=i){
                arrayNew[i]=array[i+1];
            } else {
                arrayNew[i]=array[i];
            }
        }
        array = arrayNew;
        count--;
    }
    public int indexAt(int item){
        for (int i=0;i<count;i++){
            if (array[i]==item){
                return i;
            }
        }
        return -1;
    }
    public int at(int index){
        return array[index];
    }
    public int max(){
        int max = 0;
        for (int i=0;i<count;i++){
            if (array[i]>=array[max]){
                max = i;
            }
        }
        return array[max];
    }
    public int min(){
        int min = 0;
        for (int i=0;i<count;i++){
            if (array[i]<=array[min]){
                min = i;
            }
        }
        return array[min];
    }
    public void remove(int item){
        if (indexAt(item)<0 || indexAt(item)>count){
            throw new IllegalStateException("This index is not valid");
        }
        int[] arrayNew = new int[array.length-1];
        for (int i=0; i<arrayNew.length;i++){
            if(indexAt(item)<=i){
                arrayNew[i]=array[i+1];
            } else {
                arrayNew[i]=array[i];
            }
        }
        array = arrayNew;
        count--;
    }
}

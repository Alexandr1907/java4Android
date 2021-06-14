package lesson11.lesson;

public class Loader <T extends Resource> {

//    public static T some;
//    public static T someMethod(){
//        return null;
//    }

    private T tObj = null;

    public void upload(T object){
        this.tObj = object;
    }

    public T download(){
        T returnObject = tObj;
        tObj = null;
        return returnObject;
    }

//    public void transfer(Loader<? extends Resource> toLoader){
//        T download = this.download();
//    }
}

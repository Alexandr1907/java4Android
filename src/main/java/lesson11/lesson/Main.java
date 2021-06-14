package lesson11.lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loader<Resource> resourceLoader = new Loader<>();
//        Loader<Sky> skyLoader = new Loader<>();
        Coal coal = new Coal();
        resourceLoader.upload(coal);
        doSome(resourceLoader);

        //Пришел на базу
        Resource resource = resourceLoader.download();
        if (resource instanceof Coal){
            Coal downloadCoal = (Coal) resource;
            System.out.println("Положили уголь на склад угля");
        } else if (resource instanceof Iron){
            Iron downloadCoal = (Iron) resource;
            System.out.println("Положили железо на склад железа");
        }
        resource.print();

        Loader<Iron> ironLoader = new Loader<>();
        Loader<Resource> resourceLoader2 = new Loader<>();

//        resourceLoader.transfer(resourceLoader2);
//        resourceLoader.transfer(ironLoader);
//        ironLoader.transfer(resourceLoader);
        Loader loader = new Loader();
        loader.upload(new Iron());
        loader.upload(new Coal());
        Resource download = loader.download();
    }

    private static void doSome(Loader loader){
        loader.download();
        loader.upload(new Iron());
        System.out.println("Что-то произошло");
    }
}

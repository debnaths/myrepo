package example.observerpattern;

/**
 * Created by debnaths on 16/03/15.
 */
public class ListenerA implements Observer {
    @Override
    public void update(int i) {
        System.out.println("In Listener A");
        System.out.println(i);
        System.out.println("***************");
    }
}

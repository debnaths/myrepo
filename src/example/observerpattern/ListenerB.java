package example.observerpattern;

/**
 * Created by debnaths on 16/03/15.
 */
public class ListenerB implements Observer {
    @Override
    public void update(int i) {
        System.out.println("In Listener B");
        System.out.println(i);
        System.out.println("***************");
    }
}

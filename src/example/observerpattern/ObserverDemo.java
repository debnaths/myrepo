package example.observerpattern;

/**
 * Created by debnaths on 16/03/15.
 */
public class ObserverDemo {
    public static void main(String[] args)
    {
        Observer observer_a = new ListenerA();
        Observer observer_b = new ListenerB();

        Subject observable = new Subject();
        observable.addObserver(observer_a);
        observable.addObserver(observer_b);

        observable.updateChange(5);
        observable.updateChange(10);

        observable.removeObservable(observer_a);
        observable.updateChange(15);

/*
        Subject observe = new Subject();
        observe.updateChange(5);
        Observer a = new ListenerA();
        Observer b = new ListenerB();

//        a.update(5);
//        b.update(5);

        observe.updateChange(10);
        a.update(observe.getNumberChanged());
      //  b.update(observe.getNumberChanged());

        observe.updateChange(15);
        a.update(observe.getNumberChanged());
       // b.update(observe.getNumberChanged());


        //

*/

    }
}

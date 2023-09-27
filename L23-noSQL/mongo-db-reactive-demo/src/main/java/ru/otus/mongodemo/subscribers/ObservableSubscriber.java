package ru.otus.mongodemo.subscribers;

import com.mongodb.MongoTimeoutException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static java.util.concurrent.TimeUnit.MINUTES;

@SuppressWarnings({"squid:S106", "squid:S112"})
public class ObservableSubscriber<T> implements Subscriber<T> {
    private final CountDownLatch latch = new CountDownLatch(1);
    private volatile Throwable error; // NOSONAR
    private final List<T> result = new ArrayList<>();

    private final boolean printOnNextElement;

    public ObservableSubscriber() {
        printOnNextElement = true;
    }

    public ObservableSubscriber(boolean printOnNextElement) {
        this.printOnNextElement = printOnNextElement;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(Integer.MAX_VALUE);
    }

    @Override
    public void onNext(T element) {
        result.add(element);
        if (printOnNextElement) {
            System.out.printf("onNext, result: %s%n", element);
        }
    }

    @Override
    public void onError(Throwable t) {
        error = t;
        System.err.println(t.getMessage());
        onComplete();
    }

    @Override
    public void onComplete() {
        latch.countDown();
    }

    public void await() throws Throwable {
        if (!latch.await(10, MINUTES)) {
            throw new MongoTimeoutException("Publisher timed out");
        }
        if (error != null) {
            throw error;
        }
    }

    public List<T> getResult() {
        return result;
    }
}

package src.solvingASimpleQuiz.introductionToGenericProgramming;

/*
You were asked to help with Java programming for a pie company.
At the moment, they bake pies, cakes, and tarts and pack them in nice boxes to sell.
Unfortunately, their approach to box programming is quite outdated and each pie type requires
its own box class. This approach is poorly scalable and will turn the situation into a nightmare
with product range growth (imagine all these: ApplePieBox, StrawberryPieBox, etc.).

To avoid this, implement a universal Box class that will accommodate anything with put methods
 and give it back with get methods.
 */
public class PastryPackingOptimization {
    private Cake cake;

    public void put(Cake cake) {
        this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}

/**
 * Box for pies
 */
class PieBox {

    private Pie pie;

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}


/**
 * Box for tarts
 */
class TartBox {

    private Tart tart;

    public void put(Tart tart) {
        this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}

/*
    Hundred more such boring classes OR ...
    magic class for everything everybody is waiting for
*/
class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public void put(T t) {
        this.t = t;
    }

    public T get() {
       return this.t;
    }

    public static void main(String[] args) {
        Box<Cake> cakeBox = new Box<>(new Cake());
        Box<Pie> pieBox = new Box<>(new Pie());
        Box<Tart> tartBox = new Box<>(new Tart());
    }
}

// Don't change classes below
class Cake {
}

class Pie {
}

class Tart {
}

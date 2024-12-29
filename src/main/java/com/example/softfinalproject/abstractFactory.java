package com.example.softfinalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;



interface Burger {
    String assemble();
    int price();
}

class SpicyBurger implements Burger {
    @Override
    public String assemble() {
        return ("Spicy Burger");
    }

    @Override
    public int price() {
        return 2500;
    }
}
class ClassicBurger implements Burger {
    @Override
    public String assemble() {
        return ("Classic Burger");
    }

    @Override
    public int price() {
        return 2690;
    }
}
class CheeseBurger implements Burger {
    @Override
    public String assemble() {
        return ("Cheese Burger");
    }

    @Override
    public int price() {
        return 1890;
    }
}
class AngryBurger implements Burger {
    @Override
    public String assemble() {
        return ("Angry Burger");
    }

    @Override
    public int price() {
        return 3190;
    }
}
class DoubleHumBurger implements Burger {
    @Override
    public String assemble() {
        return ("Double Humburger");
    }

    @Override
    public int price() {
        return 4790;
    }
}
class ChickenBurger implements Burger {
    @Override
    public String assemble() {
        return ("Chicken Burger");
    }

    @Override
    public int price() {
        return 3890;
    }
}
class PineappleBurger implements Burger {
    @Override
    public String assemble() {
        return ("Pineapple Burger");
    }

    @Override
    public int price() {
        return 3200;
    }
}
class DoubleCheeseBurger implements Burger {
    @Override
    public String assemble() {
        return ("Double Cheeseburger");
    }

    @Override
    public int price() {
        return 2600;
    }
}
class QazaqBurger implements Burger {
    @Override
    public String assemble() {
        return ("Qazaq Burger");
    }

    @Override
    public int price() {
        return 2890;
    }
}

interface BurgerFactory {
    Burger createSpicyBurger();
    Burger createClassicBurger();
    Burger createCheeseBurger();
    Burger createAngryBurger();
    Burger createDoubleHumburger();
    Burger createChickenBurger();
    Burger createPineappleBurger();
    Burger createDoubleCheeseBurger();
    Burger createQazaqBurger();
}

class SimpleBurgerFactory implements BurgerFactory {
    @Override
    public Burger createSpicyBurger() {
        return new SpicyBurger();
    }

    @Override
    public Burger createClassicBurger() {
        return new ClassicBurger();
    }
    @Override
    public Burger createCheeseBurger() {
        return new CheeseBurger();
    }
    @Override
    public Burger createAngryBurger() {
        return new AngryBurger();
    }
    @Override
    public Burger createDoubleHumburger() {
        return new DoubleHumBurger();
    }
    @Override
    public Burger createChickenBurger() {
        return new ChickenBurger();
    }
    @Override
    public Burger createDoubleCheeseBurger() {
        return new DoubleCheeseBurger();
    }
    @Override
    public Burger createQazaqBurger() {
        return new QazaqBurger();
    }
    @Override
    public Burger createPineappleBurger() {
        return new PineappleBurger();
    }
}

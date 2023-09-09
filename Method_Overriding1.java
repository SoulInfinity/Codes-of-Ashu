
public class Method_Overriding1 {
    public static void main(String args[]) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        Axis a = new Axis();
        System.out.println("The rate of interest of SBI is: " + s.getrateOfInterest());
        System.out.println("The rate of interest of ICICI is: " + i.getrateOfInterest());
        System.out.println("The rate of interest of AXIS is: " + a.getrateOfInterest());

    }
}


class Bank {
    float getrateOfInterest() {
        return 0.0f;
    }
}

class SBI extends Bank {
    float getrateOfInterest() {
        return 8.0f;
    }
}

class ICICI extends Bank {
    float getrateOfInterest() {
        return 7.0f;
    }
}

class Axis extends Bank {
    float getrateOfInterest() {
        return 9.0f;
    }
}


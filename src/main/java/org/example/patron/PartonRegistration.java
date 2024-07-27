package org.example.patron;

import java.util.List;

public class PartonRegistration {

    List<Patron> patrons;


    public PartonRegistration(List<Patron> patrons) {
        this.patrons = patrons;
    }

    public List<Patron> getPatron() {
        return patrons;
    }

    public void setPatron(List<Patron> patrons) {
        this.patrons = patrons;
    }


    public boolean addPatron(Patron patron) {
        return patrons.add(patron);
    }

    public boolean removePatron(Patron patron) {
        return patrons.remove(patron);
    }

}

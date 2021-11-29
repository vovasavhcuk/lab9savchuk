package com.company;

import java.util.Comparator;

public class ParalComparator implements Comparator<Paralelopiped> {
    @Override
    public int compare(Paralelopiped a, Paralelopiped b){
        return Double.compare(a.getPl(),b.getPl());
    }
}

package com.wasiniewski.examples.busniess;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService{

    @Override
    public int[] retrievedData() {
        return new int[] {1, 2 ,3};
    }
}
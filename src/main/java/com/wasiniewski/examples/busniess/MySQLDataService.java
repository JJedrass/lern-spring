package com.wasiniewski.examples.busniess;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

    @Override
    public int[] retrievedData() {
        return new int[] {1, 2 ,3};
    }
}
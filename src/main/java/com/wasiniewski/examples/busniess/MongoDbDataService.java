package com.wasiniewski.examples.busniess;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{

    @Override
    public int[] retrievedData() {
        return new int[] {11, 22 ,33};
    }
}
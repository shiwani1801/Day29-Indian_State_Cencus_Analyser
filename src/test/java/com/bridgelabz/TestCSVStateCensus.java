package com.bridgelabz;

import org.junit.jupiter.api.*;
import org.junit.Test;
import static org.junit.Assert.fail;

import java.util.ArrayList;
public class TestCSVStateCensus {
    static CSVStateCensus csvStateCensus;
    @Test
    public void testReadDataFromDestinationHappy(){
        csvStateCensus =  new CSVStateCensus();
        try{
            ArrayList<String> stateList = csvStateCensus.readDataFromSource("C:\\Users\\Dell\\Desktop\\IndianCencusAnalyser\\census.csv");
            Assertions.assertEquals(stateList.size(), 199);
        } catch(Exception e){
            fail("Should not throw exception");
        }
    }

    @Test
    public void testReadDataFromDestinationSadWrongFile(){
        csvStateCensus =  new CSVStateCensus();
        try{
            ArrayList<String> stateList = csvStateCensus.readDataFromSource("C:\\Users\\Dell\\Desktop\\IndianCencusAnalyser\\state.csv");
            fail("Should throw exception");
        } catch(Exception e){
            Assertions.assertNotNull(e.getMessage());
        }
    }


}

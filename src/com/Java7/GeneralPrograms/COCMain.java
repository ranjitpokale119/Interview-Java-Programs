package com.Java7.GeneralPrograms;

import java.io.File;
import java.io.IOException;

public class COCMain {
    public static void main(String[] args) throws IOException {
        COCService cocService = new COCService(); // Child to Child
        AbstractParser abstractParser = new COCService();// Parent to Child ..we can access all method s from parent child
        //abstractParser.getSampleName()// this method can not be accessed through parent reference

        cocService.parselinedata(2);
        cocService.parse(new File("/"));
    }
}

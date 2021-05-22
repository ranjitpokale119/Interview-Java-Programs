package com.Java7.GeneralPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class COCService extends AbstractParser {

    public static void main(String[] args) throws IOException {
        AbstractParser o = new COCService();
        o.parse(new File("/cd"));
    }

    @Override
    public Object parselinedata(int n) {

        return null;
    }

    public String getSampleName(int n) {
        System.out.println("n = " + n);
        return new String("Hi");
    }
}

abstract class AbstractParser {
    protected List<Object> parse(File file) throws IOException {

        List<Object> data = new ArrayList<>();
        FileInputStream fp = new FileInputStream(file);
        int str = fp.read();
        Object parselinedata = parselinedata(str);
        data.add(parselinedata);
        return data;

    }

    public abstract Object parselinedata(int n);

}
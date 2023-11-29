package typoInformator;

import java.util.ArrayList;
import java.util.Arrays;

abstract class TypeInfoObject {
    abstract void getInfo();
}

class ByteInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Byte min=" + (Byte.MIN_VALUE)
                + ", Byte max=" + Byte.MAX_VALUE);
    }
}

class BoolInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Boolean min=" + false
                + ", Boolean max=" + true);
    }
}

class CharInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Char min=" + Character.MIN_VALUE
                + ", Char max=" + Character.MAX_VALUE);
    }
}

class ShortInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Short min=" + (Short.MIN_VALUE)
                + ", Short max=" + Short.MAX_VALUE);
    }
}

class IntInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Integer min=" + (Integer.MIN_VALUE)
                + ", Integer max=" + Integer.MAX_VALUE);
    }
}

class LongInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Long min=" + (Long.MIN_VALUE)
                + ", Long max=" + Long.MAX_VALUE);
    }
}

class FloatInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Float min=" + (Float.MIN_VALUE)
                + ", Float max=" + Float.MAX_VALUE);
    }
}

class DoubleInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("Double min=" + (Double.MIN_VALUE)
                + ", Double max=" + Double.MAX_VALUE);
    }
}

class StringInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        System.out.println("String min=" + Character.MIN_VALUE
                + ", String max is about string of Integer.MAX_VALUE symbols");
    }
}

class ArrayInfo extends TypeInfoObject {

    @Override
    public void getInfo() {
        boolean[] min = {};
        System.out.println("Array min=" + Arrays.toString(min)
                + ", Array max is bound to the value Integer.MAX_VALUE, and on each machine it is the difference");
    }
}

public class TypoInformator {

    private static ArrayList<TypeInfoObject> allTypes;

     static {
        allTypes = new ArrayList<>();
        allTypes.add(new CharInfo());
        allTypes.add(new BoolInfo());
        allTypes.add(new ByteInfo());
        allTypes.add(new ShortInfo());
        allTypes.add(new IntInfo());
        allTypes.add(new LongInfo());
        allTypes.add(new FloatInfo());
        allTypes.add(new DoubleInfo());
        allTypes.add(new StringInfo());
        allTypes.add(new ArrayInfo());
    }

    public static void getValueInfo() {
        for (TypeInfoObject type : allTypes) {
            type.getInfo();
        }
    }
}

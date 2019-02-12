package test;

public class SimpleClass {

    //Fields declaration
    public int simpleField = 0;
    public String simpleStringField = "SimpleString";

    //Constructor declaration
    public SimpleClass(){

    }

    public SimpleClass(int newSimpleField){
        this.simpleField = newSimpleField;
    }

    //Methods void type declaration
    public void simplePublicMethod() {
        System.out.println("test");
    }

    private void simplePrivateMethod() {
        System.out.println("test2");
    }

    protected void simpleProtectedMethod() {
        System.out.println("test3");
    }

    //Methods specific type

    public int simpleReturnTypeMethod(){
        return simpleField;
    }

    protected String simpleReturnStringTypeMethod(){
        return simpleStringField;
    }
}

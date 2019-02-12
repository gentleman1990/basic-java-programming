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
        System.out.println("simplePublicMethod");
    }

    private void simplePrivateMethod() {
        System.out.println("simplePrivateMethod");
    }

    protected void simpleProtectedMethod() {
        System.out.println("simpleProtectedMethod");
    }

    //Methods specific type

    public int simpleReturnTypeMethod(){
        return simpleField;
    }

    protected String simpleReturnStringTypeMethod(){
        return simpleStringField;
    }

    public void innerMethod(){
        simplePrivateMethod();
    }
}

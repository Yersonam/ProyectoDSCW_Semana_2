// Abstract class with template method
abstract class AbstractClass {
    public void templateMethod() {
        System.out.println("Executing step 1...");
        step1();
        System.out.println("Executing step 2...");
        step2();
        System.out.println("Template method execution complete.");
    }

    protected abstract void step1();

    protected abstract void step2();
}
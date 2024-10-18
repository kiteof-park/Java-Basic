class B {
    public void method(){
        System.out.println("method in B");
    }
}

interface I{
    public void mehthod();
}
class C implements I{
    @Override
    public void mehthod() {
        System.out.println("mehthod in B");
    }
}

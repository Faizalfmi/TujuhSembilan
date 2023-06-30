public class Programmer extends Person {
    String technology;

    public Programmer(){

    }

    public Programmer(String name, String address, String technology){
        super(name, address);
        this.technology = technology;
    }

    void coding(){
        System.out.println("I can create an application using technology : "+technology+".");
    }

    void hacking(){
        System.out.println("I can hack a website.");
    }

    @Override
    void greeting(){
        super.greeting();
        System.out.println("My job is a "+technology+" programmer");
    }
}

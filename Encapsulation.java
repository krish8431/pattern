class human {
    private int age;
    private String Name ;

    public int getAge()
    {
        return age;
    }    
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
}

    public class Encapsulation  {
        public static void main(String[] args) {
            human person = new human();
            person.setAge(19);
            person.setName("Krish Singh");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }

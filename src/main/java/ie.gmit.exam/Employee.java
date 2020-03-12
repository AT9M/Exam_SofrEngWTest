package ie.gmit.exam;

public class Employee {
    private String title;
    private String name;
    private String pps;
    private int phone;
    private String employentType;
    private int age;

    public Employee(String title, String name, String pps, int phone, String employentType, int age) {
        setTitle(title);
        setName(name);
        setPps(pps);
        setPhone(phone);
        setEmployentType(employentType);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if((title.equalsIgnoreCase("Mr"))||(title.equalsIgnoreCase("Mrs"))||(title.equalsIgnoreCase("Miss"))){
            this.title = title;
        }
        else{
            throw  new IllegalArgumentException("Invalid title");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if((name.length()>=5)&&(name.length()<22)){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        if(pps.length()!=6){
            throw new IllegalArgumentException("Not a valid pps Number");
        }
        else{
            this.pps = pps;
        }

    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {

        if(phone<1000000){
            throw new IllegalArgumentException("Not a valid Phone Number");
        }
        else{
            this.phone = phone;
        }
    }

    public String getEmployentType() {
        return employentType;
    }

    public void setEmployentType(String employentType) {

        if((employentType.equals("Part-Time"))||(employentType.equals("Full-Time"))){
            this.employentType = employentType;
        }
        else{
            throw new IllegalArgumentException("Invalid Employement type");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("The employee must be over 18");
        }
    }
}

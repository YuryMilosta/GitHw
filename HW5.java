public class HW5 {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Milosta Yury", "Engineer", "milosta@mailbox.com", "8297105828",550000,41);
        empCorp[1] = new Employee("Pugach Nikolai", "Creator", "Pugach@mailbox.com", "8295836124",510000,32);
        empCorp[2] = new Employee("Saveliev Slava", "Water pot", "saveliev@mailbox.com", "8292861501",150000,43);
        empCorp[3] = new Employee("Popko Nadezda", "EnvelopeLicker", "popko@mailbox.com", "892312316",53000,18);
        empCorp[4] = new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317",32000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}



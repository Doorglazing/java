public class Manager {
    String name,
           jobId;
    private int[] salary = new int[2];
    Manager(){}
    Manager(String name, String jobId, int[] salary){
        this.name = name;
        this.jobId = jobId;
        this.salary = salary;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    void intro (){
        System.out.println("经理姓名:"+name + "\n" +"工号:"+ jobId);
    }
    void intro (String level){
        System.out.println(level + name + "\n" +"工号:"+ jobId);
    }
    void showSalary(){
        System.out.println("基本工资为:"+salary[0] + "奖金" + salary[1]);
    }
    void showSalary(int salary){
        System.out.println("基本工资为:"+ salary + "奖金无");
    }
    void work(){
        System.out.println("管理层正在压榨秃头程序猿");
    }
}

public class Coder extends Manager {
    private int salary1 ;
    Coder(){}
    Coder(String name,String jobId,int salary1){
        this.name = name;
        this.jobId = jobId;
        this.salary1 = salary1;
    }

    public int getSalary1() {
        return salary1;
    }

    public void setSalary1(int salary) {
        this.salary1 = salary;
    }

    @Override
    void intro() {
        super.intro("程序员");
    }

    @Override
    void showSalary() {
        super.showSalary(salary1);
    }
    void work(){
        System.out.println("正在秃头");
    }
}

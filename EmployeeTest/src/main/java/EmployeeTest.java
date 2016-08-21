/**
 * Created by ScorpionOrange on 2016/06/05.
 */
public class EmployeeTest {
    public static void main(String[] args){
        //fill the staff with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
        staff[2] = new Employee("Tony Stark", 40000, 1990, 3, 15);

        //raise everyone's salary by 5%
        for(Employee e : staff){
            e.raiseSalary(5.0);
        }

        //print out information about all Employee object
        for(Employee e:staff){
            System.out.println("name = " + e.getName() +
                           ", salary = " + e.getSalary() +
                          ", hireDay = " + e.getHireDay());
        }
        /*
        //对应Employee的getHireDay()方法
        staff[0].getHireDay().setTime(staff[0].getHireDay().getTime() - (long)(10*365.25*24*60*60*1000));

        //验证：如若不适用clone()的话，对getHireDay()的返回值进行修改的话是否反影响到private hireDay；
        for(Employee e:staff){
            System.out.println("name = " + e.getName() +
                    ", salary = " + e.getSalary() +
                    ", hireDay = " + e.getHireDay());
        }
        */
    }
}

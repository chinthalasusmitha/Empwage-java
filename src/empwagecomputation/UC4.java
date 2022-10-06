package empwagecomputation;
    import java.util.Scanner;
public class UC4 {
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;

        public static int empHrs = 0;

//        /**
//         * Method for computing the wage for employee.
//         */
        private static void UC4 () {
            Random random = new Random();
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present Full Time");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Present Part Time ");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent ");
            }

            int empWage = empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage is : " + empWage);
        }


//         * This is main method, This is a starting point of EmpWageComputation program.

             public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            UC4();
        }
    }


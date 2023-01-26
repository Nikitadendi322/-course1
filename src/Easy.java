public class Easy {
    private static Employee[] employees = new Employee[10];

    /*
     * Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
     * Посчитать сумму затрат на зарплаты в месяц.
     * Найти сотрудника с минимальной зарплатой.
     * Найти сотрудника с максимальной зарплатой.
     * Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
     * Получить Ф. И. О. всех сотрудников (вывести в консоль).
     */
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }

        }
        return sum;
    }


    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = result.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateAverageSalary() / Employee.getCounter();
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                null,
                new Employee("Павлов Никита Алексеевич", 17000, 1),
                new Employee("Cахаров Дмитрий Адреевич", 17000, 2),
                new Employee("Бертцун Артем", 17000, 2),
                new Employee("Павлова Елена", 17000, 2),
                new Employee("Юдина Екатерина", 2000_000, 3),
                new Employee("Прачиков Алексей", 200_000, 1),
                new Employee("Булгакова Анастасия", 200_000, 3),
                new Employee("Пушкин Василий", 200_000, 3),
                new Employee("Василий Пупкин", 200_000, 2)
        };
        employees[0] = new Employee("Павлов Никита Алексеевич", 17000, 1);
        printFullNames();
        printEmployees();
        System.out.println("avg =" + calculateAverageSalary());


    }
}
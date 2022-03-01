import java.time.LocalDateTime;

/**
 * Класс, объекты которого помещаются в коллекцию
 */
public class Worker{
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0,
    // Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer salary; //Поле может быть null, Значение поля должно быть больше 0
    private Position position; //Поле не может быть null
    private Status status; //Поле не может быть null
    private Organization organization; //Поле не может быть null

    /**
     * Меняет объект, хранящий координаты, объекта класса Worker
     * @param coordinates объект, хранящий координаты
     */
    public void setCoordinates(Coordinates coordinates) {

        this.coordinates = coordinates;
    }
    /**
     * Возврощает объект, хранящий координаты, объекта класса Worker
     * @return координаты
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Устанавливает новые координаты, меняя объект в поле coordinates
     * @param x новое значение координаты x
     * @param y новое значение координаты y
     */
    public void setupCoordinates(Integer x,Double y){
        coordinates = new Coordinates(x,y);
    }

    /**
     * Статический класс, объекты которого хранят координаты
     */
    public static class Coordinates {
        public Coordinates(Integer x,Double y){
            this.x=x;
            this.y=y;
        }
        private Integer x; //Значение поля должно быть больше -716, Поле не может быть null
        private Double y; //Максимальное значение поля: 943, Поле не может быть null

        /**
         * Получает координату x
         * @return x
         */
        public Integer getX() {
            return x;
        }

        /**
         * Меняет координату x
         * @param x координата x
         */
        public void setX(Integer x) {
            this.x = x;
        }
        /**
         * Получает координату y
         * @return y
         */
        public Double getY() {
            return y;
        }
        /**
         * Меняет координату y
         * @param y координата y
         */
        public void setY(Double y) {
            this.y = y;
        }
    }

    public void setupOrganizationInfo(String fullName, Integer annualTurnover, Integer employeesCount){
        organization = new Organization(fullName, annualTurnover, employeesCount);
    }

    public static class Organization {
        public Organization(String fullName, Integer annualTurnover, Integer employeesCount) {
            this.fullName = fullName;
            this.annualTurnover = annualTurnover;
            this.employeesCount = employeesCount;
        }

        private String fullName; //Строка не может быть пустой, Значение этого поля должно быть уникальным, Поле может быть null
        private Integer annualTurnover; //Поле может быть null, Значение поля должно быть больше 0
        private Integer employeesCount; //Поле не может быть null, Значение поля должно быть больше 0

        public String getFullName() {
            return fullName;
        }
        public Integer getAnnualTurnover() {
            return annualTurnover;
        }

        public Integer getEmployeesCount() {
            return employeesCount;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
        public void setAnnualTurnover(Integer annualTurnover) {
            this.annualTurnover = annualTurnover;
        }
        public void setEmployeesCount(Integer employeesCount) {
            this.employeesCount = employeesCount;
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public Status getStatus() {
        return status;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + " X:" + coordinates.getX() + " Y:" + coordinates.getY() +
                ", creationDate=" + creationDate +
                ", salary=" + salary +
                ", position=" + position +
                ", status=" + status +
                ", organization=" + " fullName:" + organization.getFullName() + " annualTurnover:" + organization.getAnnualTurnover() + " employeesCount:" + organization.getEmployeesCount() +
                '}';
    }

    /**
     *  Компоратор сравнивающий зарплату сотрудника
     * @param value зарплата
     * @return результат сравнения объекта по зарплате
     */
    public int compareSalaryValues(int value) {
        return Integer.compare(this.getSalary(), value);
    }
}
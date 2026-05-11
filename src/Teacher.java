public class Teacher extends User {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void showRole() {

        System.out.println(name + " является преподавателем.");

    }

}

 class Person {
    private String name;
    private Person me;

    public Person(String name) {
        this.name = name;
    }

    public void setMe(Person other) {
        this.me = other;
    }

    public Person getMe() {
        return me;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person p = new Person("Nguyen Van A");
        p.setMe(p);

        System.out.println("Tên qua p.getMe(): " + p.getMe().getName());
        p = null;
        System.out.println("p = null; đối tượng không bị xóa ngay lập tức.");
        System.out.println("Nó trở thành eligible for Garbage Collection.");
    }
}

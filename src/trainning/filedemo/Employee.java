package trainning.filedemo;

public class Employee {
    public int id;
    public String name;
    public String email;
    private String[] roles;
    private boolean manager;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public Employee(int id, String name, String email, String[] roles, boolean manager) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.manager = manager;
    }
}

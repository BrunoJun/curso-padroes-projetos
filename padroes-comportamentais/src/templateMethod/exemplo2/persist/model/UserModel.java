package templateMethod.exemplo2.persist.model;

public class UserModel extends ModelPersist{

    private String name;
    private  String password;

    public UserModel(String name, String password) {

        this.name = name;
        this.password = password;
    }

    @Override
    void preSave() {

        System.out.println("Checking if there is another user with the same name");
    }

    @Override
    protected void prePersist() {

        if(name == null) throw new RuntimeException("Name is mandatory.");
        if(password == null) throw new RuntimeException("Password is mandatory.");
    }

    @Override
    protected void postSave() {

        System.out.println("Creating user roles");
    }
}

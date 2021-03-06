package jt.library.model.entity;

/**
 * created: Sep 4, 2010T6:06:50 PM
 *
 * @author ctapobep
 */
public class Author implements Persitent {
    private Long id;

    private String firstName;
    private String lastName;

    public Author() {
    }

    public Author(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}

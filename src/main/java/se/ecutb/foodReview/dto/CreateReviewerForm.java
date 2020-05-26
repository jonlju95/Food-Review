package se.ecutb.foodReview.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateReviewerForm {

    @NotBlank(message = "First name is mandatory")
    @Size(min = 2, max = 255, message = "First name need to have 2 or more letters")
    private String firstName;
    @NotBlank(message = "Last name is mandatory")
    @Size(min = 2, max = 255, message = "Last name need to have 2 or more letters")
    private String lastName;
    @NotBlank(message = "Email is mandatory")
    private String email;
    @NotBlank(message = "You need to define a password")
    private String password;
    @NotBlank(message = "You need to confirm your password")
    private String passwordConfirm;

    private boolean admin;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}

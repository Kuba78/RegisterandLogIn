package DAO;

import java.sql.Timestamp;
import java.util.Date;

public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private Date birthday;
    private Timestamp registrationDate;
    private String password;
    private Enum sex;
    private boolean mailSent;
}

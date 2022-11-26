package Model;

import java.time.LocalDate;
import java.util.regex.*;

public class User {
  protected int id;
  protected String nom;
  protected String prenom;
  protected String email;
  protected String password;
  protected String role;
  protected LocalDate d_cration;

  public User(int id, String nom, String prenom, String email,String password) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.password=password;
    d_cration = LocalDate.now();

    // validate email
    setEmail(email);
  }

  public User() {
    d_cration = LocalDate.now();
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getPassword() {
    return password;
  }

  public String getRole() {
    return role;
  }

  public int getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public String getEmail() {
    return email;
  }

  public LocalDate getD_cration() {
    return d_cration;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public void setEmail(String email) {
    //Regular Expression
    String regex = "^(.+)@(.+)$";
    //Compile regular expression to get the pattern
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);


    if (matcher.matches()) this.email = email;
  }

  public void setD_cration(LocalDate d_cration) {
    this.d_cration = d_cration;
  }

  public boolean equals(Object obj) {
    if (obj instanceof User) return false;
    User o = (User) obj;
    if (this.getId() == o.getId()) return true; else return false;
  }

  public String toString() {
    String r = "\n";
    r += "        Id            : " + id + "\n";
    r += "        Nom           : " + nom + "\n";
    r += "        Prenom        : " + prenom + "\n";
    r += "        Email         : " + email + "\n";
    r += "        Password      : " + password + "\n";
    r += "        Date Creation : " + d_cration + "\n";
    return r;
  }
}

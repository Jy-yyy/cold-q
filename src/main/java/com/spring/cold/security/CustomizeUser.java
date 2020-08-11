package com.spring.cold.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author jy
 */
public class CustomizeUser extends User {

  private static final long serialVersionUID = 500L;
  private String id;
  private String name;

  public CustomizeUser(String id,String name,String account, String password,
                       Collection<? extends GrantedAuthority> authorities) {
    super(account, password, authorities);
    this.id=id;
    this.name=name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}

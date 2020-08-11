package com.spring.cold.security;

import org.springframework.security.core.context.SecurityContextHolder;

public class Securitys {

  private static CustomizeUser getCustomizeUser(){
    return (CustomizeUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  }

  public static String getName(){
    return getCustomizeUser().getName();
  }

  public static String getUserId(){
    return getCustomizeUser().getId();
  }

}

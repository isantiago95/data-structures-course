package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

import java.util.HashSet;
import java.util.Set;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUnique {

  public boolean isUnique(String s) {
    if (s.length() > 128) return false;
     
    Set<Character> characters = new HashSet<>();
    for(Character c : s.toCharArray()) {
       if(characters.contains(c)) return false;
       characters.add(c);
    }
    
    return true;
  }
}

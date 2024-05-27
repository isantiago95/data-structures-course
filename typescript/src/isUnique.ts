// Exercise 1: Java to TypeScript

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */

// TypeScript code:
export function isUnique(str: string): boolean {
  const strSet = new Set(str);
  return strSet.size === str.length;
}
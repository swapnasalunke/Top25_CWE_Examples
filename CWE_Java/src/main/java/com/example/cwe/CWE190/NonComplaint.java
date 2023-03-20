package com.example.cwe.CWE190;

//      CWE-190: Integer Overflow or Wraparound

public class NonComplaint {
  public static void main(String[] arg) {
      int x = 50;
      int result = 1;

      for (int i = 1; i < x; i++) {
          result = result * i;

      }
      System.out.println(result);  // result is greater than the maximum value for integer
  }
}

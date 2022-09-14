package com.gpsl.handlers

public class validateApproval {
    def isBuildUatApproved() {
    def file = new File("C:/_tools/approved.txt")
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    } 
    return false; 
  }
}
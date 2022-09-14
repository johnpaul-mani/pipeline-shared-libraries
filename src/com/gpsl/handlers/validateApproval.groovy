package com.gpsl.handlers

public class validateApproval {
    def isBuildUatApproved() {
    def file = new File("approved.txt")
    if (file.exists()){
      println "Build Approved."
      return true;
    } else {
      println "Approval file does not exist."
    } 
    return false; 
  }
}
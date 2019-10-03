#!/usr/bin/env groovy
//def x = 0;
def stringFunction(){
def y = "Hello World";
def z = y.length();
for(x in 0..z-1){
  println(y[x..z-1])
	}
}

def ageCalc(yearBorn){
  Date now = new Date();
  int year = now.getYear() + 1900;
  int age;
   try{
       age = year / yearBorn;
  }
  catch(exc){
  	println(exc);	
  }
  finally{
    println("Code done executing...");	
  }
  return age;
}

def String[] arg = ["Groovy","Java","Python","nodeJS"];
for( a in arg){
  println a
}

def getOs(){
  def osName;
  def os = System.properties['os.name'].toLowerCase();
  if(os.contains("windows")){
	osName = "windows";
  }
  else if(os.contains("linux")){
	osName = "linux";
  }
  else if(os.contains("mac os")){
	osName = "mac os";
  }
  else{
    println("Anything");
  }
  return osName;
}

stringFunction();
ageCalc(1991);
getOs();

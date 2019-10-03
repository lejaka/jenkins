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
  int age = year - yearBorn;
  return age;
}

def String[] arg = ["Groovy","Java","Python","nodeJS"]
for( a in arg){
  println a
}

stringFunction();
ageCalc(1991);

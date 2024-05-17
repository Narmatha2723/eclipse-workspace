package features;

import com.intuit.karate.junit5.Karate;
//import package features;

class sampleRunner {
  
  @Karate.Test
  Karate testUsers() {
      return Karate.run("simpleEX").relativeTo(getClass());
  }    

}
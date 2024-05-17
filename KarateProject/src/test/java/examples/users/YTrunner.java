package examples.users;

import com.intuit.karate.junit5.Karate;

class YTrunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("YTrandom").relativeTo(getClass());
    }    

}
             
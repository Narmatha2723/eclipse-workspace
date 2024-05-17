package examples.users;

import com.intuit.karate.junit5.Karate;

class toolRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("toolAPI").relativeTo(getClass());
    }    

}

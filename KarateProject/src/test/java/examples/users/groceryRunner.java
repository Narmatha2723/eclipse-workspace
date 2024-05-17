package examples.users;

import com.intuit.karate.junit5.Karate;

class groceryRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("groceryApi").relativeTo(getClass());
    }    

}

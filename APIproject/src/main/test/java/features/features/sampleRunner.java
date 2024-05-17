package features;
import com.intuit.karate.core.KarateLexer;
import com.intuit.karate.core.KarateParser;

//import package features;

 

class HelloRunner {

    

    @Karate.Test

    KarateLexer testUsers() {

        return KarateParser.run("json").relativeTo(getClass());

    }    

 

}
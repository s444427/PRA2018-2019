package pracownia.introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    public static void main(String [ ] args) {
        System.out.println("Hello World");
        Logger log = Logger.getLogger("sd");
        log.info("asdf");
        log.error("ASDF");

    }

}
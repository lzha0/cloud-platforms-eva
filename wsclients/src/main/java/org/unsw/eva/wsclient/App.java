package org.unsw.eva.wsclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.unsw.eva.strategy.*;

/**
 *
 * @author shrimpy
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        AbstractStrageyTest test1 = new ThreadBaseStrategyTest();
        test1.run();
        log.debug("All test finished, Next Gen id is up to  ============== " + (test1.getNextGenId() == 1 ? test1.getNextGenId() : test1.getNextGenId() - 1) + " ==============");
//      AbstractStrageyTest test2 =  new TimeBaseStrategyTest();
    }
}


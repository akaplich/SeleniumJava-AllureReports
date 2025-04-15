package actions.selenium.utils;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

public class GetIPAddress {

    public static Map<String, String> run(def params) throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();
        String ipAddress = inetAddress.getHostAddress();
        Map<String, String> agentInfo = new HashMap<>();
        def agentId
        
        switch (ipAddress) {
           	case "13.2.0.30":
                agentId = "rwhq-agent-17"
            	break;
	   		case "13.0.2.230":
                agentId = "rwhq-agent-16"
            	break;
	   		case "13.0.2.196":
                agentId = "rwhq-agent-15"
            	break;
            case "13.0.2.130":
                agentId = "rwhq-agent-14"
            	break;
            case "13.0.2.171":
                agentId = "rwhq-agent-13"
            	break;
            case "13.0.2.150":
                agentId = "rwhq-agent-12"
                break;
            case "13.0.2.191":
                agentId = "rwhq-agent-11"
                break;
            case "13.0.2.254":
                agentId = "rwhq-agent-10"
                break;
            case "13.0.2.222":
                agentId = "rwhq-agent-9"
                break;
            case "13.0.2.29":
                agentId = "rwhq-agent-8"
                break;
            case "13.0.2.75":
                agentId = "rwhq-agent-7"
                break;
            case "13.0.2.72":
                agentId = "rwhq-agent-6"
                break;
            case "13.0.2.160":
                agentId = "rwhq-agent-5"
                break;
            case "13.0.2.133":
                agentId = "rwhq-agent-4"
                break;
            case "13.0.2.183":
                agentId = "rwhq-agent-3"
                break;
            case "13.0.2.143":
                agentId = "rwhq-agent-2"
                break;
            case "13.0.2.225":
                agentId = "rwhq-agent-1"
                break;
	    	case "13.0.2.170":
                agentId = "rwhq-agent-0"
                break;
            
            default:
                agentId = "not able to determine"
        }
        agentInfo.put("Agent ID", agentId);
        agentInfo.put("Agent IP", ipAddress);
        
        //System.out.println("AGENT INFO")
        //System.out.println("This is ${agentId}; IP is ${ipAddress}");
        return agentInfo;
    
        
    }
}


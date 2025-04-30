package actions.API;

import groovyx.net.http.RESTClient
import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import utils.Settings

class HttpClient{
    //Type = GET, PUT, POST, DELETE
    //RequestContentType = example: "application/x-www-form-urlencoded"
    //ContentType = example: "application/json"
    //Body = Body parameter map
    //Path = path that goes after the URL, example: "/bi/bi_xt_create_affiliate.bix"
    //App Environment = What Application Environment are we working with here, example: "BI Admin" (otherwise just uses URL variable)
    //Dont Print (optional, boolean, default false if ommited) = Dont print of REQUEST or RESPONSE if true (useful to set to true if expected too many printouts)
    
    //Affiliate variables
    public static final ThreadLocal<String> systemid = ThreadLocal.withInitial { null }
    public static final ThreadLocal<String> affiliatename = ThreadLocal.withInitial { null }
    public static final ThreadLocal<String> affiliateid = ThreadLocal.withInitial { null }
    //public static systemid =  null
    //public static affiliatename = null
    //public static affiliateid = null
    def public static Headers = [:]
    public static client = null
    private static final Logger logger = LoggerFactory.getLogger(HttpClient.class);

    public static String getSystemid() {
        return systemid.get();
    }

    public static void setSystemid(String value) {
        systemid.set(value);
    }

    public static void clearSystemid() {
        systemid.remove();
    }

    public static String getAffiliatename() {
        return affiliatename.get();
    }

    public static void setAffiliatename(String value) {
        affiliatename.set(value);
    }

    public static void clearAffiliatename() {
        affiliatename.remove();
    }

    public static String getAffiliateid() {
        return affiliateid.get();
    }

    public static void setAffiliateid(String value) {
        affiliateid.set(value);
    }

    public static void clearAffiliateid() {
        affiliateid.remove();
    }
    public static createHttpClient(){
        client = new RESTClient()
        client.ignoreSSLIssues()
    }
    public static def MakeRequest(def params){
        logger.debug("MakeRequest with Params: ${params}")
        if(client == null) createHttpClient()
        def http = new HTTPBuilder(params.URL)
        http.ignoreSSLIssues()
        def requestParams = [:]
        def result 
        requestParams.uri = params.URL
        if(params.ContentType){
            requestParams.contentType = params.ContentType
        }
        else{
            requestParams.contentType = 'text/plain'
        }

        if(params.RequestContentType){
            requestParams.requestContentType = params.RequestContentType
        }

        requestParams.headers = params.Headers
        requestParams.query = params.Query

        //println requestParams
        if(params.Type == "GET"){
            http.request(Method.GET,requestParams.contentType){req->
                uri = params.URL
                body = params.Body
                contentType = requestParams.contentType
                requestContentType = requestParams.requestContentType
                if (requestParams.headers){
                    headers = requestParams.headers
                }
                response.success = {resp,json->
                    result = resp
                    if(json.getClass().name == "org.apache.http.conn.EofSensorInputStream"){
                        result.responseData = json.text
                    }
                    else if(json.getClass().name == "java.util.HashMap"){
                        result.responseData = json
                    }
                    else if(json.getClass().name == "groovy.util.slurpersupport.NodeChild"){
                        result.responseData = json
                    }
                    else if (json.getClass().name == "groovy.json.internal.LazyMap") {
                        result.responseData = json
                    }
                    else{
                       result.responseData = json.text
                    }
                }

                response.failure = {resp,json->
                    assert false, "Error from response: ${json}"
                }
            }
        }
        else if(params.Type == "PUT"){
            //result = client.put(requestParams)
            http.request(Method.PUT,requestParams.contentType){req->
                uri = params.URL
                body = params.Body
                contentType = requestParams.contentType
                requestContentType = requestParams.requestContentType
                if (requestParams.headers){
                    headers = requestParams.headers
                }
                response.success = {resp,json->
                    result = resp
                    if(json.getClass().name == "org.apache.http.conn.EofSensorInputStream"){
                        result.responseData = json.text
                    }
                    else{
                        result.responseData = json
                    }
                }

                response.failure = {resp,json->
                    assert false, "Error from response: ${json}"
                }
            }
        }
        else if(params.Type == "POST"){
            http.request(Method.POST,requestParams.contentType){req->
                uri = params.URL
                body = params.Body
                contentType = requestParams.contentType
                requestContentType = requestParams.requestContentType
                if (requestParams.headers){
                    headers = requestParams.headers
                }
                
                response.success = {resp,json->
                    result = resp
                    if(json.getClass().name == "org.apache.http.conn.EofSensorInputStream"){
                        result.responseData = json.text
                    }
                    else{
                        result.responseData = json
                    }                 
                }

                response.failure = {resp,json->
                    assert false, "Error from response: ${json}"
                    //ret = resp
                    //data = json
                }
            }
            //requestParams.body = params.Body
            //result = client.post(requestParams)           
        }
        else if(params.Type == "DELETE"){
            result = client.delete(requestParams)
        }

        return result

    }

    public static def MainMakeRequest(def params){
        logger.debug("MainMakeReqest with Params: ${params}")
        def requestContentType
        def contentType = ContentType.JSON
        
        if(params.RequestContentType){
            requestContentType = params.RequestContentType
        }
        if(params.ContentType){
            contentType = params.ContentType
        }

        String URLPath = System.getProperty("environment.url", Settings.getProperty("environment.url"));
        logger.debug("URLPath: ${URLPath}")
                //If 'App Environment' paramater is specified then modify URL from standard one that is used to access affiliate variable to a different one
        if(params."App Environment"){
            if(params."App Environment"=="BI Admin"){
                String urlpathelement = URLPath.split("\\.")[0]
                switch(urlpathelement){
                    case "brightideatest":
                    	URLPath = "https://test.brightideatest.com"
                    	break
                    case "brightideasandbox":
                    	URLPath = "https://sandbox.brightideasandbox.com"
                    	break
                }                 
            } else if(params."App Environment"=="Free Trial"){
              	URLPath = "https://ideabox.brightideatest.com"  
            }
            else if(params."App Environment"=="System Manager"){
				switch(URLPath.split("\\.")[1]){
                    case "brightideatest":
                    	URLPath = "https://brightideatest.com"
                    	break
                    case "brightideasandbox":
                    	URLPath = "https://brightideasandbox.com"
                    	break
                }            
            }
        }        
        
        if(!params."Dont Print"){println "REQUEST: URL: ${URLPath+params.Path} | BODY: ${params.Body}"}

        def response = HttpClient.MakeRequest(Body:params.Body, URL:URLPath+params.Path, Type:params.Type, ContentType:contentType, RequestContentType:requestContentType,Headers:this.Headers)
        if(!params."Dont Print"){println "RESPONSE: " + response.responseData}

        return response
    }
}
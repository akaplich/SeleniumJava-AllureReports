package actions.API.Utils;

import actions.API.HttpClient

class BIAdminLogin{
    public static void run(def params){
        def affiliateLogin = [
            email:"bi.adminuser1@brightidea.com",
            password:"brightidea1"
        ]
        //def affiliateResponse = HttpClient.MainMakeRequest(Type:"POST",Path:"/bi/bi_xt_login.bix?${affiliateLogin}","Other Environment":"Create Affiliate").responseData
        //def affiliateResponse = HttpClient.MainMakeRequest(Type:"POST",Path:"/bi/bi_xt_login.bix",Body:affiliateLogin,"RequestContentType":"application/x-www-form-urlencoded",ContentType:"text/html","App Environment":"BI Admin")
        
        def affiliateResponse = HttpClient.MainMakeRequest(Type:"POST",Path:"/BI/bi_xt_login.php",Body:affiliateLogin,"RequestContentType":"application/x-www-form-urlencoded",ContentType:"text/html","App Environment":"BI Admin")
        
        println("Affiliate login response ${affiliateResponse}")
        HttpClient.Headers["Cookie"] =  affiliateResponse.headers.'Set-Cookie'

        //println(HttpClient.MainMakeRequest(RequestContentType:"text/plain",ContentType:"text/plain",Type:"GET",Path:"/bi/bi_copy_affiliate.bix","Other Environment":"BI Admin").responseData)
        //println(affiliateResponse)
    }
}
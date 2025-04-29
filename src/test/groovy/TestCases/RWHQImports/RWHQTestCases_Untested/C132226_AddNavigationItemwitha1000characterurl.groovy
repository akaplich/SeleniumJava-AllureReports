import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132226 - Add Navigation Item with a 1000 character url
class C132226_AddNavigationItemwitha1000characterurl
{
    private static def variables = [:]

    @BeforeSuite
    public void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
    }
    @Test
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Enterprise Setup Site Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteNavigationPage().run("Add Edit or Delete Navigation Item":/Add/.toString(),"Title":/LongURL/.toString(),"Link":/https:\/\/www.example.com\/api\/data?query=long_query_string_with_multiple_parameters&param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7&param8=value8&param9=value9&param10=value10&param11=value11&param12=value12&param13=value13&param14=value14&param15=value15&param16=value16&param17=value17&param18=value18&param19=value19&param20=value20&extra_param1=1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&extra_param2=0987654321zyxwvutsrqponmlkjihgfedcba&extra_param3=longer_string_to_fill_space&extra_param4=another_long_string_to_ensure_character_count&extra_param5=further_parameters_that_fill_up_the_url_with_random_text&extra_param6=something_else_to_reach_the_2000_character_limit_with_variety&extra_param7=just_more_text_to_get_us_to_the_exact_number_needed&extra_param8=continuing_on_with_strings_that_make_this_url_longer&extra_param9=we_are_almost_there_with_the_length_now&extra_param10=final_stretch_to_reach_two_thousand_characters_exactly/.toString(),"Permission":/ALL/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Element Attribute
        new actions.selenium.VerifyAttribute().run("ID":/\/\/ul[@class='desktop-nav-core-items']\/\/a[contains(text(),'LongURL')]/.toString(),"Attribute Name":/href/.toString(),"Value":/https:\/\/www.example.com\/api\/data?query=long_query_string_with_multiple_parameters&param1=value1&param2=value2&param3=value3&param4=value4&param5=value5&param6=value6&param7=value7&param8=value8&param9=value9&param10=value10&param11=value11&param12=value12&param13=value13&param14=value14&param15=value15&param16=value16&param17=value17&param18=value18&param19=value19&param20=value20&extra_param1=1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&extra_param2=0987654321zyxwvutsrqponmlkjihgfedcba&extra_param3=longer_string_to_fill_space&extra_param4=another_long_string_to_ensure_character_count&extra_param5=further_parameters_that_fill_up_the_url_with_random_text&extra_param6=something_else_to_reach_the_2000_character_limit_with_variety&extra_param7=just_more_text_to_get_us_to_the_exact_number_needed&extra_param8=continuing_on_with_strings_that_make_this_url_longer&extra_param9=we_are_almost_there_with_the_length_now&extra_param10=final_stretch_to_reach_two_thousand_characters_exactly/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new actions.API.Utils.CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new actions.Utils.SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        try{
            //Close Current Window
            new actions.selenium.CloseWindow().run([:])
        }
       catch(all){}catch(Error err){}
        //Delete Affiliate
        new actions.API.Utils.DeleteAffiliate().run([:])

    }
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}
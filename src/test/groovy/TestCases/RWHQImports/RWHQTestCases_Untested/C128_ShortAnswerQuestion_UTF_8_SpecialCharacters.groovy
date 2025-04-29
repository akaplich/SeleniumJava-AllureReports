import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128 - Short Answer Question - UTF-8, Special Characters
class C128_ShortAnswerQuestion_UTF_8_SpecialCharacters
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Test Idea Short UTF-8/.toString(),"Description":/Description/.toString(),"Category":/New Product/.toString(),"Short Answer Question":/Greek: Μπορώ να φάω σπασμένα γυαλιά χωρίς να πάθω τίποτα. Íslenska \/ Icelandic: Ég get etið gler án þess að meiða mig.Polish: Mogę jeść szkło, i mi nie szkodzi. 4.Romanian: Pot să mănânc sticlă și ea nu mă rănește. Ukrainian: Я можу їсти шкло, й воно мені не пошкодить. Armenian: Կրնամ ապակի ուտել և ինծի անհանգիստ չըներ։Georgian: მინას ვჭამ და არა მტკივა.Hindi: मैं काँच खा सकता हूँ, मुझे उस से कोई पीडा नहीं होती.Hebrew(2):ני יכול לאכול זכוכית וזה לא מזיק לי.Yiddish(2):ך קען עסן גלאָז און עס טוט מיר נישט װ.Arabic(2):أنا قادر على أكل الزجاج و هذا لا يؤلمني.Japanese:私はガラスを食べられます。それは私を傷つけません.Thai: ฉันกินกระจกได้ แต่มันไม่ทำให้ฉันเจ็บ.Russian: Буря мглою небо кроет, Вихри снежные крутя;Special Chars and Symbols: √ ∑ π ∞ ∆ ™ © æ £ ¢ @, <, \, ‘, “, $, %, &/.toString(),"Required Short Question":/Required Short Question/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Test Idea Short UTF-8/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Short Answer Question/.toString(),"Field Value":/Greek: Μπορώ να φάω σπασμένα γυαλιά χωρίς να πάθω τίποτα. Íslenska \/ Icelandic: Ég get etið gler án þess að meiða mig.Polish: Mogę jeść szkło, i mi nie szkodzi. 4.Romanian: Pot să mănânc sticlă și ea nu mă rănește. Ukrainian: Я можу їсти шкло, й воно мені не пошкодить. Armenian: Կրնամ ապակի ուտել և ինծի անհանգիստ չըներ։Georgian: მინას ვჭამ და არა მტკივა.Hindi: मैं काँच खा सकता हूँ, मुझे उस से कोई पीडा नहीं होती.Hebrew(2):ני יכול לאכול זכוכית וזה לא מזיק לי.Yiddish(2):ך קען עסן גלאָז און עס טוט מיר נישט װ.Arabic(2):أنا قادر على أكل الزجاج و هذا لا يؤلمني.Japanese:私はガラスを食べられます。それは私を傷つけません.Thai: ฉันกินกระจกได้ แต่มันไม่ทำให้ฉันเจ็บ.Russian: Буря мглою небо кроет, Вихри снежные крутя;Special Chars and Symbols: √ ∑ π ∞ ∆ ™ © æ £ ¢ @, <, \, ‘, “, $, %, &/.toString())
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
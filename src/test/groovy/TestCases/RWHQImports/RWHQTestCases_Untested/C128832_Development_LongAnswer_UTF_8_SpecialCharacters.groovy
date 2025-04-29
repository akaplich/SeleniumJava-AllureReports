import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128832 - Development - Long Answer - UTF-8, Special Characters
class C128832_Development_LongAnswer_UTF_8_SpecialCharacters
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Long Text - A/.toString(),"Additional Question Type":/Long Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Initial Screen/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Idea Submitter/.toString(),"Development Team":/Evaluator/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Long Text - A/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/new idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/new idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Initial Screen/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/new idea/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Long Answer - Title":/Development Long Text - A/.toString(),"Long Answer - Answer":/Greek: Μπορώ να φάω σπασμένα γυαλιά χωρίς να πάθω τίποτα. Íslenska \/ Icelandic: Ég get etið gler án þess að meiða mig.Polish: Mogę jeść szkło, i mi nie szkodzi. 4.Romanian: Pot să mănânc sticlă și ea nu mă rănește. Ukrainian: Я можу їсти шкло, й воно мені не пошкодить. Armenian: Կրնամ ապակի ուտել և ինծի անհանգիստ չըներ։Georgian: მინას ვჭამ და არა მტკივა.Hindi: मैं काँच खा सकता हूँ, मुझे उस से कोई पीडा नहीं होती.Hebrew(2):ני יכול לאכול זכוכית וזה לא מזיק לי.Yiddish(2):ך קען עסן גלאָז און עס טוט מיר נישט װ.Arabic(2):أنا قادر على أكل الزجاج و هذا لا يؤلمني.Japanese:私はガラスを食べられます。それは私を傷つけません.Thai: ฉันกินกระจกได้ แต่มันไม่ทำให้ฉันเจ็บ.Russian: Буря мглою небо кроет, Вихри снежные крутя;Special Chars and Symbols: √ ∑ π ∞ ∆ ™ © æ £ ¢ @, <, \, ‘, “, $, %, &/.toString(),"Action":/Save/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/new idea/.toString())
        //Verify Development Card Answers
        new actions.ActionItems.VerifyDevelopmentCardAnswers().run("Long Answer - Title":/Development Long Text - A/.toString(),"Long Answer - Answer":/Greek: Μπορώ να φάω σπασμένα γυαλιά χωρίς να πάθω τίποτα. Íslenska \/ Icelandic: Ég get etið gler án þess að meiða mig.Polish: Mogę jeść szkło, i mi nie szkodzi. 4.Romanian: Pot să mănânc sticlă și ea nu mă rănește. Ukrainian: Я можу їсти шкло, й воно мені не пошкодить. Armenian: Կրնամ ապակի ուտել և ինծի անհանգիստ չըներ։Georgian: მინას ვჭამ და არა მტკივა.Hindi: मैं काँच खा सकता हूँ, मुझे उस से कोई पीडा नहीं होती.Hebrew(2):ני יכול לאכול זכוכית וזה לא מזיק לי.Yiddish(2):ך קען עסן גלאָז און עס טוט מיר נישט װ.Arabic(2):أنا قادر على أكل الزجاج و هذا لا يؤلمني.Japanese:私はガラスを食べられます。それは私を傷つけません.Thai: ฉันกินกระจกได้ แต่มันไม่ทำให้ฉันเจ็บ.Russian: Буря мглою небо кроет, Вихри снежные крутя;Special Chars and Symbols: √ ∑ π ∞ ∆ ™ © æ £ ¢ @, <, \, ‘, “, $, %, &/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/new idea/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Action":/Mark Complete/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/new idea/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/My Action Items/.toString(),"Title":/new idea/.toString())
        //Verify Development Card Answers
        new actions.ActionItems.VerifyDevelopmentCardAnswers().run("Long Answer - Title":/Development Long Text - A/.toString(),"Long Answer - Answer":/Greek: Μπορώ να φάω σπασμένα γυαλιά χωρίς να πάθω τίποτα. Íslenska \/ Icelandic: Ég get etið gler án þess að meiða mig.Polish: Mogę jeść szkło, i mi nie szkodzi. 4.Romanian: Pot să mănânc sticlă și ea nu mă rănește. Ukrainian: Я можу їсти шкло, й воно мені не пошкодить. Armenian: Կրնամ ապակի ուտել և ինծի անհանգիստ չըներ։Georgian: მინას ვჭამ და არა მტკივა.Hindi: मैं काँच खा सकता हूँ, मुझे उस से कोई पीडा नहीं होती.Hebrew(2):ני יכול לאכול זכוכית וזה לא מזיק לי.Yiddish(2):ך קען עסן גלאָז און עס טוט מיר נישט װ.Arabic(2):أنا قادر على أكل الزجاج و هذا لا يؤلمني.Japanese:私はガラスを食べられます。それは私を傷つけません.Thai: ฉันกินกระจกได้ แต่มันไม่ทำให้ฉันเจ็บ.Russian: Буря мглою небо кроет, Вихри снежные крутя;Special Chars and Symbols: √ ∑ π ∞ ∆ ™ © æ £ ¢ @, <, \, ‘, “, $, %, &/.toString())
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
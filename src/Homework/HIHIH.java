//import UIKit
//
//
//@UIApplicationMain
//class AppDelegate: UIResponder, UIApplicationDelegate {
//
//        var window: UIWindow?
//
//
//        func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplicationLaunchOptionsKey: Any]?) -> Bool {
//
//        // obtain a referece to Lexicotext
//        let dictionary = Lexicontext.sharedDictionary()
//
//        // lookup the work 'apple'
//        var word = "apple"
//        var definition = dictionary?.definition(for: word)
//        print("The definition of \'\(word)\' is: \n\n\(definition)\n\n")
//
//        // lookup another word that begins with the letter 'a'
//        word = "asked";
//        definition = dictionary?.definition(for: word)
//        print("The definition of \'\(word)\' is: \n\n\(definition)\n\n")
//
//        // check if the dictionary contains a word
//        let contains = dictionary?.containsDefinition(for: word);
//        print("Contains definition for \'\(word)\': \(contains)\n\n")
//
//        // lookup another word that begins with the letter 'r' (will fail when using the trial version)
//        word = "run";
//        definition = dictionary?.definition(for: word)
//        print("The definition of \'\(word)\' is: \n\n\(definition)\n\n")
//
//        // get the result as an NSDictionary object
//        word = "archive"
//        let result = dictionary?.definitionAsDictionary(for: word);
//        print("NSDictinoary Result for \'\(word)\' is: \n\n\(result)\n\n")
//
//        // search for words that begin with 'app'
//        word = "app"
//        let words = dictionary?.words(withPrefix: word);
//        print("Words with prefix \'\(word)\' are: \n\n\(words)\n\n")
//
//        // run a string search on the dictionary
//        let grep = dictionary?.grep(word);
//        print("Grep for \'\(word)\' is: \n\n\(grep)\n\n")
//
//        // run a 'thesaurus' search on the dictionary
//        word = "action";
//        let synset = dictionary?.thesaurus(for: word);
//        print("Thesaurus for \'\(word)\' is: \n\n\(synset)\n\n")
//
//        // format a word definition as HTML using a custom CSS
//        word = "Abecedarian"
//        let css = "<style type='text/css'>  body { background-color: #FF0000; color:#00FF00 }   p.definition_body { font-family:'Courier'; font-size:40px }   a { color: #00FF00; text-decoration: none; } </style>"
//        let html = dictionary?.definitionAsHTML(for: word, withStyleSheet:css, useHyperlinks:false);
//        print("HTML Result for \'\(word)\' (no links) is: \n\n\(html)\n\n")
//
//        return true
//        }
//
//        func applicationWillResignActive(_ application: UIApplication) {
//        // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
//        // Use this method to pause ongoing tasks, disable timers, and throttle down OpenGL ES frame rates. Games should use this method to pause the game.
//        }
//
//        func applicationDidEnterBackground(_ application: UIApplication) {
//        // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
//        // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
//        }
//
//        func applicationWillEnterForeground(_ application: UIApplication) {
//        // Called as part of the transition from the background to the inactive state; here you can undo many of the changes made on entering the background.
//        }
//
//        func applicationDidBecomeActive(_ application: UIApplication) {
//        // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
//        }
//
//        func applicationWillTerminate(_ application: UIApplication) {
//        // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
//        }
//
//
//        }
//

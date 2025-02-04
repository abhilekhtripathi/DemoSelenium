package Selenium1;

public class ChallengesForAutomtion
{
	
	/**
	 * 
	 * 
	 * Issue 1: Tests Work Locally but Fail on Jenkins
      Possible Causes:
      Missing browser drivers → Install correct WebDriver version.
      Browser running in headless mode behaves differently → Debug by running in headed mode first.
      Jenkins runs tests as a different user, missing permissions → Use xvfb for Linux environments.

      Issue 2: StaleElementReferenceException in Dynamic Applications
      Possible Causes:
      The element gets refreshed after an action.
      The page updates before interaction.

      Solution: Use FluentWait with retry mechanism.


     Issue 3: Selenium Test Running Very Slowly
     Possible Causes:
     Too many implicit waits → Switch to explicit waits.
     Unnecessary browser interactions → Disable animations, pop-ups, and images in Chrome.


                       
   Synchronization Issues → Use Explicit Waits
   Dynamic Elements → Use Stable XPaths & CSS Selectors
   Cross-Browser Compatibility → Test on multiple browsers
   Captcha/OTP Handling → Use test environments with mock data
   Parallel Execution → Use TestNG & Selenium Grid
   Debugging Issues → Use logs, reports & screenshots

	 * 
	 */

}

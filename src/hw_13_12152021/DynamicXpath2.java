package hw_13_12152021;
/*02) Create dynamic xpath following next 5 ways your teacher taught. For each type, create 5 examples from any website. Write them by commenting in a class inside a package and push to the github. Paste the link below.
90 points*/


public class DynamicXpath2 {
	
   /*10) Tag with parents:
    Source: https://www.bankofamerica.com/
    Example:
    1. Credit Cards: //span[@class='icon']//parent::a[@id='navCreditCards']
    2. Save Online ID: //span[@class='spa-input-check']//parent::div[@class='spa-input-options-
      wrapper']
    3. Visit Better Money Habbit: //[@id='visitBetterMoneyHabitsMobile']//parent::div[@class='columns    small-10 small-push-1 medium-8 medium-push-2 explore-container']   
   
    Source: https://www.nytimes.com/
    4.International:(//a[@class='css-ogiugu']//parent::li[@class='css-1vlye70'])[1] 
     
    11) Tag with child: 
	Source: https://www.bankofamerica.com/
	Example:
	1. Passcode:(//label[@class='spa-input-label']//child::span[@class='ada-hidden'])[8]
	
	 Source: https://www.nytimes.com/
	2. Log In://div[@class='css-ntct7 e1j3jvdr0']//child::a[@class='css-1q6mid5 eieewvv0']
	
	Source:https://www.verizon.com/
	3.Shop: (//div[@class='gnav20-primary-menu gnav20-featured-card']//child::button[@id='gnav20-Shop-L1'])[1]
	4.Home Internet: //li[@class='Tab']//child::a[@id='tab-2']
	
	
	12)Tag with following sibling:
	
	Source: https://www.bankofamerica.com/
    1.Our Company:(//a[@class='navigation-main__link t-track-nav-main-link']//following-sibling::a[@class='navigation-main__toggle plus-icon t-track-nav-mobile-expand'])[1]
	2.Coverage://a[@id='digital-header-nav-link-head-3']//following-sibling::button[@class='nav__link caret-icon ng-tns-c59-18 ng-star-inserted']
	3. Auto Loans:(//span[@class='ada-hidden']//following-sibling::span[@class='title'])[5]
	Source:https://www.verizon.com/
	4.Support://button [@id='gnav20-Support-L1']//following-sibling::button[@class='gnav20-menu-label gnav20-menu-label-button gnav20-goback']
	
	
	13) Tag with preceding sibling      
	Source: https://www.bankofamerica.com/
	1.No Annual Fee:(//span[@class='show-for-medium-up']//preceding-sibling::span[@class='show-for-small-only'])[1]
	Source:https://www.t-mobile.com/
	2.Accept://button [@id='acceptCookie']//preceding-sibling::button[@class='btn btn-secondary manage-cookie-cta']
    3.T-Mobile connect://h2[@class='medium m-t-sm']//preceding-sibling::p[@class='eyebrow m-t-sm']
    4.Activate://button[@id='elem']//preceding-sibling::p[@class='lead m-t-lg xs-m-t-md']



    14) Tag with inner text/attribute:
    Source: https://www.bankofamerica.com/ 
    1.Celebrate The Season: //span[text()='Celebrate the season']
	2.Security: (//a[text()='Security'])[1]
	3.Credit Cards:(//span[text()='Credit Cards'])[1]
	4.Open an Account://a[text()='Open an Account']


}*/
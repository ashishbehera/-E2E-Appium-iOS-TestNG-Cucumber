Feature: Setting of Alert Text for Alert Views on UIKitCatalog Test APP



@smokeTest
Scenario Outline: Navigating Alert Views and check the Alert Text
	Given Server is started and the UIKitCatalog Test APP is opened
	And Navigate to Alert Views Tab
	And Click on Text Entry Sub-Tabs
	And Enter Text <text>
	When Click on OK Button
	Then Click on Confirm or Cancel Sub-Tabs
	And  Verify the message <message> label
	And Click on Confirm Button
	And Stop the Server
	
	
	Examples:
	|text |message                                        |
    |hello|A message should be a short, complete sentence.|

    

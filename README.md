Katalon Studio Automation test using BDD Cucumber

 Feature File in the folder /Include/features

 Step Definitions in the folder /Include/scripts/groovy
 
 Scenario :
    1. User login into Presensi
    2. User Verify copy, csv, excel, pdf and print button in personalia page
    2.1.1 User do asc and desc nama staff and jabatan coloumn
    3. User Verify copy, excel, pdf and print button in data absensi page
    3.1.1 User do asc and desc nama pegawai, tanggal, jam masuk dan jam istirahat coloumn
   
BDD Cucumber for Katalon
	
  @Login
  Feature: Login feature

  @2.1
  Scenario Outline: Verify user login feature
    Given user navigate to presensi.com
  	And user enter username as <username> and password as <password>
  	When user click sign in button
  	Then user verify the <condition> in step

    Examples: 
      | username  | password        | condition           |
      | 220102    | iGDxf8hSRT4=    | loginSuccess        |
      | 220102    | FiS47qEJyp0=    | passwordNotValid    |
      | 22010     | FiS47qEJyp0=    | usernameNotValid    |
      
 
 @Personalia
  Feature: Personalia feature
  
  Background:
  	 Given user on homepage with validID
  	 And user click personalia 
    	
  @2.2.1
  Scenario Outline: Verify copy, csv, excel, pdf and print button 
  	When user click button <button>
  	Then user should get success
  	
  	 Examples: 
      | button  |
      | copy    |
      | csv     |
      | excel   |
      | pdf     |
      | print   |
  
  @2.3.1
  Scenario Outline: Verify asc,dsc on nama staff coloumn
  	When user click asc dsc in <namaKolom> coloumn
  	Then user should get success
  	
   	 Examples: 
      | namaKolom    |
      | namaStaff    |
      | jabatan      |
  
  
  @DataAbsensi
  Feature: Data Absensi feature
  
  Background:
    Given user on homepage with validID in databsensi
  	And user click data absensi
  	 
  @2.5.1
  Scenario Outline: Verify copy, excel, pdf and print button 
  	When user click <buttonaction> button in databsensi
  	Then user should get success in databsensi
  	
  	 Examples: 
      | buttonaction  |
      | copy    			|
      | excel  	 			|
      | pdf     			|
      | print   			|
  
  @2.6.1
  Scenario Outline: Verify asc,dsc on coloumn
  	When user click asc dsc <namaKolom1> coloumn in databsensi
  	Then user should get success in databsensi
  	
   	 Examples: 
      | namaKolom1    |
      | namapegawai   |
      | tanggal       |
      | jammasuk      |
      | jamistirahat  |
      
 
 
      	
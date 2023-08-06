@Personalia
	Feature: Personalia feature
  As a user I want to be sure personalian page in presensi.com correctly
  
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
      
@DataAbsensi
	Feature: Data Absensi feature
  As a user I want to be sure data absensi page in presensi.com correctly
  
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
      
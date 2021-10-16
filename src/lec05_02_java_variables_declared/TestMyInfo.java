package lec05_02_java_variables_declared;

public class TestMyInfo {

	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo();  // Constructor initialized
		myInfo.MyName = "John"; // variables initialized from this line
		myInfo.myAge = 90;
		myInfo.myHouseRent = 30000;
		myInfo.myYearlySalary = 300000;
		myInfo.myBankBalance = 786872685648l;
		myInfo.mySex = 'M';
		myInfo.myHeight = 1.90f;
		myInfo.myGrade = 3.58473657348;
		myInfo.usCitizen = true;
		myInfo.myInformation(); // method initialized
		
		System.out.println("\n********************************************\n");
		
		MyInfo myInfo2 = new MyInfo(); 
		myInfo2.MyName = "Angelina";
		myInfo2.myAge = 50;
		myInfo2.myHouseRent = 31000;
		myInfo2.myYearlySalary = 4000000;
		myInfo2.myBankBalance = 556872685648l;
		myInfo2.mySex = 'F';
		myInfo2.myHeight = 2.10f;
		myInfo2.myGrade = 3.00073657348;
		myInfo2.usCitizen = false;
		myInfo2.myInformation(); // method initialized
	}

}


public class build {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      project myProject = new project();
      myProject.displaySalesClerkName();
      String smartPhoneName = myProject.getSmartPhoneName();
      Integer phoneModel = myProject.getPhoneModel();
      String backColor = myProject.getBackColor();
          System.out.println(backColor);
    	  System.out.println(smartPhoneName);
    	  System.out.println(phoneModel);
      
	}

}

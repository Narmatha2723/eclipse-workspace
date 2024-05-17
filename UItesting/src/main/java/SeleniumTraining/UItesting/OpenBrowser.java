package SeleniumTraining.UItesting;

public class OpenBrowser {
	public static void main(String args[]) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\NARMAE\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver d=new EdgeDriver();
	}

}

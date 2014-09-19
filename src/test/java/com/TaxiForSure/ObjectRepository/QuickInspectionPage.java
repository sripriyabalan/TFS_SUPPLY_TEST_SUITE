package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickInspectionPage {
	
	@FindBy(id="currentOdoMeterReading")
	private WebElement currenOdometerReadEdt;
	
	@FindBy(xpath="//input[@id='wasDriverLate' and @value='0']")
	private WebElement driverLateRaBtn;
	
	@FindBy(xpath="//input[@id='docsVerified' and @value='3']")
	private WebElement docsVerifiedRaBtn;
	
	@FindBy(id="button_newVehiclePhoto1")
	private WebElement frontViewBtn;
	
	@FindBy(id="quick_front_View")
	private WebElement frontViewSelectImgBtn;
	
	@FindBy(xpath="//form[@id='FrontQuickView']/div/div/div/button")
	private WebElement frontViewUploadImgBtn;
	
	@FindBy(xpath="//div[@id='frontViewModal']/div[3]/a")
	private WebElement frontViewCloseBtn;
	
	@FindBy(id="button_newVehiclePhoto5")
	private WebElement sideViewBtn;
	
	@FindBy(id="quick_side_View")
	private WebElement sideViewSelectImgBtn;
	
	@FindBy(xpath="//form[@id='SideQuickView']/div/div/div/button")
	private WebElement sideViewUploadImgBtn;
	
	@FindBy(xpath="//div[@id='sideViewModal']/div[3]/a")
	private WebElement sideViewCloseBtn;
	
	@FindBy(xpath="//input[@id='horn' and @value='3']")
	private WebElement hornRaBtn;;
	
	@FindBy(xpath="//input[@id='headLamp' and @value='3']")
	private WebElement headLampRaBtn;
	
	@FindBy(xpath="//input[@id='windScreen' and @value='3']")
	private WebElement windScreenRaBtn;
	
	@FindBy(xpath="//input[@id='wiper' and @value='3']")
	private WebElement wiperRaBtn;
	
	@FindBy(xpath="//input[@id='rearViewMirror' and @value='3']")
	private WebElement rearViewRaBtn;
	
	@FindBy(xpath="//input[@id='sideViewMirror' and @value='3']")
	private WebElement sideViewRaBtn;
	
	@FindBy(xpath="//input[@id='sideIndicator' and @value='3']")
	private WebElement sideIndicatorRaBtn;
	
	@FindBy(xpath="//input[@id='brakes' and @value='3']")
	private WebElement brakeRaBtn;
	
	@FindBy(xpath="//input[@id='seatBelt' and @value='3']")
	private WebElement seatBeltRaBtn;
	
	@FindBy(xpath="//input[@id='childLock' and @value='3']")
	private WebElement childLockRaBtn;
	
	@FindBy(xpath="//input[@id='stepheny' and @value='3']")
	private WebElement stephenyRaBtn;
	
	@FindBy(xpath="//input[@id='toolKit' and @value='3']")
	private WebElement toolkitRaBtn;
	
	@FindBy(xpath="//input[@id='firstAidKit' and @value='3']")
	private WebElement firstAidKitRaBtn;
	
	@FindBy(xpath="//input[@id='hazardIndicator' and @value='3']")
	private WebElement hazardIndicatorRaBtn;
	
	@FindBy(xpath="//input[@id='tailLamps' and @value='3']")
	private WebElement tailLampsRaBtn;
	
	@FindBy(xpath="//input[@id='cleanFromInside' and @value='3']")
	private WebElement cleanFrmInsideRaBtn;
	
	@FindBy(xpath="//input[@id='cleanFromOutside' and @value='3']")
	private WebElement cleanFrmOutsideRaBtn;
	
	@FindBy(xpath="//input[@id='acWorking' and @value='3']")
	private WebElement acWorkingRaBtn;
	
	@FindBy(xpath="//input[@id='freshner' and @value='3']")
	private WebElement freshnerRaBtn;
	
	@FindBy(xpath="//input[@id='tissue' and @value='3']")
	private WebElement tissueRaBtn;
	
	@FindBy(xpath="//input[@id='seatCover' and @value='3']")
	private WebElement seatCoverRaBtn;
	
	@FindBy(xpath="//input[@id='mobileHandsFree' and @value='3']")
	private WebElement mobileHandsFreeRaBtn;
	
	@FindBy(xpath="//input[@id='floorMat' and @value='3']")
	private WebElement floorMatRaBtn;
	
	@FindBy(xpath="//input[@id='placardMarker' and @value='3']")
	private WebElement placardMarkerRaBtn;
	
	@FindBy(xpath="//input[@id='infoIdCard' and @value='3']")
	private WebElement infoIdCardRaBtn;
	
	@FindBy(xpath="//input[@id='qualityCard' and @value='3']")
	private WebElement qualityCardRaBtn;
	
	@FindBy(xpath="//input[@id='deviceStandMounted' and @value='3']")
	private WebElement devStandMountRaBtn;
	
	@FindBy(xpath="//input[@id='deviceOnStand' and @value='3']")
	private WebElement devOnStandRaBtn;
	
	@FindBy(xpath="//input[@id='wearingUniform' and @value='3']")
	private WebElement wearUniformRaBtn;
	
	@FindBy(xpath="//input[@id='smoking' and @value='1']")
	private WebElement smokingRaBtn;
	
	@FindBy(xpath="//input[@id='drinking' and @value='1']")
	private WebElement drinkingRaBtn;
	
	@FindBy(xpath="//input[@id='chewTobacco' and @value='1']")
	private WebElement chewTobaccoRaBtn;
	
	@FindBy(xpath="//input[@id='shaving' and @value='3']")
	private WebElement shavingRaBtn;
	
	@FindBy(xpath="//input[@id='haircut' and @value='3']")
	private WebElement hairCutRaBtn;
	
	@FindBy(xpath="//body[@id='top']/div[2]/h1")
	private WebElement inspectionSumHeader;

	public WebElement getInspectionSumHeader() {
		return inspectionSumHeader;
	}
	public WebElement getCurrenOdometerReadEdt() {
		return currenOdometerReadEdt;
	}

	public WebElement getDriverLateRaBtn() {
		return driverLateRaBtn;
	}

	public WebElement getDocsVerifiedRaBtn() {
		return docsVerifiedRaBtn;
	}

	public WebElement getFrontViewBtn() {
		return frontViewBtn;
	}

	public WebElement getFrontViewSelectImgBtn() {
		return frontViewSelectImgBtn;
	}

	public WebElement getFrontViewUploadImgBtn() {
		return frontViewUploadImgBtn;
	}

	public WebElement getFrontViewCloseBtn() {
		return frontViewCloseBtn;
	}

	public WebElement getSideViewBtn() {
		return sideViewBtn;
	}

	public WebElement getSideViewSelectImgBtn() {
		return sideViewSelectImgBtn;
	}

	public WebElement getSideViewUploadImgBtn() {
		return sideViewUploadImgBtn;
	}

	public WebElement getSideViewCloseBtn() {
		return sideViewCloseBtn;
	}

	public WebElement getHornRaBtn() {
		return hornRaBtn;
	}

	public WebElement getHeadLampRaBtn() {
		return headLampRaBtn;
	}

	public WebElement getWindScreenRaBtn() {
		return windScreenRaBtn;
	}

	public WebElement getWiperRaBtn() {
		return wiperRaBtn;
	}

	public WebElement getRearViewRaBtn() {
		return rearViewRaBtn;
	}

	public WebElement getSideViewRaBtn() {
		return sideViewRaBtn;
	}

	public WebElement getSideIndicatorRaBtn() {
		return sideIndicatorRaBtn;
	}

	public WebElement getBrakeRaBtn() {
		return brakeRaBtn;
	}

	public WebElement getSeatBeltRaBtn() {
		return seatBeltRaBtn;
	}

	public WebElement getChildLockRaBtn() {
		return childLockRaBtn;
	}

	public WebElement getStephenyRaBtn() {
		return stephenyRaBtn;
	}

	public WebElement getToolkitRaBtn() {
		return toolkitRaBtn;
	}

	public WebElement getFirstAidKitRaBtn() {
		return firstAidKitRaBtn;
	}

	public WebElement getHazardIndicatorRaBtn() {
		return hazardIndicatorRaBtn;
	}

	public WebElement getTailLampsRaBtn() {
		return tailLampsRaBtn;
	}

	public WebElement getCleanFrmInsideRaBtn() {
		return cleanFrmInsideRaBtn;
	}

	public WebElement getCleanFrmOutsideRaBtn() {
		return cleanFrmOutsideRaBtn;
	}

	public WebElement getAcWorkingRaBtn() {
		return acWorkingRaBtn;
	}

	public WebElement getFreshnerRaBtn() {
		return freshnerRaBtn;
	}

	public WebElement getTissueRaBtn() {
		return tissueRaBtn;
	}

	public WebElement getSeatCoverRaBtn() {
		return seatCoverRaBtn;
	}

	public WebElement getMobileHandsFreeRaBtn() {
		return mobileHandsFreeRaBtn;
	}

	public WebElement getFloorMatRaBtn() {
		return floorMatRaBtn;
	}

	public WebElement getPlacardMarkerRaBtn() {
		return placardMarkerRaBtn;
	}

	public WebElement getInfoIdCardRaBtn() {
		return infoIdCardRaBtn;
	}

	public WebElement getQualityCardRaBtn() {
		return qualityCardRaBtn;
	}

	public WebElement getDevStandMountRaBtn() {
		return devStandMountRaBtn;
	}

	public WebElement getDevOnStandRaBtn() {
		return devOnStandRaBtn;
	}

	public WebElement getWearUniformRaBtn() {
		return wearUniformRaBtn;
	}

	public WebElement getSmokingRaBtn() {
		return smokingRaBtn;
	}

	public WebElement getDrinkingRaBtn() {
		return drinkingRaBtn;
	}

	public WebElement getChewTobaccoRaBtn() {
		return chewTobaccoRaBtn;
	}

	public WebElement getShavingRaBtn() {
		return shavingRaBtn;
	}

	public WebElement getHairCutRaBtn() {
		return hairCutRaBtn;
	}

	public WebElement getSaveChangesSubmitBtn() {
		return saveChangesSubmitBtn;
	}

	public WebElement getCheckDriverDistBtn() {
		return checkDriverDistBtn;
	}

	@FindBy(id="submit_vehicle_inspection")
	private WebElement saveChangesSubmitBtn;
	
	@FindBy(linkText="Check Distance with Driver ")
	private WebElement checkDriverDistBtn;
	
	@FindBy(xpath="//form[@id='vehicleQuickInspectionModel']/div[1]/div")
	private WebElement headerMsg;

	public WebElement getHeaderMsg() {
		return headerMsg;
	}
	
	

}

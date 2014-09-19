package com.TaxiForSure.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComprehensiveInspectionPage {

	@FindBy(id="curr_odometer_reading_val")
	private WebElement currOdometerReadingEdt;
	
	@FindBy(xpath="//input[@id='driver_late_val' and @value='0']")
	private WebElement driverLateRaBtn;
	
	@FindBy(xpath="//input[@id='doc_verified_val' and @value='3']")
	private WebElement verifiedDocumentRaBtn;;
	
	@FindBy(id="button_vehicle_photo1")
	private WebElement frontViewUploadBtn;;
	
	@FindBy(id="button_vehicle_photo5")
	private WebElement driverUploadBtn;;
	
	@FindBy(id="front_view")
	private WebElement frontViewSelectImgBtn;;
	
	@FindBy(xpath="//*[@id='FrontView']/div/div/div/button")
	private WebElement frontViewUploadImageBtn;
	
	@FindBy(xpath="//*[@id='frontUploadModal']/div[3]/a")
	private WebElement frontViewCloseBtn;
	
	@FindBy(id="with_driver")
	private WebElement driverSelectImgBtn;
	
	@FindBy(xpath="//*[@id='WithDriver']/div/div/div/button")
	private WebElement driverUploadImageBtn;
	
	@FindBy(xpath="//*[@id='withDriverUploadModal']/div[3]/a")
	private WebElement driverCloseBtn;
	
	
	@FindBy(xpath="//input[@id='horns_val' and @value='3']")
	private WebElement hornsRaBtn;
	
	@FindBy(xpath="//input[@id='headLamp_val' and @value='3']")
	private WebElement headLampRaBtn;
	
	@FindBy(xpath="//input[@id='windscreen_val' and @value='3']")
	private WebElement windScreenRaBtn;
	
	@FindBy(xpath="//input[@id='wiper_val' and @value='3']")
	private WebElement wiperRaBtn;
	
	@FindBy(xpath="//input[@id='rearViewMirror_val' and @value='3']")
	private WebElement rearViewMirrorRaBtn;
	
	@FindBy(xpath="//input[@id='sideViewMirror_val' and @value='3']")
	private WebElement sideViewMirrorRaBtn;
	
	@FindBy(xpath="//input[@id='sideIndicators_val' and @value='3']")
	private WebElement sideIndicatorRaBtn;
	
	@FindBy(xpath="//input[@id='brakes_val' and @value='3']")
	private WebElement brakesRaBtn;
	
	
	@FindBy(xpath="//input[@id='seatBelt_val' and @value='3']")
	private WebElement seatBeltRaBtn;
	
	@FindBy(xpath="//input[@id='childLocks_val' and @value='3']")
	private WebElement childLockRaBtn;
	
	@FindBy(xpath="//input[@id='stepheny_val' and @value='3']")
	private WebElement stephenyRaBtn;
	
	@FindBy(xpath="//input[@id='toolKit_val' and @value='3']")
	private WebElement toolKitRaBtn;
	
	@FindBy(xpath="//input[@id='firstAidKit_val' and @value='3']")
	private WebElement firstAidKitRaBtn;
	
	@FindBy(xpath="//input[@id='hazardIndicators_val' and @value='3']")
	private WebElement hazardIndicatorRaBtn;
	
	@FindBy(xpath="//input[@id='tailLamps_val' and @value='3']")
	private WebElement tailLampRaBtn;
	
	@FindBy(xpath="//input[@id='tyres_val' and @value='3']")
	private WebElement tyresRaBtn;
	
	@FindBy(xpath="//input[@id='front_val' and @value='3']")
	private WebElement frontRaBtn;
	
	@FindBy(xpath="//input[@id='back_val' and @value='3']")
	private WebElement backRaBtn;
	
	@FindBy(xpath="//input[@id='suspension_val' and @value='3']")
	private WebElement suspensionRaBtn;
	
	@FindBy(xpath="//input[@id='paintCondition_val' and @value='3']")
	private WebElement paintRaBtn;;
	
	@FindBy(xpath="//input[@id='carrierCondition_val' and @value='3']")
	private WebElement carrierConditionRaBtn;
	
	@FindBy(xpath="//input[@id='ropes_val' and @value='3']")
	private WebElement ropesRaBtn;
	
	@FindBy(xpath="//input[@id='tarpaulin_val' and @value='3']")
	private WebElement tarpaulinRaBtn;
	
	@FindBy(xpath="//input[@id='branding_val' and @value='3']")
	private WebElement brandingRaBtn;
	
	@FindBy(xpath="//input[@id='acWorking_val' and @value='3']")
	private WebElement acWorkingRaBtn;
	
	@FindBy(xpath="//input[@id='fresheners_val' and @value='3']")
	private WebElement freshenersRaBtn;
	
	@FindBy(xpath="//input[@id='tissues_val' and @value='3']")
	private WebElement tissuesRaBtn;
	
	@FindBy(xpath="//input[@id='seatCovers_val' and @value='3']")
	private WebElement seatCoversRaBtn;
	
	@FindBy(xpath="//input[@id='mobileHandsFree_val' and @value='3']")
	private WebElement mobileHandsFreeRaBtn;
	
	@FindBy(xpath="//input[@id='footMatt_val' and @value='3']")
	private WebElement footMatRaBtn;
	
	@FindBy(xpath="//input[@id='mobileChargers_val' and @value='3']")
	private WebElement mobileChargersRaBtn;
	
	@FindBy(xpath="//input[@id='penBillBook_val' and @value='3']")
	private WebElement penBillRaBtn;
	
	@FindBy(xpath="//input[@id='placard_val' and @value='3']")
	private WebElement placardRaBtn;
	
	@FindBy(xpath="//input[@id='idCard_val' and @value='3']")
	private WebElement idCardRaBtn;
	
	@FindBy(xpath="//input[@id='stereo_val' and @value='3']")
	private WebElement stereoRaBtn;
	
	@FindBy(xpath="//input[@id='qualityCard_val' and @value='3']")
	private WebElement qualityCardRaBtn;
	
	@FindBy(xpath="//input[@id='devStandMounted_val' and @value='3']")
	private WebElement devStandMountedRaBtn;
	
	@FindBy(xpath="//input[@id='devOnStand_val' and @value='3']")
	private WebElement devStandRaBtn;
	
	@FindBy(xpath="//input[@id='knowledgeOfDevFunction_val' and @value='3']")
	private WebElement knowledgeDevRaBtn;
	
	@FindBy(xpath="//input[@id='wearingUniform_val' and @value='3']")
	private WebElement wearingUniformRaBtn;
	
	@FindBy(xpath="//input[@id='smoking_val' and @value='3']")
	private WebElement smokingRaBtn;
	
	@FindBy(xpath="//input[@id='drinking_val' and @value='3']")
	private WebElement drinkingRaBtn;
	
	@FindBy(xpath="//input[@id='chewingTobacco_val' and @value='3']")
	private WebElement chewingTobaccoRaBtn;
	
	@FindBy(xpath="//input[@id='shaving_val' and @value='3']")
	private WebElement shavingRaBtn;
	
	@FindBy(xpath="//input[@id='haircut_val' and @value='3']")
	private WebElement haircutRaBtn;
	
	@FindBy(xpath="//input[@id='knowledgeOfRoutes_val' and @value='3']")
	private WebElement knowledgeRoutesRaBtn;
	
	@FindBy(xpath="//input[@id='routing_to_customer_pt_val' and @value='1']")
	private WebElement routingToCustRaBtn;
	
	@FindBy(xpath="//input[@id='business_satisfaction_val' and @value='1']")
	private WebElement businessSatisfactionRaBtn;
	
	@FindBy(id="submit_vehicle_inspection")
	private WebElement saveChangesSubmitBtn;
	
	@FindBy(id="share_location")
	private WebElement driverDistBtn;

	public WebElement getCurrOdometerReadingEdt() {
		return currOdometerReadingEdt;
	}

	public WebElement getDriverLateRaBtn() {
		return driverLateRaBtn;
	}

	public WebElement getVerifiedDocumentRaBtn() {
		return verifiedDocumentRaBtn;
	}

	public WebElement getFrontViewUploadBtn() {
		return frontViewUploadBtn;
	}

	public WebElement getDriverUploadBtn() {
		return driverUploadBtn;
	}

	public WebElement getFrontViewSelectImgBtn() {
		return frontViewSelectImgBtn;
	}

	public WebElement getFrontViewUploadImageBtn() {
		return frontViewUploadImageBtn;
	}

	public WebElement getFrontViewCloseBtn() {
		return frontViewCloseBtn;
	}

	public WebElement getDriverSelectImgBtn() {
		return driverSelectImgBtn;
	}

	public WebElement getDriverUploadImageBtn() {
		return driverUploadImageBtn;
	}

	public WebElement getDriverCloseBtn() {
		return driverCloseBtn;
	}

	public WebElement getHornsRaBtn() {
		return hornsRaBtn;
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

	public WebElement getRearViewMirrorRaBtn() {
		return rearViewMirrorRaBtn;
	}

	public WebElement getSideViewMirrorRaBtn() {
		return sideViewMirrorRaBtn;
	}

	public WebElement getSideIndicatorRaBtn() {
		return sideIndicatorRaBtn;
	}

	public WebElement getBrakesRaBtn() {
		return brakesRaBtn;
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

	public WebElement getToolKitRaBtn() {
		return toolKitRaBtn;
	}

	public WebElement getFirstAidKitRaBtn() {
		return firstAidKitRaBtn;
	}

	public WebElement getHazardIndicatorRaBtn() {
		return hazardIndicatorRaBtn;
	}

	public WebElement getTailLampRaBtn() {
		return tailLampRaBtn;
	}

	public WebElement getTyresRaBtn() {
		return tyresRaBtn;
	}

	public WebElement getFrontRaBtn() {
		return frontRaBtn;
	}

	public WebElement getBackRaBtn() {
		return backRaBtn;
	}

	public WebElement getSuspensionRaBtn() {
		return suspensionRaBtn;
	}

	public WebElement getPaintRaBtn() {
		return paintRaBtn;
	}

	public WebElement getCarrierConditionRaBtn() {
		return carrierConditionRaBtn;
	}

	public WebElement getRopesRaBtn() {
		return ropesRaBtn;
	}

	public WebElement getTarpaulinRaBtn() {
		return tarpaulinRaBtn;
	}

	public WebElement getBrandingRaBtn() {
		return brandingRaBtn;
	}

	public WebElement getAcWorkingRaBtn() {
		return acWorkingRaBtn;
	}

	public WebElement getFreshenersRaBtn() {
		return freshenersRaBtn;
	}

	public WebElement getTissuesRaBtn() {
		return tissuesRaBtn;
	}

	public WebElement getSeatCoversRaBtn() {
		return seatCoversRaBtn;
	}

	public WebElement getMobileHandsFreeRaBtn() {
		return mobileHandsFreeRaBtn;
	}

	public WebElement getFootMatRaBtn() {
		return footMatRaBtn;
	}

	public WebElement getMobileChargersRaBtn() {
		return mobileChargersRaBtn;
	}

	public WebElement getPenBillRaBtn() {
		return penBillRaBtn;
	}

	public WebElement getPlacardRaBtn() {
		return placardRaBtn;
	}

	public WebElement getIdCardRaBtn() {
		return idCardRaBtn;
	}

	public WebElement getStereoRaBtn() {
		return stereoRaBtn;
	}

	public WebElement getQualityCardRaBtn() {
		return qualityCardRaBtn;
	}

	public WebElement getDevStandMountedRaBtn() {
		return devStandMountedRaBtn;
	}

	public WebElement getDevStandRaBtn() {
		return devStandRaBtn;
	}

	public WebElement getKnowledgeDevRaBtn() {
		return knowledgeDevRaBtn;
	}

	public WebElement getWearingUniformRaBtn() {
		return wearingUniformRaBtn;
	}

	public WebElement getSmokingRaBtn() {
		return smokingRaBtn;
	}

	public WebElement getDrinkingRaBtn() {
		return drinkingRaBtn;
	}

	public WebElement getChewingTobaccoRaBtn() {
		return chewingTobaccoRaBtn;
	}

	public WebElement getShavingRaBtn() {
		return shavingRaBtn;
	}

	public WebElement getHaircutRaBtn() {
		return haircutRaBtn;
	}

	public WebElement getKnowledgeRoutesRaBtn() {
		return knowledgeRoutesRaBtn;
	}

	public WebElement getRoutingToCustRaBtn() {
		return routingToCustRaBtn;
	}

	public WebElement getBusinessSatisfactionRaBtn() {
		return businessSatisfactionRaBtn;
	}

	public WebElement getSaveChangesSubmitBtn() {
		return saveChangesSubmitBtn;
	}

	public WebElement getDriverDistBtn() {
		return driverDistBtn;
	}
	
	@FindBy(xpath="//body[@id='top']/div[2]/h1")
	private WebElement inspectionSumHeader;

	public WebElement getInspectionSumHeader() {
		return inspectionSumHeader;
	}
	
	@FindBy(xpath="//form[@id='inspection_form']/div/div")
	private WebElement headerRadiusMsg;

	public WebElement getHeaderRadiusMsg() {
		return headerRadiusMsg;
	}
	
	
	
	
}

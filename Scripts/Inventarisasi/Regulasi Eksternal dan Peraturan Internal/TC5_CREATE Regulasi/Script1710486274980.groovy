import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Auth/TC1_SignIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Navigation/to Inventarisasi - Regulasi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create Regulasi/svg_Input RegulasiPeraturan_ng-tns-c137-10'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/span_Regulasi Eksternal'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/svg_Regulasi Eksternal_ng-tns-c137-12'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/span_Undang-undang Test'))

WebUI.setText(findTestObject('Object Repository/Create Regulasi/textarea_Undang-undang Test_mat-input-3'), 'Peraturan Automation')

WebUI.setText(findTestObject('Object Repository/Create Regulasi/input_Undang-undang Test_mat-input-4'), 'regulasi Automation')

WebUI.setText(findTestObject('Object Repository/Create Regulasi/input_Undang-undang Test_mat-input-5'), '2024')

WebUI.setText(findTestObject('Object Repository/Create Regulasi/textarea_Undang-undang Test_mat-input-6'), 'implementasi automation')

WebUI.comment('upload file')

WebUI.uploadFile(findTestObject('Create Regulasi/input_Input RegulasiPeraturan_file-input'), 'C:\\\\Users\\\\yohan\\\\Downloads\\\\laporan.pdf')

WebUI.click(findTestObject('Object Repository/Create Regulasi/svg_Cari_ng-tns-c137-19'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/span_Akademisi'))

WebUI.setText(findTestObject('Create Regulasi/input_Akademisi_mat-input-7'), 'kedeputian bidang strategi')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Regulasi/span_Kedeputian Bidang Strategi, Perencanaa_8a0a63'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/span__mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/div_17'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/div_19'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/button_Yes'))

WebUI.click(findTestObject('Object Repository/Create Regulasi/button_OK'))


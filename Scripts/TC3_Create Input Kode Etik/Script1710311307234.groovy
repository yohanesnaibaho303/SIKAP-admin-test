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

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/DropDown_Inventarisasi'))

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/span_Kode Etik'))

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/svg_Drop Down Jenis Produk Hukum'))

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/Choose Option 2'))

WebUI.setText(findTestObject('Object Repository/Create Kode Etik Obj/textarea_'), 'test auto lagi')

WebUI.setText(findTestObject('Object Repository/Create Kode Etik Obj/input_Coba Update XXX1_mat-input-4'), '303')

WebUI.setText(findTestObject('Object Repository/Create Kode Etik Obj/input_Cari_mat-input-5'), 'kedeputian bidang strategi')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/span_Kedeputian Bidang Strategi, Perencanaa_8a0a63'))

WebUI.uploadFile(findTestObject('Create Kode Etik Obj/input_Input Kode Etik_file-input'), 'C:\\Users\\yohan\\Downloads\\laporan.pdf')

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/button_Yes'))

WebUI.click(findTestObject('Object Repository/Create Kode Etik Obj/button_OK'))


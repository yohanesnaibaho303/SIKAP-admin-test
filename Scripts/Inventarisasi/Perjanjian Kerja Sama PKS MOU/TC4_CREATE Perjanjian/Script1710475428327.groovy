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

WebUI.comment('Setelah berhasil login, bot akan pergi ke page Inventarisasi Kode Etik')

WebUI.comment('Bot Automated akan mengisi semua input dengan benar')

WebUI.click(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/svg_Input PKS  MOU_ng-tns-c137-10'))

WebUI.click(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/span_Coba Update XXX1'))

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/input_Coba Update XXX1_mat-input-3'), '0123')

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/textarea_Coba Update XXX1_mat-input-4'), 
    'PKS Automated')

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/input_Coba Update XXX1_mat-input-5'), '2024')

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/textarea_Coba Update XXX1_mat-input-6'), 
    'Tentang Automated Tools')

WebUI.comment('Bot bisa mengupload file dari local dengan membaca path dari device')

WebUI.uploadFile(findTestObject('Create New Perjanjian Kerja Sama/input_Input PKS  MOU_file-input'), 'C:\\Users\\yohan\\Downloads\\laporan.pdf')

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/input_Cari_mat-input-7'), 'Eksternal Auto')

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/input_Required field_mat-input-8'), 'kedeputian bidang strategi')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/span_Kedeputian Bidang Strategi, Perencanaa_8a0a63'))

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/input__mat-end-date mat-date-range-input-inner ng-untouched ng-pristine ng-invalid'), 
    '01/02/2024')

WebUI.setText(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/input__mat-end-date mat-date-range-input-in_e5a77e'), 
    '03/02/2024')

WebUI.click(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/span_Simpan'))

WebUI.comment('Setelah mengisi semua inputan dengan benar, maka data akan sukses ditambahkan')

WebUI.click(findTestObject('Object Repository/Create New Perjanjian Kerja Sama/button_Yes'))

WebUI.click(findTestObject('Create New Perjanjian Kerja Sama/button_OK'))


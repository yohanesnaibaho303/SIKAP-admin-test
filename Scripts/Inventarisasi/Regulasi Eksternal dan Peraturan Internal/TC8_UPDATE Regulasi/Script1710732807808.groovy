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

WebUI.comment('Setelah berhasil login, maka admin akan mengupdate data Regulasi Eksternal Internal')

WebUI.click(findTestObject('Button Update Inventarisasi/Button Update Regulasi (index)'))

// Simpan nilai input sebelumnya
String previousInput = WebUI.getAttribute(findTestObject('Update Regulasi/textarea_Undang-undang Test_mat-input-3'), 'value')

WebUI.comment('Codingan Logic untuk mengecek Jikalau String yang ingin di update sama, maka akan diupdate')

// Input value baru
String newValue = 'Peraturan Regulasi Automation'

// Lakukan pengecekan kondisional
if (newValue.equals(previousInput)) {
    String suffix = 'Terbaru dan Terupdate'

    while (newValue.equals(previousInput)) {
        newValue += " $suffix"
    }
}

// Masukkan nilai input baru
WebUI.setText(findTestObject('Update Regulasi/textarea_Undang-undang Test_mat-input-3'), newValue)

WebUI.click(findTestObject('Object Repository/Update Regulasi/span_Update'))

WebUI.click(findTestObject('Object Repository/Update Regulasi/button_Yes'))

WebUI.click(findTestObject('Object Repository/Update Regulasi/button_OK'))

WebUI.comment('Data berhasil diupdate')


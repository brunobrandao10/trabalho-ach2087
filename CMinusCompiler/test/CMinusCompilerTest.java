import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class CMinusCompilerTest {
	private Path tempDir;
	
	@BeforeMethod
	public void createTempDir() throws IOException {
		tempDir = Files.createTempDirectory("compilerTest");
	}
	
	@AfterMethod
	public void deleteTempDir() {
		deleteRecursive(tempDir.toFile());
	}
	
	private void deleteRecursive(File file) {
		if (file.isDirectory()) {
			for(File child : file.listFiles()) {
				deleteRecursive(child);
			}
		}
		if (!file.delete()) {
			throw new Error("Could not delete file <" + file + ">");
		}
	}

	@Test(dataProvider = "provide_code_expectedText")
	public void runningCode_outputsExpectedText(
			String code, String expectedText) throws Exception {
		// execution
		String actualOutput = compileAndRun(code);
		
		// evaluation
		Assert.assertEquals(actualOutput, expectedText);
	}
	
	
	
	@DataProvider
	public Object[][] provide_code_expectedText() {
		return new Object[][]{
				{"int main(void) {\n" +
						"write(1);\n" +
						"}\n",
				  ".text\n" + 
				  "	.globl main\n" + 
				  "main:\n" + 
				  "	subu $t0, $sp, 8\n" + 
				  "	sw  $ra, 4($t0)\n" + 
				  "	sw  $sp, ($t0)\n" + 
				  "	addu $sp, $t0, 0\n" + 
				  "	li  $a0, 2\n" + 
				  "	li  $v0, 1\n" + 
				  "	syscall\n" + 
				  "	li $v0, 0\n" + 
				  "	lw  $ra, 4($sp)\n" + 
				  "	lw  $sp, ($sp)\n" + 
				  "	jr  $ra	"+ System.lineSeparator()}
		};
	}

	private String compileAndRun(String code) throws Exception {
		String v = Main.compile(CharStreams.fromString(code));
		return v;
	}

}

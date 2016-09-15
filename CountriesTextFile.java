import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {

	private Path filePath;
	

	public CountriesTextFile(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}

	public CountriesTextFile() {
		this("C:/Users/User/workspace/Labs/src/countries.txt");
	}

	public List<String> readCountryList() {

		List<String> countries = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return countries;
		}

		try {
			File file = filePath.toFile();

			FileReader filereader = new FileReader(file);
			BufferedReader reader = new BufferedReader(filereader);
			String line = reader.readLine();
			while (line != null) {
				countries.add(line);
				line = reader.readLine();
			}

			reader.close();
			return countries;

		} catch (IOException ex) {
			throw new RuntimeException("unable to read the country list", ex);
		}
	}

	public void writeCountryList(List<String> country) {
	
		
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}

			File file1 = filePath.toFile();
			PrintWriter writer = new PrintWriter(
					             new BufferedWriter(
					             new FileWriter(file1,true))); 
			

			for (String countryList : country) {
				writer.println(countryList);
			}

			writer.close();
		} catch (IOException ex) {
           throw new RuntimeException("unable to write country list");
		}
       
	}

}

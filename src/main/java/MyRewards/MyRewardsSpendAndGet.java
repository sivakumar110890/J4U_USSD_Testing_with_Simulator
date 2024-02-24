package MyRewards;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class MyRewardsSpendAndGet {
	public static Properties prop;

	public static void main(String[] args) throws InterruptedException, IOException {
		// Define the base URL
		PropertyfileLoading();
		String MSISDN = prop.getProperty("MSISDN");

		int randomVariable0 = UniqueNumberGenerator();
		System.out.println("=============================");
		
		Requests("*1402*2%23", MSISDN, "0001", randomVariable0);
		Requests("5", MSISDN, "0012", randomVariable0);
		Requests("3", MSISDN, "0012", randomVariable0);
		Requests("1", MSISDN, "0012", randomVariable0);
	
		Thread.sleep(5000);
		System.out.println("=============================");

		int randomVariable1 = UniqueNumberGenerator();
	
		Requests("*1402*2%23", MSISDN, "0001", randomVariable1);
		Requests("5", MSISDN, "0012", randomVariable1);
		Requests("3", MSISDN, "0012", randomVariable1);
		Requests("2", MSISDN, "0012", randomVariable1);

	
		Thread.sleep(5000);
		System.out.println("=============================");
		
		int randomVariable2 = UniqueNumberGenerator();
		Requests("*1402*2%23", MSISDN, "0001", randomVariable2);
		Requests("5", MSISDN, "0012", randomVariable2);
		Requests("3", MSISDN, "0012", randomVariable2);		
		Requests("1", MSISDN, "0012", randomVariable2);		
		Thread.sleep(5000);
		System.out.println("=============================");
	

		int randomVariable3 = UniqueNumberGenerator();
		Requests("*1402*2%23", MSISDN, "0001", randomVariable3);
		Requests("5", MSISDN, "0012", randomVariable3);
		Requests("3", MSISDN, "0012", randomVariable3);
		Requests("1", MSISDN, "0012", randomVariable3);
		Requests("1", MSISDN, "0012", randomVariable3);

		
		Thread.sleep(5000);
		System.out.println("=============================");
	

		int randomVariable4 = UniqueNumberGenerator();
		Requests("*1402*2%23", MSISDN, "0001", randomVariable4);
		Requests("5", MSISDN, "0012", randomVariable4);
		Requests("3", MSISDN, "0012", randomVariable4);
		Requests("2", MSISDN, "0012", randomVariable4);

		
		Thread.sleep(5000);
		System.out.println("=============================");

	}

	public static int generateUniqueRandomNumber() {
		int min = 1;
		int max = 1000;
		int numberOfUniqueNumbers = 1000;

		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		Random rand = new Random();
		int randomInt = -1; // Initialize randomInt outside the loop

		while (uniqueNumbers.size() < numberOfUniqueNumbers) {
			randomInt = rand.nextInt((max - min) + 1) + min;

			// Check if the generated number is unique
			if (!uniqueNumbers.contains(randomInt)) {
				uniqueNumbers.add(randomInt);
				System.out.println(randomInt);
			}
		}

		return randomInt; // Return the generated randomInt
	}

	public static void Requests(String short_messge, String MSISDN, String SESSION_VALUE, int randomVariable)
			throws InterruptedException {
		Thread.sleep(4000);
		String baseUrl = "http://10.200.178.76:8284/inject_mo?" + "short_message=" + short_messge + "&" + "source_addr="
				+ MSISDN + "&"
				+ "destination_addr=98765432&submit=Submit+Message&service_type=&source_addr_ton=1&source_addr_npi=1&dest_addr_ton=1&dest_addr_npi=1&esm_class=0&protocol_ID=&priority_flag=&registered_delivery_flag=0&data_coding=0&user_message_reference="
				+ randomVariable
				+ "&source_port=&destination_port=&sar_msg_ref_num=&sar_total_segments=&sar_segment_seqnum=&user_response_code=&privacy_indicator=&payload_type=&message_payload=&callback_num=&source_subaddress=&dest_subaddress=&language_indicator=&tlv1_tag=1281&tlv1_len=1&tlv1_val="
				+ SESSION_VALUE
				+ "&tlv2_tag=5376&tlv2_len=30&tlv2_val=1500&tlv3_tag=5632&tlv3_len=15&tlv3_val=CF1D&tlv4_tag=&tlv4_len=&tlv4_val=&tlv5_tag=&tlv5_len=&tlv5_val=&tlv6_tag=&tlv6_len=&tlv6_val=&tlv7_tag=&tlv7_len=&tlv7_val=";

		try

		{
			// Create the URL for the GET request with the current parameter value
			URL url = new URL(baseUrl + "?" + short_messge + MSISDN + SESSION_VALUE);
			System.out.println("Actual Endpoint is : " + url);

			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Set the request method to GET
			connection.setRequestMethod("GET");

			// Get the response code
			int responseCode = connection.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				// Read and print the response
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String inputLine;
				StringBuilder response = new StringBuilder();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}

				in.close();

				System.out.println("Response for " + url + ":");
				// System.out.println(response.toString());
			} else {
				System.out.println("Request failed with response code: " + responseCode);
			}

			// Close the connection
			connection.disconnect();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int UniqueNumberGenerator() {
		int min = 1;
		int max = 1000;

		// Create an array to hold numbers in the specified range
		int[] numbers = new int[max - min + 1];
		for (int i = min; i <= max; i++) {
			numbers[i - min] = i;
		}

		// Shuffle the array
		shuffleArray(numbers);

		// Get the first element, which is a random unique number
		int randomUniqueNumber = numbers[0];

		System.out.println("Generated Random Unique Number: " + randomUniqueNumber);
		return randomUniqueNumber;
	}

	// Fisher-Yates shuffle algorithm to shuffle an array
	private static void shuffleArray(int[] arr) {
		Random rand = new Random();
		for (int i = arr.length - 1; i > 0; i--) {
			int index = rand.nextInt(i + 1);
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}

	public static Properties PropertyfileLoading() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "//config//config.properties");
		prop = new Properties();
		prop.load(file);
		return prop;
	}
}
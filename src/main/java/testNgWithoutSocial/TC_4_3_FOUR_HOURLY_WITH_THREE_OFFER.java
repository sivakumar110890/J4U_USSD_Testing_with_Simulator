package testNgWithoutSocial;

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

import org.testng.annotations.Test;

public class TC_4_3_FOUR_HOURLY_WITH_THREE_OFFER {
	public static Properties prop;

	public static void main(String[] args) throws InterruptedException, IOException {

	}

	@Test(priority = 1, groups = { "HourlyThreeValid" })
	public static void HourlyFirstAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  First offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("4", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);

		System.out.println("J4U HOURLY - 3 OFFERS  First offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 2, groups = { "HourlyThreeValid" })
	public static void HourlyFirstMpesaUSD() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  First offer with MPESA - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("4", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U HOURLY - 3 OFFERS  First offer with MPESA - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 3, groups = { "HourlyThreeValid" })
	public static void HourlyFirstMpesaCDF() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  First offer with MPESA - 2 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  First offer with MPESA - 2 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 4, groups = { "HourlyThreeValid" })
	public static void HourlySecondAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  Second offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("4", "0012", randomVariable1);
		Requests("2", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);

		System.out.println("J4U HOURLY - 3 OFFERS  Second offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 5, groups = { "HourlyThreeValid" })
	public static void HourlySecondMpesaUSD() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  SECOND offer with MPESA - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("4", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U HOURLY - 3 OFFERS  SECOND offer with MPESA - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 6, groups = { "HourlyThreeValid" })
	public static void HourlySecondMpesaCDF() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  SECOND offer with MPESA - 2 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  SECOND offer with MPESA - 2 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 7, groups = { "HourlyThreeValid" })
	public static void HourlyThirdAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  THIRD offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("4", "0012", randomVariable1);
		Requests("3", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);

		System.out.println("J4U HOURLY - 3 OFFERS  THIRD offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 8, groups = { "HourlyThreeValid" })
	public static void HourlyThirdMpesaUSD() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  THIRD offer with MPESA - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("4", "0012", randomVariable2);
		Requests("3", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U HOURLY - 3 OFFERS  THIRD offer with MPESA - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 9, groups = { "HourlyThreeValid" })
	public static void HourlyThirdMpesaCDF() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  THIRD offer with MPESA - 2 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("3", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  THIRD offer with MPESA - 2 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 10, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidFour() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 4th - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("4", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 4th - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 11, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidFive() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 5th - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("5", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 5th - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 12, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidSix() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 6th - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("6", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 6th - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 13, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidSeven() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 7th - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("7", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 7th - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 14, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidEighth() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 8th - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("8", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 8th - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 15, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidHash() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION # - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("%23", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION # - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 16, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidAsterisk() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION * - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("*", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION * - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 17, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidZero() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 0 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("0", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID SELECTION 0 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 18, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidPaymentThree() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION 3 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("3", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION 3 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 19, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidPaymentZero() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION 0 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("0", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION 0 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 20, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidPaymentHash() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION # - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("%23", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION # - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 21, groups = { "HourlyThreeInvalid" })
	public static void HourlyThreeInvalidPaymentAsterisk() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION * - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("4", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("*", "0012", randomVariable3);
		System.out.println("J4U HOURLY - 3 OFFERS  INVALID PAYMENT SELECTION * - ENDING");
		System.out.println("==================================================");
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

	public static void Requests(String short_messge, String SESSION_VALUE, int randomVariable)
			throws InterruptedException, IOException {
		PropertyfileLoading();
		String PORT = prop.getProperty("simulator.port");
		String MSISDN = prop.getProperty("MSISDN");
		Thread.sleep(4000);
		String baseUrl = "http://10.200.178.76:" + PORT + "/inject_mo?" + "short_message=" + short_messge + "&"
				+ "source_addr=" + MSISDN + "&"
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
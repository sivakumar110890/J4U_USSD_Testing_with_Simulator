package testNgWithSocial;

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

public class TC_5_3_J4U_TOWN_THREE_OFFERS {
	public static Properties prop;

	public static void main(String[] args) throws InterruptedException, IOException {

//		 UPSERT INTO ENBA_T_J4U_CELLID_TOWNNAME_MAP (CELL_ID,TOWN_NAME,START_DATE,END_DATE,ENABLED,LOAD_DATE) VALUES 
//		('53021','two','2023-11-16 14:25:22.796','2050-01-30 11:00:00.000',1,CURRENT_TIMESTAMP);
//		select * from ENBA_T_J4U_TOWNNAME_TOWNOFFERS_MAP WHERE TOWN_NAME in('two');
//		UPSERT INTO ENBA_T_J4U_TOWNNAME_TOWNOFFERS_MAP (TOWN_NAME,PRODUCT_ID,LOAD_DATE) VALUES ('two','611820',CURRENT_TIMESTAMP);
//		UPSERT INTO ENBA_T_J4U_TOWNNAME_TOWNOFFERS_MAP (TOWN_NAME,PRODUCT_ID,LOAD_DATE) VALUES ('two','611821',CURRENT_TIMESTAMP);
//		PropertyfileLoading();

	}

	@Test(priority = 1)
	public static void One() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer First offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("5", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);

		System.out.println("J4U Town Offer First offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 2)
	public static void Two() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer First offer with MPESA - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("5", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U Town Offer First offer with MPESA - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 3)
	public static void Three() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer First offer with MPESA - 2 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("5", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		System.out.println("J4U Town Offer First offer with MPESA - 2 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 4)
	public static void Fourteen() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable14 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer Second offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable14);
		Requests("5", "0012", randomVariable14);
		Requests("2", "0012", randomVariable14);
		Requests("1", "0012", randomVariable14);
		System.out.println("J4U Town Offer Second offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 5)
	public static void Fifteen() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable15 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer Second offer with MPESA - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable15);
		Requests("5", "0012", randomVariable15);
		Requests("2", "0012", randomVariable15);
		Requests("2", "0012", randomVariable15);
		Requests("1", "0012", randomVariable15);
		System.out.println("J4U Town Offer Second offer with MPESA - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 6)
	public static void Sixteen() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable16 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer Second offer with MPESA - 2 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable16);
		Requests("5", "0012", randomVariable16);
		Requests("2", "0012", randomVariable16);
		Requests("2", "0012", randomVariable16);
		Requests("2", "0012", randomVariable16);
		System.out.println("J4U Town Offer Second offer with MPESA - 2 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 7)
	public static void OneOne() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer Third offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("5", "0012", randomVariable1);
		Requests("3", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);

		System.out.println("J4U Town Offer Third offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 8)
	public static void TwoTwo() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer Third offer with MPESA - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("5", "0012", randomVariable2);
		Requests("3", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U Town Offer Third offer with MPESA - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 9)
	public static void ThreeThree() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U Town Offer Third offer with MPESA - 2 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("5", "0012", randomVariable3);
		Requests("3", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("2", "0012", randomVariable3);
		System.out.println("J4U Town Offer Third offer with MPESA - 2 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 10)
	public static void Four() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable4 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario 4 STARTING");
		Requests("*1402*2%23", "0001", randomVariable4);
		Requests("5", "0012", randomVariable4);
		Requests("4", "0012", randomVariable4);
		System.out.println("Invalid scenario 4 ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 11)
	public static void Seven() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable7 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario 5 STARTING");
		Requests("*1402*2%23", "0001", randomVariable7);
		Requests("5", "0012", randomVariable7);
		Requests("5", "0012", randomVariable7);
		System.out.println("Invalid scenario 5 ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 12)
	public static void Eight() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable8 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario # STARTING");
		Requests("*1402*2%23", "0001", randomVariable8);
		Requests("5", "0012", randomVariable8);
		Requests("%23", "0012", randomVariable8);
		System.out.println("Invalid scenario # ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 13)
	public static void Nine() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable9 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario * STARTING");
		Requests("*1402*2%23", "0001", randomVariable9);
		Requests("5", "0012", randomVariable9);
		Requests("*", "0012", randomVariable9);
		System.out.println("Invalid scenario * ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 14)
	public static void Ten() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable10 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario 0 STARTING");
		Requests("*1402*2%23", "0001", randomVariable10);
		Requests("5", "0012", randomVariable10);
		Requests("0", "0012", randomVariable10);
		System.out.println("Invalid scenario 0 ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 15)
	public static void Eleven() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable11 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario 6 STARTING");
		Requests("*1402*2%23", "0001", randomVariable11);
		Requests("5", "0012", randomVariable11);
		Requests("6", "0012", randomVariable11);
		System.out.println("Invalid scenario 6 ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 16)
	public static void Twelve() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable12 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario 7 STARTING");
		Requests("*1402*2%23", "0001", randomVariable12);
		Requests("5", "0012", randomVariable12);
		Requests("7", "0012", randomVariable12);
		System.out.println("Invalid scenario 7 ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 17)
	public static void Thirteen() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable13 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Invalid scenario 8 STARTING");
		Requests("*1402*2%23", "0001", randomVariable13);
		Requests("5", "0012", randomVariable13);
		Requests("8", "0012", randomVariable13);
		System.out.println("Invalid scenario 8 ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 18)
	public static void PaymentInvalid() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable14 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Payment Invalid scenario 3 STARTING");
		Requests("*1402*2%23", "0001", randomVariable14);
		Requests("5", "0012", randomVariable14);
		Requests("1", "0012", randomVariable14);
		Requests("3", "0012", randomVariable14);
		System.out.println("Payment Invalid scenario 3 ENDING");
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

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

public class AllSubmenu {
	public static Properties prop;
	

	/*
	 * UPDATE ERED_T_REDUCED_CCR SET MORNING_OFFER_ELIGIBILITY='Y',
	 * J4U_ELIGIBILITY='Y', ML_CUSTOMER_FLAG='Y', PED_ELIGIBILITY='Y',
	 * RANDOM_FLAG='Y', LOCATION_RANDOM_FLAG='Y',A_VALUE='0.3', PREF_PAY_METHOD='G',
	 * AA_ELIGIBLE='1', OFFER_REFRESH_FLAG='VDIHS', LANG_CODE='2' WHERE
	 * MSISDN='811404441';
	 * 
	 * UPSERT INTO ENBA_T_MORNING_OFFER_WHITELIST
	 * (MSISDN,PRODUCT_ID,ACTIVE_FLAG,LOAD_DATE) VALUES
	 * ('243811404441','611633','Y',CURRENT_TIMESTAMP); UPSERT INTO
	 * ENBA_T_MORNING_OFFER_WHITELIST (MSISDN,PRODUCT_ID,ACTIVE_FLAG,LOAD_DATE)
	 * VALUES ('243811404441','611632','Y',CURRENT_TIMESTAMP); UPSERT INTO
	 * ENBA_T_MORNING_OFFER_WHITELIST (MSISDN,PRODUCT_ID,ACTIVE_FLAG,LOAD_DATE)
	 * VALUES ('243811404441','611696','Y',CURRENT_TIMESTAMP); DELETE FROM
	 * ERED_T_RAG_EFFORT_REWARD_WL where msisdn='811404441'; DELETE FROM
	 * ERED_T_RAG_EFFORT_OPT_INFO where msisdn='811404441'; DELETE FROM
	 * ERED_T_SAG_EFFORT_REWARD_WL where msisdn='811404441'; DELETE FROM
	 * ERED_T_SAG_EFFORT_OPT_INFO where msisdn='811404441'; DELETE FROM
	 * ERED_T_PLAY_ALLOCATION_D0D1 WHERE MSISDN IN ('243811404441'); INSERT into
	 * ERED_T_PLAY_ALLOCATION_D0D1 values('243811404441',NOW,10); DELETE from
	 * ENBA_T_J4U_CONSENT_STATUS WHERE MSISDN='811404441'; UPSERT INTO
	 * ENBA_T_J4U_TOWNNAME_TOWNOFFERS_MAP (TOWN_NAME,PRODUCT_ID,LOAD_DATE) VALUES
	 * ('one','611820',CURRENT_TIMESTAMP); UPSERT INTO
	 * ENBA_T_J4U_CELLID_TOWNNAME_MAP
	 * (CELL_ID,TOWN_NAME,START_DATE,END_DATE,ENABLED,LOAD_DATE) VALUES
	 * ('53021','one','2023-11-16 14:25:22.796','2050-01-30
	 * 11:00:00.000',1,CURRENT_TIMESTAMP);
	 */
	
	// Refresh cache
	// http://10.200.178.76:8090/USSDPlugin/ussd/reloadproductinfocache

	public static void main(String[] args) throws InterruptedException, IOException {

	}

	@Test(priority = 1, groups = { "AllSubmenu" })
	public static void ZeroMorning() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U MORNING First offer with Airtime - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("0", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);
		System.out.println("J4U VOICE First offer with Airtime - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 2, groups = { "AllSubmenu" })
	public static void OneVoiceConsentDecline() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("Consent Decline - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("%23", "0012", randomVariable2);
		Requests("*", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		System.out.println("Consent Decline - ENDING");
		System.out.println("==================================================");
	}
	
	@Test(priority = 2, groups = { "AllSubmenu" })
	public static void OneVoiceAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U VOICE First offer with AIRTIME - 1 - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U VOICE First offer with AIRTIME - 1 - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 3, groups = { "AllSubmenu" })
	public static void TwoDataAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U DATA First offer with AIRTIME - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("2", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		System.out.println("J4U DATA First offer with AIRTIME - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 4, groups = { "AllSubmenu" })
	public static void ThreeIntegratedAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U INTEGRATED First offer with AIRTIME - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("3", "0012", randomVariable1);
		Requests("2", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);
		System.out.println("J4U INTEGRATED First offer with AIRTIME  - ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 5, groups = { "VoiceValid" })
	public static void HourlyAirtime() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U HOURLY First offer with AIRTIME  - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("4", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("J4U HOURLY First offer with AIRTIME  - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 6, groups = { "AllSubmenu" })
	public static void VoiceSecondMpesaCDF() throws InterruptedException, IOException {
		Thread.sleep(5000);

		int randomVariable3 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U TOWN First offer with AIRTIME - STARTING");
		Requests("*1402*2%23", "0001", randomVariable3);
		Requests("5", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		Requests("1", "0012", randomVariable3);
		System.out.println("J4U TOWN First offer with AIRTIME- ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 7, groups = { "AllSubmenu" })
	public static void SixSocial() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable1 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("J4U SOCIAL First offer with AIRTIME - STARTING");
		Requests("*1402*2%23", "0001", randomVariable1);
		Requests("%23", "0012", randomVariable1);
		Requests("6", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);
		Requests("1", "0012", randomVariable1);
		System.out.println("J4U SOCIAL First offer with AIRTIME- ENDING");
		System.out.println("==================================================");

	}

	@Test(priority = 8, groups = { "AllSubmenu" })
	public static void SevenRAG() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("MY Rewards RAG - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("%23", "0012", randomVariable2);
		Requests("7", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("MY Rewards RAG - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 9, groups = { "AllSubmenu" })
	public static void SevenPED() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("MY Rewards PED - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("%23", "0012", randomVariable2);
		Requests("7", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("MY Rewards PED - ENDING");
		System.out.println("==================================================");
	}

	@Test(priority = 10, groups = { "AllSubmenu" })
	public static void OptOutDecline() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("OptOut Decline - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("%23", "0012", randomVariable2);
		Requests("8", "0012", randomVariable2);
		Requests("2", "0012", randomVariable2);
		System.out.println("OptOut Decline- ENDING");
		System.out.println("==================================================");
	}

	
	@Test(priority = 11, groups = { "VoiceInvalid" })
	public static void OptOutAccept() throws InterruptedException, IOException {
		Thread.sleep(5000);
		int randomVariable2 = UniqueNumberGenerator();
		System.out.println("==================================================");
		System.out.println("OptOut Accept - STARTING");
		Requests("*1402*2%23", "0001", randomVariable2);
		Requests("%23", "0012", randomVariable2);
		Requests("8", "0012", randomVariable2);
		Requests("1", "0012", randomVariable2);
		System.out.println("OptOut Accept- ENDING");
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
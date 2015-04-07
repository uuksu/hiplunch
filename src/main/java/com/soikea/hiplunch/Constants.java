package com.soikea.hiplunch;

/**
 * Created by penni on 19/08/14.
 */
public class Constants {

	public static final String URL_SONAATTI = "http://www.sonaatti.fi/rssfeed/";

	public static final String PREFIX_WILHELMIINA = "Wilhelmiina";
	public static final String MESSAGE_URL_WILHELMIINA = "http://www.sonaatti.fi/wilhelmiina/";

    public static final String PREFIX_PIATO = "Piato";
	public static final String MESSAGE_URL_PIATO = "http://www.sonaatti.fi/piato/";
    public static final String GRILL_API = "https://www.kimonolabs.com/api/json/ondemand/e6rwhgda?apikey=88YhRC4s1GBK2FlBN32W9xOksgo01sHs";

    public static final String URL_SODEXO = "http://www.sodexo.fi/ruokalistat/output/daily_json/66/";
	public static final String PREFIX_SODEXO = "Sodexo";
	public static final String MESSAGE_URL_SODEXO = "http://www.sodexo.fi/mattilanniemi";

    public static final String ERROR_NOT_AVAILABLE = "Tietoja ei saatavilla.";

//	public static final String HIP_ROOM = "748322"; //Bottitesti
//	public static final String HIP_API_KEY = "kVrbFSVQXkjV4nY2rhMnpEM2SgO5NVV5YTxi5xPX"; //Bottitesti
	public static final String HIP_ROOM = "263211"; //Soikea
	public static final String HIP_API_KEY = "UBZKUrMSMlSv4PjCfJceixwOkR2sdByirfaRNtco"; //Soikea -room

	public static final String HIP_FROM = "LunchBot";
	public static final HipchatEnums.Format HIP_MESSAGE_FORMAT = HipchatEnums.Format.html;
	public static final boolean HIP_NOTIFY = false;
	public static final HipchatEnums.Color HIP_COLOR = HipchatEnums.Color.green;
	public static final String HIP_APIURL_PREFIX = "https://api.hipchat.com/v2/";
	public static final String HIP_APIURL_METHOD = "room/" + HIP_ROOM + "/notification";
	public static final String HIP_APIURL_PARAMS = "?auth_token=" + HIP_API_KEY;
	public static final String HIP_HEADER_MIME = "application/json";

	public static final String[] HIGHLIGHTS = {"pekoni", "olut", "kalja", "pizza"};
}

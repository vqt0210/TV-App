package com.amarullz.androidtv.animetvjmto;

public class Conf {
  public static String DOMAIN = "animekai.to";
  public static String[] SOURCE_DOMAINS={
      "animekai.to", /* default */
      "animekai.to",
      "anix.to",
      "hianime.to",
      "aniwatchtv.to",
      "animeflix.live", "kaa.mx", "api.gojo.live", "www.miruro.tv"
  };
  public static String SOURCE_DOMAIN5_API = "api.animeflix.dev";
  public static int SOURCE_DOMAIN = 1;

  public static void updateSource(int num){
    SOURCE_DOMAIN=num;
    if (num>0 && num<SOURCE_DOMAINS.length){
      SOURCE_DOMAINS[0]=DOMAIN=SOURCE_DOMAINS[num];
    }
  }
  public static String getDomain(){
    if (SOURCE_DOMAIN>0 && SOURCE_DOMAIN<SOURCE_DOMAINS.length){
      return SOURCE_DOMAINS[SOURCE_DOMAIN];
    }
    return DOMAIN;
  }

  public static int CACHE_SIZE_MB=100;


  // History
  // * vidplay.site
  public static String STREAM_DOMAIN = "krussdomi.com"; // "vid2a41.site";
  public static String STREAM_DOMAIN1 = "megaup.cc";
  public static String STREAM_DOMAIN2 = "megaf.cc";

  public static String SOURCE_DOMAIN_USED = "";


  public static String STREAM_DOMAIN3 = "megacloud.blog";
  // public static String STREAM_DOMAIN3 = "megacloud.club";
  // public static String STREAM_DOMAIN3 = "megacloud.tv";
  public static String STREAM_DOMAIN4 = "rapid-cloud.co";

  public static String SERVER_VER = "1.0-APK";

  /* Steam Selection */
  public static int STREAM_TYPE = 0;
  public static int STREAM_SERVER = 0;

  public static boolean PROGRESSIVE_CACHE = false;

  public static boolean USE_DOH = true;

  public static int HTTP_CLIENT = 0;

  // public static String MAL_CLIENT_ID="7b5a9155e3870fd91382445ef04b133c";
  public static String MAL_CLIENT_ID="0e9466e5ec09684cc69da53f20b07af6";

  public static String USER_AGENT =
  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0";

      // "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, " +
      //     "like Gecko) Chrome/131.0.0.0 Safari/537.36";
//      "Mozilla/5.0 (Windows NT 10.0; Win64; " +
//      "x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 " +
//          "Safari/537.36 Edg/121.0.0.0";

//      "Mozilla/5.0 (iPhone; CPU iPhone OS 17_3 like Mac OS X) AppleWebKit/605" +
//          ".1.15 (KHTML, like Gecko) Version/17.2 Mobile/15E148 Safari/604.1";

//      "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, " +
//          "like Gecko) Chrome/122.0.0.0 Safari/537.36 Edg/122.0.0.0";

//    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"+
//      " (KHTML, like Gecko) Chrome/119.0.0.0 " +
//      "Safari/537.36 Edg/116.0.1938.69";

//          "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36 Edg/125.0.0.0";

//  "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36 Edg/127.0.0.0";

//  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like " +
//      "Gecko) Chrome/122.0.0.0 Safari/537.36";
}

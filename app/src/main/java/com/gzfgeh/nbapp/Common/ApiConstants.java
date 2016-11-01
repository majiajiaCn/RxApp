package com.gzfgeh.nbapp.Common;

/**
 * Description:
 * Created by guzhenfu on 2016/10/31 17:36.
 */

public class ApiConstants {

    public static final String JU_HE_NEWS_HOST = "http://v.juhe.cn/toutiao/index";

    public static final String KUKA_HOST = "http://kaku.com/";

    public static final String GANK_IO_HOST = "http://gank.io";

    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.JU_HE_NEWS:
                host = JU_HE_NEWS_HOST;
                break;
            case HostType.GANK_GIRL_PHOTO:
                host = GANK_IO_HOST;
                break;
            case HostType.NEWS_DETAIL_HTML_PHOTO:
                host = KUKA_HOST;
                break;
            default:
                host = "";
                break;
        }
        return host;
    }
}
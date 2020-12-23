package cn.mikulink.rabbitbot.apirequest.lolicon;

import cn.mikulink.rabbitbot.apirequest.BaseRequest;
import cn.mikulink.rabbitbot.utils.HttpUtil;
import cn.mikulink.rabbitbot.utils.HttpsUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

/**
 * @author by MechellWater
 * @date : 2020-12-23 20:26
 */
@Getter
@Setter
public class LoliconRequest extends BaseRequest {

    //LoliconApi请求头
    private static final String URL = "https://api.lolicon.app/setu/";

    //Lolicon apiKey
    private String apiKey;
    //Lolicon 0为非 R18，1为 R18，2为混合
    private Integer r18;
    //若指定关键字，将会返回从插画标题、作者、标签中模糊搜索的结果
    private String keyword;
    //一次返回的结果数量，范围为1到10，不提供 APIKEY 时固定为1；在指定关键字的情况下，结果数量可能会不足指定的数量
    private Integer num;
    //设置返回的原图链接的域名，你也可以设置为disable来得到真正的原图链接
    private String proxy;
    //是否使用 master_1200 缩略图，即长或宽最大为 1200px 的缩略图，以节省流量或提升加载速度（某些原图的大小可以达到十几MB）
    private boolean size1200;

    //执行接口请求
    public void doRequest() throws IOException {
        //拼装参数
        addParam();

        body = new String(HttpsUtil.doGet(URL + HttpUtil.parseUrlEncode(param)));
    }

    //拼装参数
    private void addParam() {
        param.put("r18", r18);
        param.put("apiKey", apiKey);
    }

}

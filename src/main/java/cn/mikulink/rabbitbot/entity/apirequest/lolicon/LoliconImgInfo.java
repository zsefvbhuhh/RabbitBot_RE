package cn.mikulink.rabbitbot.entity.apirequest.lolicon;

import lombok.Getter;
import lombok.Setter;

/**
 * @author by MechellWater
 * @date : 2020-12-23 21:00
 */
@Getter
@Setter
public class LoliconImgInfo {
    private int	pid;//作品 PID
    private int p;   //作品所在 P
    private int uid;   //作者 UID
    private String title;   //作品标题
    private String author;   //作者名（入库时，并过滤掉 @ 及其后内容）
    private String url;   //图片链接（可能存在有些作品因修改或删除而导致 404 的情况）
    private boolean r18;   //是否 R18（在色图库中的分类，并非作者标识的 R18）
    private int width;   //原图宽度 px
    private int height;   //原图高度 px
    private String[] tags;   //作品标签，包含标签的中文翻译（有的话）
}

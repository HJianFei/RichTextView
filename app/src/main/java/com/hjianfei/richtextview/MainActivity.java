package com.hjianfei.richtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hjianfei.richtextview.utils.ImageTextUtil;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
//        String html = "<p dir=\"ltr\"><img src=\"http://p1.duyao001.com/image/article/a838e283f2b5d7cc45487c5fd79f84cb.gif\"></p><img src=\"http://statics.zhid58.com/Fqr9YXHd20fDOqil4nLAbBhNBw0A\"><br><br><img src=\"http://statics.zhid58.com/FufBg05KGCLypIvrYgjaXnTWySUS\"><br><br>OK咯木木木立刻哦lol额JOJO图谋女女look女女诺克各地测了测理论啃了了乐克乐克人咯咯JOJO图谋木木木木木木女女哦咯口头摸头LED可口女女LED咳咳JOJO咯JOJO咳咳咯科技JOJO扣女哦lol欧诺扣女<a href=\"http://www.taobao.com\">http://www.taobao.com</a> jvjvjvjv jgjvvjjvjce<br><br><img src=\"http://statics.zhid58.com/FkBcKMiLfzGfUpSb0bge4x-gIqWw\"><br></p><br>";
//        String html="镇海楼<p>《九日登镇海楼》<p>陈恭尹<p>清尊须醉曲栏前，飞阁临秋一浩然。五岭北来峰在地，九州南尽水浮天。<p>将开菊蕊黄如酒，欲倒松风响似泉。白首重阳惟有笑，未堪怀古问山川。<p>镇海楼坐落在越秀山小蟠龙冈上。因旧时能在楼顶上眺望珠江，所以又称为“望海楼”。又因楼高五层，所以还有个“俗家名字”叫“五层楼”。<p>明洪武十三年（1380年），永嘉侯朱亮祖扩建广州城时，把北城墙扩展到越秀山上，同时在山上修筑了一座五层的高楼作为城防之用。史料记载，镇海是广州现存最早的城防建筑。当然除了城防，镇海楼巍巍屹立在越秀山顶，“壮三城之观瞻”。另有一说是朱元璋听道人铁冠子所言，岭南一带隐隐笼罩着一股帝王之气。于是朱元璋派大臣到广州的越秀山上修建五层楼以镇压“王气”。<p><p>清嘉庆《羊城古钞》绘画的镇海楼。其建筑式样与现状相距甚远，而可能与明代所建之镇海楼相近。<p><p>镇海楼旧照。摄于1860年4月的镇海楼。1857年英法联军攻陷广州城，并占据广州的制高点镇海楼，图中联军士兵正在镇海楼侧站岗放哨。<p><p>镇海楼旧照。英法联军已撤走多时，古楼得以简单的修缮，楼前的参木已长至三楼高了，游人又可登临一览山河。<p><p>门前石狮现在依旧守候在镇海楼前。<p><p>镇海楼旧照。可见镇海楼外的明代城墙和哨岗亭。<p>镇海楼自十四世纪后期至今六百多年间曾五毁五建，一直见证着广州的历史。<p>表：镇海楼筑建和修缮记录<p>镇海楼从其出现在越秀山上至今漫长的六个世纪里，一直是广州的城市标记。在清代广州繁盛的对外贸易中，外国人在珠江面上遥见镇海楼便知到了广州。在纵多外销画、外国人拍摄的旧照片、明信片、手绘地图中，都能见到镇海楼的身影。镇海楼一直是广州一个不可或缺的人文符号。<p><p>镇海楼，粤语中有童谣：“肥仔个头大过五层楼，肥仔只手佢细过荷兰豆”。<p><p>镇海楼牌匾<p><p>明代石狮子<p><p><p><p>镇海楼外明城墙，是广州仅存的一段古城墙。<p>这段古城墙分西、中、东三部分：从大北门到镇海楼为西段，环镇海楼所在的小盘龙岗山头为中段，从广州美术馆到小北门为东段，共<p>1000余米。<p>";
        String html="镇海楼<p>《九日登镇海楼》<p>陈恭尹<p>清尊须醉曲栏前，飞阁临秋一浩然。五岭北来峰在地，九州南尽水浮天。<p>将开菊蕊黄如酒，欲倒松风响似泉。白首重阳惟有笑，未堪怀古问山川。<p>镇海楼坐落在越秀山小蟠龙冈上。因旧时能在楼顶上眺望珠江，所以又称为“望海楼”。又因楼高五层，所以还有个“俗家名字”叫“五层楼”。<p>明洪武十三年（1380年），永嘉侯朱亮祖扩建广州城时，把北城墙扩展到越秀山上，同时在山上修筑了一座五层的高楼作为城防之用。史料记载，镇海是广州现存最早的城防建筑。当然除了城防，镇海楼巍巍屹立在越秀山顶，“壮三城之观瞻”。另有一说是朱元璋听道人铁冠子所言，岭南一带隐隐笼罩着一股帝王之气。于是朱元璋派大臣到广州的越秀山上修建五层楼以镇压“王气”。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600371z99l.jpg\"><p>清嘉庆《羊城古钞》绘画的镇海楼。其建筑式样与现状相距甚远，而可能与明代所建之镇海楼相近。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600371fb2c.jpg\"><p>镇海楼旧照。摄于1860年4月的镇海楼。1857年英法联军攻陷广州城，并占据广州的制高点镇海楼，图中联军士兵正在镇海楼侧站岗放哨。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600370SjjT.jpg\"><p>镇海楼旧照。英法联军已撤走多时，古楼得以简单的修缮，楼前的参木已长至三楼高了，游人又可登临一览山河。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_13716003717fdC.jpg\"><p>门前石狮现在依旧守候在镇海楼前。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600370plf9.jpg\"><p>镇海楼旧照。可见镇海楼外的明代城墙和哨岗亭。<p>镇海楼自十四世纪后期至今六百多年间曾五毁五建，一直见证着广州的历史。<p>表：镇海楼筑建和修缮记录<p>镇海楼从其出现在越秀山上至今漫长的六个世纪里，一直是广州的城市标记。在清代广州繁盛的对外贸易中，外国人在珠江面上遥见镇海楼便知到了广州。在纵多外销画、外国人拍摄的旧照片、明信片、手绘地图中，都能见到镇海楼的身影。镇海楼一直是广州一个不可或缺的人文符号。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_13716003734XpW.jpg\"><p>镇海楼，粤语中有童谣：“肥仔个头大过五层楼，肥仔只手佢细过荷兰豆”。<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600369551W.jpg\"><p>镇海楼牌匾<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600371Dko6.jpg\"><p>明代石狮子<p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_1371600368626G.jpg\"><p><img src=\"http://www.gdmuseum.com/attachment/201306/19/2_13716003686ajS.jpg\"><p>镇海楼外明城墙，是广州仅存的一段古城墙。<p>这段古城墙分西、中、东三部分：从大北门到镇海楼为西段，环镇海楼所在的小盘龙岗山头为中段，从广州美术馆到小北门为东段，共<p>1000余米。<p>";
        ImageTextUtil.setImageText(tv, html);
    }
}

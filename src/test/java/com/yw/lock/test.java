package com.yw.lock;

/**
 * @Auther: YW
 * @Date: 2019/3/29 11:14
 * @Description:
 */
public class test {
    public static void main(String agrs[]){
        String s="<?xml version=\"1.0\" encoding=\"utf-8\"?>"+
                "<MSG>"+
                "  <META>"+
                "    <SNDR>MU</SNDR>"+
                "    <SEQN>1111465734125654016</SEQN>"+
                "    <DTTM>2019-03-29 11:10:55</DTTM>"+
                "    <TYPE>FLOP</TYPE>"+
                "    <STYP>SFGS</STYP>"+
                "</META>"+
                "<SFGS>"+
                "<FLID>138085405</FLID>"+
                "<FFID>MU5814-A-20190329-D-W/Z</FFID>"+
                "<SODT>2019-03-29</SODT>"+
                "<ALCD>MU</ALCD>"+
                "<FLNO>5814</FLNO>"+
                "<DPAPCD>SHA</DPAPCD>"+
                "<ARAPCD>KMG</ARAPCD>"+
                "<PointEnCode>AddFuelBeginTime</PointEnCode>"+
                "<PointName>加油开始</PointName>"+
                "<PointFinishTime>2019-03-29 06:32:00</PointFinishTime>"+
                "</SFGS>"+
                "</MSG>";
        s.trim();
        System.out.print(s);

    }
}

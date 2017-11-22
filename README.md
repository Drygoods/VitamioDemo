---
Android --- 节目直播案例开发
---

#### 前言

#### 直播原理以及协议

直播本质：**实时**推送/拉取过来的音视频数据

直播相关协议：

* RTMP ( Real Time Messaging Protocal ) 实时消息传输协议

  RTMP 协议是一个互联网 TCP/IP 五层体系结构中应用层协议

  RTMP 协议可以用来推送又可以用来直播

  RTMP 协议中基本的数据单元称为消息 ( Message )

  测试地址：香港卫视 rtmp://live.hkstv.hk.lxdns.com/live/hks

* FLV ( Flash Video )

  FLV 协议是在大块的视频帧和音视频头部加入一些**标记头信息**

  FLV 协议在延迟表现和大规模并发方面很成熟

  FLV 协议非常适合于手机端 APP 直播协议

  测试地址：CCTV4 http://flv106.v1.cn/cloud/20130604/605305.flv

* HLS ( HTTP Live Streaming )

  苹果推出的解决方案，将视频分成 5-10 秒的视频小分片，然后用 m3u8 索引表进行管理，HLS在iPhone和大部分Android手机浏览器上的支持非常好，常用于像QQ和微信朋友圈的URL分享。

  测试地址：湖南卫视 http://117.144.248.49/HDhnws.m3u8?authCode=07110409322147352675&amp;stbId=006001FF0018120000060019F0D49A1&Contentid=6837496099179515295&mos=jbjhhzstsl&livemode=1&channel-id=wasusyt

  **m3u8 概念**：以UTF-8编码格式的m3u文件，m3u文件记录了一个索引的纯文本文件，打开它时，播放软件并不是播放它，而是根据它里面的索引找到对应的音视频网络地址进行播放。

  **m3u8优点是什么？**

  主要是可以做多码率的适配，根据网络带宽，客户端会选择一个适合自己码率的文件进行播放，保证视频流的流畅。

  #### 直播源测试

  直播源论坛：[http://www.hdpfans.com/](http://www.hdpfans.com/)

  直播源测试：VLC

  #### Vitamio 框架简介

  Android 平台音视频播放组件，支持播放主流格式的音视频、网络视频流 ( http/rtsp/mms )

  

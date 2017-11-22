package top.omooo.vitamiodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener {

    private VideoView mVideoView;
    private MediaController mController;
    private String url = "http://117.144.248.49/HDhnws.m3u8?authCode=07110409322147352675&amp;stbId=006001FF0018120000060019F0D49A1&amp;Contentid=6837496099179515295&amp;mos=jbjhhzstsl&amp;livemode=1&amp;channel-id=wasusyt";
    private String url2 = "http://www.wooyun.site/1987.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Vitamio.isInitialized(getApplicationContext());
        setContentView(R.layout.activity_main);

        initView();
//        mVideoView.setVideoURI(Uri.parse(url2));
        mVideoView.setVideoPath(url);
    }

    private void initView() {
        mVideoView = findViewById(R.id.surface_view);
        mController = new MediaController(this);
        mVideoView.setMediaController(mController);
        mVideoView.setVideoQuality(MediaPlayer.VIDEOQUALITY_HIGH);
        mVideoView.setVideoLayout(VideoView.VIDEO_LAYOUT_STRETCH, 0); //取得焦点 mVideoView.requestFocus(); //设置相关的监听
        mVideoView.setOnPreparedListener(this);
        mVideoView.setOnErrorListener(this);
        mVideoView.setOnCompletionListener(this);
    }
    //播放结束
    @Override
    public void onCompletion(MediaPlayer mp) {

    }
    //播放错误
    @Override
    public boolean onError(MediaPlayer mp, int what, int extra) {
        return false;
    }
    //播放准备
    @Override
    public void onPrepared(MediaPlayer mp) {
        mVideoView.start();
    }
}

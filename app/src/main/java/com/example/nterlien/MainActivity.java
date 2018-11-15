package com.example.nterlien;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import cat.ereza.customactivityoncrash.config.CaocConfig;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.EntypoModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.IoniconsModule;
import com.joanzapata.iconify.fonts.MaterialCommunityModule;
import com.joanzapata.iconify.fonts.MaterialModule;
import com.joanzapata.iconify.fonts.MeteoconsModule;
import com.joanzapata.iconify.fonts.SimpleLineIconsModule;
import com.joanzapata.iconify.fonts.TypiconsModule;
import com.joanzapata.iconify.fonts.WeathericonsModule;
import com.ramotion.foldingcell.FoldingCell;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    private FoldingCell fc;
    private FoldingCell foldingCellskills;
    private FoldingCell foldingCellssoftware;
    private SliderLayout mDemoSlider;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));



        mDemoSlider = (SliderLayout)findViewById(R.id.ap);

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("house", "https://static1.squarespace.com/static/58586fa5ebbd1a60e7d76d3e/t/5915a411a5790a84969a6a15/1494590491887/");
        url_maps.put("sci-fi ", "https://code.blender.org/wp-content/uploads/2017/03/sci-fi-1024x580.jpg");
        url_maps.put("sci-fi armor", "https://dbystedt.files.wordpress.com/2015/03/scifiarmor_main.jpg");
        url_maps.put("classroom", "https://s3.amazonaws.com/blendergrid-media/news/7-mistakes-trying-to-render-faster/classroom-original.jpg");




        for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);

            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.CenterInside)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(16000);
        mDemoSlider.addOnPageChangeListener(this);


        Iconify
                .with(new FontAwesomeModule())
                .with(new EntypoModule())
                .with(new TypiconsModule())
                .with(new MaterialModule())
                .with(new MaterialCommunityModule())
                .with(new MeteoconsModule())
                .with(new WeathericonsModule())
                .with(new SimpleLineIconsModule())
                .with(new IoniconsModule());


        fc = findViewById(R.id.folding_cell);
        foldingCellskills = findViewById(R.id.folding_cell_skills);
        foldingCellssoftware = findViewById(R.id.folding_cell_renderings);



        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });

        foldingCellskills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foldingCellskills.toggle(false);
            }
        });

        foldingCellssoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foldingCellssoftware.toggle(false);
            }
        });

    }


    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

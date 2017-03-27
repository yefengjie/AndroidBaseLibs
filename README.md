# Android Common Libs

### How To Use
```Java
    compile 'com.yefeng:c_libs:0.0.1'
    add a buildsystem folder under your project
    add a config.gradle file to handle lib version just like the demo
    
    in project build.gradle, add this line 
    apply from: 'buildsystem/config.gradle'
```

### Libs
```Java
    ext {
        //app
        androidApplicationId = "com.yefeng.appcreator"
        androidVersionCode = 100
        androidVersionName = "1.0.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    
        //Android
        androidBuildToolsVersion = "25.0.2"
        androidMinSdkVersion = 15
        androidTargetSdkVersion = 25
        androidCompileSdkVersion = 25
    
        //Libraries
        // android
        androidSupportVersion = '25.1.0'
        daggerVersion = '2.9'
        // google
        gsonVersion = '2.6.2'
        guavaVersion = '21.0'
        // square
        retrofitVersion = '2.1.0'
        okhttpVersion = '3.4.1'
        okioVersion = '1.10.0'
        retrofit2Rxjava2AdapterVersion = '1.0.0'
        httplogVersion = '3.5.0'
        // rx java
        rxandroidVersion = '2.0.1'
        rxjavaVersion = '2.0.5'
        // green robot
        greendaoVersion = '3.2.0'
        // android annotations
        aaVersion = '4.2.0'
        // master
        timberVersion = '4.5.0'
        glideVersion = '3.7.0'
        hiRecyclerViewVersion = '1.2.0'
    
        //Test
        junitVersion = '4.12'
        espressoVersion = '2.2.2'
    
        dependencies = [
                // android
                appcompat_v7             : "com.android.support:appcompat-v7:$androidSupportVersion",
                design                   : "com.android.support:design:$androidSupportVersion",
                recyclerview             : "com.android.support:recyclerview-v7:$androidSupportVersion",
                card_view                : "com.android.support:cardview-v7:$androidSupportVersion",
    
                // google
                guava                    : "com.google.guava:guava:$guavaVersion",
                gson                     : "com.google.code.gson:gson:$gsonVersion",
                dagger                   : "com.google.dagger:dagger:$daggerVersion",
                dagger_compiler          : "com.google.dagger:dagger-compiler:$daggerVersion",
    
                // square
                okhttp                   : "com.squareup.okhttp3:okhttp:$okhttpVersion",
                okio                     : "com.squareup.okio:okio:$okioVersion",
                retrofit                 : "com.squareup.retrofit2:retrofit:$retrofitVersion",
                retrofit2_rxjava2_adapter: "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:$retrofit2Rxjava2AdapterVersion",
                converter_gson           : "com.squareup.retrofit2:converter-gson:$retrofitVersion",
                http_log                 : "com.squareup.okhttp3:logging-interceptor:$httplogVersion",
    
                // rx java
                rxandroid                : "io.reactivex.rxjava2:rxandroid:$rxandroidVersion",
                rxjava                   : "io.reactivex.rxjava2:rxjava:$rxjavaVersion",
    
                // green robot
                greendao                 : "org.greenrobot:greendao:$greendaoVersion",
    
                // android annotations
                aa                       : "org.androidannotations:androidannotations:$aaVersion",
                aa_api                   : "org.androidannotations:androidannotations-api:$aaVersion",
    
                // master
                glide                    : "com.github.bumptech.glide:glide:$glideVersion",
                timber                   : "com.jakewharton.timber:timber:$timberVersion",
                hi_recycler_view         : "com.yefeng:HiRecyclerView:$hiRecyclerViewVersion",
    
        ]
    
        testDependencies = [
                junit   : "junit:junit:$junitVersion",
                espresso: "com.android.support.test.espresso:espresso-core:$espressoVersion",
        ]
    
    }

```


### Common Res
```Java
    <resources>
        <!-- default item size -->
        <dimen name="default_img_size">96dp</dimen>
        <dimen name="default_ui_size">48dp</dimen>
        <dimen name="default_ui_size_half">24dp</dimen>
    
        <dimen name="default_ui_margin_very_small">2dp</dimen>
        <dimen name="default_ui_margin_small">4dp</dimen>
        <dimen name="default_ui_margin">8dp</dimen>
        <dimen name="default_ui_margin_large">16dp</dimen>
        <dimen name="default_ui_margin_huge">32dp</dimen>
    
        <dimen name="default_button_height">36dp</dimen>
        <dimen name="default_button_margin_vertical">6dp</dimen>
        <dimen name="default_button_margin_horizontal">8dp</dimen>
        <dimen name="default_button_padding_horizontal">8dp</dimen>
        <dimen name="default_button_height_min_width">64dp</dimen>
        <dimen name="default_button_margin_content">24dp</dimen>
    
        <dimen name="default_icon_small_size">24dp</dimen>
        <dimen name="default_icon_small_margin">12dp</dimen>
        <dimen name="default_icon_size">40dp</dimen>
        <dimen name="default_icon_margin">4dp</dimen>
    
        <dimen name="default_text_input_margin_vertical">16dp</dimen>
        <dimen name="default_text_input_divider_padding">8dp</dimen>
    
        <!--Font and color:-->
    
        <!--Text: Roboto Regular 16sp,  #000 87%-->
        <!--Title (optional): Roboto Regular 16sp, #000 54%-->
        <!--Default bottom sheet background fill: #FFF-->
        <!--Overlay shield fill: #000 20%-->
        <dimen name="default_specs_horizontal_margin">16dp</dimen>
        <dimen name="default_specs_icon_text_margin">32dp</dimen>
        <dimen name="default_specs_icon_size">24dp</dimen>
    </resources>

    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <dimen name="text_size_button">14sp</dimen>
        <dimen name="text_size_caption">12sp</dimen>
        <dimen name="text_size_body">14sp</dimen>
        <dimen name="text_size_subhead">16sp</dimen>
        <dimen name="text_size_title">20sp</dimen>
        <dimen name="text_size_headline">24sp</dimen>
        <dimen name="text_size_display34">34sp</dimen>
        <dimen name="text_size_display45">45sp</dimen>
        <dimen name="text_size_display56">56sp</dimen>
        <dimen name="text_size_display112">112sp</dimen>
    
    
        <dimen name="text_size_micro">12sp</dimen>
        <dimen name="text_size_small">14sp</dimen>
        <dimen name="text_size_medium">16sp</dimen>
        <dimen name="text_size_large">20sp</dimen>
        <dimen name="text_size_huge">34sp</dimen>
    
        <dimen name="text_size_input">16sp</dimen>
    </resources>

    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <!--Overlay shield fill: #000 20%-->
        <color name="color_default_overlay">#33FFFFFF</color>
        <!-- 12% of #000000: dividers text -->
        <color name="divider">#1F000000</color>
        <!-- 12% of #FFFFFF: text -->
        <color name="divider_dark">#17FFFFFF</color>
    
        <color name="transparent">#00000000</color>
        <color name="white">#FFFFFFFF</color>
        <color name="white_background">#FFEEEEEE</color>
        <color name="black">#FF000000</color>
        <color name="red">#FFFF0000</color>
        <color name="green">#00FF00</color>
        <color name="blue">#0000FF</color>
        <color name="cyan">#00FFFF</color>
        <color name="peony">#FF00FF</color>
        <color name="yellow">#FFFF00</color>
        
    </resources>
    
        <color name="m_accent_red">#FF5252</color>
        <color name="m_accent_pink">#FF4081</color>
        <color name="m_accent_purple">#E040FB</color>
        <color name="m_accent_deep_purple">#7C4DFF</color>
        <color name="m_accent_indigo">#536DFE</color>
        <color name="m_accent_blue">#448AFF</color>
        <color name="m_accent_light_blue">#03A9F4</color>
        <color name="m_accent_cyan">#00BCD4</color>
        <color name="m_accent_teal">#009688</color>
        <color name="m_accent_green">#4CAF50</color>
        <color name="m_accent_light_green">#8BC34A</color>
        <color name="m_accent_lime">#CDDC39</color>
        <color name="m_accent_yellow">#FFEB3B</color>
        <color name="m_accent_amber">#FFC107</color>
        <color name="m_accent_orange">#FF9800</color>
        <color name="m_accent_deep_orange">#FF5722</color>
        <color name="m_accent_brown">#795548</color>
        <color name="m_accent_grey">#9E9E9E</color>
        <color name="m_accent_blue_grey">#607D8B</color>
        
        
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <!-- text colors -->
        <!-- 87% of #000000: text -->
        <color name="text_primary">#DF000000</color>
        <!-- 54% of #000000: secondary text / icons -->
        <color name="text_secondary">#8A000000</color>
        <!-- 26% of #000000: hint text -->
        <color name="text_hint">#43000000</color>
    
    
        <!-- 100% of #FFFFFF: text -->
        <color name="text_primary_dark">#FFFFFFFF</color>
        <!-- 70% of #FFFFFF: text -->
        <color name="text_secondary_dark">#B3FFFFFF</color>
        <!-- 30% of #FFFFFF: text -->
        <color name="text_hint_dark">#4CFFFFFF</color>
    
    
        <color name="text_white">#FFFFFF</color>
    
    </resources>
    
    <?xml version="1.0" encoding="utf-8"?>
    <resources>
        <color name="yf_white">#FFFFFF</color>
        <color name="yf_black">#000000</color>
        <color name="yf_primary_text">#212121</color>
        <color name="yf_secondary_text">#727272</color>
        <color name="yf_divider">#B6B6B6</color>
        <color name="yf_hint_text">#43000000</color>
        <color name="yf_white_background">#FFEEEEEE</color>
        <color name="yf_transparent_half">#77FFFFFF</color>
        <color name="yf_transparent">#00000000</color>
        <color name="yf_transparent_half_black">#88000000</color>
    
        <!-- red -->
        <color name="yf_red_primary_dark">#D32F2F</color>
        <color name="yf_red_primary">#F44336</color>
        <color name="yf_red_primary_light">#FFCDD2</color>
        <color name="yf_red_accent">#FF5252</color>
    
        <!-- pink -->
        <color name="yf_pink_primary_dark">#C2185B</color>
        <color name="yf_pink_primary">#E91E63</color>
        <color name="yf_pink_primary_light">#F8BBD0</color>
        <color name="yf_pink_accent">#FF4081</color>
    
        <!-- purple -->
        <color name="yf_purple_primary_dark">#7B1FA2</color>
        <color name="yf_purple_primary">#9C27B0</color>
        <color name="yf_purple_primary_light">#E1BEE7</color>
        <color name="yf_purple_accent">#E040FB</color>
    
        <!-- deep purple -->
        <color name="yf_deep_purple_primary_dark">#512DA8</color>
        <color name="yf_deep_purple_primary">#673AB7</color>
        <color name="yf_deep_purple_primary_light">#D1C4E9</color>
        <color name="yf_deep_purple_accent">#7C4DFF</color>
    
        <!-- indigo -->
        <color name="yf_indigo_primary_dark">#303F9F</color>
        <color name="yf_indigo_primary">#3F51B5</color>
        <color name="yf_indigo_primary_light">#C5CAE9</color>
        <color name="yf_indigo_accent">#536DFE</color>
    
        <!-- blue -->
        <color name="yf_blue_primary_dark">#1976D2</color>
        <color name="yf_blue_primary">#2196F3</color>
        <color name="yf_blue_primary_light">#BBDEFB</color>
        <color name="yf_blue_accent">#448AFF</color>
    
        <!-- light blue -->
        <color name="yf_light_blue_primary_dark">#0288D1</color>
        <color name="yf_light_blue_primary">#03A9F4</color>
        <color name="yf_light_blue_primary_light">#B3E5FC</color>
        <color name="yf_light_blue_accent">#03A9F4</color>
    
        <!-- cyan -->
        <color name="yf_cyan_primary_dark">#0097A7</color>
        <color name="yf_cyan_primary">#00BCD4</color>
        <color name="yf_cyan_primary_light">#B2EBF2</color>
        <color name="yf_cyan_accent">#00BCD4</color>
    
        <!-- teal -->
        <color name="yf_teal_primary_dark">#00796B</color>
        <color name="yf_teal_primary">#009688</color>
        <color name="yf_teal_primary_light">#B2DFDB</color>
        <color name="yf_teal_accent">#009688</color>
    
        <!-- green -->
        <color name="yf_green_primary_dark">#388E3C</color>
        <color name="yf_green_primary">#4CAF50</color>
        <color name="yf_green_primary_light">#C8E6C9</color>
        <color name="yf_green_accent">#4CAF50</color>
    
        <!-- light green -->
        <color name="yf_light_green_primary_dark">#689F38</color>
        <color name="yf_light_green_primary">#8BC34A</color>
        <color name="yf_light_green_primary_light">#DCEDC8</color>
        <color name="yf_light_green_accent">#8BC34A</color>
    
        <!-- lime -->
        <color name="yf_lime_primary_dark">#AFB42B</color>
        <color name="yf_lime_primary">#CDDC39</color>
        <color name="yf_lime_primary_light">#F0F4C3</color>
        <color name="yf_lime_accent">#CDDC39</color>
    
        <!-- yellow -->
        <color name="yf_yellow_primary_dark">#FBC02D</color>
        <color name="yf_yellow_primary">#FFEB3B</color>
        <color name="yf_yellow_primary_light">#FFF9C4</color>
        <color name="yf_yellow_accent">#FFEB3B</color>
    
        <!-- amber -->
        <color name="yf_amber_primary_dark">#FFA000</color>
        <color name="yf_amber_primary">#FFC107</color>
        <color name="yf_amber_primary_light">#FFECB3</color>
        <color name="yf_amber_accent">#FFC107</color>
    
        <!-- orange -->
        <color name="yf_orange_primary_dark">#F57C00</color>
        <color name="yf_orange_primary">#FF9800</color>
        <color name="yf_orange_primary_light">#FFE0B2</color>
        <color name="yf_orange_accent">#FF9800</color>
    
        <!-- deep orange -->
        <color name="yf_deep_orange_primary_dark">#E64A19</color>
        <color name="yf_deep_orange_primary">#FF5722</color>
        <color name="yf_deep_orange_primary_light">#FFCCBC</color>
        <color name="yf_deep_orange_accent">#FF5722</color>
    
        <!-- brown -->
        <color name="yf_brown_primary_dark">#5D4037</color>
        <color name="yf_brown_primary">#795548</color>
        <color name="yf_brown_primary_light">#D7CCC8</color>
        <color name="yf_brown_accent">#795548</color>
    
        <!-- grey -->
        <color name="yf_grey_primary_dark">#616161</color>
        <color name="yf_grey_primary">#9E9E9E</color>
        <color name="yf_grey_primary_light">#F5F5F5</color>
        <color name="yf_grey_accent">#9E9E9E</color>
    
        <!-- blue grey -->
        <color name="yf_blue_grey_primary_dark">#455A64</color>
        <color name="yf_blue_grey_primary">#607D8B</color>
        <color name="yf_blue_grey_primary_light">#CFD8DC</color>
        <color name="yf_blue_grey_accent">#607D8B</color>
    </resources>
```
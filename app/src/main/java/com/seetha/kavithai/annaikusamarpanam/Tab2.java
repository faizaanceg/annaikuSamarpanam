package com.seetha.kavithai.annaikusamarpanam;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Tab2 extends Fragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tab2, null);

        ListView recList = (ListView) rootView.findViewById(R.id.listView);
        Tab2Adapter ca = new Tab2Adapter(getActivity().getApplicationContext(), populateKavithai());
        recList.setAdapter(ca);

        return rootView;
    }

    private List<Tab2Kavithai> populateKavithai() {

        List<Tab2Kavithai> kavithaiList = new ArrayList<>();

        /* first Tab2Kavithai */

        Tab2Kavithai temp = new Tab2Kavithai();

        temp.title = "ஆயுதம்";

        temp.content =
                "காகிதத்தாளே \n" +
                        "என்னைக் கொன்றுவிட்டாள்\n" +
                        "காதலியின் திருமணப்பத்திரிக்கை.\n";

        kavithaiList.add(temp);


        /* second Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நிலவு";

        temp.content =
                "உடையின்மையால் தான்\n" +
                        "அழகாகத் தெரிகிறதோ \n" +
                        "நிலவு.\n";

        kavithaiList.add(temp);

        /* third Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "விதவை";

        temp.content =
                "கணவனை இழந்துவிட்டாளோ\n" +
                        "வெள்ளைப்புடவையில் தேய்கிறாள்\n" +
                        "நிலவு.\n";

        kavithaiList.add(temp);

        /* fourth Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "காதலித்துப்பார்";

        temp.content =
                "அரிச்சந்திரனும்\n" +
                        "பொய் சொல்லியிருப்பார்\n" +
                        "காதலித்திருந்தால்...\n";

        kavithaiList.add(temp);


        /* fifth Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "தல";

        temp.content =
                "பட்டமே வாங்காதவனுக்கு\n" +
                        "அனைத்து பட்டதாரிகளும்-ரசிகர்கள் \n" +
                        "சச்சின்...\n";
        kavithaiList.add(temp);


        /* sixth Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "கல்லறை ";

        temp.content =
                "ஓர் அங்குலத்தில்\n" +
                        "என்னை புதைத்துவிட்டாள்\n" +
                        "அவள் கண்களுக்குள்...\n";

        kavithaiList.add(temp);


        /*  seventh Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "புகைப்படம்";

        temp.content =
                "இறந்தபின்னரும் \n" +
                        "என்னவள் சிரிக்கிறாள் \n" +
                        "புகைப்படத்தில்...\n";

        kavithaiList.add(temp);


        /*  eighth Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "புகையிலை";

        temp.content =
                "எனக்கு \n" +
                        "நானே கொள்ளிவைக்கிறேன்\n" +
                        "புகைப்பிடிப்பதால்....\n";
        kavithaiList.add(temp);


        /* ninth Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "கர்ப்பப்பை ";

        temp.content =
                "என் இதயப்பையும்\n" +
                        "கர்ப்பப்பையானது-அவளை \n" +
                        "அன்பாய் சுமப்பதினால்...\n";

        kavithaiList.add(temp);


        /* tenth Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "பூமித்தாயும் வருணனும்";

        temp.content =
                "அவளின் வெட்டுக்காயத்துக்கு மருந்தானது \n" +
                        "சகோதரனின் கண்ணீர்துளிகள் \n" +
                        "மழை ....\n";
        kavithaiList.add(temp);


        /* eleventh Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மனமே நிறம்";

        temp.content =
                "கறுப்பு மனுசனுக்கு\n" +
                        "வெள்ளை மனசு\n" +
                        "மண்டேலா....\n";
        kavithaiList.add(temp);


        /* 12th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நேசம்";

        temp.content =
                "அவள் கணவனை \n" +
                        "என்னைப்போல் நேசிக்கிறாள்\n" +
                        "என் அம்மா...\n";
        kavithaiList.add(temp);


        /* 13th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "காதல்கவிதை";

        temp.content =
                "காதலைப்பற்றி \n" +
                        "கவிதைகள் பல \n" +
                        "எழுதலாம்...\n" +
                        "ஆனால்,ஒரு கவியே\n" +
                        "காதலை பற்றி எழுதுகிறதே...!\n";

        kavithaiList.add(temp);


        /* 14th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "கோழைப்பெண்";

        temp.content =
                "தற்கொலை என்றபெயரில்\n" +
                        "கொலை செய்துவிட்டாள்\n" +
                        "என்னை...\n";

        kavithaiList.add(temp);


        /* 15th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நானும் பூக்களும்";

        temp.content =
                "உன்னைப்பார்க்கும் முன்\n" +
                        "வாடிப்போயிருந்த பூக்கள்\n" +
                        "உன்னைப் பார்த்ததும்\n" +
                        "நீ சூடிக்கொள்ள\n" +
                        "புத்துயிர் பெற்றனவோ?\n" +
                        "என்னைப்போல்....\n";

        kavithaiList.add(temp);


        /* 16th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "அழகு";

        temp.content =
                "பூமிக்கு ஒரு நிலவுதான்\n" +
                        "என்று யார் சொன்னது\n" +
                        "உன்னை ஒருமுறைப்பார்த்தால்\n" +
                        "அவ்வாறு சொல்லியிருக்க முடியாது...\n";

        kavithaiList.add(temp);


        /* 17th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "வானவில்";

        temp.content =
                "வானவில் என்மீது போர்வையாக\n" +
                        "போர்த்தப்பட்டதாக உணர்ந்தேன்,\n" +
                        "உனது துப்பட்டா என்மீது \n" +
                        "விழுந்தபோது....\n";
        kavithaiList.add(temp);


        /* 18th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "தினமும் பிறக்கிறாள்";

        temp.content =
                "உனது தாயின் கருவறையிலிருந்து\n" +
                        "ஒருமுறை மட்டும்\n" +
                        "அழுதுகொண்டே பிறந்தாய்...\n" +
                        "\n" +
                        "ஆனால்,\n" +
                        "தினமும் சிரித்துக்கொண்டே\n" +
                        "பிறக்கிறாய்;என்மனதில்\n" +
                        "உன்நினைவுகள் வரும்போது...\n";

        kavithaiList.add(temp);


        /* 19th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "சாதியம்";

        temp.content =
                "கூகுள் தேடலும் \n" +
                        "மனிதனிடம் தோற்றுப்போகும்\n" +
                        "விரைவாக   சாதியைக்கண்டுபிடிப்பதில்...\n";
        kavithaiList.add(temp);


        /* 20th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நீர்";

        temp.content =
                "உதிரத்தின் நிறம் சிவப்பு \n" +
                        "மனிதர்களுக்கு...\n" +
                        "ஆனால்\n" +
                        "ஒருத்திக்கு மட்டும் நிறமற்றது\n" +
                        "பூமித்தாய்க்கு...\n";

        kavithaiList.add(temp);


        /* 21st Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "புத்தகச்சுமை";

        temp.content =
                "பள்ளிக்குச்செல்ல உணவு\n" +
                        "கொடுத்த காலம் மாறி,\n" +
                        "பளுதூக்கி கொடுக்கும்\n" +
                        "காலம் எப்போது வருமோ?\n" +
                        "பள்ளிச்சிறுமியின் ஏக்கம்...\n";
        kavithaiList.add(temp);


        /* 22nd Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "அடிமைத்தனம்,கறுப்புப்பணம்";

        temp.content =
                "வெள்ளையர்கள் கருப்பர்களை ஒதுக்கினான் ;\n" +
                        "கொள்ளையர்கள் கறுப்புபணத்தை பதுக்குகிறான்\n" +
                        "அயல்நாட்டு வங்கியில்...\n";

        kavithaiList.add(temp);


        /* 23rd Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "ஆவதும் அழிவதும் பெண்ணாலே";

        temp.content =
                "அன்னை \n+" +
                        "கருவறையில்" +
                        "தங்கவைத்தால்...." +
                        "பெண்ணே நீ" +
                        "கல்லறையில்" +
                        "உறங்க செய்தாய்...\n" +
                        "இதுதான்\n" +
                        "ஆவதும் அழிவதும் பெண்ணாலா...\n";

        kavithaiList.add(temp);


        /*  24th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மறைவதில்லை";

        temp.content =
                "கனவுகள் கண்களுக்குள் \n" +
                        "மறைந்திருக்கலாம்....\n" +
                        "நினைவுகள் நெஞ்சுக்குள்\n" +
                        "மறைந்துபோவதில்லை...\n";

        kavithaiList.add(temp);


        /* 25th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மறைந்துபோவதில்லை";

        temp.content =
                "என்தோட்டத்தில்\n" +
                        "அவளுக்காக பூத்தப்பூக்கள்\n" +
                        "என் கழுத்தில்\n" +
                        "மாலையாக...\n" +
                        "என் மணவாழ்க்கையிலன்று\n" +
                        "என் மரணப்படுக்கையில்...\n";

        kavithaiList.add(temp);


        /*  26th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நம்பிக்கை";

        temp.content =
                "இரு கைகளிருந்தும்\n" +
                        "ஊனமானேன்\n" +
                        "நம்பிக்கையில்லாததால்...\n";

        kavithaiList.add(temp);


        /* 27th  Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "தொழிற்கல்வி";

        temp.content =
                "கல்விக்கூடங்கள்\n" +
                        "தொழிற்கூடங்களாகின\n" +
                        "காகிதத்தாளுக்காக...\n";
        kavithaiList.add(temp);


        /*  28th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "அமிர்தம்";

        temp.content =
                "கொடிய நஞ்சும்\n" +
                        "அமிர்தமானது\n" +
                        "அன்புடன்  கொடுத்தமையால்...\n";

        kavithaiList.add(temp);


        /* 29th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "பணத்தாசை";

        temp.content =
                "காந்தியின் மீது\n" +
                        "பற்றுள்ளவன் போலும்\n" +
                        "வரிசெலுத்த மறுக்கிறான்...\n";

        kavithaiList.add(temp);


        /* 30th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "அம்மா";

        temp.content =
                "கோழை போன்றிருப்பவளின்\n" +
                        "அன்புக்குமுன் குபேரனும்-ஏழையே \n" +
                        "அம்மா...\n";

        kavithaiList.add(temp);


        /* 31st Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "விண்மீன்கள்";

        temp.content =
                "காலையில் கோலம்போட\n" +
                        "இரவில் அவள்வைத்த\n" +
                        "புள்ளிகள் தான்\n" +
                        "விண்மீன்கள்...\n";
        kavithaiList.add(temp);


        /* 32nd Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நிகழ்கால உண்மை";

        temp.content =
                "படித்துபெற்ற பட்டத்தைவிட\n" +
                        "அதிகமதிப்பை பெற்றது\n" +
                        "பணம்...\n";

        kavithaiList.add(temp);


        /*  33rd Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "காதலின் மகிமை";

        temp.content =
                "காதலின் மகிமை\n" +
                        "ஓர் உயிரை சுமப்பாய்\n" +
                        "காதலித்துப்பார்...\n";

        kavithaiList.add(temp);


        /* 34th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "விந்தை உலகம்";

        temp.content =
                "இவ்வுலகை\n" +
                        "படித்தவன்\n" +
                        "அசுத்தம் செய்கிறான்...\n" +
                        "படிக்காதவன்\n" +
                        "சுத்தம் செய்கிறான்...\n";
        kavithaiList.add(temp);


        /* 35th  Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மரத்தின் மறுபிறவி";

        temp.content =
                "ஒரு மரத்தின் இறப்பில்\n" +
                        "பல மரங்கள் பிறந்தன\n" +
                        "காகிதத்தில் மரம்...\n";
        kavithaiList.add(temp);


        /* 36th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மரங்களின் அவ(ஓ)லம்";

        temp.content =
                "படுகொலையால்\n" +
                        "அழிகிறது எம்இனம்\n" +
                        "மரங்கள்...\n";

        kavithaiList.add(temp);

                /* 37th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மழைக்குப்பின் ";

        temp.content =
                "மழையில் நனைந்ததால் \n" +
                        "பைத்தியமானேன்\n" +
                        "என்னவளின் முத்தமழைக்கு...\n";
        kavithaiList.add(temp);


                /* 38th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "இசைஞானிகள்";

        temp.content =
                "இலவசமாக இசைக்கச்சேரி\n" +
                        "நடத்தும் இசைஞானிகள்d\n" +
                        "குருவிக்கூட்டம்...\nd";
        kavithaiList.add(temp);


                /* 39th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "கிராமத்து சொத்து";

        temp.content =
                "வானுயர்ந்த கட்டிடங்களுக்கிடையே \n" +
                        "தொலைந்துபோயினவோ\n" +
                        "வானவில்...\n";

        kavithaiList.add(temp);


                /* 40th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "(அ)நீதியா...?";

        temp.content =
                "ஒசோனை விட\n" +
                        "பெரிய ஓட்டையுள்ளது\n" +
                        "நமது சட்டத்தில்....\n" +
                        "செல்வந்தற்கு  \n" +
                        "வாழ்வு கொடுக்கும்...\n" +
                        "செல்வமில்லாதவரின்\n" +
                        "வாழ்வைக் கெடுக்கும்...\n";

        kavithaiList.add(temp);


                /* 41st Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "‘குடி’மகன்";

        temp.content =
                "குடிமகன்  \n" +
                        "போதையில் மிதக்கையில்\n" +
                        "அவன் குடும்பம்\n" +
                        "கண்ணீர்கடலில்  மிதக்கிறது...\n";

        kavithaiList.add(temp);


                /* 42nd Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "எப்போது இழக்கிறாய்?";

        temp.content =
                "நீ இழந்ததை \n" +
                        "நினைத்து வருந்தினால் \n" +
                        "இருப்பதையும் இழந்திடுவாய்......\n" +
                        "இருப்பதை நினைத்து மகிழ்ந்தால்\n" +
                        "இழந்ததையும்\n" +
                        "அடைந்திடுவாய்...\n";

        kavithaiList.add(temp);

                /* 43rd Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "முயற்சி";

        temp.content =
                "முட்டி மோதி பூமியை\n" +
                        "பிளக்கும் போதுதான்\n" +
                        "விதையும் மரமாகும்...\n" +
                        "\n" +
                        "முயற்சி செய்து தடைகளை \n" +
                        "தகர்க்கும் போதுதான் \n" +
                        "சோதனையும் சாதனையாகும்...\n";
        kavithaiList.add(temp);


               /* 44th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "தவறு தந்த பாடம்";

        temp.content =
                "தவறுகளை மறந்துவிடு;\n" +
                        "ஆனால்,அது உனக்கு \n" +
                        "கற்றுத்தந்தவற்றை மறந்துவிடாதே ...\n";

        kavithaiList.add(temp);


                /* 45th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "இருநொடிகள்";

        temp.content =
                "இருநொடிகள் எடுத்துக்கொண்டாள்\n" +
                        "எனது இருபது வருட வாழ்க்கையை\n" +
                        "களவாடுவதற்கு...\n";

        kavithaiList.add(temp);


                 /* 46th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "நூதன திருட்டு";

        temp.content =
                "உன் பார்வையில்\n" +
                        "என் உயிர்போனது \n" +
                        "உன் சுவாசம் தீண்டியதால்\n" +
                        "என் உயிர்வந்தது\n" +
                        "இருகண்களால் \n" +
                        "இதயத்தை களவாடியவளே\n" +
                        "யாரிடம் இந்தகலையை  கற்றாய்...\n";

        kavithaiList.add(temp);


                /* 47th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "விபச்சாரமன்று";

        temp.content =
                "விற்பனைக்காக உடைகளை\n" +
                        "விலக்கிக்காட்டுகிறாள்\n" +
                        "துணிவியாபாரியாக ...\n";

        kavithaiList.add(temp);


                 /* 48th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "காத்திருக்கிறேன்";

        temp.content =
                "உனது வருகைக்காக\n" +
                        "வசந்தகாலத்தில் காத்திருக்க\n" +
                        "தொடங்கினேன்.\n" +
                        "ஆனால்,இலையுதிர்காலமே\n" +
                        "வந்துவிட்டது;நீ மட்டும் \n" +
                        "இன்னும்வரவில்லை...\n";
        kavithaiList.add(temp);


                /* 49th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "காட்சிப்பிழை";

        temp.content =
                "காதல் இல்லாத\n" +
                        "வாழ்க்கை...\n" +
                        "காற்றில் வரையப்படும்\n" +
                        "ஓவியம்போன்றது;\n" +
                        "\n" +
                        "நீரில் எழுதப்படும்\n" +
                        "வாசகம் போன்றது;\n" +
                        "கண்ணால் இரண்டையும்\n" +
                        "காணஇயலாது...\n";

        kavithaiList.add(temp);


              /* 50th Tab2Kavithai */

        temp = new Tab2Kavithai();

        temp.title = "மழை";

        temp.content =
                "மரங்களைவெட்டியதால்\n" +
                        "மழைவரவில்லை;\n" +
                        "வெள்ளம் வந்தது,\n" +
                        "எனது கண்களில் \n" +
                        "மரம் வெட்டுபட்டதைக்கண்டு...\n";
        kavithaiList.add(temp);

            /* 51st kavithai */

        temp = new Tab2Kavithai();

        temp.title="குழந்தையின் தொழில்";

        temp.content=
                "கூலியில்லாத வேலைக்கு \n" +
                        "குழந்தைகள் தேவை\n" +
                        "இலவசக்கல்வி...\n";

        kavithaiList.add(temp);

        return kavithaiList;
    }
}
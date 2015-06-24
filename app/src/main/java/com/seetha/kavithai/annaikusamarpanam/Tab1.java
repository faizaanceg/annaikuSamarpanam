package com.seetha.kavithai.annaikusamarpanam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tab1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View munnurai = inflater.inflate(R.layout.fragment_tab1, null);

        TextView heading = (TextView) munnurai.findViewById(R.id.heading);
        heading.setText("தவழ-தொடங்கியுள்ளேன்");

        TextView textView = (TextView) munnurai.findViewById(R.id.textView);
        textView.setText("இருபத்தியோராம் நூற்றாண்டின் கவிதை உலகில் இருபத்தியோராம் அகவையில் தவழ தொடங்கியுள்ளேன்.\n\n" +
                "எனது எழுத்துலகில் என்னோடு பயணிக்கும் மதிப்புக்குரிய திருநங்கை என்னுடைய எழுதுகோல்.எனது எழுதுகோலின் உயிரணுக்களில் இருந்து ஒரே பிரசவத்தில் கவிதைகள் பலவற்றை பெற்றெடுத்த மகிழ்ச்சியில் என்னுடன் பயணிக்கின்றன.\n\n" +
                "தன்னுயிரை நீர்த்து,பல உண்மைகளை சுமந்து நிற்கும் தியாகிகளான மரத்திலிருந்து செய்யப்பட்ட காகிதத்துண்டுகளுக்கு சற்று ஓய்வு அளித்துள்ளேன்.\n\n" +
                "குறுங்கவிதைகள் என்றாலும் குண்டூசியின் முனைபோல் அளப்பரிய தாக்கத்தை ஏற்படுத்துகிறது.\n\n" +
                "காதல் பகுதிகள் மிகுதியாக இடம்பெற்றதன் காரணம்,அவற்றின் உண்மையான இயல்பை எடுத்துரைக்கவே.\n\n" +
                "காதல் என்றுமே போற்றுதலுக்குரிய உணர்வுகளின் உண்மை நிலை.ஆனால் அதை காதலென்றபெயரில் தவறுதலாக எடுத்துக்காட்டும் போலியர்களின் முகத்திரையைக் கிழித்துக்காட்டும் கருவி எழுத்துகளின் மூலம் வடிவம் பெருகின்றன.\n\n" +
                "தற்கொலை செய்துகொள்ளும் கோழைக் காதலர்களையும்,காதலர்களை கௌரவக்கொலை செய்யும் பெற்றோரின் மூளையை சலவை செய்யும் புது முயற்சி.\n\n" +
                "பெண்ணினத்தின் நிலைமையை கன்னியத்துடன் எடுத்துரைத்துள்ளேன்.\n\n" +
                "பிறர் முதுக்குப் பின்னால் நாம் செய்யவேண்டிய வேலை “தட்டிக்கொடுப்பது மட்டும்தான்” என்பது திரு.விவேகானந்தர் அவர்கள் கூறிய பொன்மொழி.இதனை பின்பற்றி ,என் முயற்சிகளுக்கு உயிர் கொடுத்த இரு  தாய்களான திருமதி.ராஜராஜேஸ்வரி  அம்மாவிற்கும்,அன்பு தோழியான ‘கவி’க்கும் நன்றி கூறாமல் தொடர்வது சரியன்று.\n\n" +
                "ஒவ்வொரு முறையும் என்னுடைய கவிதைகளை மெருகேற்றிட தன்னுடைய முதல் கருத்தைக்கூறும் கு.ராகுல் சாரதி,தங்கராஜ் இருவருக்கும் என்னுடைய நன்றிக்கடன் அளப்பரியது.\n\n" +
                "அன்னைக்கு சமர்ப்பணம்- தமிழ் கவிதைகளின் தொகுப்பு செயலியை உருவாக்கிட முழுமையாக உதவி புரிந்த அன்பு தோழர் ஜெயவசந்த்’க்கு பிரத்தியேகமாக நன்றி கூற விரும்புகிறேன்.");

        Button about = (Button) munnurai.findViewById(R.id.aboutBtn);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getActivity().getApplicationContext(), About.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(a);
            }
        });

        return munnurai;
    }
}
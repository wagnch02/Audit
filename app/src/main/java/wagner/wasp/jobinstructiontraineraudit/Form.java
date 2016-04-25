package wagner.wasp.jobinstructiontraineraudit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Form extends Activity {
	boolean canSend = true;
	boolean alertShown = false;
	String body;
	final Context context = this;
	long tsStart;
	long tsEnd;
	long tsTotal;
	String ts;
	boolean hitEnd = false;
	
	boolean notFilled = false;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
		//RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
		//rg.setBackgroundResource(R.drawable.ic_launcher);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form, menu);
		return true;
	}

	public void submitClick(View v) {
		if (hitEnd == false) {
			tsEnd = System.currentTimeMillis()/1000;
			hitEnd = true;
		}
		body = "";
		
		EditText et1 = (EditText) findViewById(R.id.editText1);
		EditText et2 = (EditText) findViewById(R.id.editText2);
		EditText et3 = (EditText) findViewById(R.id.editText3);
		EditText et4 = (EditText) findViewById(R.id.editText4);
		
		if (et1.getText().toString() == "") {
			notFilled = true;
		}
		else {
			body = body + "Trainer: " + et1.getText().toString() + "\n" + "\n";
		}
		
		if (et2.getText().toString() == "") {
			notFilled = true;
		}
		else {
			body = body + "Trainee: " + et2.getText().toString() + "\n" + "\n";
		}
		
		if (et3.getText().toString() == "") {
			notFilled = true;
		}
		else {
			body = body + "Topic: " + et3.getText().toString() + "\n" + "\n";
		}
		
		RadioButton rb1 = (RadioButton) findViewById(R.id.radio1);
		RadioButton rb2 = (RadioButton) findViewById(R.id.radio2);
	    RadioButton rb3 = (RadioButton) findViewById(R.id.radio3);
		RadioButton rb4 = (RadioButton) findViewById(R.id.radio4);
		RadioButton rb5 = (RadioButton) findViewById(R.id.radio5);
		RadioButton rb6 = (RadioButton) findViewById(R.id.radio6);
		RadioButton rb7 = (RadioButton) findViewById(R.id.radio7);
		RadioButton rb8 = (RadioButton) findViewById(R.id.radio8);
		RadioButton rb9 = (RadioButton) findViewById(R.id.radio9);
		RadioButton rb10 = (RadioButton) findViewById(R.id.radio10);
		RadioButton rb11 = (RadioButton) findViewById(R.id.radio11);
		RadioButton rb12 = (RadioButton) findViewById(R.id.radio12);
		RadioButton rb13 = (RadioButton) findViewById(R.id.radio13);
		RadioButton rb14 = (RadioButton) findViewById(R.id.radio14);
		RadioButton rb15 = (RadioButton) findViewById(R.id.radio15);
		RadioButton rb16 = (RadioButton) findViewById(R.id.radio16);
		RadioButton rb17 = (RadioButton) findViewById(R.id.radio17);
		RadioButton rb18 = (RadioButton) findViewById(R.id.radio18);
		RadioButton rb19 = (RadioButton) findViewById(R.id.radio19);
		RadioButton rb20 = (RadioButton) findViewById(R.id.radio20);
		RadioButton rb21 = (RadioButton) findViewById(R.id.radio21);
		RadioButton rb22 = (RadioButton) findViewById(R.id.radio22);
		RadioButton rb23 = (RadioButton) findViewById(R.id.radio23);
		RadioButton rb24 = (RadioButton) findViewById(R.id.radio24);
		RadioButton rb25 = (RadioButton) findViewById(R.id.radio25);
		RadioButton rb26 = (RadioButton) findViewById(R.id.radio26);
		RadioButton rb27 = (RadioButton) findViewById(R.id.radio27);
		RadioButton rb28 = (RadioButton) findViewById(R.id.radio28);
		RadioButton rb29 = (RadioButton) findViewById(R.id.radio29);
		RadioButton rb30 = (RadioButton) findViewById(R.id.radio30);
		RadioButton rb31 = (RadioButton) findViewById(R.id.radio31);
		RadioButton rb32 = (RadioButton) findViewById(R.id.radio32);
		RadioButton rb33 = (RadioButton) findViewById(R.id.radio33);
		RadioButton rb34 = (RadioButton) findViewById(R.id.radio34);
		
		
		
		RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
		RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
		RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
		RadioGroup rg4 = (RadioGroup) findViewById(R.id.radioGroup4);
		RadioGroup rg5 = (RadioGroup) findViewById(R.id.radioGroup5);
		RadioGroup rg6 = (RadioGroup) findViewById(R.id.radioGroup6);
		RadioGroup rg7 = (RadioGroup) findViewById(R.id.radioGroup7);
		RadioGroup rg8 = (RadioGroup) findViewById(R.id.radioGroup8);
		RadioGroup rg9 = (RadioGroup) findViewById(R.id.radioGroup9);
		RadioGroup rg10 = (RadioGroup) findViewById(R.id.radioGroup10);
		RadioGroup rg11 = (RadioGroup) findViewById(R.id.radioGroup11);
		RadioGroup rg12 = (RadioGroup) findViewById(R.id.radioGroup12);
		RadioGroup rg13 = (RadioGroup) findViewById(R.id.radioGroup13);
		RadioGroup rg14 = (RadioGroup) findViewById(R.id.radioGroup14);
		RadioGroup rg15 = (RadioGroup) findViewById(R.id.radioGroup15);
		RadioGroup rg16 = (RadioGroup) findViewById(R.id.radioGroup16);
		RadioGroup rg17 = (RadioGroup) findViewById(R.id.radioGroup17);

		if (rg1.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb1.isChecked()) {
				body = body + "Put the person at ease: Yes" + "\n" + "\n";
			}

			if (rb2.isChecked()) {
				body = body + "Put the person at ease: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg2.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb3.isChecked()) {
				body = body + "Stated the job: Yes" + "\n" + "\n";
			}

			if (rb4.isChecked()) {
				body = body + "Stated the job: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg3.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb5.isChecked()) {
				body = body + "Found out what the person already knows: Yes" + "\n" + "\n";
			}

			if (rb6.isChecked()) {
				body = body + "Found out what the person already knows: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg4.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb7.isChecked()) {
				body = body + "Got the person interested in learning the job: Yes" + "\n" + "\n";
			}

			if (rb8.isChecked()) {
				body = body + "Got the person interested in learning the job: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg5.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb9.isChecked()) {
				body = body + "Placed the person in the correct position: Yes" + "\n" + "\n";
			}

			if (rb10.isChecked()) {
				body = body + "Placed the person in the correct position: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg6.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb11.isChecked()) {
				body = body + "Told, showed, and illustrated one Important Step at a time: Yes" + "\n" + "\n";
			}

			if (rb12.isChecked()) {
				body = body + "Told, showed, and illustrated one Important Step at a time: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg7.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb13.isChecked()) {
				body = body + "Did it again stressing Key Points: Yes" + "\n" + "\n";
			}

			if (rb14.isChecked()) {
				body = body + "Did it again stressing Key Points: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg8.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb15.isChecked()) {
				body = body + "Did it again stating reasons for Key Points: Yes" + "\n" + "\n";
			}

			if (rb16.isChecked()) {
				body = body + "Did it again stating reasons for Key Points: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg9.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb17.isChecked()) {
				body = body + "Had the person do the job - corrected errors: Yes" + "\n" + "\n";
			}

			if (rb18.isChecked()) {
				body = body + "Had the person do the job - corrected errors: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg10.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb19.isChecked()) {
				body = body + "Had the person explain each Important Step to you as they did the job again: Yes" + "\n" + "\n";
			}

			if (rb20.isChecked()) {
				body = body + "Had the person explain each Important Step to you as they did the job again: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}

		if (rg11.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb21.isChecked()) {
				body = body + "Had the person explain each Key Point to you as they did the job again: Yes" + "\n" + "\n";
			}

			if (rb22.isChecked()) {
				body = body + "Had the person explain each Key Point to you as they did the job again: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg12.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb23.isChecked()) {
				body = body + "Had the person explain reasons for Key Point to you as they did the job again: Yes" + "\n" + "\n";
			}

			if (rb24.isChecked()) {
				body = body + "Had the person explain reasons for Key Point to you as they did the job again: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg13.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb25.isChecked()) {
				body = body + "Put the person on their own: Yes" + "\n" + "\n";
			}

			if (rb26.isChecked()) {
				body = body + "Put the person on their own: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg14.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb27.isChecked()) {
				body = body + "Designated who the person goes to for help: Yes" + "\n" + "\n";
			}

			if (rb28.isChecked()) {
				body = body + "Designated who the person goes to for help: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg15.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb29.isChecked()) {
				body = body + "Checked on the person frequently: Yes" + "\n" + "\n";
			}

			if (rb30.isChecked()) {
				body = body + "Checked on the person frequently: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (rg16.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb31.isChecked()) {
				body = body + "Encouraged questions: Yes" + "\n" + "\n";
			}

			if (rb32.isChecked()) {
				body = body + "Encouraged questions: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}


		if (rg17.getCheckedRadioButtonId() == -1) {
			notFilled = true;
		}

		else {
			if (rb33.isChecked()) {
				body = body + "Tapered off extra coaching and closed follow-up: Yes" + "\n" + "\n";
			}

			if (rb34.isChecked()) {
				body = body + "Tapered off extra coaching and closed follow-up: No" + "\n" + "\n";
			}
			//yes is 2131230725
			//no is  2131230726
			//System.out.println(rg1.getCheckedRadioButtonId());
		}
		
		if (et4.getText().toString() != "") {
			body = body + "Comments: " + et4.getText().toString() + "\n";
		}
		
		
		tsTotal = tsEnd-tsStart;
		if (tsTotal > 60){
			long minutes = tsTotal / 60;
			long seconds = tsTotal % 60;
			if (seconds < 10) {
				ts = minutes +":"+"0"+seconds;
			}
			else {
				ts = minutes +":"+ seconds;
			}
		}
		
		else {
			if (tsTotal < 10) {
				ts = "0:0"+tsTotal;
			}
			else {
				ts = "0:"+tsTotal;
			}
		}
		
		if (tsTotal > 1000) {
			ts = "Timer was not started.";
		}
		
		body = body + "Training duration: " + ts;
		//System.out.println(body);

		if (notFilled == false) {
			Intent email = new Intent(Intent.ACTION_SEND);
			email.putExtra(Intent.EXTRA_EMAIL, new String[]{"swagner@waspinc.com"});
			email.putExtra(Intent.EXTRA_SUBJECT, "Job Instruction Trainer Audit");
			email.putExtra(Intent.EXTRA_TEXT, body);
			email.setType("message/rfc822");
			startActivity(Intent.createChooser(email, "Choose an Email client :"));
		}
		else {
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
					context);

			// set title
			alertDialogBuilder.setTitle("Invalid Form");

			// set dialog message
			alertDialogBuilder
			.setMessage("One or more required fields were left blank.")
			.setCancelable(true);
			alertDialogBuilder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();
				}
			});

			// create alert dialog
			AlertDialog alertDialog = alertDialogBuilder.create();

			// show it
			alertDialog.show();
			canSend = false;
			alertShown = true;
		}

		notFilled = false;

	}

	public void startTime(View v) {
		Button startButton = (Button) findViewById(R.id.button1);
		Button endButton = (Button) findViewById(R.id.button3);
		tsStart = System.currentTimeMillis()/1000;
		hitEnd = false;
		startButton.setBackgroundColor(Color.GREEN);
		endButton.setBackgroundColor(Color.GREEN);
	}

	public void endTime(View v) {
		Button startButton = (Button) findViewById(R.id.button1);
		Button endButton = (Button) findViewById(R.id.button3);
		tsEnd = System.currentTimeMillis()/1000;
		hitEnd = true;
		startButton.setBackgroundColor(Color.RED);
		endButton.setBackgroundColor(Color.RED);
//		tsTotal = tsEnd-tsStart;
//		if (tsTotal > 60){
//			long minutes = tsTotal / 60;
//			long seconds = tsTotal % 60;
//			if (seconds < 10) {
//				ts = minutes +":"+"0"+seconds;
//			}
//			else {
//				ts = minutes +":"+ seconds;
//			}
//		}
		
	}

}
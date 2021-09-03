/*
*  LightActivity.java
*  UI Kit
*
*  Created by [Author].
*  Copyright © 2018 [Company]. All rights reserved.
*/

package com.company_name.ui_kit.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.company_name.ui_kit.R;
import io.supernova.uitoolkit.drawable.LinearGradientDrawable;


public class LightActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, LightActivity.class);
	}
	
	private TextView findMyWayTextView;
	private TextView dababyTextView;
	private TextView textViewTextView;
	private TextView textViewTwoTextView;
	private TextView findMyWayTwoTextView;
	private TextView dababyTwoTextView;
	private TextView alexTraierTextView;
	private TextView friendRequestTextView;
	private TextView markPhilipsTextView;
	private TextView textViewThreeTextView;
	private TextView textViewFourTextView;
	private TextView teacherTextView;
	private TextView followsTextView;
	private TextView followingTextView;
	private TextView markPhilipsTwoTextView;
	private TextView teacherTwoTextView;
	private TextView papaSpizzeriaTextView;
	private TextView kmTextView;
	private TextView coffeeMugTextView;
	private TextView beautifulAndDurablTextView;
	private TextView textViewFiveTextView;
	private TextView filesUploadingTextView;
	private TextView designPsdTextView;
	private TextView textViewSixTextView;
	private TextView resumeDocxTextView;
	private TextView textViewSevenTextView;
	private TextView messageDocxTextView;
	private TextView textViewEightTextView;
	private TextView boringGirlsTextView;
	private TextView saraTaylorTextView;
	private TextView amazingVeryIntereTextView;
	private TextView ️textView;
	private TextView sunnyTextView;
	private TextView textViewNineTextView;
	private ConstraintLayout switchOnConstraintLayout;
	private TextView newPaymentMethodTextView;
	private ConstraintLayout button3ConstraintLayout;
	private TextView continueTextView;
	private TextView filtersTextView;
	private TextView priceTextView;
	private TextView colorsTextView;
	private TextView textViewTenTextView;
	private ConstraintLayout button3TwoConstraintLayout;
	private TextView applyTextView;
	private TextView materialTextView;
	private TextView cottonTextView;
	private TextView linenTextView;
	private TextView poliesterTextView;
	private TextView notificationsTextView;
	private TextView annaTextView;
	private TextView likedYourPhotoTextView;
	private TextView tomTextView;
	private TextView commentedTextView;
	private TextView amyTextView;
	private TextView wantsToBeFriendsTextView;
	private ConstraintLayout button3ThreeConstraintLayout;
	private TextView saveTextView;
	private TextView addAnewCardTextView;
	private TextView cardNumberTextView;
	private TextView ownerNameTextView;
	private TextView expDateTextView;
	private TextView cvcTextView;
	private TextView coffeeMugTwoTextView;
	private TextView hustleEditionTextView;
	private TextView textViewElevenTextView;
	private TextView newCollectionTextView;
	private TextView summerOutfitsTextView;
	private ConstraintLayout cta1ConstraintLayout;
	private TextView buttonTextTextView;
	private ConstraintLayout button1ConstraintLayout;
	private TextView buttonTextTwoTextView;
	private TextView reviewsTextView;
	private TextView textViewTwelveTextView;
	private TextView textViewThirteenTextView;
	private TextView textViewFourteenTextView;
	private TextView textViewFifteenTextView;
	private TextView textViewSixteenTextView;
	private TextView searchAnythingTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.light_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure FIND MY WAY component
		findMyWayTextView = this.findViewById(R.id.find_my_way_text_view);
		
		// Configure DaBaby component
		dababyTextView = this.findViewById(R.id.dababy_text_view);
		
		// Configure 1:21 component
		textViewTextView = this.findViewById(R.id.text_view_text_view);
		
		// Configure -2:36 component
		textViewTwoTextView = this.findViewById(R.id.text_view_two_text_view);
		
		// Configure FIND MY WAY component
		findMyWayTwoTextView = this.findViewById(R.id.find_my_way_two_text_view);
		
		// Configure DaBaby component
		dababyTwoTextView = this.findViewById(R.id.dababy_two_text_view);
		
		// Configure Alex Traier component
		alexTraierTextView = this.findViewById(R.id.alex_traier_text_view);
		
		// Configure Friend request component
		friendRequestTextView = this.findViewById(R.id.friend_request_text_view);
		
		// Configure Mark Philips component
		markPhilipsTextView = this.findViewById(R.id.mark_philips_text_view);
		
		// Configure 423 component
		textViewThreeTextView = this.findViewById(R.id.text_view_three_text_view);
		
		// Configure 123 component
		textViewFourTextView = this.findViewById(R.id.text_view_four_text_view);
		
		// Configure Teacher component
		teacherTextView = this.findViewById(R.id.teacher_text_view);
		
		// Configure FOLLOWS component
		followsTextView = this.findViewById(R.id.follows_text_view);
		
		// Configure FOLLOWING component
		followingTextView = this.findViewById(R.id.following_text_view);
		
		// Configure Mark Philips component
		markPhilipsTwoTextView = this.findViewById(R.id.mark_philips_two_text_view);
		
		// Configure Teacher component
		teacherTwoTextView = this.findViewById(R.id.teacher_two_text_view);
		
		// Configure Papa’s Pizzeria component
		papaSpizzeriaTextView = this.findViewById(R.id.papa_spizzeria_text_view);
		
		// Configure 3.2km component
		kmTextView = this.findViewById(R.id.km_text_view);
		
		// Configure Coffee mug component
		coffeeMugTextView = this.findViewById(R.id.coffee_mug_text_view);
		
		// Configure Beautiful and durabl component
		beautifulAndDurablTextView = this.findViewById(R.id.beautiful_and_durabl_text_view);
		
		// Configure $7.99 component
		textViewFiveTextView = this.findViewById(R.id.text_view_five_text_view);
		
		// Configure Files uploading… component
		filesUploadingTextView = this.findViewById(R.id.files_uploading_text_view);
		
		// Configure design.psd component
		designPsdTextView = this.findViewById(R.id.design_psd_text_view);
		
		// Configure 50% component
		textViewSixTextView = this.findViewById(R.id.text_view_six_text_view);
		
		// Configure resume.docx component
		resumeDocxTextView = this.findViewById(R.id.resume_docx_text_view);
		
		// Configure 32% component
		textViewSevenTextView = this.findViewById(R.id.text_view_seven_text_view);
		
		// Configure message.docx component
		messageDocxTextView = this.findViewById(R.id.message_docx_text_view);
		
		// Configure 21% component
		textViewEightTextView = this.findViewById(R.id.text_view_eight_text_view);
		
		// Configure Boring Girls component
		boringGirlsTextView = this.findViewById(R.id.boring_girls_text_view);
		
		// Configure Sara Taylor component
		saraTaylorTextView = this.findViewById(R.id.sara_taylor_text_view);
		
		// Configure Amazing, very intere component
		amazingVeryIntereTextView = this.findViewById(R.id.amazing_very_intere_text_view);
		
		// Configure ☀️ component
		️textView = this.findViewById(R.id.️text_view);
		
		// Configure Sunny component
		sunnyTextView = this.findViewById(R.id.sunny_text_view);
		
		// Configure ° component
		textViewNineTextView = this.findViewById(R.id.text_view_nine_text_view);
		
		// Configure switch_on component
		switchOnConstraintLayout = this.findViewById(R.id.switch_on_constraint_layout);
		switchOnConstraintLayout.setBackground(new LinearGradientDrawable.Builder(this, new PointF(1f, 0.5f), new PointF(0f, 0.5f)).cornerRadius(R.dimen.light_activity_switch_on_constraint_layout_radius).addStop(0f, Color.argb(255, 135, 67, 255)).addStop(1f, Color.argb(255, 65, 54, 241)).build());
		
		// Configure New payment method component
		newPaymentMethodTextView = this.findViewById(R.id.new_payment_method_text_view);
		
		// Configure button3 component
		button3ConstraintLayout = this.findViewById(R.id.button3_constraint_layout);
		button3ConstraintLayout.setBackground(new LinearGradientDrawable.Builder(this, new PointF(1f, 0.5f), new PointF(0f, 0.5f)).cornerRadius(R.dimen.light_activity_button3_constraint_layout_radius).addStop(0f, Color.argb(255, 135, 67, 255)).addStop(1f, Color.argb(255, 65, 54, 241)).build());
		
		// Configure Continue component
		continueTextView = this.findViewById(R.id.continue_text_view);
		
		// Configure Filters component
		filtersTextView = this.findViewById(R.id.filters_text_view);
		
		// Configure Price component
		priceTextView = this.findViewById(R.id.price_text_view);
		
		// Configure Colors component
		colorsTextView = this.findViewById(R.id.colors_text_view);
		
		// Configure $50-$125 component
		textViewTenTextView = this.findViewById(R.id.text_view_ten_text_view);
		
		// Configure button3 component
		button3TwoConstraintLayout = this.findViewById(R.id.button3_two_constraint_layout);
		button3TwoConstraintLayout.setBackground(new LinearGradientDrawable.Builder(this, new PointF(1f, 0.5f), new PointF(0f, 0.5f)).cornerRadius(R.dimen.light_activity_button3_two_constraint_layout_radius).addStop(0f, Color.argb(255, 135, 67, 255)).addStop(1f, Color.argb(255, 65, 54, 241)).build());
		
		// Configure Apply component
		applyTextView = this.findViewById(R.id.apply_text_view);
		
		// Configure Material component
		materialTextView = this.findViewById(R.id.material_text_view);
		
		// Configure Cotton component
		cottonTextView = this.findViewById(R.id.cotton_text_view);
		
		// Configure Linen component
		linenTextView = this.findViewById(R.id.linen_text_view);
		
		// Configure Poliester component
		poliesterTextView = this.findViewById(R.id.poliester_text_view);
		
		// Configure Notifications component
		notificationsTextView = this.findViewById(R.id.notifications_text_view);
		
		// Configure Anna component
		annaTextView = this.findViewById(R.id.anna_text_view);
		
		// Configure Liked your photo component
		likedYourPhotoTextView = this.findViewById(R.id.liked_your_photo_text_view);
		
		// Configure Tom component
		tomTextView = this.findViewById(R.id.tom_text_view);
		
		// Configure Commented component
		commentedTextView = this.findViewById(R.id.commented_text_view);
		
		// Configure Amy component
		amyTextView = this.findViewById(R.id.amy_text_view);
		
		// Configure Wants to be friends component
		wantsToBeFriendsTextView = this.findViewById(R.id.wants_to_be_friends_text_view);
		
		// Configure button3 component
		button3ThreeConstraintLayout = this.findViewById(R.id.button3_three_constraint_layout);
		button3ThreeConstraintLayout.setBackground(new LinearGradientDrawable.Builder(this, new PointF(1f, 0.5f), new PointF(0f, 0.5f)).cornerRadius(R.dimen.light_activity_button3_three_constraint_layout_radius).addStop(0f, Color.argb(255, 135, 67, 255)).addStop(1f, Color.argb(255, 65, 54, 241)).build());
		
		// Configure Save component
		saveTextView = this.findViewById(R.id.save_text_view);
		
		// Configure Add a new card component
		addAnewCardTextView = this.findViewById(R.id.add_anew_card_text_view);
		
		// Configure Card number… component
		cardNumberTextView = this.findViewById(R.id.card_number_text_view);
		
		// Configure Owner name component
		ownerNameTextView = this.findViewById(R.id.owner_name_text_view);
		
		// Configure Exp. date component
		expDateTextView = this.findViewById(R.id.exp_date_text_view);
		
		// Configure CVC component
		cvcTextView = this.findViewById(R.id.cvc_text_view);
		
		// Configure Coffee mug component
		coffeeMugTwoTextView = this.findViewById(R.id.coffee_mug_two_text_view);
		
		// Configure Hustle edition component
		hustleEditionTextView = this.findViewById(R.id.hustle_edition_text_view);
		
		// Configure $7.99 component
		textViewElevenTextView = this.findViewById(R.id.text_view_eleven_text_view);
		
		// Configure NEW COLLECTION component
		newCollectionTextView = this.findViewById(R.id.new_collection_text_view);
		
		// Configure Summer outfits component
		summerOutfitsTextView = this.findViewById(R.id.summer_outfits_text_view);
		
		// Configure cta1 component
		cta1ConstraintLayout = this.findViewById(R.id.cta1_constraint_layout);
		cta1ConstraintLayout.setBackground(new LinearGradientDrawable.Builder(this, new PointF(1f, 0.5f), new PointF(0f, 0.5f)).cornerRadius(R.dimen.light_activity_cta1_constraint_layout_radius).addStop(0f, Color.argb(255, 135, 67, 255)).addStop(1f, Color.argb(255, 65, 54, 241)).build());
		
		// Configure Button text component
		buttonTextTextView = this.findViewById(R.id.button_text_text_view);
		
		// Configure button1 component
		button1ConstraintLayout = this.findViewById(R.id.button1_constraint_layout);
		button1ConstraintLayout.setBackground(new LinearGradientDrawable.Builder(this, new PointF(1f, 0.5f), new PointF(0f, 0.5f)).cornerRadius(R.dimen.light_activity_button1_constraint_layout_radius).addStop(0f, Color.argb(255, 135, 67, 255)).addStop(1f, Color.argb(255, 65, 54, 241)).build());
		
		// Configure Button text component
		buttonTextTwoTextView = this.findViewById(R.id.button_text_two_text_view);
		
		// Configure 32 reviews component
		reviewsTextView = this.findViewById(R.id.reviews_text_view);
		
		// Configure 5 component
		textViewTwelveTextView = this.findViewById(R.id.text_view_twelve_text_view);
		
		// Configure 4 component
		textViewThirteenTextView = this.findViewById(R.id.text_view_thirteen_text_view);
		
		// Configure 3 component
		textViewFourteenTextView = this.findViewById(R.id.text_view_fourteen_text_view);
		
		// Configure 2 component
		textViewFifteenTextView = this.findViewById(R.id.text_view_fifteen_text_view);
		
		// Configure 1 component
		textViewSixteenTextView = this.findViewById(R.id.text_view_sixteen_text_view);
		
		// Configure Search anything… component
		searchAnythingTextView = this.findViewById(R.id.search_anything_text_view);
	}
}

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/Payments.feature");
formatter.feature({
  "line": 1,
  "name": "Promolta Web Applocation Test",
  "description": "",
  "id": "promolta-web-applocation-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Promolta Log-in Test",
  "description": "",
  "id": "promolta-web-applocation-test;promolta-log-in-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ": User is on promolta Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ": User login with \"Tss99@gmail.com\" and \"123456\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ": Video checkout page is populated search \"trump\" and select the video",
  "keyword": "Then "
});
formatter.match({
  "location": "Mobile_FirstPayment_StepDefenation.user_is_on_promolta_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Tss99@gmail.com",
      "offset": 19
    },
    {
      "val": "123456",
      "offset": 41
    }
  ],
  "location": "Mobile_FirstPayment_StepDefenation.user_login_with_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "trump",
      "offset": 43
    }
  ],
  "location": "Mobile_FirstPayment_StepDefenation._video_checkout_page_is_populated_search_something_and_select_the_video(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 8,
  "name": "Promolta Payment Test",
  "description": "",
  "id": "promolta-web-applocation-test;promolta-payment-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": ": appearance will displayed fill details and next",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": ": enter budget ammount \"20\" and print views",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": ": startcampaign payment popup page will displayed",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": ":enter the card details \"testcard\" click on pay",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": check the payment is successful",
  "keyword": "And "
});
formatter.match({
  "location": "Mobile_FirstPayment_StepDefenation._appearance_will_displayed_fill_details_and_next()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 24
    }
  ],
  "location": "Mobile_FirstPayment_StepDefenation._enter_budget_ammount_something_and_print_views(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mobile_FirstPayment_StepDefenation._startcampaign_payment_popup_page_will_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "testcard",
      "offset": 25
    }
  ],
  "location": "Mobile_FirstPayment_StepDefenation.enter_the_card_details_click_on_pay(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Mobile_FirstPayment_StepDefenation._check_the_payment_is_successful()"
});
formatter.result({
  "status": "skipped"
});
});
# Automated Survey Servlets
[![Java Servlet CI](https://github.com/TwilioDevEd/automated-survey-servlets/actions/workflows/gradle.yml/badge.svg)](https://github.com/TwilioDevEd/automated-survey-servlets/actions/workflows/gradle.yml)

An application example implementing Click to Call using Twilio.
An application example that implements an Automated Survey using Twilio.

## Run the application

1. Clone the repository and `cd` into it.
   ```bash
    git clone git@github.com:TwilioDevEd/automated-survey-servlets.git
    cd automated-survey-servlets
    ```

1. The application uses Gradle to manage dependencies.

1. Set your environment variables
    ```bash
    cp .env.example .env
    ```
   No variables needed in this project

1. Configure Twilio to call your webhooks.

   You will need to configure Twilio to call your application when SMSs and calls are received.

   You will need to provision at least one Twilio number with SMS and voice capabilities
   so the application's users can trigger the survey. You can buy a number [right
   here](//www.twilio.com/user/account/phone-numbers/search). Once you have
   a number you need to configure it to work with your application. Open
   [the number management page](//www.twilio.com/user/account/phone-numbers/incoming)
   and open a number's configuration by clicking on it.

   [Learn how to configure a Twilio phone number for Programmable Voice](https://www.twilio.com/docs/voice/tutorials/how-to-respond-to-incoming-phone-calls-python#buy-and-configure-a-phone-number)
   [Learn how to configure a Twilio phone number for Programmable SMS](https://support.twilio.com/hc/en-us/articles/223136047-Configure-a-Twilio-Phone-Number-to-Receive-and-Respond-to-Messages)
   
1. Run the application using Gradle Gretty plugin.

   ```bash
   ./gradlew appRun
   ```

   This will run the embedded Jetty application server that uses port 8080.

1. Expose the application to the wider Internet using [ngrok](https://ngrok.com/).

   ```bash
   ngrok http 8080
   ```

   Once you have started ngrok, update your Twilio's number SMS and voice URL
   setting to use your ngrok hostname. It will look something like
   this:

   ```
   http://<your-ngrok-subdomaon/survey
   ```

### Dependencies

This application uses this Twilio helper library.

* [twilio-java](//github.com/twilio/twilio-java)

### Run the tests

Run at the top-level directory.

```bash
./gradlew test
```

## Meta

* No warranty expressed or implied. Software is as is. Diggity.
* [MIT License](http://www.opensource.org/licenses/mit-license.html)
* Lovingly crafted by Twilio Developer Education.

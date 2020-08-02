package tbc.uncagedmist.sarkariseva.Service;

import android.util.Log;

import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import org.json.JSONObject;

public class SarkariNotificationReceivedHandler implements OneSignal.NotificationReceivedHandler {
  @Override
  public void notificationReceived(OSNotification notification) {
    JSONObject data = notification.payload.additionalData;
    String customKey;

    if (data != null) {

      customKey = data.optString("customkey", null);
      if (customKey != null)
        Log.i("OneSignalExample", "customkey set with value: " + customKey);
    }
  }
}
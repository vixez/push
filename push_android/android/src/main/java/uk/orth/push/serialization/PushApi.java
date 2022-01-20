// Autogenerated from Pigeon (v1.0.14), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package uk.orth.push.serialization;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class PushApi {

  public enum UNAuthorizationStatus {
    notDetermined(0),
    denied(1),
    authorized(2),
    provisional(3),
    ephemeral(4);

    private int index;
    private UNAuthorizationStatus(final int index) {
      this.index = index;
    }
  }

  public enum UNAlertStyle {
    none(0),
    banner(1),
    alert(2);

    private int index;
    private UNAlertStyle(final int index) {
      this.index = index;
    }
  }

  public enum UNNotificationSetting {
    notSupported(0),
    disabled(1),
    enabled(2);

    private int index;
    private UNNotificationSetting(final int index) {
      this.index = index;
    }
  }

  public enum UNShowPreviewsSetting {
    always(0),
    whenAuthenticated(1),
    never(2);

    private int index;
    private UNShowPreviewsSetting(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class RemoteMessage {
    private Notification notification;
    public Notification getNotification() { return notification; }
    public void setNotification(Notification setterArg) { this.notification = setterArg; }

    private Map<String, Object> data;
    public Map<String, Object> getData() { return data; }
    public void setData(Map<String, Object> setterArg) { this.data = setterArg; }

    private Boolean isNotificationNull;
    public Boolean getIsNotificationNull() { return isNotificationNull; }
    public void setIsNotificationNull(Boolean setterArg) { this.isNotificationNull = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("notification", (notification == null) ? null : notification.toMap());
      toMapResult.put("data", data);
      toMapResult.put("isNotificationNull", isNotificationNull);
      return toMapResult;
    }
    static RemoteMessage fromMap(Map<String, Object> map) {
      RemoteMessage fromMapResult = new RemoteMessage();
      Object notification = map.get("notification");
      fromMapResult.notification = Notification.fromMap((Map)notification);
      Object data = map.get("data");
      fromMapResult.data = (Map<String, Object>)data;
      Object isNotificationNull = map.get("isNotificationNull");
      fromMapResult.isNotificationNull = (Boolean)isNotificationNull;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class Notification {
    private String title;
    public String getTitle() { return title; }
    public void setTitle(String setterArg) { this.title = setterArg; }

    private String body;
    public String getBody() { return body; }
    public void setBody(String setterArg) { this.body = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("title", title);
      toMapResult.put("body", body);
      return toMapResult;
    }
    static Notification fromMap(Map<String, Object> map) {
      Notification fromMapResult = new Notification();
      Object title = map.get("title");
      fromMapResult.title = (String)title;
      Object body = map.get("body");
      fromMapResult.body = (String)body;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class UNNotificationSettings {
    private UNAuthorizationStatus authorizationStatus;
    public UNAuthorizationStatus getAuthorizationStatus() { return authorizationStatus; }
    public void setAuthorizationStatus(UNAuthorizationStatus setterArg) { this.authorizationStatus = setterArg; }

    private UNNotificationSetting soundSetting;
    public UNNotificationSetting getSoundSetting() { return soundSetting; }
    public void setSoundSetting(UNNotificationSetting setterArg) { this.soundSetting = setterArg; }

    private UNNotificationSetting badgeSetting;
    public UNNotificationSetting getBadgeSetting() { return badgeSetting; }
    public void setBadgeSetting(UNNotificationSetting setterArg) { this.badgeSetting = setterArg; }

    private UNNotificationSetting alertSetting;
    public UNNotificationSetting getAlertSetting() { return alertSetting; }
    public void setAlertSetting(UNNotificationSetting setterArg) { this.alertSetting = setterArg; }

    private UNNotificationSetting notificationCenterSetting;
    public UNNotificationSetting getNotificationCenterSetting() { return notificationCenterSetting; }
    public void setNotificationCenterSetting(UNNotificationSetting setterArg) { this.notificationCenterSetting = setterArg; }

    private UNNotificationSetting lockScreenSetting;
    public UNNotificationSetting getLockScreenSetting() { return lockScreenSetting; }
    public void setLockScreenSetting(UNNotificationSetting setterArg) { this.lockScreenSetting = setterArg; }

    private UNNotificationSetting carPlaySetting;
    public UNNotificationSetting getCarPlaySetting() { return carPlaySetting; }
    public void setCarPlaySetting(UNNotificationSetting setterArg) { this.carPlaySetting = setterArg; }

    private UNAlertStyle alertStyle;
    public UNAlertStyle getAlertStyle() { return alertStyle; }
    public void setAlertStyle(UNAlertStyle setterArg) { this.alertStyle = setterArg; }

    private UNShowPreviewsSetting showPreviewsSetting;
    public UNShowPreviewsSetting getShowPreviewsSetting() { return showPreviewsSetting; }
    public void setShowPreviewsSetting(UNShowPreviewsSetting setterArg) { this.showPreviewsSetting = setterArg; }

    private UNNotificationSetting criticalAlertSetting;
    public UNNotificationSetting getCriticalAlertSetting() { return criticalAlertSetting; }
    public void setCriticalAlertSetting(UNNotificationSetting setterArg) { this.criticalAlertSetting = setterArg; }

    private Boolean providesAppNotificationSettings;
    public Boolean getProvidesAppNotificationSettings() { return providesAppNotificationSettings; }
    public void setProvidesAppNotificationSettings(Boolean setterArg) { this.providesAppNotificationSettings = setterArg; }

    private UNNotificationSetting announcementSetting;
    public UNNotificationSetting getAnnouncementSetting() { return announcementSetting; }
    public void setAnnouncementSetting(UNNotificationSetting setterArg) { this.announcementSetting = setterArg; }

    Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("authorizationStatus", authorizationStatus == null ? null : authorizationStatus.index);
      toMapResult.put("soundSetting", soundSetting == null ? null : soundSetting.index);
      toMapResult.put("badgeSetting", badgeSetting == null ? null : badgeSetting.index);
      toMapResult.put("alertSetting", alertSetting == null ? null : alertSetting.index);
      toMapResult.put("notificationCenterSetting", notificationCenterSetting == null ? null : notificationCenterSetting.index);
      toMapResult.put("lockScreenSetting", lockScreenSetting == null ? null : lockScreenSetting.index);
      toMapResult.put("carPlaySetting", carPlaySetting == null ? null : carPlaySetting.index);
      toMapResult.put("alertStyle", alertStyle == null ? null : alertStyle.index);
      toMapResult.put("showPreviewsSetting", showPreviewsSetting == null ? null : showPreviewsSetting.index);
      toMapResult.put("criticalAlertSetting", criticalAlertSetting == null ? null : criticalAlertSetting.index);
      toMapResult.put("providesAppNotificationSettings", providesAppNotificationSettings);
      toMapResult.put("announcementSetting", announcementSetting == null ? null : announcementSetting.index);
      return toMapResult;
    }
    static UNNotificationSettings fromMap(Map<String, Object> map) {
      UNNotificationSettings fromMapResult = new UNNotificationSettings();
      Object authorizationStatus = map.get("authorizationStatus");
      fromMapResult.authorizationStatus = authorizationStatus == null ? null : UNAuthorizationStatus.values()[(int)authorizationStatus];
      Object soundSetting = map.get("soundSetting");
      fromMapResult.soundSetting = soundSetting == null ? null : UNNotificationSetting.values()[(int)soundSetting];
      Object badgeSetting = map.get("badgeSetting");
      fromMapResult.badgeSetting = badgeSetting == null ? null : UNNotificationSetting.values()[(int)badgeSetting];
      Object alertSetting = map.get("alertSetting");
      fromMapResult.alertSetting = alertSetting == null ? null : UNNotificationSetting.values()[(int)alertSetting];
      Object notificationCenterSetting = map.get("notificationCenterSetting");
      fromMapResult.notificationCenterSetting = notificationCenterSetting == null ? null : UNNotificationSetting.values()[(int)notificationCenterSetting];
      Object lockScreenSetting = map.get("lockScreenSetting");
      fromMapResult.lockScreenSetting = lockScreenSetting == null ? null : UNNotificationSetting.values()[(int)lockScreenSetting];
      Object carPlaySetting = map.get("carPlaySetting");
      fromMapResult.carPlaySetting = carPlaySetting == null ? null : UNNotificationSetting.values()[(int)carPlaySetting];
      Object alertStyle = map.get("alertStyle");
      fromMapResult.alertStyle = alertStyle == null ? null : UNAlertStyle.values()[(int)alertStyle];
      Object showPreviewsSetting = map.get("showPreviewsSetting");
      fromMapResult.showPreviewsSetting = showPreviewsSetting == null ? null : UNShowPreviewsSetting.values()[(int)showPreviewsSetting];
      Object criticalAlertSetting = map.get("criticalAlertSetting");
      fromMapResult.criticalAlertSetting = criticalAlertSetting == null ? null : UNNotificationSetting.values()[(int)criticalAlertSetting];
      Object providesAppNotificationSettings = map.get("providesAppNotificationSettings");
      fromMapResult.providesAppNotificationSettings = (Boolean)providesAppNotificationSettings;
      Object announcementSetting = map.get("announcementSetting");
      fromMapResult.announcementSetting = announcementSetting == null ? null : UNNotificationSetting.values()[(int)announcementSetting];
      return fromMapResult;
    }
  }

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class PushHostApiCodec extends StandardMessageCodec {
    public static final PushHostApiCodec INSTANCE = new PushHostApiCodec();
    private PushHostApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return Notification.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return RemoteMessage.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return UNNotificationSettings.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof Notification) {
        stream.write(128);
        writeValue(stream, ((Notification) value).toMap());
      } else 
      if (value instanceof RemoteMessage) {
        stream.write(129);
        writeValue(stream, ((RemoteMessage) value).toMap());
      } else 
      if (value instanceof UNNotificationSettings) {
        stream.write(130);
        writeValue(stream, ((UNNotificationSettings) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface PushHostApi {
    Boolean notificationTapLaunchedTerminatedApp();
    Map<String, Object> getNotificationTapWhichLaunchedTerminatedApp();
    void getToken(Result<String> result);
    void backgroundFlutterApplicationReady();
    void onListenToOnNewToken();
    void onCancelToOnNewToken();
    void requestPermission(Boolean badge, Boolean sound, Boolean alert, Boolean carPlay, Boolean criticalAlert, Boolean provisional, Boolean providesAppNotificationSettings, Boolean announcement, Result<Boolean> result);
    void getNotificationSettings(Result<UNNotificationSettings> result);

    /** The codec used by PushHostApi. */
    static MessageCodec<Object> getCodec() {
      return PushHostApiCodec.INSTANCE;
    }

    /** Sets up an instance of `PushHostApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, PushHostApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.notificationTapLaunchedTerminatedApp", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Boolean output = api.notificationTapLaunchedTerminatedApp();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.getNotificationTapWhichLaunchedTerminatedApp", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Map<String, Object> output = api.getNotificationTapWhichLaunchedTerminatedApp();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.getToken", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<String> resultCallback = new Result<String>() {
                public void success(String result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.getToken(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.backgroundFlutterApplicationReady", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.backgroundFlutterApplicationReady();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.onListenToOnNewToken", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.onListenToOnNewToken();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.onCancelToOnNewToken", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              api.onCancelToOnNewToken();
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.requestPermission", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              Boolean badgeArg = (Boolean)args.get(0);
              if (badgeArg == null) {
                throw new NullPointerException("badgeArg unexpectedly null.");
              }
              Boolean soundArg = (Boolean)args.get(1);
              if (soundArg == null) {
                throw new NullPointerException("soundArg unexpectedly null.");
              }
              Boolean alertArg = (Boolean)args.get(2);
              if (alertArg == null) {
                throw new NullPointerException("alertArg unexpectedly null.");
              }
              Boolean carPlayArg = (Boolean)args.get(3);
              if (carPlayArg == null) {
                throw new NullPointerException("carPlayArg unexpectedly null.");
              }
              Boolean criticalAlertArg = (Boolean)args.get(4);
              if (criticalAlertArg == null) {
                throw new NullPointerException("criticalAlertArg unexpectedly null.");
              }
              Boolean provisionalArg = (Boolean)args.get(5);
              if (provisionalArg == null) {
                throw new NullPointerException("provisionalArg unexpectedly null.");
              }
              Boolean providesAppNotificationSettingsArg = (Boolean)args.get(6);
              if (providesAppNotificationSettingsArg == null) {
                throw new NullPointerException("providesAppNotificationSettingsArg unexpectedly null.");
              }
              Boolean announcementArg = (Boolean)args.get(7);
              if (announcementArg == null) {
                throw new NullPointerException("announcementArg unexpectedly null.");
              }
              Result<Boolean> resultCallback = new Result<Boolean>() {
                public void success(Boolean result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.requestPermission(badgeArg, soundArg, alertArg, carPlayArg, criticalAlertArg, provisionalArg, providesAppNotificationSettingsArg, announcementArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushHostApi.getNotificationSettings", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              Result<UNNotificationSettings> resultCallback = new Result<UNNotificationSettings>() {
                public void success(UNNotificationSettings result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.getNotificationSettings(resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static class PushFlutterApiCodec extends StandardMessageCodec {
    public static final PushFlutterApiCodec INSTANCE = new PushFlutterApiCodec();
    private PushFlutterApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return Notification.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return RemoteMessage.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return UNNotificationSettings.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof Notification) {
        stream.write(128);
        writeValue(stream, ((Notification) value).toMap());
      } else 
      if (value instanceof RemoteMessage) {
        stream.write(129);
        writeValue(stream, ((RemoteMessage) value).toMap());
      } else 
      if (value instanceof UNNotificationSettings) {
        stream.write(130);
        writeValue(stream, ((UNNotificationSettings) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class PushFlutterApi {
    private final BinaryMessenger binaryMessenger;
    public PushFlutterApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    static MessageCodec<Object> getCodec() {
      return PushFlutterApiCodec.INSTANCE;
    }

    public void onMessage(RemoteMessage messageArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushFlutterApi.onMessage", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(messageArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onBackgroundMessage(RemoteMessage messageArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushFlutterApi.onBackgroundMessage", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(messageArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onNotificationTap(Map<String, Object> dataArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushFlutterApi.onNotificationTap", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(dataArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onNewToken(String tokenArg, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushFlutterApi.onNewToken", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(tokenArg)), channelReply -> {
        callback.reply(null);
      });
    }
    public void onOpenNotificationSettings(Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushFlutterApi.onOpenNotificationSettings", getCodec());
      channel.send(null, channelReply -> {
        callback.reply(null);
      });
    }
    public void showNotificationInForeground(RemoteMessage messageArg, Reply<Boolean> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.PushFlutterApi.showNotificationInForeground", getCodec());
      channel.send(new ArrayList<Object>(Arrays.asList(messageArg)), channelReply -> {
        @SuppressWarnings("ConstantConditions")
        Boolean output = (Boolean)channelReply;
        callback.reply(output);
      });
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", null);
    return errorMap;
  }
}

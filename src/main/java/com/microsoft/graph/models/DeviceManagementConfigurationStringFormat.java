package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DeviceManagementConfigurationStringFormat implements ValuedEnum {
    None("none"),
    Email("email"),
    Guid("guid"),
    Ip("ip"),
    Base64("base64"),
    Url("url"),
    Version("version"),
    Xml("xml"),
    Date("date"),
    Time("time"),
    Binary("binary"),
    RegEx("regEx"),
    Json("json"),
    DateTime("dateTime"),
    SurfaceHub("surfaceHub");
    public final String value;
    DeviceManagementConfigurationStringFormat(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationStringFormat forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "email": return Email;
            case "guid": return Guid;
            case "ip": return Ip;
            case "base64": return Base64;
            case "url": return Url;
            case "version": return Version;
            case "xml": return Xml;
            case "date": return Date;
            case "time": return Time;
            case "binary": return Binary;
            case "regEx": return RegEx;
            case "json": return Json;
            case "dateTime": return DateTime;
            case "surfaceHub": return SurfaceHub;
            default: return null;
        }
    }
}

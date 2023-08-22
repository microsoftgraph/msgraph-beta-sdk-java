package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationStringFormat implements ValuedEnum {
    /** Indicates a string with no well-defined format expected. */
    None("none"),
    /** Indicates a string that is expected to be a valid email address. */
    Email("email"),
    /** Indicates a string that is expected to be a valid GUID. */
    Guid("guid"),
    /** Indicates a string that is expected to be a valid IP address. */
    Ip("ip"),
    /** Indicates a string that is base64 encoded. */
    Base64("base64"),
    /** Indicates a string that is expected to be a valid URL. */
    Url("url"),
    /** Indicates a string that should refer to a version. */
    Version("version"),
    /** Indicates a string that is expected to be a valid XML. */
    Xml("xml"),
    /** Indicates a string that is expected to be a valid date. */
    Date("date"),
    /** Indicates a string that is expected to be a valid time. */
    Time("time"),
    Binary("binary"),
    /** Indicates a string that is expected to be a valid Regex string. */
    RegEx("regEx"),
    /** Indicates a string that is expected to be a valid JSON string. */
    Json("json"),
    /** Indicates a string that is expected to be a valid Datetime. */
    DateTime("dateTime"),
    /** Indicates a Windows SKU applicability value that maps to Intune. */
    SurfaceHub("surfaceHub"),
    /** String whose value is a bash script */
    BashScript("bashScript"),
    /** Sentinel member for cases where the client cannot handle the new enum values. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationStringFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationStringFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
            case "bashScript": return BashScript;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

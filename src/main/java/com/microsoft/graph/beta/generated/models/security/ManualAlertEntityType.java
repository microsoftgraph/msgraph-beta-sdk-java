package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManualAlertEntityType implements ValuedEnum {
    User("user"),
    Device("device"),
    File("file"),
    Ip("ip"),
    Url("url"),
    CloudApplication("cloudApplication"),
    Mailbox("mailbox"),
    SecurityGroup("securityGroup"),
    AzureResource("azureResource"),
    AmazonResource("amazonResource"),
    GoogleCloudResource("googleCloudResource"),
    OAuthApplication("oAuthApplication"),
    EmailMessage("emailMessage"),
    EmailCluster("emailCluster"),
    Process("process"),
    RegistryKey("registryKey"),
    RegistryValue("registryValue"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManualAlertEntityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManualAlertEntityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "device": return Device;
            case "file": return File;
            case "ip": return Ip;
            case "url": return Url;
            case "cloudApplication": return CloudApplication;
            case "mailbox": return Mailbox;
            case "securityGroup": return SecurityGroup;
            case "azureResource": return AzureResource;
            case "amazonResource": return AmazonResource;
            case "googleCloudResource": return GoogleCloudResource;
            case "oAuthApplication": return OAuthApplication;
            case "emailMessage": return EmailMessage;
            case "emailCluster": return EmailCluster;
            case "process": return Process;
            case "registryKey": return RegistryKey;
            case "registryValue": return RegistryValue;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

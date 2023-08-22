package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that describes tenant level settings for derived credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementDerivedCredentialSettings extends Entity implements Parsable {
    /**
     * The display name for the profile.
     */
    private String displayName;
    /**
     * The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     */
    private String helpUrl;
    /**
     * Supported values for the derived credential issuer.
     */
    private DeviceManagementDerivedCredentialIssuer issuer;
    /**
     * Supported values for the notification type to use.
     */
    private DeviceManagementDerivedCredentialNotificationType notificationType;
    /**
     * The nominal percentage of time before certificate renewal is initiated by the client.
     */
    private Integer renewalThresholdPercentage;
    /**
     * Instantiates a new deviceManagementDerivedCredentialSettings and sets the default values.
     */
    public DeviceManagementDerivedCredentialSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementDerivedCredentialSettings
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementDerivedCredentialSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementDerivedCredentialSettings();
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpUrl", (n) -> { this.setHelpUrl(n.getStringValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getEnumValue(DeviceManagementDerivedCredentialIssuer.class)); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getEnumValue(DeviceManagementDerivedCredentialNotificationType.class)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpUrl property value. The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHelpUrl() {
        return this.helpUrl;
    }
    /**
     * Gets the issuer property value. Supported values for the derived credential issuer.
     * @return a deviceManagementDerivedCredentialIssuer
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialIssuer getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the notificationType property value. Supported values for the notification type to use.
     * @return a deviceManagementDerivedCredentialNotificationType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialNotificationType getNotificationType() {
        return this.notificationType;
    }
    /**
     * Gets the renewalThresholdPercentage property value. The nominal percentage of time before certificate renewal is initiated by the client.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.renewalThresholdPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("helpUrl", this.getHelpUrl());
        writer.writeEnumValue("issuer", this.getIssuer());
        writer.writeEnumValue("notificationType", this.getNotificationType());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
    }
    /**
     * Sets the displayName property value. The display name for the profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the helpUrl property value. The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     * @param value Value to set for the helpUrl property.
     */
    public void setHelpUrl(@jakarta.annotation.Nullable final String value) {
        this.helpUrl = value;
    }
    /**
     * Sets the issuer property value. Supported values for the derived credential issuer.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialIssuer value) {
        this.issuer = value;
    }
    /**
     * Sets the notificationType property value. Supported values for the notification type to use.
     * @param value Value to set for the notificationType property.
     */
    public void setNotificationType(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialNotificationType value) {
        this.notificationType = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. The nominal percentage of time before certificate renewal is initiated by the client.
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.renewalThresholdPercentage = value;
    }
}

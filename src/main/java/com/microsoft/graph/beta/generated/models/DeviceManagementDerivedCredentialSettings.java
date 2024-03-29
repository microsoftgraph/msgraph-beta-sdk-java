package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that describes tenant level settings for derived credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementDerivedCredentialSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementDerivedCredentialSettings} and sets the default values.
     */
    public DeviceManagementDerivedCredentialSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementDerivedCredentialSettings}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementDerivedCredentialSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementDerivedCredentialSettings();
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpUrl", (n) -> { this.setHelpUrl(n.getStringValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getEnumValue(DeviceManagementDerivedCredentialIssuer::forValue)); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getEnumSetValue(DeviceManagementDerivedCredentialNotificationType::forValue)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpUrl property value. The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpUrl() {
        return this.backingStore.get("helpUrl");
    }
    /**
     * Gets the issuer property value. Supported values for the derived credential issuer.
     * @return a {@link DeviceManagementDerivedCredentialIssuer}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialIssuer getIssuer() {
        return this.backingStore.get("issuer");
    }
    /**
     * Gets the notificationType property value. Supported values for the notification type to use.
     * @return a {@link EnumSet<DeviceManagementDerivedCredentialNotificationType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementDerivedCredentialNotificationType> getNotificationType() {
        return this.backingStore.get("notificationType");
    }
    /**
     * Gets the renewalThresholdPercentage property value. The nominal percentage of time before certificate renewal is initiated by the client.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.backingStore.get("renewalThresholdPercentage");
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
        writer.writeEnumSetValue("notificationType", this.getNotificationType());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
    }
    /**
     * Sets the displayName property value. The display name for the profile.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the helpUrl property value. The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     * @param value Value to set for the helpUrl property.
     */
    public void setHelpUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("helpUrl", value);
    }
    /**
     * Sets the issuer property value. Supported values for the derived credential issuer.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialIssuer value) {
        this.backingStore.set("issuer", value);
    }
    /**
     * Sets the notificationType property value. Supported values for the notification type to use.
     * @param value Value to set for the notificationType property.
     */
    public void setNotificationType(@jakarta.annotation.Nullable final EnumSet<DeviceManagementDerivedCredentialNotificationType> value) {
        this.backingStore.set("notificationType", value);
    }
    /**
     * Sets the renewalThresholdPercentage property value. The nominal percentage of time before certificate renewal is initiated by the client.
     * @param value Value to set for the renewalThresholdPercentage property.
     */
    public void setRenewalThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("renewalThresholdPercentage", value);
    }
}

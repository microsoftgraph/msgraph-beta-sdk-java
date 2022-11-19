package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementDerivedCredentialSettings extends Entity implements Parsable {
    /** The display name for the profile. */
    private String _displayName;
    /** The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal. */
    private String _helpUrl;
    /** Supported values for the derived credential issuer. */
    private DeviceManagementDerivedCredentialIssuer _issuer;
    /** Supported values for the notification type to use. */
    private DeviceManagementDerivedCredentialNotificationType _notificationType;
    /** The nominal percentage of time before certificate renewal is initiated by the client. */
    private Integer _renewalThresholdPercentage;
    /**
     * Instantiates a new deviceManagementDerivedCredentialSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementDerivedCredentialSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nonnull
    public static DeviceManagementDerivedCredentialSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementDerivedCredentialSettings();
    }
    /**
     * Gets the displayName property value. The display name for the profile.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementDerivedCredentialSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpUrl", (n) -> { currentObject.setHelpUrl(n.getStringValue()); });
        deserializerMap.put("issuer", (n) -> { currentObject.setIssuer(n.getEnumValue(DeviceManagementDerivedCredentialIssuer.class)); });
        deserializerMap.put("notificationType", (n) -> { currentObject.setNotificationType(n.getEnumValue(DeviceManagementDerivedCredentialNotificationType.class)); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { currentObject.setRenewalThresholdPercentage(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the helpUrl property value. The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHelpUrl() {
        return this._helpUrl;
    }
    /**
     * Gets the issuer property value. Supported values for the derived credential issuer.
     * @return a deviceManagementDerivedCredentialIssuer
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialIssuer getIssuer() {
        return this._issuer;
    }
    /**
     * Gets the notificationType property value. Supported values for the notification type to use.
     * @return a deviceManagementDerivedCredentialNotificationType
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialNotificationType getNotificationType() {
        return this._notificationType;
    }
    /**
     * Gets the renewalThresholdPercentage property value. The nominal percentage of time before certificate renewal is initiated by the client.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this._renewalThresholdPercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the helpUrl property value. The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.
     * @param value Value to set for the helpUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHelpUrl(@javax.annotation.Nullable final String value) {
        this._helpUrl = value;
    }
    /**
     * Sets the issuer property value. Supported values for the derived credential issuer.
     * @param value Value to set for the issuer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssuer(@javax.annotation.Nullable final DeviceManagementDerivedCredentialIssuer value) {
        this._issuer = value;
    }
    /**
     * Sets the notificationType property value. Supported values for the notification type to use.
     * @param value Value to set for the notificationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationType(@javax.annotation.Nullable final DeviceManagementDerivedCredentialNotificationType value) {
        this._notificationType = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. The nominal percentage of time before certificate renewal is initiated by the client.
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._renewalThresholdPercentage = value;
    }
}

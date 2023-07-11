package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties, inherited properties and actions for AFW mobile app configurations.
 */
public class AndroidForWorkMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration implements Parsable {
    /**
     * Setting to specify whether to allow ConnectedApps experience for this app.
     */
    private Boolean connectedAppsEnabled;
    /**
     * Android For Work app configuration package id.
     */
    private String packageId;
    /**
     * Android For Work app configuration JSON payload.
     */
    private String payloadJson;
    /**
     * List of Android app permissions and corresponding permission actions.
     */
    private java.util.List<AndroidPermissionAction> permissionActions;
    /**
     * Android profile applicability
     */
    private AndroidProfileApplicability profileApplicability;
    /**
     * Instantiates a new androidForWorkMobileAppConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidForWorkMobileAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkMobileAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidForWorkMobileAppConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkMobileAppConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkMobileAppConfiguration();
    }
    /**
     * Gets the connectedAppsEnabled property value. Setting to specify whether to allow ConnectedApps experience for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectedAppsEnabled() {
        return this.connectedAppsEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectedAppsEnabled", (n) -> { this.setConnectedAppsEnabled(n.getBooleanValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("payloadJson", (n) -> { this.setPayloadJson(n.getStringValue()); });
        deserializerMap.put("permissionActions", (n) -> { this.setPermissionActions(n.getCollectionOfObjectValues(AndroidPermissionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("profileApplicability", (n) -> { this.setProfileApplicability(n.getEnumValue(AndroidProfileApplicability.class)); });
        return deserializerMap;
    }
    /**
     * Gets the packageId property value. Android For Work app configuration package id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this.packageId;
    }
    /**
     * Gets the payloadJson property value. Android For Work app configuration JSON payload.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadJson() {
        return this.payloadJson;
    }
    /**
     * Gets the permissionActions property value. List of Android app permissions and corresponding permission actions.
     * @return a androidPermissionAction
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidPermissionAction> getPermissionActions() {
        return this.permissionActions;
    }
    /**
     * Gets the profileApplicability property value. Android profile applicability
     * @return a androidProfileApplicability
     */
    @javax.annotation.Nullable
    public AndroidProfileApplicability getProfileApplicability() {
        return this.profileApplicability;
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
        writer.writeBooleanValue("connectedAppsEnabled", this.getConnectedAppsEnabled());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeStringValue("payloadJson", this.getPayloadJson());
        writer.writeCollectionOfObjectValues("permissionActions", this.getPermissionActions());
        writer.writeEnumValue("profileApplicability", this.getProfileApplicability());
    }
    /**
     * Sets the connectedAppsEnabled property value. Setting to specify whether to allow ConnectedApps experience for this app.
     * @param value Value to set for the connectedAppsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedAppsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.connectedAppsEnabled = value;
    }
    /**
     * Sets the packageId property value. Android For Work app configuration package id.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this.packageId = value;
    }
    /**
     * Sets the payloadJson property value. Android For Work app configuration JSON payload.
     * @param value Value to set for the payloadJson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadJson(@javax.annotation.Nullable final String value) {
        this.payloadJson = value;
    }
    /**
     * Sets the permissionActions property value. List of Android app permissions and corresponding permission actions.
     * @param value Value to set for the permissionActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionActions(@javax.annotation.Nullable final java.util.List<AndroidPermissionAction> value) {
        this.permissionActions = value;
    }
    /**
     * Sets the profileApplicability property value. Android profile applicability
     * @param value Value to set for the profileApplicability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileApplicability(@javax.annotation.Nullable final AndroidProfileApplicability value) {
        this.profileApplicability = value;
    }
}

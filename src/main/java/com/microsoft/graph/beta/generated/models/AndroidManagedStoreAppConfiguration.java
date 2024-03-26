package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties, inherited properties and actions for Android Enterprise mobile app configurations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedStoreAppConfiguration extends ManagedDeviceMobileAppConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidManagedStoreAppConfiguration} and sets the default values.
     */
    public AndroidManagedStoreAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedStoreAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidManagedStoreAppConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedStoreAppConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppConfiguration();
    }
    /**
     * Gets the appSupportsOemConfig property value. Whether or not this AppConfig is an OEMConfig policy. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppSupportsOemConfig() {
        return this.backingStore.get("appSupportsOemConfig");
    }
    /**
     * Gets the connectedAppsEnabled property value. Setting to specify whether to allow ConnectedApps experience for this app.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectedAppsEnabled() {
        return this.backingStore.get("connectedAppsEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appSupportsOemConfig", (n) -> { this.setAppSupportsOemConfig(n.getBooleanValue()); });
        deserializerMap.put("connectedAppsEnabled", (n) -> { this.setConnectedAppsEnabled(n.getBooleanValue()); });
        deserializerMap.put("packageId", (n) -> { this.setPackageId(n.getStringValue()); });
        deserializerMap.put("payloadJson", (n) -> { this.setPayloadJson(n.getStringValue()); });
        deserializerMap.put("permissionActions", (n) -> { this.setPermissionActions(n.getCollectionOfObjectValues(AndroidPermissionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("profileApplicability", (n) -> { this.setProfileApplicability(n.getEnumValue(AndroidProfileApplicability::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the packageId property value. Android Enterprise app configuration package id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPackageId() {
        return this.backingStore.get("packageId");
    }
    /**
     * Gets the payloadJson property value. Android Enterprise app configuration JSON payload.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayloadJson() {
        return this.backingStore.get("payloadJson");
    }
    /**
     * Gets the permissionActions property value. List of Android app permissions and corresponding permission actions.
     * @return a {@link java.util.List<AndroidPermissionAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidPermissionAction> getPermissionActions() {
        return this.backingStore.get("permissionActions");
    }
    /**
     * Gets the profileApplicability property value. Android profile applicability
     * @return a {@link AndroidProfileApplicability}
     */
    @jakarta.annotation.Nullable
    public AndroidProfileApplicability getProfileApplicability() {
        return this.backingStore.get("profileApplicability");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("connectedAppsEnabled", this.getConnectedAppsEnabled());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeStringValue("payloadJson", this.getPayloadJson());
        writer.writeCollectionOfObjectValues("permissionActions", this.getPermissionActions());
        writer.writeEnumValue("profileApplicability", this.getProfileApplicability());
    }
    /**
     * Sets the appSupportsOemConfig property value. Whether or not this AppConfig is an OEMConfig policy. This property is read-only.
     * @param value Value to set for the appSupportsOemConfig property.
     */
    public void setAppSupportsOemConfig(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appSupportsOemConfig", value);
    }
    /**
     * Sets the connectedAppsEnabled property value. Setting to specify whether to allow ConnectedApps experience for this app.
     * @param value Value to set for the connectedAppsEnabled property.
     */
    public void setConnectedAppsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectedAppsEnabled", value);
    }
    /**
     * Sets the packageId property value. Android Enterprise app configuration package id.
     * @param value Value to set for the packageId property.
     */
    public void setPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("packageId", value);
    }
    /**
     * Sets the payloadJson property value. Android Enterprise app configuration JSON payload.
     * @param value Value to set for the payloadJson property.
     */
    public void setPayloadJson(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadJson", value);
    }
    /**
     * Sets the permissionActions property value. List of Android app permissions and corresponding permission actions.
     * @param value Value to set for the permissionActions property.
     */
    public void setPermissionActions(@jakarta.annotation.Nullable final java.util.List<AndroidPermissionAction> value) {
        this.backingStore.set("permissionActions", value);
    }
    /**
     * Sets the profileApplicability property value. Android profile applicability
     * @param value Value to set for the profileApplicability property.
     */
    public void setProfileApplicability(@jakarta.annotation.Nullable final AndroidProfileApplicability value) {
        this.backingStore.set("profileApplicability", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedStoreAppConfiguration extends ManagedDeviceMobileAppConfiguration implements Parsable {
    /** Whether or not this AppConfig is an OEMConfig policy. */
    private Boolean _appSupportsOemConfig;
    /** Setting to specify whether to allow ConnectedApps experience for this app. */
    private Boolean _connectedAppsEnabled;
    /** Android Enterprise app configuration package id. */
    private String _packageId;
    /** Android Enterprise app configuration JSON payload. */
    private String _payloadJson;
    /** List of Android app permissions and corresponding permission actions. */
    private java.util.List<AndroidPermissionAction> _permissionActions;
    /** Android profile applicability */
    private AndroidProfileApplicability _profileApplicability;
    /**
     * Instantiates a new AndroidManagedStoreAppConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedStoreAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedStoreAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedStoreAppConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidManagedStoreAppConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedStoreAppConfiguration();
    }
    /**
     * Gets the appSupportsOemConfig property value. Whether or not this AppConfig is an OEMConfig policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppSupportsOemConfig() {
        return this._appSupportsOemConfig;
    }
    /**
     * Gets the connectedAppsEnabled property value. Setting to specify whether to allow ConnectedApps experience for this app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectedAppsEnabled() {
        return this._connectedAppsEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidManagedStoreAppConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appSupportsOemConfig", (n) -> { currentObject.setAppSupportsOemConfig(n.getBooleanValue()); });
        deserializerMap.put("connectedAppsEnabled", (n) -> { currentObject.setConnectedAppsEnabled(n.getBooleanValue()); });
        deserializerMap.put("packageId", (n) -> { currentObject.setPackageId(n.getStringValue()); });
        deserializerMap.put("payloadJson", (n) -> { currentObject.setPayloadJson(n.getStringValue()); });
        deserializerMap.put("permissionActions", (n) -> { currentObject.setPermissionActions(n.getCollectionOfObjectValues(AndroidPermissionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("profileApplicability", (n) -> { currentObject.setProfileApplicability(n.getEnumValue(AndroidProfileApplicability.class)); });
        return deserializerMap;
    }
    /**
     * Gets the packageId property value. Android Enterprise app configuration package id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPackageId() {
        return this._packageId;
    }
    /**
     * Gets the payloadJson property value. Android Enterprise app configuration JSON payload.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadJson() {
        return this._payloadJson;
    }
    /**
     * Gets the permissionActions property value. List of Android app permissions and corresponding permission actions.
     * @return a androidPermissionAction
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidPermissionAction> getPermissionActions() {
        return this._permissionActions;
    }
    /**
     * Gets the profileApplicability property value. Android profile applicability
     * @return a androidProfileApplicability
     */
    @javax.annotation.Nullable
    public AndroidProfileApplicability getProfileApplicability() {
        return this._profileApplicability;
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
        writer.writeBooleanValue("appSupportsOemConfig", this.getAppSupportsOemConfig());
        writer.writeBooleanValue("connectedAppsEnabled", this.getConnectedAppsEnabled());
        writer.writeStringValue("packageId", this.getPackageId());
        writer.writeStringValue("payloadJson", this.getPayloadJson());
        writer.writeCollectionOfObjectValues("permissionActions", this.getPermissionActions());
        writer.writeEnumValue("profileApplicability", this.getProfileApplicability());
    }
    /**
     * Sets the appSupportsOemConfig property value. Whether or not this AppConfig is an OEMConfig policy.
     * @param value Value to set for the appSupportsOemConfig property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppSupportsOemConfig(@javax.annotation.Nullable final Boolean value) {
        this._appSupportsOemConfig = value;
    }
    /**
     * Sets the connectedAppsEnabled property value. Setting to specify whether to allow ConnectedApps experience for this app.
     * @param value Value to set for the connectedAppsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedAppsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._connectedAppsEnabled = value;
    }
    /**
     * Sets the packageId property value. Android Enterprise app configuration package id.
     * @param value Value to set for the packageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPackageId(@javax.annotation.Nullable final String value) {
        this._packageId = value;
    }
    /**
     * Sets the payloadJson property value. Android Enterprise app configuration JSON payload.
     * @param value Value to set for the payloadJson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadJson(@javax.annotation.Nullable final String value) {
        this._payloadJson = value;
    }
    /**
     * Sets the permissionActions property value. List of Android app permissions and corresponding permission actions.
     * @param value Value to set for the permissionActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionActions(@javax.annotation.Nullable final java.util.List<AndroidPermissionAction> value) {
        this._permissionActions = value;
    }
    /**
     * Sets the profileApplicability property value. Android profile applicability
     * @param value Value to set for the profileApplicability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileApplicability(@javax.annotation.Nullable final AndroidProfileApplicability value) {
        this._profileApplicability = value;
    }
}

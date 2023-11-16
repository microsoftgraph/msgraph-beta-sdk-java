package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Mobile App Intent and Install State for a given device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppIntentAndStateDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new MobileAppIntentAndStateDetail and sets the default values.
     */
    public MobileAppIntentAndStateDetail() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppIntentAndStateDetail
     */
    @jakarta.annotation.Nonnull
    public static MobileAppIntentAndStateDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppIntentAndStateDetail();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the applicationId property value. MobieApp identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApplicationId() {
        return this.BackingStore.get("applicationId");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the displayName property value. The admin provided or imported title of the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the displayVersion property value. Human readable version of the application
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayVersion() {
        return this.BackingStore.get("displayVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("applicationId", (n) -> { this.setApplicationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("installState", (n) -> { this.setInstallState(n.getEnumValue(ResultantAppState.class)); });
        deserializerMap.put("mobileAppIntent", (n) -> { this.setMobileAppIntent(n.getEnumValue(MobileAppIntent.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("supportedDeviceTypes", (n) -> { this.setSupportedDeviceTypes(n.getCollectionOfObjectValues(MobileAppSupportedDeviceType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @return a ResultantAppState
     */
    @jakarta.annotation.Nullable
    public ResultantAppState getInstallState() {
        return this.BackingStore.get("installState");
    }
    /**
     * Gets the mobileAppIntent property value. Indicates the status of the mobile app on the device.
     * @return a MobileAppIntent
     */
    @jakarta.annotation.Nullable
    public MobileAppIntent getMobileAppIntent() {
        return this.BackingStore.get("mobileAppIntent");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the supportedDeviceTypes property value. The supported platforms for the app.
     * @return a java.util.List<MobileAppSupportedDeviceType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppSupportedDeviceType> getSupportedDeviceTypes() {
        return this.BackingStore.get("supportedDeviceTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicationId", this.getApplicationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeEnumValue("installState", this.getInstallState());
        writer.writeEnumValue("mobileAppIntent", this.getMobileAppIntent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("supportedDeviceTypes", this.getSupportedDeviceTypes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the applicationId property value. MobieApp identifier.
     * @param value Value to set for the applicationId property.
     */
    public void setApplicationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("applicationId", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the displayName property value. The admin provided or imported title of the app.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the displayVersion property value. Human readable version of the application
     * @param value Value to set for the displayVersion property.
     */
    public void setDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayVersion", value);
    }
    /**
     * Sets the installState property value. A list of possible states for application status on an individual device. When devices contact the Intune service and find targeted application enforcement intent, the status of the enforcement is recorded and becomes accessible in the Graph API. Since the application status is identified during device interaction with the Intune service, status records do not immediately appear upon application group assignment; it is created only after the assignment is evaluated in the service and devices start receiving the policy during check-ins.
     * @param value Value to set for the installState property.
     */
    public void setInstallState(@jakarta.annotation.Nullable final ResultantAppState value) {
        this.BackingStore.set("installState", value);
    }
    /**
     * Sets the mobileAppIntent property value. Indicates the status of the mobile app on the device.
     * @param value Value to set for the mobileAppIntent property.
     */
    public void setMobileAppIntent(@jakarta.annotation.Nullable final MobileAppIntent value) {
        this.BackingStore.set("mobileAppIntent", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the supportedDeviceTypes property value. The supported platforms for the app.
     * @param value Value to set for the supportedDeviceTypes property.
     */
    public void setSupportedDeviceTypes(@jakarta.annotation.Nullable final java.util.List<MobileAppSupportedDeviceType> value) {
        this.BackingStore.set("supportedDeviceTypes", value);
    }
}

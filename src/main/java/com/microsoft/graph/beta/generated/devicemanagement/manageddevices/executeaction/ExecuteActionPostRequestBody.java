package com.microsoft.graph.beta.devicemanagement.manageddevices.executeaction;

import com.microsoft.graph.beta.models.ManagedDeviceRemoteAction;
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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExecuteActionPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ExecuteActionPostRequestBody and sets the default values.
     */
    public ExecuteActionPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExecuteActionPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ExecuteActionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExecuteActionPostRequestBody();
    }
    /**
     * Gets the actionName property value. The actionName property
     * @return a ManagedDeviceRemoteAction
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceRemoteAction getActionName() {
        return this.backingStore.get("actionName");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the carrierUrl property value. The carrierUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCarrierUrl() {
        return this.backingStore.get("carrierUrl");
    }
    /**
     * Gets the deprovisionReason property value. The deprovisionReason property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeprovisionReason() {
        return this.backingStore.get("deprovisionReason");
    }
    /**
     * Gets the deviceIds property value. The deviceIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDeviceIds() {
        return this.backingStore.get("deviceIds");
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getEnumValue(ManagedDeviceRemoteAction::forValue)); });
        deserializerMap.put("carrierUrl", (n) -> { this.setCarrierUrl(n.getStringValue()); });
        deserializerMap.put("deprovisionReason", (n) -> { this.setDeprovisionReason(n.getStringValue()); });
        deserializerMap.put("deviceIds", (n) -> { this.setDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("keepEnrollmentData", (n) -> { this.setKeepEnrollmentData(n.getBooleanValue()); });
        deserializerMap.put("keepUserData", (n) -> { this.setKeepUserData(n.getBooleanValue()); });
        deserializerMap.put("notificationBody", (n) -> { this.setNotificationBody(n.getStringValue()); });
        deserializerMap.put("notificationTitle", (n) -> { this.setNotificationTitle(n.getStringValue()); });
        deserializerMap.put("organizationalUnitPath", (n) -> { this.setOrganizationalUnitPath(n.getStringValue()); });
        deserializerMap.put("persistEsimDataPlan", (n) -> { this.setPersistEsimDataPlan(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keepEnrollmentData property value. The keepEnrollmentData property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepEnrollmentData() {
        return this.backingStore.get("keepEnrollmentData");
    }
    /**
     * Gets the keepUserData property value. The keepUserData property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepUserData() {
        return this.backingStore.get("keepUserData");
    }
    /**
     * Gets the notificationBody property value. The notificationBody property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotificationBody() {
        return this.backingStore.get("notificationBody");
    }
    /**
     * Gets the notificationTitle property value. The notificationTitle property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotificationTitle() {
        return this.backingStore.get("notificationTitle");
    }
    /**
     * Gets the organizationalUnitPath property value. The organizationalUnitPath property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationalUnitPath() {
        return this.backingStore.get("organizationalUnitPath");
    }
    /**
     * Gets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPersistEsimDataPlan() {
        return this.backingStore.get("persistEsimDataPlan");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionName", this.getActionName());
        writer.writeStringValue("carrierUrl", this.getCarrierUrl());
        writer.writeStringValue("deprovisionReason", this.getDeprovisionReason());
        writer.writeCollectionOfPrimitiveValues("deviceIds", this.getDeviceIds());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeBooleanValue("keepEnrollmentData", this.getKeepEnrollmentData());
        writer.writeBooleanValue("keepUserData", this.getKeepUserData());
        writer.writeStringValue("notificationBody", this.getNotificationBody());
        writer.writeStringValue("notificationTitle", this.getNotificationTitle());
        writer.writeStringValue("organizationalUnitPath", this.getOrganizationalUnitPath());
        writer.writeBooleanValue("persistEsimDataPlan", this.getPersistEsimDataPlan());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. The actionName property
     * @param value Value to set for the actionName property.
     */
    public void setActionName(@jakarta.annotation.Nullable final ManagedDeviceRemoteAction value) {
        this.backingStore.set("actionName", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the carrierUrl property value. The carrierUrl property
     * @param value Value to set for the carrierUrl property.
     */
    public void setCarrierUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("carrierUrl", value);
    }
    /**
     * Sets the deprovisionReason property value. The deprovisionReason property
     * @param value Value to set for the deprovisionReason property.
     */
    public void setDeprovisionReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deprovisionReason", value);
    }
    /**
     * Sets the deviceIds property value. The deviceIds property
     * @param value Value to set for the deviceIds property.
     */
    public void setDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("deviceIds", value);
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the keepEnrollmentData property value. The keepEnrollmentData property
     * @param value Value to set for the keepEnrollmentData property.
     */
    public void setKeepEnrollmentData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("keepEnrollmentData", value);
    }
    /**
     * Sets the keepUserData property value. The keepUserData property
     * @param value Value to set for the keepUserData property.
     */
    public void setKeepUserData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("keepUserData", value);
    }
    /**
     * Sets the notificationBody property value. The notificationBody property
     * @param value Value to set for the notificationBody property.
     */
    public void setNotificationBody(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationBody", value);
    }
    /**
     * Sets the notificationTitle property value. The notificationTitle property
     * @param value Value to set for the notificationTitle property.
     */
    public void setNotificationTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationTitle", value);
    }
    /**
     * Sets the organizationalUnitPath property value. The organizationalUnitPath property
     * @param value Value to set for the organizationalUnitPath property.
     */
    public void setOrganizationalUnitPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationalUnitPath", value);
    }
    /**
     * Sets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @param value Value to set for the persistEsimDataPlan property.
     */
    public void setPersistEsimDataPlan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("persistEsimDataPlan", value);
    }
}

package com.microsoft.graph.beta.models;

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
public class CloudPcAutopilotConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPcAutopilotConfiguration} and sets the default values.
     */
    public CloudPcAutopilotConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcAutopilotConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcAutopilotConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcAutopilotConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the applicationTimeoutInMinutes property value. Indicates the number of minutes allowed for the Autopilot application to apply the device preparation profile (DPP) configurations to the device. If the Autopilot application doesn't finish within the specified time (applicationTimeoutInMinutes), the application error is added to the statusDetail property of the cloudPC object. The supported value is an integer between 10 and 360. Required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getApplicationTimeoutInMinutes() {
        return this.backingStore.get("applicationTimeoutInMinutes");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the devicePreparationProfileId property value. The unique identifier (ID) of the Autopilot device preparation profile (DPP) that links a Windows Autopilot device preparation policy to ensure that devices are ready for users after provisioning. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDevicePreparationProfileId() {
        return this.backingStore.get("devicePreparationProfileId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("applicationTimeoutInMinutes", (n) -> { this.setApplicationTimeoutInMinutes(n.getIntegerValue()); });
        deserializerMap.put("devicePreparationProfileId", (n) -> { this.setDevicePreparationProfileId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onFailureDeviceAccessDenied", (n) -> { this.setOnFailureDeviceAccessDenied(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the onFailureDeviceAccessDenied property value. Indicates whether the access to the device is allowed when the application of Autopilot device preparation profile (DPP) configurations fails or times out. If true, the status of the device is failed and the device is unable to access; otherwise, the status of the device is provisionedWithWarnings and the device is allowed to access. The default value is false. Required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOnFailureDeviceAccessDenied() {
        return this.backingStore.get("onFailureDeviceAccessDenied");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("applicationTimeoutInMinutes", this.getApplicationTimeoutInMinutes());
        writer.writeStringValue("devicePreparationProfileId", this.getDevicePreparationProfileId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("onFailureDeviceAccessDenied", this.getOnFailureDeviceAccessDenied());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the applicationTimeoutInMinutes property value. Indicates the number of minutes allowed for the Autopilot application to apply the device preparation profile (DPP) configurations to the device. If the Autopilot application doesn't finish within the specified time (applicationTimeoutInMinutes), the application error is added to the statusDetail property of the cloudPC object. The supported value is an integer between 10 and 360. Required.
     * @param value Value to set for the applicationTimeoutInMinutes property.
     */
    public void setApplicationTimeoutInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("applicationTimeoutInMinutes", value);
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
     * Sets the devicePreparationProfileId property value. The unique identifier (ID) of the Autopilot device preparation profile (DPP) that links a Windows Autopilot device preparation policy to ensure that devices are ready for users after provisioning. Required.
     * @param value Value to set for the devicePreparationProfileId property.
     */
    public void setDevicePreparationProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("devicePreparationProfileId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the onFailureDeviceAccessDenied property value. Indicates whether the access to the device is allowed when the application of Autopilot device preparation profile (DPP) configurations fails or times out. If true, the status of the device is failed and the device is unable to access; otherwise, the status of the device is provisionedWithWarnings and the device is allowed to access. The default value is false. Required.
     * @param value Value to set for the onFailureDeviceAccessDenied property.
     */
    public void setOnFailureDeviceAccessDenied(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("onFailureDeviceAccessDenied", value);
    }
}

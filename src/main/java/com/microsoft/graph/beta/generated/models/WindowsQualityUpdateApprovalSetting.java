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
/**
 * Entity to record approval settings for windows quality update policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateApprovalSetting implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsQualityUpdateApprovalSetting} and sets the default values.
     */
    public WindowsQualityUpdateApprovalSetting() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateApprovalSetting}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateApprovalSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateApprovalSetting();
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
     * Gets the approvalMethodType property value. Enum type to describe the approval type for different type of quality updates.
     * @return a {@link WindowsQualityUpdatePolicyApprovalMethodType}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdatePolicyApprovalMethodType getApprovalMethodType() {
        return this.backingStore.get("approvalMethodType");
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
     * Gets the deferredDeploymentInDay property value. The deferral days for auto approval type, not applicable for manual approve
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeferredDeploymentInDay() {
        return this.backingStore.get("deferredDeploymentInDay");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("approvalMethodType", (n) -> { this.setApprovalMethodType(n.getEnumValue(WindowsQualityUpdatePolicyApprovalMethodType::forValue)); });
        deserializerMap.put("deferredDeploymentInDay", (n) -> { this.setDeferredDeploymentInDay(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("windowsQualityUpdateCadence", (n) -> { this.setWindowsQualityUpdateCadence(n.getEnumValue(WindowsQualityUpdateCadence::forValue)); });
        deserializerMap.put("windowsQualityUpdateCategory", (n) -> { this.setWindowsQualityUpdateCategory(n.getEnumValue(WindowsQualityUpdateCategory::forValue)); });
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
     * Gets the windowsQualityUpdateCadence property value. The publishing cadence of the quality update. Possible values are: monthly, outOfBand. This property cannot be modified and is automatically populated when the catalog is created.
     * @return a {@link WindowsQualityUpdateCadence}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateCadence getWindowsQualityUpdateCadence() {
        return this.backingStore.get("windowsQualityUpdateCadence");
    }
    /**
     * Gets the windowsQualityUpdateCategory property value. Windows quality update category
     * @return a {@link WindowsQualityUpdateCategory}
     */
    @jakarta.annotation.Nullable
    public WindowsQualityUpdateCategory getWindowsQualityUpdateCategory() {
        return this.backingStore.get("windowsQualityUpdateCategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("approvalMethodType", this.getApprovalMethodType());
        writer.writeIntegerValue("deferredDeploymentInDay", this.getDeferredDeploymentInDay());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("windowsQualityUpdateCadence", this.getWindowsQualityUpdateCadence());
        writer.writeEnumValue("windowsQualityUpdateCategory", this.getWindowsQualityUpdateCategory());
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
     * Sets the approvalMethodType property value. Enum type to describe the approval type for different type of quality updates.
     * @param value Value to set for the approvalMethodType property.
     */
    public void setApprovalMethodType(@jakarta.annotation.Nullable final WindowsQualityUpdatePolicyApprovalMethodType value) {
        this.backingStore.set("approvalMethodType", value);
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
     * Sets the deferredDeploymentInDay property value. The deferral days for auto approval type, not applicable for manual approve
     * @param value Value to set for the deferredDeploymentInDay property.
     */
    public void setDeferredDeploymentInDay(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deferredDeploymentInDay", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the windowsQualityUpdateCadence property value. The publishing cadence of the quality update. Possible values are: monthly, outOfBand. This property cannot be modified and is automatically populated when the catalog is created.
     * @param value Value to set for the windowsQualityUpdateCadence property.
     */
    public void setWindowsQualityUpdateCadence(@jakarta.annotation.Nullable final WindowsQualityUpdateCadence value) {
        this.backingStore.set("windowsQualityUpdateCadence", value);
    }
    /**
     * Sets the windowsQualityUpdateCategory property value. Windows quality update category
     * @param value Value to set for the windowsQualityUpdateCategory property.
     */
    public void setWindowsQualityUpdateCategory(@jakarta.annotation.Nullable final WindowsQualityUpdateCategory value) {
        this.backingStore.set("windowsQualityUpdateCategory", value);
    }
}

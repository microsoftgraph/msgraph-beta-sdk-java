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
 * Base type for assignment targets.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAndAppManagementAssignmentTarget implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceAndAppManagementAssignmentTarget and sets the default values.
     */
    public DeviceAndAppManagementAssignmentTarget() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nonnull
    public static DeviceAndAppManagementAssignmentTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.allDevicesAssignmentTarget": return new AllDevicesAssignmentTarget();
                case "#microsoft.graph.allLicensedUsersAssignmentTarget": return new AllLicensedUsersAssignmentTarget();
                case "#microsoft.graph.androidFotaDeploymentAssignmentTarget": return new AndroidFotaDeploymentAssignmentTarget();
                case "#microsoft.graph.configurationManagerCollectionAssignmentTarget": return new ConfigurationManagerCollectionAssignmentTarget();
                case "#microsoft.graph.exclusionGroupAssignmentTarget": return new ExclusionGroupAssignmentTarget();
                case "#microsoft.graph.groupAssignmentTarget": return new GroupAssignmentTarget();
                case "#microsoft.graph.scopeTagGroupAssignmentTarget": return new ScopeTagGroupAssignmentTarget();
            }
        }
        return new DeviceAndAppManagementAssignmentTarget();
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
     * Gets the deviceAndAppManagementAssignmentFilterId property value. The Id of the filter for the target assignment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceAndAppManagementAssignmentFilterId() {
        return this.backingStore.get("deviceAndAppManagementAssignmentFilterId");
    }
    /**
     * Gets the deviceAndAppManagementAssignmentFilterType property value. Represents type of the assignment filter.
     * @return a DeviceAndAppManagementAssignmentFilterType
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getDeviceAndAppManagementAssignmentFilterType() {
        return this.backingStore.get("deviceAndAppManagementAssignmentFilterType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("deviceAndAppManagementAssignmentFilterId", (n) -> { this.setDeviceAndAppManagementAssignmentFilterId(n.getStringValue()); });
        deserializerMap.put("deviceAndAppManagementAssignmentFilterType", (n) -> { this.setDeviceAndAppManagementAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceAndAppManagementAssignmentFilterId", this.getDeviceAndAppManagementAssignmentFilterId());
        writer.writeEnumValue("deviceAndAppManagementAssignmentFilterType", this.getDeviceAndAppManagementAssignmentFilterType());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the deviceAndAppManagementAssignmentFilterId property value. The Id of the filter for the target assignment.
     * @param value Value to set for the deviceAndAppManagementAssignmentFilterId property.
     */
    public void setDeviceAndAppManagementAssignmentFilterId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceAndAppManagementAssignmentFilterId", value);
    }
    /**
     * Sets the deviceAndAppManagementAssignmentFilterType property value. Represents type of the assignment filter.
     * @param value Value to set for the deviceAndAppManagementAssignmentFilterType property.
     */
    public void setDeviceAndAppManagementAssignmentFilterType(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this.backingStore.set("deviceAndAppManagementAssignmentFilterType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

package com.microsoft.graph.devicemanagement.devicecustomattributeshellscripts.item.assign;

import com.microsoft.graph.models.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
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
public class AssignPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new AssignPostRequestBody and sets the default values.
     */
    public AssignPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
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
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the deviceManagementScriptAssignments property value. The deviceManagementScriptAssignments property
     * @return a java.util.List<DeviceManagementScriptAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptAssignment> getDeviceManagementScriptAssignments() {
        return this.BackingStore.get("deviceManagementScriptAssignments");
    }
    /**
     * Gets the deviceManagementScriptGroupAssignments property value. The deviceManagementScriptGroupAssignments property
     * @return a java.util.List<DeviceManagementScriptGroupAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> getDeviceManagementScriptGroupAssignments() {
        return this.BackingStore.get("deviceManagementScriptGroupAssignments");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("deviceManagementScriptAssignments", (n) -> { this.setDeviceManagementScriptAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementScriptGroupAssignments", (n) -> { this.setDeviceManagementScriptGroupAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptGroupAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceManagementScriptAssignments", this.getDeviceManagementScriptAssignments());
        writer.writeCollectionOfObjectValues("deviceManagementScriptGroupAssignments", this.getDeviceManagementScriptGroupAssignments());
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
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the deviceManagementScriptAssignments property value. The deviceManagementScriptAssignments property
     * @param value Value to set for the deviceManagementScriptAssignments property.
     */
    public void setDeviceManagementScriptAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this.BackingStore.set("deviceManagementScriptAssignments", value);
    }
    /**
     * Sets the deviceManagementScriptGroupAssignments property value. The deviceManagementScriptGroupAssignments property
     * @param value Value to set for the deviceManagementScriptGroupAssignments property.
     */
    public void setDeviceManagementScriptGroupAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this.BackingStore.set("deviceManagementScriptGroupAssignments", value);
    }
}

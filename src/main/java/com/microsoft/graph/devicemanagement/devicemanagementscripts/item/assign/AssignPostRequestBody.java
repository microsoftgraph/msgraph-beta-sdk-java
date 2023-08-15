package com.microsoft.graph.devicemanagement.devicemanagementscripts.item.assign;

import com.microsoft.graph.models.DeviceManagementScriptAssignment;
import com.microsoft.graph.models.DeviceManagementScriptGroupAssignment;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AssignPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceManagementScriptAssignments property
     */
    private java.util.List<DeviceManagementScriptAssignment> deviceManagementScriptAssignments;
    /**
     * The deviceManagementScriptGroupAssignments property
     */
    private java.util.List<DeviceManagementScriptGroupAssignment> deviceManagementScriptGroupAssignments;
    /**
     * Instantiates a new assignPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AssignPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AssignPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceManagementScriptAssignments property value. The deviceManagementScriptAssignments property
     * @return a deviceManagementScriptAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptAssignment> getDeviceManagementScriptAssignments() {
        return this.deviceManagementScriptAssignments;
    }
    /**
     * Gets the deviceManagementScriptGroupAssignments property value. The deviceManagementScriptGroupAssignments property
     * @return a deviceManagementScriptGroupAssignment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> getDeviceManagementScriptGroupAssignments() {
        return this.deviceManagementScriptGroupAssignments;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceManagementScriptAssignments", this.getDeviceManagementScriptAssignments());
        writer.writeCollectionOfObjectValues("deviceManagementScriptGroupAssignments", this.getDeviceManagementScriptGroupAssignments());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceManagementScriptAssignments property value. The deviceManagementScriptAssignments property
     * @param value Value to set for the deviceManagementScriptAssignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceManagementScriptAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this.deviceManagementScriptAssignments = value;
    }
    /**
     * Sets the deviceManagementScriptGroupAssignments property value. The deviceManagementScriptGroupAssignments property
     * @param value Value to set for the deviceManagementScriptGroupAssignments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceManagementScriptGroupAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this.deviceManagementScriptGroupAssignments = value;
    }
}

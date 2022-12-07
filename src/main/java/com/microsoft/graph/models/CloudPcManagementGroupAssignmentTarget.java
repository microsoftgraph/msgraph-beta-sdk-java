package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcManagementGroupAssignmentTarget extends CloudPcManagementAssignmentTarget implements Parsable {
    /** The id of the assignment's target group */
    private String _groupId;
    /** The servicePlanId property */
    private String _servicePlanId;
    /**
     * Instantiates a new CloudPcManagementGroupAssignmentTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcManagementGroupAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcManagementGroupAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcManagementGroupAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static CloudPcManagementGroupAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcManagementGroupAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The id of the assignment's target group
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this._groupId;
    }
    /**
     * Gets the servicePlanId property value. The servicePlanId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanId() {
        return this._servicePlanId;
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
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
    }
    /**
     * Sets the groupId property value. The id of the assignment's target group
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this._groupId = value;
    }
    /**
     * Sets the servicePlanId property value. The servicePlanId property
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanId(@javax.annotation.Nullable final String value) {
        this._servicePlanId = value;
    }
}

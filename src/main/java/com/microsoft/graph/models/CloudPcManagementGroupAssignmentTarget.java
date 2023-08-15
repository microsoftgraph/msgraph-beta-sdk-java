package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcManagementGroupAssignmentTarget extends CloudPcManagementAssignmentTarget implements Parsable {
    /**
     * The ID of the target group for the assignment.
     */
    private String groupId;
    /**
     * The unique identifier for the service plan that indicates which size of the Cloud PC to provision for the user. Use a null value, when the provisioningType is dedicated.
     */
    private String servicePlanId;
    /**
     * Instantiates a new cloudPcManagementGroupAssignmentTarget and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CloudPcManagementGroupAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcManagementGroupAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcManagementGroupAssignmentTarget
     */
    @jakarta.annotation.Nonnull
    public static CloudPcManagementGroupAssignmentTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcManagementGroupAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The ID of the target group for the assignment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the servicePlanId property value. The unique identifier for the service plan that indicates which size of the Cloud PC to provision for the user. Use a null value, when the provisioningType is dedicated.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.servicePlanId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
    }
    /**
     * Sets the groupId property value. The ID of the target group for the assignment.
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the servicePlanId property value. The unique identifier for the service plan that indicates which size of the Cloud PC to provision for the user. Use a null value, when the provisioningType is dedicated.
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.servicePlanId = value;
    }
}

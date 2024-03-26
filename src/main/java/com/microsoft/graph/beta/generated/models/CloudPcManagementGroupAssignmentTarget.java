package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcManagementGroupAssignmentTarget extends CloudPcManagementAssignmentTarget implements Parsable {
    /**
     * Instantiates a new {@link CloudPcManagementGroupAssignmentTarget} and sets the default values.
     */
    public CloudPcManagementGroupAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcManagementGroupAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcManagementGroupAssignmentTarget}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcManagementGroupAssignmentTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcManagementGroupAssignmentTarget();
    }
    /**
     * Gets the allotmentDisplayName property value. The allotmentDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAllotmentDisplayName() {
        return this.backingStore.get("allotmentDisplayName");
    }
    /**
     * Gets the allotmentLicensesCount property value. The allotmentLicensesCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAllotmentLicensesCount() {
        return this.backingStore.get("allotmentLicensesCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allotmentDisplayName", (n) -> { this.setAllotmentDisplayName(n.getStringValue()); });
        deserializerMap.put("allotmentLicensesCount", (n) -> { this.setAllotmentLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The ID of the target group for the assignment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Gets the servicePlanId property value. The unique identifier for the service plan that indicates which size of the Cloud PC to provision for the user. Use a null value, when the provisioningType is dedicated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.backingStore.get("servicePlanId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("allotmentDisplayName", this.getAllotmentDisplayName());
        writer.writeIntegerValue("allotmentLicensesCount", this.getAllotmentLicensesCount());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
    }
    /**
     * Sets the allotmentDisplayName property value. The allotmentDisplayName property
     * @param value Value to set for the allotmentDisplayName property.
     */
    public void setAllotmentDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("allotmentDisplayName", value);
    }
    /**
     * Sets the allotmentLicensesCount property value. The allotmentLicensesCount property
     * @param value Value to set for the allotmentLicensesCount property.
     */
    public void setAllotmentLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("allotmentLicensesCount", value);
    }
    /**
     * Sets the groupId property value. The ID of the target group for the assignment.
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
    /**
     * Sets the servicePlanId property value. The unique identifier for the service plan that indicates which size of the Cloud PC to provision for the user. Use a null value, when the provisioningType is dedicated.
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanId", value);
    }
}

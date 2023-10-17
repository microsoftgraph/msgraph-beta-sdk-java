package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity represents a single payload with requested assignment filter Id
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PayloadByFilter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents type of the assignment filter.
     */
    private DeviceAndAppManagementAssignmentFilterType assignmentFilterType;
    /**
     * The Azure AD security group ID
     */
    private String groupId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The policy identifier
     */
    private String payloadId;
    /**
     * This enum represents associated assignment payload type
     */
    private AssociatedAssignmentPayloadType payloadType;
    /**
     * Instantiates a new PayloadByFilter and sets the default values.
     */
    public PayloadByFilter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PayloadByFilter
     */
    @jakarta.annotation.Nonnull
    public static PayloadByFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PayloadByFilter();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the assignmentFilterType property value. Represents type of the assignment filter.
     * @return a DeviceAndAppManagementAssignmentFilterType
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getAssignmentFilterType() {
        return this.assignmentFilterType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("assignmentFilterType", (n) -> { this.setAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType.class)); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("payloadId", (n) -> { this.setPayloadId(n.getStringValue()); });
        deserializerMap.put("payloadType", (n) -> { this.setPayloadType(n.getEnumValue(AssociatedAssignmentPayloadType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The Azure AD security group ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the payloadId property value. The policy identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPayloadId() {
        return this.payloadId;
    }
    /**
     * Gets the payloadType property value. This enum represents associated assignment payload type
     * @return a AssociatedAssignmentPayloadType
     */
    @jakarta.annotation.Nullable
    public AssociatedAssignmentPayloadType getPayloadType() {
        return this.payloadType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("assignmentFilterType", this.getAssignmentFilterType());
        writer.writeStringValue("groupId", this.getGroupId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("payloadId", this.getPayloadId());
        writer.writeEnumValue("payloadType", this.getPayloadType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignmentFilterType property value. Represents type of the assignment filter.
     * @param value Value to set for the assignmentFilterType property.
     */
    public void setAssignmentFilterType(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this.assignmentFilterType = value;
    }
    /**
     * Sets the groupId property value. The Azure AD security group ID
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.groupId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the payloadId property value. The policy identifier
     * @param value Value to set for the payloadId property.
     */
    public void setPayloadId(@jakarta.annotation.Nullable final String value) {
        this.payloadId = value;
    }
    /**
     * Sets the payloadType property value. This enum represents associated assignment payload type
     * @param value Value to set for the payloadType property.
     */
    public void setPayloadType(@jakarta.annotation.Nullable final AssociatedAssignmentPayloadType value) {
        this.payloadType = value;
    }
}

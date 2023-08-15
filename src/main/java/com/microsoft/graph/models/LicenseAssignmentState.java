package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class LicenseAssignmentState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the license is directly-assigned or inherited from a group. If directly-assigned, this field is null; if inherited through a group membership, this field contains the ID of the group. Read-Only.
     */
    private String assignedByGroup;
    /**
     * The service plans that are disabled in this assignment. Read-Only.
     */
    private java.util.List<UUID> disabledPlans;
    /**
     * License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.
     */
    private String error;
    /**
     * The timestamp when the state of the license assignment was last updated.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The unique identifier for the SKU. Read-Only.
     */
    private UUID skuId;
    /**
     * Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.
     */
    private String state;
    /**
     * Instantiates a new licenseAssignmentState and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public LicenseAssignmentState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a licenseAssignmentState
     */
    @jakarta.annotation.Nonnull
    public static LicenseAssignmentState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LicenseAssignmentState();
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
     * Gets the assignedByGroup property value. Indicates whether the license is directly-assigned or inherited from a group. If directly-assigned, this field is null; if inherited through a group membership, this field contains the ID of the group. Read-Only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignedByGroup() {
        return this.assignedByGroup;
    }
    /**
     * Gets the disabledPlans property value. The service plans that are disabled in this assignment. Read-Only.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getDisabledPlans() {
        return this.disabledPlans;
    }
    /**
     * Gets the error property value. License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("assignedByGroup", (n) -> { this.setAssignedByGroup(n.getStringValue()); });
        deserializerMap.put("disabledPlans", (n) -> { this.setDisabledPlans(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getUUIDValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The timestamp when the state of the license assignment was last updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the skuId property value. The unique identifier for the SKU. Read-Only.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getSkuId() {
        return this.skuId;
    }
    /**
     * Gets the state property value. Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedByGroup", this.getAssignedByGroup());
        writer.writeCollectionOfPrimitiveValues("disabledPlans", this.getDisabledPlans());
        writer.writeStringValue("error", this.getError());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("skuId", this.getSkuId());
        writer.writeStringValue("state", this.getState());
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
     * Sets the assignedByGroup property value. Indicates whether the license is directly-assigned or inherited from a group. If directly-assigned, this field is null; if inherited through a group membership, this field contains the ID of the group. Read-Only.
     * @param value Value to set for the assignedByGroup property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignedByGroup(@jakarta.annotation.Nullable final String value) {
        this.assignedByGroup = value;
    }
    /**
     * Sets the disabledPlans property value. The service plans that are disabled in this assignment. Read-Only.
     * @param value Value to set for the disabledPlans property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisabledPlans(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.disabledPlans = value;
    }
    /**
     * Sets the error property value. License assignment failure error. If the license is assigned successfully, this field will be Null. Read-Only. The possible values are CountViolation, MutuallyExclusiveViolation, DependencyViolation, ProhibitedInUsageLocationViolation, UniquenessViolation, and Other. For more information on how to identify and resolve license assignment errors see here.
     * @param value Value to set for the error property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The timestamp when the state of the license assignment was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the skuId property value. The unique identifier for the SKU. Read-Only.
     * @param value Value to set for the skuId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSkuId(@jakarta.annotation.Nullable final UUID value) {
        this.skuId = value;
    }
    /**
     * Sets the state property value. Indicate the current state of this assignment. Read-Only. The possible values are Active, ActiveWithError, Disabled, and Error.
     * @param value Value to set for the state property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
}

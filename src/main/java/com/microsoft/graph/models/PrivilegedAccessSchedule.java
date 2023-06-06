package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedAccessSchedule extends Entity implements Parsable {
    /** When the schedule was created. Optional. */
    private OffsetDateTime createdDateTime;
    /** The identifier of the access assignment or eligibility request that created this schedule. Optional. */
    private String createdUsing;
    /** When the schedule was last modified. Optional. */
    private OffsetDateTime modifiedDateTime;
    /** Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required. */
    private RequestSchedule scheduleInfo;
    /** The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional. */
    private String status;
    /**
     * Instantiates a new privilegedAccessSchedule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedAccessSchedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedAccessSchedule
     */
    @javax.annotation.Nonnull
    public static PrivilegedAccessSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.privilegedAccessGroupAssignmentSchedule": return new PrivilegedAccessGroupAssignmentSchedule();
                case "#microsoft.graph.privilegedAccessGroupEligibilitySchedule": return new PrivilegedAccessGroupEligibilitySchedule();
            }
        }
        return new PrivilegedAccessSchedule();
    }
    /**
     * Gets the createdDateTime property value. When the schedule was created. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the createdUsing property value. The identifier of the access assignment or eligibility request that created this schedule. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedUsing() {
        return this.createdUsing;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdUsing", (n) -> { this.setCreatedUsing(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. When the schedule was last modified. Optional.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the scheduleInfo property value. Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.scheduleInfo;
    }
    /**
     * Gets the status property value. The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("createdUsing", this.getCreatedUsing());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. When the schedule was created. Optional.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the createdUsing property value. The identifier of the access assignment or eligibility request that created this schedule. Optional.
     * @param value Value to set for the createdUsing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedUsing(@javax.annotation.Nullable final String value) {
        this.createdUsing = value;
    }
    /**
     * Sets the modifiedDateTime property value. When the schedule was last modified. Optional.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the scheduleInfo property value. Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduleInfo(@javax.annotation.Nullable final RequestSchedule value) {
        this.scheduleInfo = value;
    }
    /**
     * Sets the status property value. The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}

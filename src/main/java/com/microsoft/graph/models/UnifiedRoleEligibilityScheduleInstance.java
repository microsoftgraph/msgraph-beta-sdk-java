package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleEligibilityScheduleInstance extends UnifiedRoleScheduleInstanceBase implements Parsable {
    /** Time that the roleEligibilityScheduleInstance will expire. */
    private OffsetDateTime endDateTime;
    /** Membership type of the assignment. It can either be Inherited, Direct, or Group. */
    private String memberType;
    /** Identifier of the parent roleEligibilitySchedule for this instance. */
    private String roleEligibilityScheduleId;
    /** Time that the roleEligibilityScheduleInstance will start. */
    private OffsetDateTime startDateTime;
    /**
     * Instantiates a new unifiedRoleEligibilityScheduleInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilityScheduleInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleEligibilityScheduleInstance
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleEligibilityScheduleInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleEligibilityScheduleInstance();
    }
    /**
     * Gets the endDateTime property value. Time that the roleEligibilityScheduleInstance will expire.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getStringValue()); });
        deserializerMap.put("roleEligibilityScheduleId", (n) -> { this.setRoleEligibilityScheduleId(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the memberType property value. Membership type of the assignment. It can either be Inherited, Direct, or Group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the roleEligibilityScheduleId property value. Identifier of the parent roleEligibilitySchedule for this instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleEligibilityScheduleId() {
        return this.roleEligibilityScheduleId;
    }
    /**
     * Gets the startDateTime property value. Time that the roleEligibilityScheduleInstance will start.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
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
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeStringValue("roleEligibilityScheduleId", this.getRoleEligibilityScheduleId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the endDateTime property value. Time that the roleEligibilityScheduleInstance will expire.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the memberType property value. Membership type of the assignment. It can either be Inherited, Direct, or Group.
     * @param value Value to set for the memberType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberType(@javax.annotation.Nullable final String value) {
        this.memberType = value;
    }
    /**
     * Sets the roleEligibilityScheduleId property value. Identifier of the parent roleEligibilitySchedule for this instance.
     * @param value Value to set for the roleEligibilityScheduleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleEligibilityScheduleId(@javax.annotation.Nullable final String value) {
        this.roleEligibilityScheduleId = value;
    }
    /**
     * Sets the startDateTime property value. Time that the roleEligibilityScheduleInstance will start.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
}

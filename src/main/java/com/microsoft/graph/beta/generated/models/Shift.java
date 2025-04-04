package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Shift extends ChangeTrackedEntity implements Parsable {
    /**
     * Instantiates a new {@link Shift} and sets the default values.
     */
    public Shift() {
        super();
        this.setOdataType("#microsoft.graph.shift");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Shift}
     */
    @jakarta.annotation.Nonnull
    public static Shift createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shift();
    }
    /**
     * Gets the draftShift property value. Draft changes in the shift. Draft changes are only visible to managers. The changes are visible to employees when they&apos;re shared, which copies the changes from the draftShift to the sharedShift property.
     * @return a {@link ShiftItem}
     */
    @jakarta.annotation.Nullable
    public ShiftItem getDraftShift() {
        return this.backingStore.get("draftShift");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("draftShift", (n) -> { this.setDraftShift(n.getObjectValue(ShiftItem::createFromDiscriminatorValue)); });
        deserializerMap.put("isStagedForDeletion", (n) -> { this.setIsStagedForDeletion(n.getBooleanValue()); });
        deserializerMap.put("schedulingGroupId", (n) -> { this.setSchedulingGroupId(n.getStringValue()); });
        deserializerMap.put("schedulingGroupInfo", (n) -> { this.setSchedulingGroupInfo(n.getObjectValue(SchedulingGroupInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedShift", (n) -> { this.setSharedShift(n.getObjectValue(ShiftItem::createFromDiscriminatorValue)); });
        deserializerMap.put("teamInfo", (n) -> { this.setTeamInfo(n.getObjectValue(ShiftsTeamInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userInfo", (n) -> { this.setUserInfo(n.getObjectValue(ShiftsUserInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isStagedForDeletion property value. The shift is marked for deletion, a process that is finalized when the schedule is shared.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStagedForDeletion() {
        return this.backingStore.get("isStagedForDeletion");
    }
    /**
     * Gets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSchedulingGroupId() {
        return this.backingStore.get("schedulingGroupId");
    }
    /**
     * Gets the schedulingGroupInfo property value. Information of the scheduling group the shift is part of.
     * @return a {@link SchedulingGroupInfo}
     */
    @jakarta.annotation.Nullable
    public SchedulingGroupInfo getSchedulingGroupInfo() {
        return this.backingStore.get("schedulingGroupInfo");
    }
    /**
     * Gets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Updates to the sharedShift property send notifications to users in the Teams client.
     * @return a {@link ShiftItem}
     */
    @jakarta.annotation.Nullable
    public ShiftItem getSharedShift() {
        return this.backingStore.get("sharedShift");
    }
    /**
     * Gets the teamInfo property value. Information of the team that the shift is in.
     * @return a {@link ShiftsTeamInfo}
     */
    @jakarta.annotation.Nullable
    public ShiftsTeamInfo getTeamInfo() {
        return this.backingStore.get("teamInfo");
    }
    /**
     * Gets the userId property value. ID of the user assigned to the shift. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userInfo property value. Information of the user assigned to the shift.
     * @return a {@link ShiftsUserInfo}
     */
    @jakarta.annotation.Nullable
    public ShiftsUserInfo getUserInfo() {
        return this.backingStore.get("userInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("draftShift", this.getDraftShift());
        writer.writeBooleanValue("isStagedForDeletion", this.getIsStagedForDeletion());
        writer.writeStringValue("schedulingGroupId", this.getSchedulingGroupId());
        writer.writeObjectValue("sharedShift", this.getSharedShift());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the draftShift property value. Draft changes in the shift. Draft changes are only visible to managers. The changes are visible to employees when they&apos;re shared, which copies the changes from the draftShift to the sharedShift property.
     * @param value Value to set for the draftShift property.
     */
    public void setDraftShift(@jakarta.annotation.Nullable final ShiftItem value) {
        this.backingStore.set("draftShift", value);
    }
    /**
     * Sets the isStagedForDeletion property value. The shift is marked for deletion, a process that is finalized when the schedule is shared.
     * @param value Value to set for the isStagedForDeletion property.
     */
    public void setIsStagedForDeletion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStagedForDeletion", value);
    }
    /**
     * Sets the schedulingGroupId property value. ID of the scheduling group the shift is part of. Required.
     * @param value Value to set for the schedulingGroupId property.
     */
    public void setSchedulingGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("schedulingGroupId", value);
    }
    /**
     * Sets the schedulingGroupInfo property value. Information of the scheduling group the shift is part of.
     * @param value Value to set for the schedulingGroupInfo property.
     */
    public void setSchedulingGroupInfo(@jakarta.annotation.Nullable final SchedulingGroupInfo value) {
        this.backingStore.set("schedulingGroupInfo", value);
    }
    /**
     * Sets the sharedShift property value. The shared version of this shift that is viewable by both employees and managers. Updates to the sharedShift property send notifications to users in the Teams client.
     * @param value Value to set for the sharedShift property.
     */
    public void setSharedShift(@jakarta.annotation.Nullable final ShiftItem value) {
        this.backingStore.set("sharedShift", value);
    }
    /**
     * Sets the teamInfo property value. Information of the team that the shift is in.
     * @param value Value to set for the teamInfo property.
     */
    public void setTeamInfo(@jakarta.annotation.Nullable final ShiftsTeamInfo value) {
        this.backingStore.set("teamInfo", value);
    }
    /**
     * Sets the userId property value. ID of the user assigned to the shift. Required.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userInfo property value. Information of the user assigned to the shift.
     * @param value Value to set for the userInfo property.
     */
    public void setUserInfo(@jakarta.annotation.Nullable final ShiftsUserInfo value) {
        this.backingStore.set("userInfo", value);
    }
}

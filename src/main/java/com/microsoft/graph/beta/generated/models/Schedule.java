package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Schedule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Schedule} and sets the default values.
     */
    public Schedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Schedule}
     */
    @jakarta.annotation.Nonnull
    public static Schedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Schedule();
    }
    /**
     * Gets the activitiesIncludedWhenCopyingShiftsEnabled property value. Indicates whether copied shifts should include the activities. This property will be removed by November 20, 2027. Use isActivitiesIncludedWhenCopyingShiftsEnabled instead. activitiesIncludedWhenCopyingShiftsEnabled and isActivitiesIncludedWhenCopyingShiftsEnabled always have the same value, so setting one automatically sets the value for the other. If both are included in the request with different values, the value for isActivitiesIncludedWhenCopyingShiftsEnabled takes precedence.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getActivitiesIncludedWhenCopyingShiftsEnabled() {
        return this.backingStore.get("activitiesIncludedWhenCopyingShiftsEnabled");
    }
    /**
     * Gets the dayNotes property value. The day notes in the schedule.
     * @return a {@link java.util.List<DayNote>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DayNote> getDayNotes() {
        return this.backingStore.get("dayNotes");
    }
    /**
     * Gets the enabled property value. Indicates whether the schedule is enabled for the team. Required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.backingStore.get("enabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activitiesIncludedWhenCopyingShiftsEnabled", (n) -> { this.setActivitiesIncludedWhenCopyingShiftsEnabled(n.getBooleanValue()); });
        deserializerMap.put("dayNotes", (n) -> { this.setDayNotes(n.getCollectionOfObjectValues(DayNote::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("isActivitiesIncludedWhenCopyingShiftsEnabled", (n) -> { this.setIsActivitiesIncludedWhenCopyingShiftsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isCrossLocationShiftRequestApprovalRequired", (n) -> { this.setIsCrossLocationShiftRequestApprovalRequired(n.getBooleanValue()); });
        deserializerMap.put("isCrossLocationShiftsEnabled", (n) -> { this.setIsCrossLocationShiftsEnabled(n.getBooleanValue()); });
        deserializerMap.put("offerShiftRequests", (n) -> { this.setOfferShiftRequests(n.getCollectionOfObjectValues(OfferShiftRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("offerShiftRequestsEnabled", (n) -> { this.setOfferShiftRequestsEnabled(n.getBooleanValue()); });
        deserializerMap.put("openShiftChangeRequests", (n) -> { this.setOpenShiftChangeRequests(n.getCollectionOfObjectValues(OpenShiftChangeRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("openShifts", (n) -> { this.setOpenShifts(n.getCollectionOfObjectValues(OpenShift::createFromDiscriminatorValue)); });
        deserializerMap.put("openShiftsEnabled", (n) -> { this.setOpenShiftsEnabled(n.getBooleanValue()); });
        deserializerMap.put("provisionStatus", (n) -> { this.setProvisionStatus(n.getEnumValue(OperationStatus::forValue)); });
        deserializerMap.put("provisionStatusCode", (n) -> { this.setProvisionStatusCode(n.getStringValue()); });
        deserializerMap.put("schedulingGroups", (n) -> { this.setSchedulingGroups(n.getCollectionOfObjectValues(SchedulingGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("shifts", (n) -> { this.setShifts(n.getCollectionOfObjectValues(Shift::createFromDiscriminatorValue)); });
        deserializerMap.put("shiftsRoleDefinitions", (n) -> { this.setShiftsRoleDefinitions(n.getCollectionOfObjectValues(ShiftsRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("startDayOfWeek", (n) -> { this.setStartDayOfWeek(n.getEnumValue(DayOfWeek::forValue)); });
        deserializerMap.put("swapShiftsChangeRequests", (n) -> { this.setSwapShiftsChangeRequests(n.getCollectionOfObjectValues(SwapShiftsChangeRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("swapShiftsRequestsEnabled", (n) -> { this.setSwapShiftsRequestsEnabled(n.getBooleanValue()); });
        deserializerMap.put("timeCards", (n) -> { this.setTimeCards(n.getCollectionOfObjectValues(TimeCard::createFromDiscriminatorValue)); });
        deserializerMap.put("timeClockEnabled", (n) -> { this.setTimeClockEnabled(n.getBooleanValue()); });
        deserializerMap.put("timeClockSettings", (n) -> { this.setTimeClockSettings(n.getObjectValue(TimeClockSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("timeOffReasons", (n) -> { this.setTimeOffReasons(n.getCollectionOfObjectValues(TimeOffReason::createFromDiscriminatorValue)); });
        deserializerMap.put("timeOffRequests", (n) -> { this.setTimeOffRequests(n.getCollectionOfObjectValues(TimeOffRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("timeOffRequestsEnabled", (n) -> { this.setTimeOffRequestsEnabled(n.getBooleanValue()); });
        deserializerMap.put("timesOff", (n) -> { this.setTimesOff(n.getCollectionOfObjectValues(TimeOff::createFromDiscriminatorValue)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("workforceIntegrationIds", (n) -> { this.setWorkforceIntegrationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isActivitiesIncludedWhenCopyingShiftsEnabled property value. Indicates whether copied shifts include activities from the original shift.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActivitiesIncludedWhenCopyingShiftsEnabled() {
        return this.backingStore.get("isActivitiesIncludedWhenCopyingShiftsEnabled");
    }
    /**
     * Gets the isCrossLocationShiftRequestApprovalRequired property value. Indicates whether approval is required by a manager of this schedule for cross location shift requests.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCrossLocationShiftRequestApprovalRequired() {
        return this.backingStore.get("isCrossLocationShiftRequestApprovalRequired");
    }
    /**
     * Gets the isCrossLocationShiftsEnabled property value. Indicates whether the cross-location marketplace feature is enabled for this schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCrossLocationShiftsEnabled() {
        return this.backingStore.get("isCrossLocationShiftsEnabled");
    }
    /**
     * Gets the offerShiftRequests property value. The offer requests for shifts in the schedule.
     * @return a {@link java.util.List<OfferShiftRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OfferShiftRequest> getOfferShiftRequests() {
        return this.backingStore.get("offerShiftRequests");
    }
    /**
     * Gets the offerShiftRequestsEnabled property value. Indicates whether offer shift requests are enabled for the schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOfferShiftRequestsEnabled() {
        return this.backingStore.get("offerShiftRequestsEnabled");
    }
    /**
     * Gets the openShiftChangeRequests property value. The open shift requests in the schedule.
     * @return a {@link java.util.List<OpenShiftChangeRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OpenShiftChangeRequest> getOpenShiftChangeRequests() {
        return this.backingStore.get("openShiftChangeRequests");
    }
    /**
     * Gets the openShifts property value. The set of open shifts in a scheduling group in the schedule.
     * @return a {@link java.util.List<OpenShift>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OpenShift> getOpenShifts() {
        return this.backingStore.get("openShifts");
    }
    /**
     * Gets the openShiftsEnabled property value. Indicates whether open shifts are enabled for the schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOpenShiftsEnabled() {
        return this.backingStore.get("openShiftsEnabled");
    }
    /**
     * Gets the provisionStatus property value. The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
     * @return a {@link OperationStatus}
     */
    @jakarta.annotation.Nullable
    public OperationStatus getProvisionStatus() {
        return this.backingStore.get("provisionStatus");
    }
    /**
     * Gets the provisionStatusCode property value. Additional information about why schedule provisioning failed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisionStatusCode() {
        return this.backingStore.get("provisionStatusCode");
    }
    /**
     * Gets the schedulingGroups property value. The logical grouping of users in the schedule (usually by role).
     * @return a {@link java.util.List<SchedulingGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SchedulingGroup> getSchedulingGroups() {
        return this.backingStore.get("schedulingGroups");
    }
    /**
     * Gets the shifts property value. The shifts in the schedule.
     * @return a {@link java.util.List<Shift>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Shift> getShifts() {
        return this.backingStore.get("shifts");
    }
    /**
     * Gets the shiftsRoleDefinitions property value. The definitions of the roles in the schedule.
     * @return a {@link java.util.List<ShiftsRoleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShiftsRoleDefinition> getShiftsRoleDefinitions() {
        return this.backingStore.get("shiftsRoleDefinitions");
    }
    /**
     * Gets the startDayOfWeek property value. Indicates the start day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday.
     * @return a {@link DayOfWeek}
     */
    @jakarta.annotation.Nullable
    public DayOfWeek getStartDayOfWeek() {
        return this.backingStore.get("startDayOfWeek");
    }
    /**
     * Gets the swapShiftsChangeRequests property value. The swap requests for shifts in the schedule.
     * @return a {@link java.util.List<SwapShiftsChangeRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SwapShiftsChangeRequest> getSwapShiftsChangeRequests() {
        return this.backingStore.get("swapShiftsChangeRequests");
    }
    /**
     * Gets the swapShiftsRequestsEnabled property value. Indicates whether swap shifts requests are enabled for the schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSwapShiftsRequestsEnabled() {
        return this.backingStore.get("swapShiftsRequestsEnabled");
    }
    /**
     * Gets the timeCards property value. The time cards in the schedule.
     * @return a {@link java.util.List<TimeCard>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeCard> getTimeCards() {
        return this.backingStore.get("timeCards");
    }
    /**
     * Gets the timeClockEnabled property value. Indicates whether time clock is enabled for the schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTimeClockEnabled() {
        return this.backingStore.get("timeClockEnabled");
    }
    /**
     * Gets the timeClockSettings property value. The time clock location settings for this schedule.
     * @return a {@link TimeClockSettings}
     */
    @jakarta.annotation.Nullable
    public TimeClockSettings getTimeClockSettings() {
        return this.backingStore.get("timeClockSettings");
    }
    /**
     * Gets the timeOffReasons property value. The set of reasons for a time off in the schedule.
     * @return a {@link java.util.List<TimeOffReason>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeOffReason> getTimeOffReasons() {
        return this.backingStore.get("timeOffReasons");
    }
    /**
     * Gets the timeOffRequests property value. The time off requests in the schedule.
     * @return a {@link java.util.List<TimeOffRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeOffRequest> getTimeOffRequests() {
        return this.backingStore.get("timeOffRequests");
    }
    /**
     * Gets the timeOffRequestsEnabled property value. Indicates whether time off requests are enabled for the schedule.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTimeOffRequestsEnabled() {
        return this.backingStore.get("timeOffRequestsEnabled");
    }
    /**
     * Gets the timesOff property value. The instances of times off in the schedule.
     * @return a {@link java.util.List<TimeOff>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeOff> getTimesOff() {
        return this.backingStore.get("timesOff");
    }
    /**
     * Gets the timeZone property value. Indicates the time zone of the schedule team using tz database format. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.backingStore.get("timeZone");
    }
    /**
     * Gets the workforceIntegrationIds property value. The IDs for the workforce integrations associated with this schedule.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWorkforceIntegrationIds() {
        return this.backingStore.get("workforceIntegrationIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("activitiesIncludedWhenCopyingShiftsEnabled", this.getActivitiesIncludedWhenCopyingShiftsEnabled());
        writer.writeCollectionOfObjectValues("dayNotes", this.getDayNotes());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeBooleanValue("isActivitiesIncludedWhenCopyingShiftsEnabled", this.getIsActivitiesIncludedWhenCopyingShiftsEnabled());
        writer.writeBooleanValue("isCrossLocationShiftRequestApprovalRequired", this.getIsCrossLocationShiftRequestApprovalRequired());
        writer.writeBooleanValue("isCrossLocationShiftsEnabled", this.getIsCrossLocationShiftsEnabled());
        writer.writeCollectionOfObjectValues("offerShiftRequests", this.getOfferShiftRequests());
        writer.writeBooleanValue("offerShiftRequestsEnabled", this.getOfferShiftRequestsEnabled());
        writer.writeCollectionOfObjectValues("openShiftChangeRequests", this.getOpenShiftChangeRequests());
        writer.writeCollectionOfObjectValues("openShifts", this.getOpenShifts());
        writer.writeBooleanValue("openShiftsEnabled", this.getOpenShiftsEnabled());
        writer.writeCollectionOfObjectValues("schedulingGroups", this.getSchedulingGroups());
        writer.writeCollectionOfObjectValues("shifts", this.getShifts());
        writer.writeCollectionOfObjectValues("shiftsRoleDefinitions", this.getShiftsRoleDefinitions());
        writer.writeEnumValue("startDayOfWeek", this.getStartDayOfWeek());
        writer.writeCollectionOfObjectValues("swapShiftsChangeRequests", this.getSwapShiftsChangeRequests());
        writer.writeBooleanValue("swapShiftsRequestsEnabled", this.getSwapShiftsRequestsEnabled());
        writer.writeCollectionOfObjectValues("timeCards", this.getTimeCards());
        writer.writeBooleanValue("timeClockEnabled", this.getTimeClockEnabled());
        writer.writeObjectValue("timeClockSettings", this.getTimeClockSettings());
        writer.writeCollectionOfObjectValues("timeOffReasons", this.getTimeOffReasons());
        writer.writeCollectionOfObjectValues("timeOffRequests", this.getTimeOffRequests());
        writer.writeBooleanValue("timeOffRequestsEnabled", this.getTimeOffRequestsEnabled());
        writer.writeCollectionOfObjectValues("timesOff", this.getTimesOff());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeCollectionOfPrimitiveValues("workforceIntegrationIds", this.getWorkforceIntegrationIds());
    }
    /**
     * Sets the activitiesIncludedWhenCopyingShiftsEnabled property value. Indicates whether copied shifts should include the activities. This property will be removed by November 20, 2027. Use isActivitiesIncludedWhenCopyingShiftsEnabled instead. activitiesIncludedWhenCopyingShiftsEnabled and isActivitiesIncludedWhenCopyingShiftsEnabled always have the same value, so setting one automatically sets the value for the other. If both are included in the request with different values, the value for isActivitiesIncludedWhenCopyingShiftsEnabled takes precedence.
     * @param value Value to set for the activitiesIncludedWhenCopyingShiftsEnabled property.
     */
    public void setActivitiesIncludedWhenCopyingShiftsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("activitiesIncludedWhenCopyingShiftsEnabled", value);
    }
    /**
     * Sets the dayNotes property value. The day notes in the schedule.
     * @param value Value to set for the dayNotes property.
     */
    public void setDayNotes(@jakarta.annotation.Nullable final java.util.List<DayNote> value) {
        this.backingStore.set("dayNotes", value);
    }
    /**
     * Sets the enabled property value. Indicates whether the schedule is enabled for the team. Required.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enabled", value);
    }
    /**
     * Sets the isActivitiesIncludedWhenCopyingShiftsEnabled property value. Indicates whether copied shifts include activities from the original shift.
     * @param value Value to set for the isActivitiesIncludedWhenCopyingShiftsEnabled property.
     */
    public void setIsActivitiesIncludedWhenCopyingShiftsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActivitiesIncludedWhenCopyingShiftsEnabled", value);
    }
    /**
     * Sets the isCrossLocationShiftRequestApprovalRequired property value. Indicates whether approval is required by a manager of this schedule for cross location shift requests.
     * @param value Value to set for the isCrossLocationShiftRequestApprovalRequired property.
     */
    public void setIsCrossLocationShiftRequestApprovalRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCrossLocationShiftRequestApprovalRequired", value);
    }
    /**
     * Sets the isCrossLocationShiftsEnabled property value. Indicates whether the cross-location marketplace feature is enabled for this schedule.
     * @param value Value to set for the isCrossLocationShiftsEnabled property.
     */
    public void setIsCrossLocationShiftsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCrossLocationShiftsEnabled", value);
    }
    /**
     * Sets the offerShiftRequests property value. The offer requests for shifts in the schedule.
     * @param value Value to set for the offerShiftRequests property.
     */
    public void setOfferShiftRequests(@jakarta.annotation.Nullable final java.util.List<OfferShiftRequest> value) {
        this.backingStore.set("offerShiftRequests", value);
    }
    /**
     * Sets the offerShiftRequestsEnabled property value. Indicates whether offer shift requests are enabled for the schedule.
     * @param value Value to set for the offerShiftRequestsEnabled property.
     */
    public void setOfferShiftRequestsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("offerShiftRequestsEnabled", value);
    }
    /**
     * Sets the openShiftChangeRequests property value. The open shift requests in the schedule.
     * @param value Value to set for the openShiftChangeRequests property.
     */
    public void setOpenShiftChangeRequests(@jakarta.annotation.Nullable final java.util.List<OpenShiftChangeRequest> value) {
        this.backingStore.set("openShiftChangeRequests", value);
    }
    /**
     * Sets the openShifts property value. The set of open shifts in a scheduling group in the schedule.
     * @param value Value to set for the openShifts property.
     */
    public void setOpenShifts(@jakarta.annotation.Nullable final java.util.List<OpenShift> value) {
        this.backingStore.set("openShifts", value);
    }
    /**
     * Sets the openShiftsEnabled property value. Indicates whether open shifts are enabled for the schedule.
     * @param value Value to set for the openShiftsEnabled property.
     */
    public void setOpenShiftsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("openShiftsEnabled", value);
    }
    /**
     * Sets the provisionStatus property value. The status of the schedule provisioning. The possible values are notStarted, running, completed, failed.
     * @param value Value to set for the provisionStatus property.
     */
    public void setProvisionStatus(@jakarta.annotation.Nullable final OperationStatus value) {
        this.backingStore.set("provisionStatus", value);
    }
    /**
     * Sets the provisionStatusCode property value. Additional information about why schedule provisioning failed.
     * @param value Value to set for the provisionStatusCode property.
     */
    public void setProvisionStatusCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisionStatusCode", value);
    }
    /**
     * Sets the schedulingGroups property value. The logical grouping of users in the schedule (usually by role).
     * @param value Value to set for the schedulingGroups property.
     */
    public void setSchedulingGroups(@jakarta.annotation.Nullable final java.util.List<SchedulingGroup> value) {
        this.backingStore.set("schedulingGroups", value);
    }
    /**
     * Sets the shifts property value. The shifts in the schedule.
     * @param value Value to set for the shifts property.
     */
    public void setShifts(@jakarta.annotation.Nullable final java.util.List<Shift> value) {
        this.backingStore.set("shifts", value);
    }
    /**
     * Sets the shiftsRoleDefinitions property value. The definitions of the roles in the schedule.
     * @param value Value to set for the shiftsRoleDefinitions property.
     */
    public void setShiftsRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<ShiftsRoleDefinition> value) {
        this.backingStore.set("shiftsRoleDefinitions", value);
    }
    /**
     * Sets the startDayOfWeek property value. Indicates the start day of the week. The possible values are: sunday, monday, tuesday, wednesday, thursday, friday, saturday.
     * @param value Value to set for the startDayOfWeek property.
     */
    public void setStartDayOfWeek(@jakarta.annotation.Nullable final DayOfWeek value) {
        this.backingStore.set("startDayOfWeek", value);
    }
    /**
     * Sets the swapShiftsChangeRequests property value. The swap requests for shifts in the schedule.
     * @param value Value to set for the swapShiftsChangeRequests property.
     */
    public void setSwapShiftsChangeRequests(@jakarta.annotation.Nullable final java.util.List<SwapShiftsChangeRequest> value) {
        this.backingStore.set("swapShiftsChangeRequests", value);
    }
    /**
     * Sets the swapShiftsRequestsEnabled property value. Indicates whether swap shifts requests are enabled for the schedule.
     * @param value Value to set for the swapShiftsRequestsEnabled property.
     */
    public void setSwapShiftsRequestsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("swapShiftsRequestsEnabled", value);
    }
    /**
     * Sets the timeCards property value. The time cards in the schedule.
     * @param value Value to set for the timeCards property.
     */
    public void setTimeCards(@jakarta.annotation.Nullable final java.util.List<TimeCard> value) {
        this.backingStore.set("timeCards", value);
    }
    /**
     * Sets the timeClockEnabled property value. Indicates whether time clock is enabled for the schedule.
     * @param value Value to set for the timeClockEnabled property.
     */
    public void setTimeClockEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("timeClockEnabled", value);
    }
    /**
     * Sets the timeClockSettings property value. The time clock location settings for this schedule.
     * @param value Value to set for the timeClockSettings property.
     */
    public void setTimeClockSettings(@jakarta.annotation.Nullable final TimeClockSettings value) {
        this.backingStore.set("timeClockSettings", value);
    }
    /**
     * Sets the timeOffReasons property value. The set of reasons for a time off in the schedule.
     * @param value Value to set for the timeOffReasons property.
     */
    public void setTimeOffReasons(@jakarta.annotation.Nullable final java.util.List<TimeOffReason> value) {
        this.backingStore.set("timeOffReasons", value);
    }
    /**
     * Sets the timeOffRequests property value. The time off requests in the schedule.
     * @param value Value to set for the timeOffRequests property.
     */
    public void setTimeOffRequests(@jakarta.annotation.Nullable final java.util.List<TimeOffRequest> value) {
        this.backingStore.set("timeOffRequests", value);
    }
    /**
     * Sets the timeOffRequestsEnabled property value. Indicates whether time off requests are enabled for the schedule.
     * @param value Value to set for the timeOffRequestsEnabled property.
     */
    public void setTimeOffRequestsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("timeOffRequestsEnabled", value);
    }
    /**
     * Sets the timesOff property value. The instances of times off in the schedule.
     * @param value Value to set for the timesOff property.
     */
    public void setTimesOff(@jakarta.annotation.Nullable final java.util.List<TimeOff> value) {
        this.backingStore.set("timesOff", value);
    }
    /**
     * Sets the timeZone property value. Indicates the time zone of the schedule team using tz database format. Required.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeZone", value);
    }
    /**
     * Sets the workforceIntegrationIds property value. The IDs for the workforce integrations associated with this schedule.
     * @param value Value to set for the workforceIntegrationIds property.
     */
    public void setWorkforceIntegrationIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("workforceIntegrationIds", value);
    }
}

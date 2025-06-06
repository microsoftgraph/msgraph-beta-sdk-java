package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a staff member who provides services in a business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingStaffMember extends BookingPerson implements Parsable {
    /**
     * Instantiates a new {@link BookingStaffMember} and sets the default values.
     */
    public BookingStaffMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BookingStaffMember}
     */
    @jakarta.annotation.Nonnull
    public static BookingStaffMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingStaffMember();
    }
    /**
     * Gets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member&apos;s availability in their personal calendar in Microsoft 365, before making a booking.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAvailabilityIsAffectedByPersonalCalendar() {
        return this.backingStore.get("availabilityIsAffectedByPersonalCalendar");
    }
    /**
     * Gets the colorIndex property value. Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getColorIndex() {
        return this.backingStore.get("colorIndex");
    }
    /**
     * Gets the createdDateTime property value. The date, time and timezone when the staff member was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityIsAffectedByPersonalCalendar", (n) -> { this.setAvailabilityIsAffectedByPersonalCalendar(n.getBooleanValue()); });
        deserializerMap.put("colorIndex", (n) -> { this.setColorIndex(n.getIntegerValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isEmailNotificationEnabled", (n) -> { this.setIsEmailNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("membershipStatus", (n) -> { this.setMembershipStatus(n.getEnumValue(BookingStaffMembershipStatus::forValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BookingStaffRole::forValue)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("useBusinessHours", (n) -> { this.setUseBusinessHours(n.getBooleanValue()); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getCollectionOfObjectValues(BookingWorkHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEmailNotificationEnabled property value. Indicates that a staff members are  notified via email when a booking assigned to them is created or changed. The default value is true
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEmailNotificationEnabled() {
        return this.backingStore.get("isEmailNotificationEnabled");
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date, time and timezone when the staff member was last updated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the membershipStatus property value. The membershipStatus property
     * @return a {@link BookingStaffMembershipStatus}
     */
    @jakarta.annotation.Nullable
    public BookingStaffMembershipStatus getMembershipStatus() {
        return this.backingStore.get("membershipStatus");
    }
    /**
     * Gets the role property value. The role property
     * @return a {@link BookingStaffRole}
     */
    @jakarta.annotation.Nullable
    public BookingStaffRole getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.backingStore.get("timeZone");
    }
    /**
     * Gets the useBusinessHours property value. True means the staff member&apos;s availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member&apos;s workingHours property setting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseBusinessHours() {
        return this.backingStore.get("useBusinessHours");
    }
    /**
     * Gets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they&apos;re initialized to be the same as the businessHours property of the business.
     * @return a {@link java.util.List<BookingWorkHours>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingWorkHours> getWorkingHours() {
        return this.backingStore.get("workingHours");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("availabilityIsAffectedByPersonalCalendar", this.getAvailabilityIsAffectedByPersonalCalendar());
        writer.writeIntegerValue("colorIndex", this.getColorIndex());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isEmailNotificationEnabled", this.getIsEmailNotificationEnabled());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeEnumValue("membershipStatus", this.getMembershipStatus());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeBooleanValue("useBusinessHours", this.getUseBusinessHours());
        writer.writeCollectionOfObjectValues("workingHours", this.getWorkingHours());
    }
    /**
     * Sets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member&apos;s availability in their personal calendar in Microsoft 365, before making a booking.
     * @param value Value to set for the availabilityIsAffectedByPersonalCalendar property.
     */
    public void setAvailabilityIsAffectedByPersonalCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("availabilityIsAffectedByPersonalCalendar", value);
    }
    /**
     * Sets the colorIndex property value. Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     * @param value Value to set for the colorIndex property.
     */
    public void setColorIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("colorIndex", value);
    }
    /**
     * Sets the createdDateTime property value. The date, time and timezone when the staff member was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the isEmailNotificationEnabled property value. Indicates that a staff members are  notified via email when a booking assigned to them is created or changed. The default value is true
     * @param value Value to set for the isEmailNotificationEnabled property.
     */
    public void setIsEmailNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEmailNotificationEnabled", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date, time and timezone when the staff member was last updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the membershipStatus property value. The membershipStatus property
     * @param value Value to set for the membershipStatus property.
     */
    public void setMembershipStatus(@jakarta.annotation.Nullable final BookingStaffMembershipStatus value) {
        this.backingStore.set("membershipStatus", value);
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BookingStaffRole value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("timeZone", value);
    }
    /**
     * Sets the useBusinessHours property value. True means the staff member&apos;s availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member&apos;s workingHours property setting.
     * @param value Value to set for the useBusinessHours property.
     */
    public void setUseBusinessHours(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useBusinessHours", value);
    }
    /**
     * Sets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they&apos;re initialized to be the same as the businessHours property of the business.
     * @param value Value to set for the workingHours property.
     */
    public void setWorkingHours(@jakarta.annotation.Nullable final java.util.List<BookingWorkHours> value) {
        this.backingStore.set("workingHours", value);
    }
}

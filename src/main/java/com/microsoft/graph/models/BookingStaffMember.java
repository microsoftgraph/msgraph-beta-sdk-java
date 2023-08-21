package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a staff member who provides services in a business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BookingStaffMember extends BookingPerson implements Parsable {
    /**
     * True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     */
    private Boolean availabilityIsAffectedByPersonalCalendar;
    /**
     * Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     */
    private Integer colorIndex;
    /**
     * True indicates that a staff member will be notified via email when a booking assigned to them is created or changed.
     */
    private Boolean isEmailNotificationEnabled;
    /**
     * The membershipStatus property
     */
    private BookingStaffMembershipStatus membershipStatus;
    /**
     * The role property
     */
    private BookingStaffRole role;
    /**
     * The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     */
    private String timeZone;
    /**
     * True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     */
    private Boolean useBusinessHours;
    /**
     * The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     */
    private java.util.List<BookingWorkHours> workingHours;
    /**
     * Instantiates a new bookingStaffMember and sets the default values.
     */
    public BookingStaffMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingStaffMember
     */
    @jakarta.annotation.Nonnull
    public static BookingStaffMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingStaffMember();
    }
    /**
     * Gets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAvailabilityIsAffectedByPersonalCalendar() {
        return this.availabilityIsAffectedByPersonalCalendar;
    }
    /**
     * Gets the colorIndex property value. Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getColorIndex() {
        return this.colorIndex;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityIsAffectedByPersonalCalendar", (n) -> { this.setAvailabilityIsAffectedByPersonalCalendar(n.getBooleanValue()); });
        deserializerMap.put("colorIndex", (n) -> { this.setColorIndex(n.getIntegerValue()); });
        deserializerMap.put("isEmailNotificationEnabled", (n) -> { this.setIsEmailNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("membershipStatus", (n) -> { this.setMembershipStatus(n.getEnumValue(BookingStaffMembershipStatus.class)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BookingStaffRole.class)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("useBusinessHours", (n) -> { this.setUseBusinessHours(n.getBooleanValue()); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getCollectionOfObjectValues(BookingWorkHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEmailNotificationEnabled property value. True indicates that a staff member will be notified via email when a booking assigned to them is created or changed.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEmailNotificationEnabled() {
        return this.isEmailNotificationEnabled;
    }
    /**
     * Gets the membershipStatus property value. The membershipStatus property
     * @return a bookingStaffMembershipStatus
     */
    @jakarta.annotation.Nullable
    public BookingStaffMembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }
    /**
     * Gets the role property value. The role property
     * @return a bookingStaffRole
     */
    @jakarta.annotation.Nullable
    public BookingStaffRole getRole() {
        return this.role;
    }
    /**
     * Gets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Gets the useBusinessHours property value. True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseBusinessHours() {
        return this.useBusinessHours;
    }
    /**
     * Gets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     * @return a bookingWorkHours
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingWorkHours> getWorkingHours() {
        return this.workingHours;
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
        writer.writeBooleanValue("isEmailNotificationEnabled", this.getIsEmailNotificationEnabled());
        writer.writeEnumValue("membershipStatus", this.getMembershipStatus());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeBooleanValue("useBusinessHours", this.getUseBusinessHours());
        writer.writeCollectionOfObjectValues("workingHours", this.getWorkingHours());
    }
    /**
     * Sets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     * @param value Value to set for the availabilityIsAffectedByPersonalCalendar property.
     */
    public void setAvailabilityIsAffectedByPersonalCalendar(@jakarta.annotation.Nullable final Boolean value) {
        this.availabilityIsAffectedByPersonalCalendar = value;
    }
    /**
     * Sets the colorIndex property value. Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     * @param value Value to set for the colorIndex property.
     */
    public void setColorIndex(@jakarta.annotation.Nullable final Integer value) {
        this.colorIndex = value;
    }
    /**
     * Sets the isEmailNotificationEnabled property value. True indicates that a staff member will be notified via email when a booking assigned to them is created or changed.
     * @param value Value to set for the isEmailNotificationEnabled property.
     */
    public void setIsEmailNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEmailNotificationEnabled = value;
    }
    /**
     * Sets the membershipStatus property value. The membershipStatus property
     * @param value Value to set for the membershipStatus property.
     */
    public void setMembershipStatus(@jakarta.annotation.Nullable final BookingStaffMembershipStatus value) {
        this.membershipStatus = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BookingStaffRole value) {
        this.role = value;
    }
    /**
     * Sets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.timeZone = value;
    }
    /**
     * Sets the useBusinessHours property value. True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     * @param value Value to set for the useBusinessHours property.
     */
    public void setUseBusinessHours(@jakarta.annotation.Nullable final Boolean value) {
        this.useBusinessHours = value;
    }
    /**
     * Sets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     * @param value Value to set for the workingHours property.
     */
    public void setWorkingHours(@jakarta.annotation.Nullable final java.util.List<BookingWorkHours> value) {
        this.workingHours = value;
    }
}

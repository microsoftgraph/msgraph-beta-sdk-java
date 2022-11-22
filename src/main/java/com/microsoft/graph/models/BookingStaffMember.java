package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingStaffMember extends BookingPerson implements Parsable {
    /** True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking. */
    private Boolean _availabilityIsAffectedByPersonalCalendar;
    /** Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app. */
    private Integer _colorIndex;
    /** The isEmailNotificationEnabled property */
    private Boolean _isEmailNotificationEnabled;
    /** The role property */
    private BookingStaffRole _role;
    /** The time zone of the staff member. For a list of possible values, see dateTimeTimeZone. */
    private String _timeZone;
    /** True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting. */
    private Boolean _useBusinessHours;
    /** The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business. */
    private java.util.List<BookingWorkHours> _workingHours;
    /**
     * Instantiates a new BookingStaffMember and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingStaffMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingStaffMember
     */
    @javax.annotation.Nonnull
    public static BookingStaffMember createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingStaffMember();
    }
    /**
     * Gets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAvailabilityIsAffectedByPersonalCalendar() {
        return this._availabilityIsAffectedByPersonalCalendar;
    }
    /**
     * Gets the colorIndex property value. Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColorIndex() {
        return this._colorIndex;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availabilityIsAffectedByPersonalCalendar", (n) -> { this.setAvailabilityIsAffectedByPersonalCalendar(n.getBooleanValue()); });
        deserializerMap.put("colorIndex", (n) -> { this.setColorIndex(n.getIntegerValue()); });
        deserializerMap.put("isEmailNotificationEnabled", (n) -> { this.setIsEmailNotificationEnabled(n.getBooleanValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BookingStaffRole.class)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        deserializerMap.put("useBusinessHours", (n) -> { this.setUseBusinessHours(n.getBooleanValue()); });
        deserializerMap.put("workingHours", (n) -> { this.setWorkingHours(n.getCollectionOfObjectValues(BookingWorkHours::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEmailNotificationEnabled property value. The isEmailNotificationEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEmailNotificationEnabled() {
        return this._isEmailNotificationEnabled;
    }
    /**
     * Gets the role property value. The role property
     * @return a bookingStaffRole
     */
    @javax.annotation.Nullable
    public BookingStaffRole getRole() {
        return this._role;
    }
    /**
     * Gets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
    }
    /**
     * Gets the useBusinessHours property value. True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseBusinessHours() {
        return this._useBusinessHours;
    }
    /**
     * Gets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     * @return a bookingWorkHours
     */
    @javax.annotation.Nullable
    public java.util.List<BookingWorkHours> getWorkingHours() {
        return this._workingHours;
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
        writer.writeBooleanValue("availabilityIsAffectedByPersonalCalendar", this.getAvailabilityIsAffectedByPersonalCalendar());
        writer.writeIntegerValue("colorIndex", this.getColorIndex());
        writer.writeBooleanValue("isEmailNotificationEnabled", this.getIsEmailNotificationEnabled());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("timeZone", this.getTimeZone());
        writer.writeBooleanValue("useBusinessHours", this.getUseBusinessHours());
        writer.writeCollectionOfObjectValues("workingHours", this.getWorkingHours());
    }
    /**
     * Sets the availabilityIsAffectedByPersonalCalendar property value. True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's availability in their personal calendar in Microsoft 365, before making a booking.
     * @param value Value to set for the availabilityIsAffectedByPersonalCalendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailabilityIsAffectedByPersonalCalendar(@javax.annotation.Nullable final Boolean value) {
        this._availabilityIsAffectedByPersonalCalendar = value;
    }
    /**
     * Sets the colorIndex property value. Identifies a color to represent the staff member. The color corresponds to the color palette in the Staff details page in the Bookings app.
     * @param value Value to set for the colorIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColorIndex(@javax.annotation.Nullable final Integer value) {
        this._colorIndex = value;
    }
    /**
     * Sets the isEmailNotificationEnabled property value. The isEmailNotificationEnabled property
     * @param value Value to set for the isEmailNotificationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEmailNotificationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEmailNotificationEnabled = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final BookingStaffRole value) {
        this._role = value;
    }
    /**
     * Sets the timeZone property value. The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
    /**
     * Sets the useBusinessHours property value. True means the staff member's availability is as specified in the businessHours property of the business. False means the availability is determined by the staff member's workingHours property setting.
     * @param value Value to set for the useBusinessHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseBusinessHours(@javax.annotation.Nullable final Boolean value) {
        this._useBusinessHours = value;
    }
    /**
     * Sets the workingHours property value. The range of hours each day of the week that the staff member is available for booking. By default, they are initialized to be the same as the businessHours property of the business.
     * @param value Value to set for the workingHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkingHours(@javax.annotation.Nullable final java.util.List<BookingWorkHours> value) {
        this._workingHours = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a booked appointment of a service by a customer in a business.
 */
public class BookingAppointment extends Entity implements Parsable {
    /**
     * Additional information that is sent to the customer when an appointment is confirmed.
     */
    private String additionalInformation;
    /**
     * The URL of the meeting to join anonymously.
     */
    private String anonymousJoinWebUrl;
    /**
     * The SMTP address of the bookingCustomer who is booking the appointment.
     */
    private String customerEmailAddress;
    /**
     * The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     */
    private String customerId;
    /**
     * Represents location information for the bookingCustomer who is booking the appointment.
     */
    private Location customerLocation;
    /**
     * The customer's name.
     */
    private String customerName;
    /**
     * Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID.  You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by customerId.
     */
    private String customerNotes;
    /**
     * The customer's phone number.
     */
    private String customerPhone;
    /**
     * A collection of the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     */
    private java.util.List<BookingCustomerInformationBase> customers;
    /**
     * The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     */
    private String customerTimeZone;
    /**
     * The length of the appointment, denoted in ISO8601 format.
     */
    private PeriodAndDuration duration;
    /**
     * The end property
     */
    private DateTimeTimeZone end;
    /**
     * The current number of customers in the appointment.
     */
    private Integer filledAttendeesCount;
    /**
     * The billed amount on the invoice.
     */
    private Double invoiceAmount;
    /**
     * The date, time, and time zone of the invoice for this appointment.
     */
    private DateTimeTimeZone invoiceDate;
    /**
     * The ID of the invoice.
     */
    private String invoiceId;
    /**
     * The invoiceStatus property
     */
    private BookingInvoiceStatus invoiceStatus;
    /**
     * The URL of the invoice in Microsoft Bookings.
     */
    private String invoiceUrl;
    /**
     * True indicates that the appointment will be held online. Default value is false.
     */
    private Boolean isLocationOnline;
    /**
     * The URL of the online meeting for the appointment.
     */
    private String joinWebUrl;
    /**
     * The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     */
    private Integer maximumAttendeesCount;
    /**
     * The onlineMeetingUrl property
     */
    private String onlineMeetingUrl;
    /**
     * True indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     */
    private Boolean optOutOfCustomerEmail;
    /**
     * The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     */
    private PeriodAndDuration postBuffer;
    /**
     * The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     */
    private PeriodAndDuration preBuffer;
    /**
     * The regular price for an appointment for the specified bookingService.
     */
    private Double price;
    /**
     * Represents the type of pricing of a booking service.
     */
    private BookingPriceType priceType;
    /**
     * The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     */
    private java.util.List<BookingReminder> reminders;
    /**
     * An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer.
     */
    private String selfServiceAppointmentId;
    /**
     * The ID of the bookingService associated with this appointment.
     */
    private String serviceId;
    /**
     * The location where the service is delivered.
     */
    private Location serviceLocation;
    /**
     * The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     */
    private String serviceName;
    /**
     * Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     */
    private String serviceNotes;
    /**
     * True indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     */
    private Boolean smsNotificationsEnabled;
    /**
     * The ID of each bookingStaffMember who is scheduled in this appointment.
     */
    private java.util.List<String> staffMemberIds;
    /**
     * The start property
     */
    private DateTimeTimeZone start;
    /**
     * Instantiates a new bookingAppointment and sets the default values.
     */
    public BookingAppointment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingAppointment
     */
    @jakarta.annotation.Nonnull
    public static BookingAppointment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingAppointment();
    }
    /**
     * Gets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }
    /**
     * Gets the anonymousJoinWebUrl property value. The URL of the meeting to join anonymously.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAnonymousJoinWebUrl() {
        return this.anonymousJoinWebUrl;
    }
    /**
     * Gets the customerEmailAddress property value. The SMTP address of the bookingCustomer who is booking the appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }
    /**
     * Gets the customerId property value. The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerId() {
        return this.customerId;
    }
    /**
     * Gets the customerLocation property value. Represents location information for the bookingCustomer who is booking the appointment.
     * @return a location
     */
    @jakarta.annotation.Nullable
    public Location getCustomerLocation() {
        return this.customerLocation;
    }
    /**
     * Gets the customerName property value. The customer's name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerName() {
        return this.customerName;
    }
    /**
     * Gets the customerNotes property value. Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID.  You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by customerId.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerNotes() {
        return this.customerNotes;
    }
    /**
     * Gets the customerPhone property value. The customer's phone number.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerPhone() {
        return this.customerPhone;
    }
    /**
     * Gets the customers property value. A collection of the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @return a bookingCustomerInformationBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingCustomerInformationBase> getCustomers() {
        return this.customers;
    }
    /**
     * Gets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCustomerTimeZone() {
        return this.customerTimeZone;
    }
    /**
     * Gets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * Gets the end property value. The end property
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEnd() {
        return this.end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInformation", (n) -> { this.setAdditionalInformation(n.getStringValue()); });
        deserializerMap.put("anonymousJoinWebUrl", (n) -> { this.setAnonymousJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("customerEmailAddress", (n) -> { this.setCustomerEmailAddress(n.getStringValue()); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getStringValue()); });
        deserializerMap.put("customerLocation", (n) -> { this.setCustomerLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("customerName", (n) -> { this.setCustomerName(n.getStringValue()); });
        deserializerMap.put("customerNotes", (n) -> { this.setCustomerNotes(n.getStringValue()); });
        deserializerMap.put("customerPhone", (n) -> { this.setCustomerPhone(n.getStringValue()); });
        deserializerMap.put("customers", (n) -> { this.setCustomers(n.getCollectionOfObjectValues(BookingCustomerInformationBase::createFromDiscriminatorValue)); });
        deserializerMap.put("customerTimeZone", (n) -> { this.setCustomerTimeZone(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("end", (n) -> { this.setEnd(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("filledAttendeesCount", (n) -> { this.setFilledAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("invoiceAmount", (n) -> { this.setInvoiceAmount(n.getDoubleValue()); });
        deserializerMap.put("invoiceDate", (n) -> { this.setInvoiceDate(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("invoiceId", (n) -> { this.setInvoiceId(n.getStringValue()); });
        deserializerMap.put("invoiceStatus", (n) -> { this.setInvoiceStatus(n.getEnumValue(BookingInvoiceStatus.class)); });
        deserializerMap.put("invoiceUrl", (n) -> { this.setInvoiceUrl(n.getStringValue()); });
        deserializerMap.put("isLocationOnline", (n) -> { this.setIsLocationOnline(n.getBooleanValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("maximumAttendeesCount", (n) -> { this.setMaximumAttendeesCount(n.getIntegerValue()); });
        deserializerMap.put("onlineMeetingUrl", (n) -> { this.setOnlineMeetingUrl(n.getStringValue()); });
        deserializerMap.put("optOutOfCustomerEmail", (n) -> { this.setOptOutOfCustomerEmail(n.getBooleanValue()); });
        deserializerMap.put("postBuffer", (n) -> { this.setPostBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("preBuffer", (n) -> { this.setPreBuffer(n.getPeriodAndDurationValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getDoubleValue()); });
        deserializerMap.put("priceType", (n) -> { this.setPriceType(n.getEnumValue(BookingPriceType.class)); });
        deserializerMap.put("reminders", (n) -> { this.setReminders(n.getCollectionOfObjectValues(BookingReminder::createFromDiscriminatorValue)); });
        deserializerMap.put("selfServiceAppointmentId", (n) -> { this.setSelfServiceAppointmentId(n.getStringValue()); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("serviceLocation", (n) -> { this.setServiceLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceName", (n) -> { this.setServiceName(n.getStringValue()); });
        deserializerMap.put("serviceNotes", (n) -> { this.setServiceNotes(n.getStringValue()); });
        deserializerMap.put("smsNotificationsEnabled", (n) -> { this.setSmsNotificationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("staffMemberIds", (n) -> { this.setStaffMemberIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the filledAttendeesCount property value. The current number of customers in the appointment.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFilledAttendeesCount() {
        return this.filledAttendeesCount;
    }
    /**
     * Gets the invoiceAmount property value. The billed amount on the invoice.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getInvoiceAmount() {
        return this.invoiceAmount;
    }
    /**
     * Gets the invoiceDate property value. The date, time, and time zone of the invoice for this appointment.
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getInvoiceDate() {
        return this.invoiceDate;
    }
    /**
     * Gets the invoiceId property value. The ID of the invoice.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInvoiceId() {
        return this.invoiceId;
    }
    /**
     * Gets the invoiceStatus property value. The invoiceStatus property
     * @return a bookingInvoiceStatus
     */
    @jakarta.annotation.Nullable
    public BookingInvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }
    /**
     * Gets the invoiceUrl property value. The URL of the invoice in Microsoft Bookings.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInvoiceUrl() {
        return this.invoiceUrl;
    }
    /**
     * Gets the isLocationOnline property value. True indicates that the appointment will be held online. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLocationOnline() {
        return this.isLocationOnline;
    }
    /**
     * Gets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJoinWebUrl() {
        return this.joinWebUrl;
    }
    /**
     * Gets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAttendeesCount() {
        return this.maximumAttendeesCount;
    }
    /**
     * Gets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOnlineMeetingUrl() {
        return this.onlineMeetingUrl;
    }
    /**
     * Gets the optOutOfCustomerEmail property value. True indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOptOutOfCustomerEmail() {
        return this.optOutOfCustomerEmail;
    }
    /**
     * Gets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPostBuffer() {
        return this.postBuffer;
    }
    /**
     * Gets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getPreBuffer() {
        return this.preBuffer;
    }
    /**
     * Gets the price property value. The regular price for an appointment for the specified bookingService.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getPrice() {
        return this.price;
    }
    /**
     * Gets the priceType property value. Represents the type of pricing of a booking service.
     * @return a bookingPriceType
     */
    @jakarta.annotation.Nullable
    public BookingPriceType getPriceType() {
        return this.priceType;
    }
    /**
     * Gets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a bookingReminder
     */
    @jakarta.annotation.Nullable
    public java.util.List<BookingReminder> getReminders() {
        return this.reminders;
    }
    /**
     * Gets the selfServiceAppointmentId property value. An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSelfServiceAppointmentId() {
        return this.selfServiceAppointmentId;
    }
    /**
     * Gets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.serviceId;
    }
    /**
     * Gets the serviceLocation property value. The location where the service is delivered.
     * @return a location
     */
    @jakarta.annotation.Nullable
    public Location getServiceLocation() {
        return this.serviceLocation;
    }
    /**
     * Gets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Gets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getServiceNotes() {
        return this.serviceNotes;
    }
    /**
     * Gets the smsNotificationsEnabled property value. True indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsNotificationsEnabled() {
        return this.smsNotificationsEnabled;
    }
    /**
     * Gets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStaffMemberIds() {
        return this.staffMemberIds;
    }
    /**
     * Gets the start property value. The start property
     * @return a dateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStart() {
        return this.start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalInformation", this.getAdditionalInformation());
        writer.writeStringValue("anonymousJoinWebUrl", this.getAnonymousJoinWebUrl());
        writer.writeStringValue("customerEmailAddress", this.getCustomerEmailAddress());
        writer.writeStringValue("customerId", this.getCustomerId());
        writer.writeObjectValue("customerLocation", this.getCustomerLocation());
        writer.writeStringValue("customerName", this.getCustomerName());
        writer.writeStringValue("customerNotes", this.getCustomerNotes());
        writer.writeStringValue("customerPhone", this.getCustomerPhone());
        writer.writeCollectionOfObjectValues("customers", this.getCustomers());
        writer.writeStringValue("customerTimeZone", this.getCustomerTimeZone());
        writer.writeObjectValue("end", this.getEnd());
        writer.writeDoubleValue("invoiceAmount", this.getInvoiceAmount());
        writer.writeObjectValue("invoiceDate", this.getInvoiceDate());
        writer.writeStringValue("invoiceId", this.getInvoiceId());
        writer.writeEnumValue("invoiceStatus", this.getInvoiceStatus());
        writer.writeStringValue("invoiceUrl", this.getInvoiceUrl());
        writer.writeBooleanValue("isLocationOnline", this.getIsLocationOnline());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeIntegerValue("maximumAttendeesCount", this.getMaximumAttendeesCount());
        writer.writeStringValue("onlineMeetingUrl", this.getOnlineMeetingUrl());
        writer.writeBooleanValue("optOutOfCustomerEmail", this.getOptOutOfCustomerEmail());
        writer.writePeriodAndDurationValue("postBuffer", this.getPostBuffer());
        writer.writePeriodAndDurationValue("preBuffer", this.getPreBuffer());
        writer.writeDoubleValue("price", this.getPrice());
        writer.writeEnumValue("priceType", this.getPriceType());
        writer.writeCollectionOfObjectValues("reminders", this.getReminders());
        writer.writeStringValue("selfServiceAppointmentId", this.getSelfServiceAppointmentId());
        writer.writeStringValue("serviceId", this.getServiceId());
        writer.writeObjectValue("serviceLocation", this.getServiceLocation());
        writer.writeStringValue("serviceName", this.getServiceName());
        writer.writeStringValue("serviceNotes", this.getServiceNotes());
        writer.writeBooleanValue("smsNotificationsEnabled", this.getSmsNotificationsEnabled());
        writer.writeCollectionOfPrimitiveValues("staffMemberIds", this.getStaffMemberIds());
        writer.writeObjectValue("start", this.getStart());
    }
    /**
     * Sets the additionalInformation property value. Additional information that is sent to the customer when an appointment is confirmed.
     * @param value Value to set for the additionalInformation property.
     */
    public void setAdditionalInformation(@jakarta.annotation.Nullable final String value) {
        this.additionalInformation = value;
    }
    /**
     * Sets the anonymousJoinWebUrl property value. The URL of the meeting to join anonymously.
     * @param value Value to set for the anonymousJoinWebUrl property.
     */
    public void setAnonymousJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.anonymousJoinWebUrl = value;
    }
    /**
     * Sets the customerEmailAddress property value. The SMTP address of the bookingCustomer who is booking the appointment.
     * @param value Value to set for the customerEmailAddress property.
     */
    public void setCustomerEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.customerEmailAddress = value;
    }
    /**
     * Sets the customerId property value. The ID of the bookingCustomer for this appointment. If no ID is specified when an appointment is created, then a new bookingCustomer object is created. Once set, you should consider the customerId immutable.
     * @param value Value to set for the customerId property.
     */
    public void setCustomerId(@jakarta.annotation.Nullable final String value) {
        this.customerId = value;
    }
    /**
     * Sets the customerLocation property value. Represents location information for the bookingCustomer who is booking the appointment.
     * @param value Value to set for the customerLocation property.
     */
    public void setCustomerLocation(@jakarta.annotation.Nullable final Location value) {
        this.customerLocation = value;
    }
    /**
     * Sets the customerName property value. The customer's name.
     * @param value Value to set for the customerName property.
     */
    public void setCustomerName(@jakarta.annotation.Nullable final String value) {
        this.customerName = value;
    }
    /**
     * Sets the customerNotes property value. Notes from the customer associated with this appointment. You can get the value only when reading this bookingAppointment by its ID.  You can set this property only when initially creating an appointment with a new customer. After that point, the value is computed from the customer represented by customerId.
     * @param value Value to set for the customerNotes property.
     */
    public void setCustomerNotes(@jakarta.annotation.Nullable final String value) {
        this.customerNotes = value;
    }
    /**
     * Sets the customerPhone property value. The customer's phone number.
     * @param value Value to set for the customerPhone property.
     */
    public void setCustomerPhone(@jakarta.annotation.Nullable final String value) {
        this.customerPhone = value;
    }
    /**
     * Sets the customers property value. A collection of the customer properties for an appointment. An appointment will contain a list of customer information and each unit will indicate the properties of a customer who is part of that appointment. Optional.
     * @param value Value to set for the customers property.
     */
    public void setCustomers(@jakarta.annotation.Nullable final java.util.List<BookingCustomerInformationBase> value) {
        this.customers = value;
    }
    /**
     * Sets the customerTimeZone property value. The time zone of the customer. For a list of possible values, see dateTimeTimeZone.
     * @param value Value to set for the customerTimeZone property.
     */
    public void setCustomerTimeZone(@jakarta.annotation.Nullable final String value) {
        this.customerTimeZone = value;
    }
    /**
     * Sets the duration property value. The length of the appointment, denoted in ISO8601 format.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = value;
    }
    /**
     * Sets the end property value. The end property
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.end = value;
    }
    /**
     * Sets the filledAttendeesCount property value. The current number of customers in the appointment.
     * @param value Value to set for the filledAttendeesCount property.
     */
    public void setFilledAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.filledAttendeesCount = value;
    }
    /**
     * Sets the invoiceAmount property value. The billed amount on the invoice.
     * @param value Value to set for the invoiceAmount property.
     */
    public void setInvoiceAmount(@jakarta.annotation.Nullable final Double value) {
        this.invoiceAmount = value;
    }
    /**
     * Sets the invoiceDate property value. The date, time, and time zone of the invoice for this appointment.
     * @param value Value to set for the invoiceDate property.
     */
    public void setInvoiceDate(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.invoiceDate = value;
    }
    /**
     * Sets the invoiceId property value. The ID of the invoice.
     * @param value Value to set for the invoiceId property.
     */
    public void setInvoiceId(@jakarta.annotation.Nullable final String value) {
        this.invoiceId = value;
    }
    /**
     * Sets the invoiceStatus property value. The invoiceStatus property
     * @param value Value to set for the invoiceStatus property.
     */
    public void setInvoiceStatus(@jakarta.annotation.Nullable final BookingInvoiceStatus value) {
        this.invoiceStatus = value;
    }
    /**
     * Sets the invoiceUrl property value. The URL of the invoice in Microsoft Bookings.
     * @param value Value to set for the invoiceUrl property.
     */
    public void setInvoiceUrl(@jakarta.annotation.Nullable final String value) {
        this.invoiceUrl = value;
    }
    /**
     * Sets the isLocationOnline property value. True indicates that the appointment will be held online. Default value is false.
     * @param value Value to set for the isLocationOnline property.
     */
    public void setIsLocationOnline(@jakarta.annotation.Nullable final Boolean value) {
        this.isLocationOnline = value;
    }
    /**
     * Sets the joinWebUrl property value. The URL of the online meeting for the appointment.
     * @param value Value to set for the joinWebUrl property.
     */
    public void setJoinWebUrl(@jakarta.annotation.Nullable final String value) {
        this.joinWebUrl = value;
    }
    /**
     * Sets the maximumAttendeesCount property value. The maximum number of customers allowed in an appointment. If maximumAttendeesCount of the service is greater than 1, pass valid customer IDs while creating or updating an appointment. To create a customer, use the Create bookingCustomer operation.
     * @param value Value to set for the maximumAttendeesCount property.
     */
    public void setMaximumAttendeesCount(@jakarta.annotation.Nullable final Integer value) {
        this.maximumAttendeesCount = value;
    }
    /**
     * Sets the onlineMeetingUrl property value. The onlineMeetingUrl property
     * @param value Value to set for the onlineMeetingUrl property.
     */
    public void setOnlineMeetingUrl(@jakarta.annotation.Nullable final String value) {
        this.onlineMeetingUrl = value;
    }
    /**
     * Sets the optOutOfCustomerEmail property value. True indicates that the bookingCustomer for this appointment does not wish to receive a confirmation for this appointment.
     * @param value Value to set for the optOutOfCustomerEmail property.
     */
    public void setOptOutOfCustomerEmail(@jakarta.annotation.Nullable final Boolean value) {
        this.optOutOfCustomerEmail = value;
    }
    /**
     * Sets the postBuffer property value. The amount of time to reserve after the appointment ends, for cleaning up, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the postBuffer property.
     */
    public void setPostBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.postBuffer = value;
    }
    /**
     * Sets the preBuffer property value. The amount of time to reserve before the appointment begins, for preparation, as an example. The value is expressed in ISO8601 format.
     * @param value Value to set for the preBuffer property.
     */
    public void setPreBuffer(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.preBuffer = value;
    }
    /**
     * Sets the price property value. The regular price for an appointment for the specified bookingService.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final Double value) {
        this.price = value;
    }
    /**
     * Sets the priceType property value. Represents the type of pricing of a booking service.
     * @param value Value to set for the priceType property.
     */
    public void setPriceType(@jakarta.annotation.Nullable final BookingPriceType value) {
        this.priceType = value;
    }
    /**
     * Sets the reminders property value. The collection of customer reminders sent for this appointment. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the reminders property.
     */
    public void setReminders(@jakarta.annotation.Nullable final java.util.List<BookingReminder> value) {
        this.reminders = value;
    }
    /**
     * Sets the selfServiceAppointmentId property value. An additional tracking ID for the appointment, if the appointment has been created directly by the customer on the scheduling page, as opposed to by a staff member on the behalf of the customer.
     * @param value Value to set for the selfServiceAppointmentId property.
     */
    public void setSelfServiceAppointmentId(@jakarta.annotation.Nullable final String value) {
        this.selfServiceAppointmentId = value;
    }
    /**
     * Sets the serviceId property value. The ID of the bookingService associated with this appointment.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.serviceId = value;
    }
    /**
     * Sets the serviceLocation property value. The location where the service is delivered.
     * @param value Value to set for the serviceLocation property.
     */
    public void setServiceLocation(@jakarta.annotation.Nullable final Location value) {
        this.serviceLocation = value;
    }
    /**
     * Sets the serviceName property value. The name of the bookingService associated with this appointment.This property is optional when creating a new appointment. If not specified, it is computed from the service associated with the appointment by the serviceId property.
     * @param value Value to set for the serviceName property.
     */
    public void setServiceName(@jakarta.annotation.Nullable final String value) {
        this.serviceName = value;
    }
    /**
     * Sets the serviceNotes property value. Notes from a bookingStaffMember. The value of this property is available only when reading this bookingAppointment by its ID.
     * @param value Value to set for the serviceNotes property.
     */
    public void setServiceNotes(@jakarta.annotation.Nullable final String value) {
        this.serviceNotes = value;
    }
    /**
     * Sets the smsNotificationsEnabled property value. True indicates SMS notifications will be sent to the customers for the appointment. Default value is false.
     * @param value Value to set for the smsNotificationsEnabled property.
     */
    public void setSmsNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.smsNotificationsEnabled = value;
    }
    /**
     * Sets the staffMemberIds property value. The ID of each bookingStaffMember who is scheduled in this appointment.
     * @param value Value to set for the staffMemberIds property.
     */
    public void setStaffMemberIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.staffMemberIds = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.start = value;
    }
}

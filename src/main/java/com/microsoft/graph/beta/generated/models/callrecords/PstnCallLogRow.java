package com.microsoft.graph.beta.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PstnCallLogRow extends CallLogRow implements Parsable {
    /**
     * Instantiates a new {@link PstnCallLogRow} and sets the default values.
     */
    public PstnCallLogRow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PstnCallLogRow}
     */
    @jakarta.annotation.Nonnull
    public static PstnCallLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnCallLogRow();
    }
    /**
     * Gets the callDurationSource property value. The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     * @return a {@link PstnCallDurationSource}
     */
    @jakarta.annotation.Nullable
    public PstnCallDurationSource getCallDurationSource() {
        return this.backingStore.get("callDurationSource");
    }
    /**
     * Gets the calleeNumber property value. Number of the user or bot who received the call (E.164).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCalleeNumber() {
        return this.backingStore.get("calleeNumber");
    }
    /**
     * Gets the callerNumber property value. Number of the user or bot who made the call (E.164).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallerNumber() {
        return this.backingStore.get("callerNumber");
    }
    /**
     * Gets the callId property value. Call identifier. Not guaranteed to be unique.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.backingStore.get("callId");
    }
    /**
     * Gets the callType property value. Indicates whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallType() {
        return this.backingStore.get("callType");
    }
    /**
     * Gets the charge property value. Amount of money or cost of the call that is charged to your account.
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getCharge() {
        return this.backingStore.get("charge");
    }
    /**
     * Gets the clientLocalIpV4Address property value. Local IPv4 of the client that is retrieved from the operating system of the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientLocalIpV4Address() {
        return this.backingStore.get("clientLocalIpV4Address");
    }
    /**
     * Gets the clientLocalIpV6Address property value. Local IPv6 of the client that is retrieved from the operating system of the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientLocalIpV6Address() {
        return this.backingStore.get("clientLocalIpV6Address");
    }
    /**
     * Gets the clientPublicIpV4Address property value. Public IPv4 of the client that can be used to determine the location of the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientPublicIpV4Address() {
        return this.backingStore.get("clientPublicIpV4Address");
    }
    /**
     * Gets the clientPublicIpV6Address property value. Public IPv6 of the client that can be used to determine the location of the client.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientPublicIpV6Address() {
        return this.backingStore.get("clientPublicIpV6Address");
    }
    /**
     * Gets the conferenceId property value. ID of the audio conference.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConferenceId() {
        return this.backingStore.get("conferenceId");
    }
    /**
     * Gets the connectionCharge property value. Connection fee price.
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getConnectionCharge() {
        return this.backingStore.get("connectionCharge");
    }
    /**
     * Gets the currency property value. Type of currency used to calculate the cost of the call (ISO 4217).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.backingStore.get("currency");
    }
    /**
     * Gets the destinationContext property value. Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationContext() {
        return this.backingStore.get("destinationContext");
    }
    /**
     * Gets the destinationName property value. Country or region dialed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationName() {
        return this.backingStore.get("destinationName");
    }
    /**
     * Gets the duration property value. How long the call was connected, in seconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * Gets the endDateTime property value. Call end time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callDurationSource", (n) -> { this.setCallDurationSource(n.getEnumValue(PstnCallDurationSource::forValue)); });
        deserializerMap.put("calleeNumber", (n) -> { this.setCalleeNumber(n.getStringValue()); });
        deserializerMap.put("callerNumber", (n) -> { this.setCallerNumber(n.getStringValue()); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("callType", (n) -> { this.setCallType(n.getStringValue()); });
        deserializerMap.put("charge", (n) -> { this.setCharge(n.getBigDecimalValue()); });
        deserializerMap.put("clientLocalIpV4Address", (n) -> { this.setClientLocalIpV4Address(n.getStringValue()); });
        deserializerMap.put("clientLocalIpV6Address", (n) -> { this.setClientLocalIpV6Address(n.getStringValue()); });
        deserializerMap.put("clientPublicIpV4Address", (n) -> { this.setClientPublicIpV4Address(n.getStringValue()); });
        deserializerMap.put("clientPublicIpV6Address", (n) -> { this.setClientPublicIpV6Address(n.getStringValue()); });
        deserializerMap.put("conferenceId", (n) -> { this.setConferenceId(n.getStringValue()); });
        deserializerMap.put("connectionCharge", (n) -> { this.setConnectionCharge(n.getBigDecimalValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("destinationContext", (n) -> { this.setDestinationContext(n.getStringValue()); });
        deserializerMap.put("destinationName", (n) -> { this.setDestinationName(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("inventoryType", (n) -> { this.setInventoryType(n.getStringValue()); });
        deserializerMap.put("licenseCapability", (n) -> { this.setLicenseCapability(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantCountryCode", (n) -> { this.setTenantCountryCode(n.getStringValue()); });
        deserializerMap.put("usageCountryCode", (n) -> { this.setUsageCountryCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryType property value. User's phone number type, such as a service of toll-free number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInventoryType() {
        return this.backingStore.get("inventoryType");
    }
    /**
     * Gets the licenseCapability property value. The license used for the call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLicenseCapability() {
        return this.backingStore.get("licenseCapability");
    }
    /**
     * Gets the operator property value. The telecommunications operator that provided PSTN services for this call. It may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Gets the startDateTime property value. Call start time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the tenantCountryCode property value. Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantCountryCode() {
        return this.backingStore.get("tenantCountryCode");
    }
    /**
     * Gets the usageCountryCode property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsageCountryCode() {
        return this.backingStore.get("usageCountryCode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("callDurationSource", this.getCallDurationSource());
        writer.writeStringValue("calleeNumber", this.getCalleeNumber());
        writer.writeStringValue("callerNumber", this.getCallerNumber());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("callType", this.getCallType());
        writer.writeBigDecimalValue("charge", this.getCharge());
        writer.writeStringValue("clientLocalIpV4Address", this.getClientLocalIpV4Address());
        writer.writeStringValue("clientLocalIpV6Address", this.getClientLocalIpV6Address());
        writer.writeStringValue("clientPublicIpV4Address", this.getClientPublicIpV4Address());
        writer.writeStringValue("clientPublicIpV6Address", this.getClientPublicIpV6Address());
        writer.writeStringValue("conferenceId", this.getConferenceId());
        writer.writeBigDecimalValue("connectionCharge", this.getConnectionCharge());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("destinationContext", this.getDestinationContext());
        writer.writeStringValue("destinationName", this.getDestinationName());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("inventoryType", this.getInventoryType());
        writer.writeStringValue("licenseCapability", this.getLicenseCapability());
        writer.writeStringValue("operator", this.getOperator());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("tenantCountryCode", this.getTenantCountryCode());
        writer.writeStringValue("usageCountryCode", this.getUsageCountryCode());
    }
    /**
     * Sets the callDurationSource property value. The source of the call duration data. If the call uses a third-party telecommunications operator via the Operator Connect Program, the operator may provide their own call duration data. In this case, the property value is operator. Otherwise, the value is microsoft.
     * @param value Value to set for the callDurationSource property.
     */
    public void setCallDurationSource(@jakarta.annotation.Nullable final PstnCallDurationSource value) {
        this.backingStore.set("callDurationSource", value);
    }
    /**
     * Sets the calleeNumber property value. Number of the user or bot who received the call (E.164).
     * @param value Value to set for the calleeNumber property.
     */
    public void setCalleeNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("calleeNumber", value);
    }
    /**
     * Sets the callerNumber property value. Number of the user or bot who made the call (E.164).
     * @param value Value to set for the callerNumber property.
     */
    public void setCallerNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callerNumber", value);
    }
    /**
     * Sets the callId property value. Call identifier. Not guaranteed to be unique.
     * @param value Value to set for the callId property.
     */
    public void setCallId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callId", value);
    }
    /**
     * Sets the callType property value. Indicates whether the call was a PSTN outbound or inbound call and the type of call such as a call placed by a user or an audio conference.
     * @param value Value to set for the callType property.
     */
    public void setCallType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callType", value);
    }
    /**
     * Sets the charge property value. Amount of money or cost of the call that is charged to your account.
     * @param value Value to set for the charge property.
     */
    public void setCharge(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("charge", value);
    }
    /**
     * Sets the clientLocalIpV4Address property value. Local IPv4 of the client that is retrieved from the operating system of the client.
     * @param value Value to set for the clientLocalIpV4Address property.
     */
    public void setClientLocalIpV4Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientLocalIpV4Address", value);
    }
    /**
     * Sets the clientLocalIpV6Address property value. Local IPv6 of the client that is retrieved from the operating system of the client.
     * @param value Value to set for the clientLocalIpV6Address property.
     */
    public void setClientLocalIpV6Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientLocalIpV6Address", value);
    }
    /**
     * Sets the clientPublicIpV4Address property value. Public IPv4 of the client that can be used to determine the location of the client.
     * @param value Value to set for the clientPublicIpV4Address property.
     */
    public void setClientPublicIpV4Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientPublicIpV4Address", value);
    }
    /**
     * Sets the clientPublicIpV6Address property value. Public IPv6 of the client that can be used to determine the location of the client.
     * @param value Value to set for the clientPublicIpV6Address property.
     */
    public void setClientPublicIpV6Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientPublicIpV6Address", value);
    }
    /**
     * Sets the conferenceId property value. ID of the audio conference.
     * @param value Value to set for the conferenceId property.
     */
    public void setConferenceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conferenceId", value);
    }
    /**
     * Sets the connectionCharge property value. Connection fee price.
     * @param value Value to set for the connectionCharge property.
     */
    public void setConnectionCharge(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("connectionCharge", value);
    }
    /**
     * Sets the currency property value. Type of currency used to calculate the cost of the call (ISO 4217).
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currency", value);
    }
    /**
     * Sets the destinationContext property value. Indicates whether the call was Domestic (within a country or region) or International (outside a country or region) based on the user's location.
     * @param value Value to set for the destinationContext property.
     */
    public void setDestinationContext(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationContext", value);
    }
    /**
     * Sets the destinationName property value. Country or region dialed.
     * @param value Value to set for the destinationName property.
     */
    public void setDestinationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationName", value);
    }
    /**
     * Sets the duration property value. How long the call was connected, in seconds.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the endDateTime property value. Call end time.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the inventoryType property value. User's phone number type, such as a service of toll-free number.
     * @param value Value to set for the inventoryType property.
     */
    public void setInventoryType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("inventoryType", value);
    }
    /**
     * Sets the licenseCapability property value. The license used for the call.
     * @param value Value to set for the licenseCapability property.
     */
    public void setLicenseCapability(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("licenseCapability", value);
    }
    /**
     * Sets the operator property value. The telecommunications operator that provided PSTN services for this call. It may be Microsoft, or it may be a third-party operator via the Operator Connect Program.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operator", value);
    }
    /**
     * Sets the startDateTime property value. Call start time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the tenantCountryCode property value. Country code of the tenant. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the tenantCountryCode property.
     */
    public void setTenantCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantCountryCode", value);
    }
    /**
     * Sets the usageCountryCode property value. Country code of the user. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the usageCountryCode property.
     */
    public void setUsageCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("usageCountryCode", value);
    }
}

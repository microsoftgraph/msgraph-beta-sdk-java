package com.microsoft.graph.beta.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectRoutingLogRow extends CallLogRow implements Parsable {
    /**
     * Instantiates a new {@link DirectRoutingLogRow} and sets the default values.
     */
    public DirectRoutingLogRow() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectRoutingLogRow}
     */
    @jakarta.annotation.Nonnull
    public static DirectRoutingLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectRoutingLogRow();
    }
    /**
     * Gets the calleeNumber property value. Number of the user or bot who received the call (E.164 format, but might include more data).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCalleeNumber() {
        return this.backingStore.get("calleeNumber");
    }
    /**
     * Gets the callEndSubReason property value. In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallEndSubReason() {
        return this.backingStore.get("callEndSubReason");
    }
    /**
     * Gets the callerNumber property value. Number of the user or bot who made the call (E.164 format, but might include more data).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallerNumber() {
        return this.backingStore.get("callerNumber");
    }
    /**
     * Gets the callType property value. Call type and direction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallType() {
        return this.backingStore.get("callType");
    }
    /**
     * Gets the correlationId property value. Identifier (GUID) for the call that you can use when calling Microsoft Support.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the duration property value. Duration of the call in seconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.backingStore.get("duration");
    }
    /**
     * Gets the endDateTime property value. Only exists for successful (fully established) calls. The time when the call ended.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailureDateTime() {
        return this.backingStore.get("failureDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("calleeNumber", (n) -> { this.setCalleeNumber(n.getStringValue()); });
        deserializerMap.put("callEndSubReason", (n) -> { this.setCallEndSubReason(n.getIntegerValue()); });
        deserializerMap.put("callerNumber", (n) -> { this.setCallerNumber(n.getStringValue()); });
        deserializerMap.put("callType", (n) -> { this.setCallType(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureDateTime", (n) -> { this.setFailureDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("finalSipCode", (n) -> { this.setFinalSipCode(n.getIntegerValue()); });
        deserializerMap.put("finalSipCodePhrase", (n) -> { this.setFinalSipCodePhrase(n.getStringValue()); });
        deserializerMap.put("inviteDateTime", (n) -> { this.setInviteDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mediaBypassEnabled", (n) -> { this.setMediaBypassEnabled(n.getBooleanValue()); });
        deserializerMap.put("mediaPathLocation", (n) -> { this.setMediaPathLocation(n.getStringValue()); });
        deserializerMap.put("signalingLocation", (n) -> { this.setSignalingLocation(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("successfulCall", (n) -> { this.setSuccessfulCall(n.getBooleanValue()); });
        deserializerMap.put("transferorCorrelationId", (n) -> { this.setTransferorCorrelationId(n.getStringValue()); });
        deserializerMap.put("trunkFullyQualifiedDomainName", (n) -> { this.setTrunkFullyQualifiedDomainName(n.getStringValue()); });
        deserializerMap.put("userCountryCode", (n) -> { this.setUserCountryCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the finalSipCode property value. The final response code with which the call ended (RFC 3261).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFinalSipCode() {
        return this.backingStore.get("finalSipCode");
    }
    /**
     * Gets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFinalSipCodePhrase() {
        return this.backingStore.get("finalSipCodePhrase");
    }
    /**
     * Gets the inviteDateTime property value. The date and time when the initial invite was sent.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInviteDateTime() {
        return this.backingStore.get("inviteDateTime");
    }
    /**
     * Gets the mediaBypassEnabled property value. Indicates if the trunk was enabled for media bypass or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMediaBypassEnabled() {
        return this.backingStore.get("mediaBypassEnabled");
    }
    /**
     * Gets the mediaPathLocation property value. The data center used for media path in non-bypass call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMediaPathLocation() {
        return this.backingStore.get("mediaPathLocation");
    }
    /**
     * Gets the signalingLocation property value. The data center used for signaling for both bypass and non-bypass calls.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignalingLocation() {
        return this.backingStore.get("signalingLocation");
    }
    /**
     * Gets the startDateTime property value. Call start time.For failed and unanswered calls, this value can be equal to invite or failure time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the successfulCall property value. Success or attempt.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccessfulCall() {
        return this.backingStore.get("successfulCall");
    }
    /**
     * Gets the transferorCorrelationId property value. Correlation ID of the call to the transferor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTransferorCorrelationId() {
        return this.backingStore.get("transferorCorrelationId");
    }
    /**
     * Gets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrunkFullyQualifiedDomainName() {
        return this.backingStore.get("trunkFullyQualifiedDomainName");
    }
    /**
     * Gets the userCountryCode property value. Country/region code of the user. For details, see ISO 3166-1 alpha-2.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserCountryCode() {
        return this.backingStore.get("userCountryCode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("calleeNumber", this.getCalleeNumber());
        writer.writeIntegerValue("callEndSubReason", this.getCallEndSubReason());
        writer.writeStringValue("callerNumber", this.getCallerNumber());
        writer.writeStringValue("callType", this.getCallType());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeOffsetDateTimeValue("failureDateTime", this.getFailureDateTime());
        writer.writeIntegerValue("finalSipCode", this.getFinalSipCode());
        writer.writeStringValue("finalSipCodePhrase", this.getFinalSipCodePhrase());
        writer.writeOffsetDateTimeValue("inviteDateTime", this.getInviteDateTime());
        writer.writeBooleanValue("mediaBypassEnabled", this.getMediaBypassEnabled());
        writer.writeStringValue("mediaPathLocation", this.getMediaPathLocation());
        writer.writeStringValue("signalingLocation", this.getSignalingLocation());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeBooleanValue("successfulCall", this.getSuccessfulCall());
        writer.writeStringValue("transferorCorrelationId", this.getTransferorCorrelationId());
        writer.writeStringValue("trunkFullyQualifiedDomainName", this.getTrunkFullyQualifiedDomainName());
        writer.writeStringValue("userCountryCode", this.getUserCountryCode());
    }
    /**
     * Sets the calleeNumber property value. Number of the user or bot who received the call (E.164 format, but might include more data).
     * @param value Value to set for the calleeNumber property.
     */
    public void setCalleeNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("calleeNumber", value);
    }
    /**
     * Sets the callEndSubReason property value. In addition to the SIP codes, Microsoft has own subcodes that indicate the specific issue.
     * @param value Value to set for the callEndSubReason property.
     */
    public void setCallEndSubReason(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("callEndSubReason", value);
    }
    /**
     * Sets the callerNumber property value. Number of the user or bot who made the call (E.164 format, but might include more data).
     * @param value Value to set for the callerNumber property.
     */
    public void setCallerNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callerNumber", value);
    }
    /**
     * Sets the callType property value. Call type and direction.
     * @param value Value to set for the callType property.
     */
    public void setCallType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callType", value);
    }
    /**
     * Sets the correlationId property value. Identifier (GUID) for the call that you can use when calling Microsoft Support.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the duration property value. Duration of the call in seconds.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the endDateTime property value. Only exists for successful (fully established) calls. The time when the call ended.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the failureDateTime property value. Only exists for failed (not fully established) calls.
     * @param value Value to set for the failureDateTime property.
     */
    public void setFailureDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("failureDateTime", value);
    }
    /**
     * Sets the finalSipCode property value. The final response code with which the call ended (RFC 3261).
     * @param value Value to set for the finalSipCode property.
     */
    public void setFinalSipCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("finalSipCode", value);
    }
    /**
     * Sets the finalSipCodePhrase property value. Description of the SIP code and Microsoft subcode.
     * @param value Value to set for the finalSipCodePhrase property.
     */
    public void setFinalSipCodePhrase(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("finalSipCodePhrase", value);
    }
    /**
     * Sets the inviteDateTime property value. The date and time when the initial invite was sent.
     * @param value Value to set for the inviteDateTime property.
     */
    public void setInviteDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("inviteDateTime", value);
    }
    /**
     * Sets the mediaBypassEnabled property value. Indicates if the trunk was enabled for media bypass or not.
     * @param value Value to set for the mediaBypassEnabled property.
     */
    public void setMediaBypassEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mediaBypassEnabled", value);
    }
    /**
     * Sets the mediaPathLocation property value. The data center used for media path in non-bypass call.
     * @param value Value to set for the mediaPathLocation property.
     */
    public void setMediaPathLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mediaPathLocation", value);
    }
    /**
     * Sets the signalingLocation property value. The data center used for signaling for both bypass and non-bypass calls.
     * @param value Value to set for the signalingLocation property.
     */
    public void setSignalingLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signalingLocation", value);
    }
    /**
     * Sets the startDateTime property value. Call start time.For failed and unanswered calls, this value can be equal to invite or failure time.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the successfulCall property value. Success or attempt.
     * @param value Value to set for the successfulCall property.
     */
    public void setSuccessfulCall(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("successfulCall", value);
    }
    /**
     * Sets the transferorCorrelationId property value. Correlation ID of the call to the transferor.
     * @param value Value to set for the transferorCorrelationId property.
     */
    public void setTransferorCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("transferorCorrelationId", value);
    }
    /**
     * Sets the trunkFullyQualifiedDomainName property value. Fully qualified domain name of the session border controller.
     * @param value Value to set for the trunkFullyQualifiedDomainName property.
     */
    public void setTrunkFullyQualifiedDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("trunkFullyQualifiedDomainName", value);
    }
    /**
     * Sets the userCountryCode property value. Country/region code of the user. For details, see ISO 3166-1 alpha-2.
     * @param value Value to set for the userCountryCode property.
     */
    public void setUserCountryCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userCountryCode", value);
    }
}

package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PstnBlockedUsersLogRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time when the user was blocked/unblocked from making PSTN calls. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime blockDateTime;
    /**
     * The reason why the user is blocked/unblocked from making calls.
     */
    private String blockReason;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Unique identifier (GUID) for the blocking/unblocking action.
     */
    private String remediationId;
    /**
     * Indicates whether the user is blocked or unblocked from making PSTN calls in Microsoft Teams. The possible values are: blocked, unblocked, unknownFutureValue.
     */
    private PstnUserBlockMode userBlockMode;
    /**
     * Display name of the user.
     */
    private String userDisplayName;
    /**
     * The unique identifier (GUID) of the user in Azure Active Directory.
     */
    private String userId;
    /**
     * The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     */
    private String userPrincipalName;
    /**
     * User's blocked number. For details, see E.164.
     */
    private String userTelephoneNumber;
    /**
     * Instantiates a new pstnBlockedUsersLogRow and sets the default values.
     */
    public PstnBlockedUsersLogRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pstnBlockedUsersLogRow
     */
    @jakarta.annotation.Nonnull
    public static PstnBlockedUsersLogRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnBlockedUsersLogRow();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the blockDateTime property value. The date and time when the user was blocked/unblocked from making PSTN calls. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBlockDateTime() {
        return this.blockDateTime;
    }
    /**
     * Gets the blockReason property value. The reason why the user is blocked/unblocked from making calls.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBlockReason() {
        return this.blockReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("blockDateTime", (n) -> { this.setBlockDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("blockReason", (n) -> { this.setBlockReason(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remediationId", (n) -> { this.setRemediationId(n.getStringValue()); });
        deserializerMap.put("userBlockMode", (n) -> { this.setUserBlockMode(n.getEnumValue(PstnUserBlockMode.class)); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userTelephoneNumber", (n) -> { this.setUserTelephoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the remediationId property value. Unique identifier (GUID) for the blocking/unblocking action.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRemediationId() {
        return this.remediationId;
    }
    /**
     * Gets the userBlockMode property value. Indicates whether the user is blocked or unblocked from making PSTN calls in Microsoft Teams. The possible values are: blocked, unblocked, unknownFutureValue.
     * @return a pstnUserBlockMode
     */
    @jakarta.annotation.Nullable
    public PstnUserBlockMode getUserBlockMode() {
        return this.userBlockMode;
    }
    /**
     * Gets the userDisplayName property value. Display name of the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. The unique identifier (GUID) of the user in Azure Active Directory.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userTelephoneNumber property value. User's blocked number. For details, see E.164.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserTelephoneNumber() {
        return this.userTelephoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("blockDateTime", this.getBlockDateTime());
        writer.writeStringValue("blockReason", this.getBlockReason());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("remediationId", this.getRemediationId());
        writer.writeEnumValue("userBlockMode", this.getUserBlockMode());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeStringValue("userTelephoneNumber", this.getUserTelephoneNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the blockDateTime property value. The date and time when the user was blocked/unblocked from making PSTN calls. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the blockDateTime property.
     */
    public void setBlockDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.blockDateTime = value;
    }
    /**
     * Sets the blockReason property value. The reason why the user is blocked/unblocked from making calls.
     * @param value Value to set for the blockReason property.
     */
    public void setBlockReason(@jakarta.annotation.Nullable final String value) {
        this.blockReason = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the remediationId property value. Unique identifier (GUID) for the blocking/unblocking action.
     * @param value Value to set for the remediationId property.
     */
    public void setRemediationId(@jakarta.annotation.Nullable final String value) {
        this.remediationId = value;
    }
    /**
     * Sets the userBlockMode property value. Indicates whether the user is blocked or unblocked from making PSTN calls in Microsoft Teams. The possible values are: blocked, unblocked, unknownFutureValue.
     * @param value Value to set for the userBlockMode property.
     */
    public void setUserBlockMode(@jakarta.annotation.Nullable final PstnUserBlockMode value) {
        this.userBlockMode = value;
    }
    /**
     * Sets the userDisplayName property value. Display name of the user.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. The unique identifier (GUID) of the user in Azure Active Directory.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (sign-in name) in Azure Active Directory. This is usually the same as the user's SIP address, and can be same as the user's e-mail address.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userTelephoneNumber property value. User's blocked number. For details, see E.164.
     * @param value Value to set for the userTelephoneNumber property.
     */
    public void setUserTelephoneNumber(@jakarta.annotation.Nullable final String value) {
        this.userTelephoneNumber = value;
    }
}

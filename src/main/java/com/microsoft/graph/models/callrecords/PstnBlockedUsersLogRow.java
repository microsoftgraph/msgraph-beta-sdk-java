package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PstnBlockedUsersLogRow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The blockDateTime property */
    private OffsetDateTime blockDateTime;
    /** The blockReason property */
    private String blockReason;
    /** The OdataType property */
    private String odataType;
    /** The remediationId property */
    private String remediationId;
    /** The userBlockMode property */
    private PstnUserBlockMode userBlockMode;
    /** The userDisplayName property */
    private String userDisplayName;
    /** The userId property */
    private String userId;
    /** The userPrincipalName property */
    private String userPrincipalName;
    /** The userTelephoneNumber property */
    private String userTelephoneNumber;
    /**
     * Instantiates a new pstnBlockedUsersLogRow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PstnBlockedUsersLogRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pstnBlockedUsersLogRow
     */
    @javax.annotation.Nonnull
    public static PstnBlockedUsersLogRow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PstnBlockedUsersLogRow();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the blockDateTime property value. The blockDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getBlockDateTime() {
        return this.blockDateTime;
    }
    /**
     * Gets the blockReason property value. The blockReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBlockReason() {
        return this.blockReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the remediationId property value. The remediationId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediationId() {
        return this.remediationId;
    }
    /**
     * Gets the userBlockMode property value. The userBlockMode property
     * @return a pstnUserBlockMode
     */
    @javax.annotation.Nullable
    public PstnUserBlockMode getUserBlockMode() {
        return this.userBlockMode;
    }
    /**
     * Gets the userDisplayName property value. The userDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the userTelephoneNumber property value. The userTelephoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserTelephoneNumber() {
        return this.userTelephoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the blockDateTime property value. The blockDateTime property
     * @param value Value to set for the blockDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.blockDateTime = value;
    }
    /**
     * Sets the blockReason property value. The blockReason property
     * @param value Value to set for the blockReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockReason(@javax.annotation.Nullable final String value) {
        this.blockReason = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the remediationId property value. The remediationId property
     * @param value Value to set for the remediationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediationId(@javax.annotation.Nullable final String value) {
        this.remediationId = value;
    }
    /**
     * Sets the userBlockMode property value. The userBlockMode property
     * @param value Value to set for the userBlockMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserBlockMode(@javax.annotation.Nullable final PstnUserBlockMode value) {
        this.userBlockMode = value;
    }
    /**
     * Sets the userDisplayName property value. The userDisplayName property
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the userTelephoneNumber property value. The userTelephoneNumber property
     * @param value Value to set for the userTelephoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserTelephoneNumber(@javax.annotation.Nullable final String value) {
        this.userTelephoneNumber = value;
    }
}

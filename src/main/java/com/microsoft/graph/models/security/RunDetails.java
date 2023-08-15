package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RunDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The errorCode property
     */
    private HuntingRuleErrorCode errorCode;
    /**
     * The failureReason property
     */
    private String failureReason;
    /**
     * The lastRunDateTime property
     */
    private OffsetDateTime lastRunDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status property
     */
    private HuntingRuleRunStatus status;
    /**
     * Instantiates a new runDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RunDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a runDetails
     */
    @javax.annotation.Nonnull
    public static RunDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunDetails();
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
     * Gets the errorCode property value. The errorCode property
     * @return a huntingRuleErrorCode
     */
    @javax.annotation.Nullable
    public HuntingRuleErrorCode getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the failureReason property value. The failureReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getEnumValue(HuntingRuleErrorCode.class)); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("lastRunDateTime", (n) -> { this.setLastRunDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(HuntingRuleRunStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastRunDateTime property value. The lastRunDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.lastRunDateTime;
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
     * Gets the status property value. The status property
     * @return a huntingRuleRunStatus
     */
    @javax.annotation.Nullable
    public HuntingRuleRunStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final HuntingRuleErrorCode value) {
        this.errorCode = value;
    }
    /**
     * Sets the failureReason property value. The failureReason property
     * @param value Value to set for the failureReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureReason(@javax.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRunDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastRunDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final HuntingRuleRunStatus value) {
        this.status = value;
    }
}

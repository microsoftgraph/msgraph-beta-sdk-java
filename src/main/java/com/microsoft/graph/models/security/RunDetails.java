package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * Instantiates a new RunDetails and sets the default values.
     */
    public RunDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunDetails
     */
    @jakarta.annotation.Nonnull
    public static RunDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunDetails();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a HuntingRuleErrorCode
     */
    @jakarta.annotation.Nullable
    public HuntingRuleErrorCode getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the failureReason property value. The failureReason property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRunDateTime() {
        return this.lastRunDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the status property value. The status property
     * @return a HuntingRuleRunStatus
     */
    @jakarta.annotation.Nullable
    public HuntingRuleRunStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("errorCode", this.getErrorCode());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeOffsetDateTimeValue("lastRunDateTime", this.getLastRunDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final HuntingRuleErrorCode value) {
        this.errorCode = value;
    }
    /**
     * Sets the failureReason property value. The failureReason property
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the lastRunDateTime property value. The lastRunDateTime property
     * @param value Value to set for the lastRunDateTime property.
     */
    public void setLastRunDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRunDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final HuntingRuleRunStatus value) {
        this.status = value;
    }
}

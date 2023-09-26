package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DlpPoliciesJobResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The auditCorrelationId property
     */
    private String auditCorrelationId;
    /**
     * The evaluationDateTime property
     */
    private OffsetDateTime evaluationDateTime;
    /**
     * The matchingRules property
     */
    private java.util.List<MatchingDlpRule> matchingRules;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new DlpPoliciesJobResult and sets the default values.
     */
    public DlpPoliciesJobResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DlpPoliciesJobResult
     */
    @jakarta.annotation.Nonnull
    public static DlpPoliciesJobResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DlpPoliciesJobResult();
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
     * Gets the auditCorrelationId property value. The auditCorrelationId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuditCorrelationId() {
        return this.auditCorrelationId;
    }
    /**
     * Gets the evaluationDateTime property value. The evaluationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEvaluationDateTime() {
        return this.evaluationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("auditCorrelationId", (n) -> { this.setAuditCorrelationId(n.getStringValue()); });
        deserializerMap.put("evaluationDateTime", (n) -> { this.setEvaluationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("matchingRules", (n) -> { this.setMatchingRules(n.getCollectionOfObjectValues(MatchingDlpRule::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the matchingRules property value. The matchingRules property
     * @return a java.util.List<MatchingDlpRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MatchingDlpRule> getMatchingRules() {
        return this.matchingRules;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("auditCorrelationId", this.getAuditCorrelationId());
        writer.writeOffsetDateTimeValue("evaluationDateTime", this.getEvaluationDateTime());
        writer.writeCollectionOfObjectValues("matchingRules", this.getMatchingRules());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the auditCorrelationId property value. The auditCorrelationId property
     * @param value Value to set for the auditCorrelationId property.
     */
    public void setAuditCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.auditCorrelationId = value;
    }
    /**
     * Sets the evaluationDateTime property value. The evaluationDateTime property
     * @param value Value to set for the evaluationDateTime property.
     */
    public void setEvaluationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.evaluationDateTime = value;
    }
    /**
     * Sets the matchingRules property value. The matchingRules property
     * @param value Value to set for the matchingRules property.
     */
    public void setMatchingRules(@jakarta.annotation.Nullable final java.util.List<MatchingDlpRule> value) {
        this.matchingRules = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IndustryDataRunStatistics implements AdditionalDataHolder, Parsable {
    /**
     * The collection of statistics for each activity included in this run.
     */
    private java.util.List<IndustryDataActivityStatistics> activityStatistics;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The aggregate statistics for all inbound flows.
     */
    private AggregatedInboundStatistics inboundTotals;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The ID of the underlying run for the statistics.
     */
    private String runId;
    /**
     * The status property
     */
    private IndustryDataRunStatus status;
    /**
     * Instantiates a new industryDataRunStatistics and sets the default values.
     */
    public IndustryDataRunStatistics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a industryDataRunStatistics
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataRunStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndustryDataRunStatistics();
    }
    /**
     * Gets the activityStatistics property value. The collection of statistics for each activity included in this run.
     * @return a industryDataActivityStatistics
     */
    @jakarta.annotation.Nullable
    public java.util.List<IndustryDataActivityStatistics> getActivityStatistics() {
        return this.activityStatistics;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("activityStatistics", (n) -> { this.setActivityStatistics(n.getCollectionOfObjectValues(IndustryDataActivityStatistics::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundTotals", (n) -> { this.setInboundTotals(n.getObjectValue(AggregatedInboundStatistics::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("runId", (n) -> { this.setRunId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IndustryDataRunStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the inboundTotals property value. The aggregate statistics for all inbound flows.
     * @return a aggregatedInboundStatistics
     */
    @jakarta.annotation.Nullable
    public AggregatedInboundStatistics getInboundTotals() {
        return this.inboundTotals;
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
     * Gets the runId property value. The ID of the underlying run for the statistics.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRunId() {
        return this.runId;
    }
    /**
     * Gets the status property value. The status property
     * @return a industryDataRunStatus
     */
    @jakarta.annotation.Nullable
    public IndustryDataRunStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activityStatistics property value. The collection of statistics for each activity included in this run.
     * @param value Value to set for the activityStatistics property.
     */
    public void setActivityStatistics(@jakarta.annotation.Nullable final java.util.List<IndustryDataActivityStatistics> value) {
        this.activityStatistics = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the inboundTotals property value. The aggregate statistics for all inbound flows.
     * @param value Value to set for the inboundTotals property.
     */
    public void setInboundTotals(@jakarta.annotation.Nullable final AggregatedInboundStatistics value) {
        this.inboundTotals = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the runId property value. The ID of the underlying run for the statistics.
     * @param value Value to set for the runId property.
     */
    public void setRunId(@jakarta.annotation.Nullable final String value) {
        this.runId = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IndustryDataRunStatus value) {
        this.status = value;
    }
}

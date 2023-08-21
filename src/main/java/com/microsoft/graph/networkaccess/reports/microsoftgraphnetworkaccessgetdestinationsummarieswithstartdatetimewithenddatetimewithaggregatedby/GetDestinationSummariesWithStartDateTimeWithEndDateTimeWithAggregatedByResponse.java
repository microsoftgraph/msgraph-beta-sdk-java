package com.microsoft.graph.networkaccess.reports.microsoftgraphnetworkaccessgetdestinationsummarieswithstartdatetimewithenddatetimewithaggregatedby;

import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.models.networkaccess.DestinationSummary;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedByResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * The value property
     */
    private java.util.List<DestinationSummary> value;
    /**
     * Instantiates a new getDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedByResponse and sets the default values.
     */
    public GetDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedByResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedByResponse
     */
    @jakarta.annotation.Nonnull
    public static GetDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedByResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedByResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(DestinationSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a destinationSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<DestinationSummary> getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<DestinationSummary> value) {
        this.value = value;
    }
}

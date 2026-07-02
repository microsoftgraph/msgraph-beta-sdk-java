package com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetcloudapplicationreportwit_4a6eb858;

import com.microsoft.graph.beta.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.beta.models.networkaccess.CloudApplicationReport;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Original name: GetCloudApplicationReportWithStartDateTimeWithEndDateTimeuserIdUserIdGetResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCloudApplicationReportWithStartDateTimeWithEndDateTi_b5a4aa5b extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new {@link GetCloudApplicationReportWithStartDateTimeWithEndDateTi_b5a4aa5b} and sets the default values.
     */
    public GetCloudApplicationReportWithStartDateTimeWithEndDateTi_b5a4aa5b() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCloudApplicationReportWithStartDateTimeWithEndDateTi_b5a4aa5b}
     */
    @jakarta.annotation.Nonnull
    public static GetCloudApplicationReportWithStartDateTimeWithEndDateTi_b5a4aa5b createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCloudApplicationReportWithStartDateTimeWithEndDateTi_b5a4aa5b();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(CloudApplicationReport::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link java.util.List<CloudApplicationReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudApplicationReport> getValue() {
        return this.backingStore.get("value");
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
    public void setValue(@jakarta.annotation.Nullable final java.util.List<CloudApplicationReport> value) {
        this.backingStore.set("value", value);
    }
}

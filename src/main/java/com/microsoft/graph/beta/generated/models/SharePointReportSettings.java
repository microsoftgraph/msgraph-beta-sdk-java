package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointReportSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointReportSettings} and sets the default values.
     */
    public SharePointReportSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointReportSettings}
     */
    @jakarta.annotation.Nonnull
    public static SharePointReportSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointReportSettings();
    }
    /**
     * Gets the apiUsageReportMetrics property value. The collection of API usage report metrics and the status of their enablement.
     * @return a {@link java.util.List<ApiUsageReportEnablementStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApiUsageReportEnablementStatus> getApiUsageReportMetrics() {
        return this.backingStore.get("apiUsageReportMetrics");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("apiUsageReportMetrics", (n) -> { this.setApiUsageReportMetrics(n.getCollectionOfObjectValues(ApiUsageReportEnablementStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("apiUsageReportMetrics", this.getApiUsageReportMetrics());
    }
    /**
     * Sets the apiUsageReportMetrics property value. The collection of API usage report metrics and the status of their enablement.
     * @param value Value to set for the apiUsageReportMetrics property.
     */
    public void setApiUsageReportMetrics(@jakarta.annotation.Nullable final java.util.List<ApiUsageReportEnablementStatus> value) {
        this.backingStore.set("apiUsageReportMetrics", value);
    }
}

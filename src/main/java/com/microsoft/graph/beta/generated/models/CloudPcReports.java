package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcReports extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcReports} and sets the default values.
     */
    public CloudPcReports() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcReports}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcReports createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcReports();
    }
    /**
     * Gets the exportJobs property value. The export jobs created for downloading reports.
     * @return a {@link java.util.List<CloudPcExportJob>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcExportJob> getExportJobs() {
        return this.backingStore.get("exportJobs");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exportJobs", (n) -> { this.setExportJobs(n.getCollectionOfObjectValues(CloudPcExportJob::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("exportJobs", this.getExportJobs());
    }
    /**
     * Sets the exportJobs property value. The export jobs created for downloading reports.
     * @param value Value to set for the exportJobs property.
     */
    public void setExportJobs(@jakarta.annotation.Nullable final java.util.List<CloudPcExportJob> value) {
        this.backingStore.set("exportJobs", value);
    }
}
